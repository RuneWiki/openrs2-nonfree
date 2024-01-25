import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class33 implements Runnable {

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!re;")
	private Class291 aClass291_1;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "[I")
	private final int[] anIntArray37 = new int[3];

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "[Lclient!wh;")
	private final Class3_Sub16[] aClass3_Sub16Array3 = new Class3_Sub16[8];

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "Z")
	private volatile boolean aBoolean84 = true;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Z")
	private volatile boolean aBoolean82 = true;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Z")
	private volatile boolean aBoolean83 = false;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	private final int anInt1298;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Lclient!ha;")
	private final Class5 aClass5_3;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1) {
		this.anInt1298 = arg0;
		this.aClass5_3 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
	private void method1370() {
		this.aClass5_3.method7502(this.anInt1298);
		while (!this.aBoolean84 && this.aBoolean82) {
			if (this.aClass291_1 == null || this.aClass291_1.method7262()) {
				this.aBoolean83 = false;
				this.aLong29 = Static263.aClass183_1.method7334();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean83 = true;
				@Pc(21) Class4 local21 = this.aClass291_1.method7265();
				if (local21 instanceof Class4_Sub1) {
					@Pc(27) Class4_Sub1 local27 = (Class4_Sub1) local21;
					if (local27.aBoolean638) {
						local27.method7699(Static232.aClass5_8);
					} else {
						Static618.method8555(local27, this.aClass3_Sub16Array3);
						if (Static553.aClass62_11 != null) {
							Static553.aClass62_11.method8373(-16777216, -256, local27.anInt8914, this.aClass291_1.aString96, local27.anInt8917);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class4_Sub3) local21).anInt2315;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class51 local70 = Static364.aClass51Array3[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static468.anInt10228 + Static468.anInt10228; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static468.anInt10228 + Static468.anInt10228; local75++) {
								if (Static251.aBooleanArrayArrayArray1[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static626.anInt10075 + local72 - Static468.anInt10228;
									@Pc(98) int local98 = Static386.anInt7210 + local75 - Static468.anInt10228;
									if (local92 >= 0 && local92 < local70.anInt9121 && local98 >= 0 && local98 < local70.anInt9115) {
										Static232.aClass5_8.H(local92 << Static308.anInt5834, local70.method7835(local92, local98), local98 << Static308.anInt5834, this.anIntArray37);
										if (Static608.method8451(this.anIntArray37[0]) == this.anInt1298 - 1) {
											local70.method7830(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass5_3.method7556(this.anInt1298);
		while (this.aBoolean84 && this.aBoolean82) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "()V")
	public void method1371() {
		this.aBoolean84 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "()J")
	public long method1372() {
		return this.aLong29;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!re;)V")
	public void method1373(@OriginalArg(0) Class291 arg0) {
		if (this.aClass291_1 != null) {
			this.aClass291_1.method7260(null);
		}
		this.aClass291_1 = arg0;
		if (this.aClass291_1 != null) {
			this.aClass291_1.method7260(this);
		}
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "()V")
	public void method1374() {
		this.aBoolean84 = false;
		this.aBoolean82 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "()V")
	public void method1375() {
		this.aBoolean84 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "()Z")
	public boolean method1376() {
		return this.aClass291_1 == null || !this.aBoolean83 && this.aClass291_1.method7262();
	}

	@OriginalMember(owner = "client!bi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean82) {
			this.method1370();
		}
	}
}
