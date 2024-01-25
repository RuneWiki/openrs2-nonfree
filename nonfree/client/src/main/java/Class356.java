import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class356 implements Runnable {

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "J")
	private long aLong262;

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "Lclient!dda;")
	private Class72 aClass72_1;

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "[Lclient!gga;")
	private final Class2_Sub14[] aClass2_Sub14Array6 = new Class2_Sub14[8];

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "[I")
	private final int[] anIntArray677 = new int[3];

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "Z")
	private volatile boolean aBoolean722 = true;

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "Z")
	private volatile boolean aBoolean723 = true;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "Z")
	private volatile boolean aBoolean721 = false;

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
	private final int anInt9404;

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "Lclient!r;")
	private final Class100 aClass100_14;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(ILclient!r;)V")
	public Class356(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1) {
		this.anInt9404 = arg0;
		this.aClass100_14 = arg1;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "()V")
	public void method7821() {
		this.aBoolean722 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!dda;)V")
	public void method7822(@OriginalArg(0) Class72 arg0) {
		if (this.aClass72_1 != null) {
			this.aClass72_1.method1355(null);
		}
		this.aClass72_1 = arg0;
		if (this.aClass72_1 != null) {
			this.aClass72_1.method1355(this);
		}
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "()V")
	public void method7823() {
		this.aBoolean722 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "()Z")
	public boolean method7824() {
		return this.aClass72_1 == null || !this.aBoolean721 && this.aClass72_1.method1356();
	}

	@OriginalMember(owner = "client!wda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean723) {
			this.method7825();
		}
	}

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "()V")
	private void method7825() {
		this.aClass100_14.method6244(this.anInt9404);
		while (!this.aBoolean722 && this.aBoolean723) {
			if (this.aClass72_1 == null || this.aClass72_1.method1356()) {
				this.aBoolean721 = false;
				this.aLong262 = Static580.aClass241_1.method7166();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean721 = true;
				@Pc(21) Class6 local21 = this.aClass72_1.method1353();
				if (local21 instanceof Class6_Sub1) {
					@Pc(27) Class6_Sub1 local27 = (Class6_Sub1) local21;
					if (local27.aBoolean676) {
						local27.method7323(Static356.aClass100_8);
					} else {
						Static372.method5513(local27, this.aClass2_Sub14Array6);
						if (Static548.aClass29_15 != null) {
							Static548.aClass29_15.method7111(-256, local27.anInt8762, this.aClass72_1.aString15, -16777216, local27.anInt8763);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class6_Sub10) local21).anInt9618;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class67 local70 = Static421.aClass67Array7[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static74.anInt1648 + Static74.anInt1648; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static74.anInt1648 + Static74.anInt1648; local75++) {
								if (Static430.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static350.anInt6287 + local72 - Static74.anInt1648;
									@Pc(98) int local98 = Static148.anInt3061 + local75 - Static74.anInt1648;
									if (local92 >= 0 && local92 < local70.anInt8111 && local98 >= 0 && local98 < local70.anInt8110) {
										Static356.aClass100_8.MA(local92 << Static134.anInt2822, local70.method6707(local98, local92), local98 << Static134.anInt2822, this.anIntArray677);
										if (Static134.method2295(this.anIntArray677[0]) == this.anInt9404 - 1) {
											local70.method6716(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass100_14.method6239(this.anInt9404);
		while (this.aBoolean722 && this.aBoolean723) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "()J")
	public long method7826() {
		return this.aLong262;
	}

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "()V")
	public void method7827() {
		this.aBoolean722 = false;
		this.aBoolean723 = false;
		synchronized (this) {
			this.notify();
		}
	}
}
