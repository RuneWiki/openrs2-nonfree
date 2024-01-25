import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class298 implements Runnable {

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "Lclient!pj;")
	private Class283 aClass283_1;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "J")
	private long aLong218;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "[Lclient!uaa;")
	private final Class3_Sub13[] aClass3_Sub13Array4 = new Class3_Sub13[8];

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "Z")
	private volatile boolean aBoolean547 = true;

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "Z")
	private volatile boolean aBoolean548 = true;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "Z")
	private volatile boolean aBoolean549 = false;

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "[I")
	private final int[] anIntArray425 = new int[3];

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
	private final int anInt7867;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Lclient!ha;")
	private final Class95 aClass95_12;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class298(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1) {
		this.anInt7867 = arg0;
		this.aClass95_12 = arg1;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "()V")
	public void method6527() {
		this.aBoolean547 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "()V")
	public void method6528() {
		this.aBoolean547 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "()V")
	private void method6529() {
		this.aClass95_12.method8035(this.anInt7867);
		while (!this.aBoolean547 && this.aBoolean548) {
			if (this.aClass283_1 == null || this.aClass283_1.method6201()) {
				this.aBoolean549 = false;
				this.aLong218 = Static9.aClass151_1.method4619();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean549 = true;
				@Pc(21) Class34 local21 = this.aClass283_1.method6198();
				if (local21 instanceof Class34_Sub1) {
					@Pc(27) Class34_Sub1 local27 = (Class34_Sub1) local21;
					if (local27.aBoolean670) {
						local27.method7849(Static50.aClass95_1);
					} else {
						Static87.method1490(local27, this.aClass3_Sub13Array4);
						if (Static464.aClass67_10 != null) {
							Static464.aClass67_10.method7684(-256, local27.anInt9623, local27.anInt9615, this.aClass283_1.aString93, -16777216);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class34_Sub5) local21).anInt4678;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class35 local70 = Static582.aClass35Array3[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static362.anInt6205 + Static362.anInt6205; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static362.anInt6205 + Static362.anInt6205; local75++) {
								if (Static30.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static88.anInt1826 + local72 - Static362.anInt6205;
									@Pc(98) int local98 = Static353.anInt6041 + local75 - Static362.anInt6205;
									if (local92 >= 0 && local92 < local70.anInt9149 && local98 >= 0 && local98 < local70.anInt9148) {
										Static50.aClass95_1.H(local92 << Static571.anInt9216, local70.method7461(local98, local92), local98 << Static571.anInt9216, this.anIntArray425);
										if (Static7.method110(this.anIntArray425[0]) == this.anInt7867 - 1) {
											local70.method7454(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass95_12.method8060(this.anInt7867);
		while (this.aBoolean547 && this.aBoolean548) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!pj;)V")
	public void method6530(@OriginalArg(0) Class283 arg0) {
		if (this.aClass283_1 != null) {
			this.aClass283_1.method6202((Class298) null);
		}
		this.aClass283_1 = arg0;
		if (this.aClass283_1 != null) {
			this.aClass283_1.method6202(this);
		}
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "()Z")
	public boolean method6531() {
		return this.aClass283_1 == null || !this.aBoolean549 && this.aClass283_1.method6201();
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "()V")
	public void method6532() {
		this.aBoolean547 = false;
		this.aBoolean548 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!qn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean548) {
			this.method6529();
		}
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "()J")
	public long method6533() {
		return this.aLong218;
	}
}
