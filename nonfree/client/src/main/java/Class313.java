import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class313 implements Runnable {

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Lclient!dq;")
	private Class66 aClass66_1;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "J")
	private long aLong227;

	@OriginalMember(owner = "client!st", name = "c", descriptor = "Z")
	private volatile boolean aBoolean620 = true;

	@OriginalMember(owner = "client!st", name = "b", descriptor = "Z")
	private volatile boolean aBoolean619 = true;

	@OriginalMember(owner = "client!st", name = "e", descriptor = "[I")
	private final int[] anIntArray610 = new int[3];

	@OriginalMember(owner = "client!st", name = "d", descriptor = "Z")
	private volatile boolean aBoolean621 = false;

	@OriginalMember(owner = "client!st", name = "i", descriptor = "[Lclient!ff;")
	private final Class3_Sub22[] aClass3_Sub22Array4 = new Class3_Sub22[8];

	@OriginalMember(owner = "client!st", name = "f", descriptor = "I")
	private final int anInt7894;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "Lclient!r;")
	private final Class43 aClass43_13;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(ILclient!r;)V")
	public Class313(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1) {
		this.anInt7894 = arg0;
		this.aClass43_13 = arg1;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "()J")
	public long method6672() {
		return this.aLong227;
	}

	@OriginalMember(owner = "client!st", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean619) {
			this.method6677();
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!dq;)V")
	public void method6673(@OriginalArg(0) Class66 arg0) {
		if (this.aClass66_1 != null) {
			this.aClass66_1.method2153(null);
		}
		this.aClass66_1 = arg0;
		if (this.aClass66_1 != null) {
			this.aClass66_1.method2153(this);
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "()Z")
	public boolean method6674() {
		return this.aClass66_1 == null || !this.aBoolean621 && this.aClass66_1.method2156();
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "()V")
	public void method6675() {
		this.aBoolean620 = false;
		this.aBoolean619 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!st", name = "d", descriptor = "()V")
	public void method6676() {
		this.aBoolean620 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!st", name = "e", descriptor = "()V")
	private void method6677() {
		this.aClass43_13.method7141(this.anInt7894);
		while (!this.aBoolean620 && this.aBoolean619) {
			if (this.aClass66_1 == null || this.aClass66_1.method2156()) {
				this.aBoolean621 = false;
				this.aLong227 = Static426.aClass25_1.method4035();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean621 = true;
				@Pc(21) Class9 local21 = this.aClass66_1.method2159();
				if (local21 instanceof Class9_Sub1) {
					@Pc(27) Class9_Sub1 local27 = (Class9_Sub1) local21;
					if (local27.aBoolean702) {
						local27.method7471(Static482.aClass43_12);
					} else {
						Static372.method5515(local27, this.aClass3_Sub22Array4);
						if (Static593.aClass117_12 != null) {
							Static593.aClass117_12.method7654(this.aClass66_1.aString33, local27.anInt8974, -256, local27.anInt8978, -16777216);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class9_Sub5) local21).anInt3366;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class139 local70 = Static29.aClass139Array6[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static266.anInt4982 + Static266.anInt4982; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static266.anInt4982 + Static266.anInt4982; local75++) {
								if (Static385.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static210.anInt4205 + local72 - Static266.anInt4982;
									@Pc(98) int local98 = Static12.anInt136 + local75 - Static266.anInt4982;
									if (local92 >= 0 && local92 < local70.anInt8179 && local98 >= 0 && local98 < local70.anInt8180) {
										Static482.aClass43_12.MA(local92 << Static458.anInt7508, local70.method6889(local92, local98), local98 << Static458.anInt7508, this.anIntArray610);
										if (Static358.method7749(this.anIntArray610[0]) == this.anInt7894 - 1) {
											local70.method6885(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass43_13.method7182(this.anInt7894);
		while (this.aBoolean620 && this.aBoolean619) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "f", descriptor = "()V")
	public void method6678() {
		this.aBoolean620 = true;
		synchronized (this) {
			this.notify();
		}
	}
}
