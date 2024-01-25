import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class124 implements Runnable {

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "Lclient!ot;")
	private Class243 aClass243_1;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "[Lclient!ada;")
	private final Class8_Sub1[] aClass8_Sub1Array3 = new Class8_Sub1[8];

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "[I")
	private final int[] anIntArray240 = new int[3];

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "Z")
	private volatile boolean aBoolean322 = true;

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "Z")
	private volatile boolean aBoolean320 = true;

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "Z")
	private volatile boolean aBoolean321 = false;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
	private final int anInt4417;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "Lclient!ha;")
	private final Class16 aClass16_6;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class124(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1) {
		this.anInt4417 = arg0;
		this.aClass16_6 = arg1;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "()V")
	public void method3581() {
		this.aBoolean322 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "()V")
	public void method3582() {
		this.aBoolean322 = false;
		this.aBoolean320 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "()V")
	public void method3583() {
		this.aBoolean322 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "()Z")
	public boolean method3584() {
		return this.aClass243_1 == null || !this.aBoolean321 && this.aClass243_1.method6456();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!ot;)V")
	public void method3585(@OriginalArg(0) Class243 arg0) {
		if (this.aClass243_1 != null) {
			this.aClass243_1.method6454(null);
		}
		this.aClass243_1 = arg0;
		if (this.aClass243_1 != null) {
			this.aClass243_1.method6454(this);
		}
	}

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "()V")
	private void method3586() {
		this.aClass16_6.method6101(this.anInt4417);
		while (!this.aBoolean322 && this.aBoolean320) {
			if (this.aClass243_1 == null || this.aClass243_1.method6456()) {
				this.aBoolean321 = false;
				this.aLong113 = Static227.aClass10_1.method5413();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean321 = true;
				@Pc(21) Class15 local21 = this.aClass243_1.method6458();
				if (local21 instanceof Class15_Sub1) {
					@Pc(27) Class15_Sub1 local27 = (Class15_Sub1) local21;
					if (local27.aBoolean742) {
						local27.method8327(Static269.aClass16_11);
					} else {
						Static148.method5411(local27, this.aClass8_Sub1Array3);
						if (Static400.aClass27_15 != null) {
							Static400.aClass27_15.method6993(local27.anInt10300, -16777216, local27.anInt10302, -256, this.aClass243_1.aString77);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class15_Sub4) local21).anInt3375;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class86 local70 = Static34.aClass86Array5[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static183.anInt4307 + Static183.anInt4307; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static183.anInt4307 + Static183.anInt4307; local75++) {
								if (Static320.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static603.anInt10257 + local72 - Static183.anInt4307;
									@Pc(98) int local98 = Static470.anInt8495 + local75 - Static183.anInt4307;
									if (local92 >= 0 && local92 < local70.anInt9955 && local98 >= 0 && local98 < local70.anInt9953) {
										Static269.aClass16_11.H(local92 << Static172.anInt4156, local70.method8086(local98, local92), local98 << Static172.anInt4156, this.anIntArray240);
										if (Static348.method5527(this.anIntArray240[0]) == this.anInt4417 - 1) {
											local70.method8087(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass16_6.method6134(this.anInt4417);
		while (this.aBoolean322 && this.aBoolean320) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean320) {
			this.method3586();
		}
	}

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "()J")
	public long method3587() {
		return this.aLong113;
	}
}
