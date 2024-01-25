import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class275 implements Runnable {

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "Z")
	private boolean aBoolean544;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Z")
	private volatile boolean aBoolean545;

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
	private int anInt7276;

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
	private int anInt7278;

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "client!qj", name = "u", descriptor = "J")
	private long aLong206;

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "Lclient!ir;")
	private Class151 aClass151_24;

	@OriginalMember(owner = "client!qj", name = "y", descriptor = "J")
	private long aLong207;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "Lclient!no;")
	private Interface15 anInterface15_1 = new Class234();

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "Lclient!no;")
	private Interface15 anInterface15_2 = null;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)Z")
	public synchronized boolean method6092() {
		return this.anInterface15_1.method7605(this.aLong206);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	public synchronized void method6093() {
		this.aBoolean544 = true;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I")
	public int method6094() {
		return this.anInt7278;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method6095() {
		return this.aString70;
	}

	@OriginalMember(owner = "client!qj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean545) {
			@Pc(10) long local10 = Static158.method2936();
			synchronized (this) {
				try {
					if (this.anInterface15_1 instanceof Class234) {
						this.anInterface15_1.method7602(this.aBoolean544);
					} else {
						this.anInt7276++;
						@Pc(27) long local27 = Static158.method2936();
						if (Static505.aClass45_11 == null || this.anInterface15_2 == null || this.anInterface15_2.method7604() == 0 || this.aLong206 < local27 - (long) this.anInterface15_2.method7604()) {
							if (this.anInterface15_2 != null) {
								this.aBoolean544 = true;
								this.anInterface15_2.method7600();
								this.anInterface15_2 = null;
							}
							if (this.aBoolean544) {
								Static189.method3211();
								if (Static505.aClass45_11 != null) {
									Static505.aClass45_11.ja(0);
								}
							}
							this.anInterface15_1.method7602(this.aBoolean544 || Static505.aClass45_11 != null && Static505.aClass45_11.method7417());
						} else {
							@Pc(67) int local67 = (int) ((local27 - this.aLong206) * 255L / (long) this.anInterface15_2.method7604());
							@Pc(72) int local72 = 255 - local67;
							@Pc(78) int local78 = local72 << 24 | 0xFFFFFF;
							Static189.method3211();
							@Pc(86) int local86 = local67 << 24 | 0xFFFFFF;
							Static505.aClass45_11.ja(0);
							@Pc(95) Class14 local95 = Static505.aClass45_11.method7390(Static40.anInt758, Static308.anInt5171);
							Static505.aClass45_11.method7369(local95);
							this.anInterface15_2.method7602(true);
							Static505.aClass45_11.method7368();
							local95.V(0, 0, 0, local78, 1);
							Static505.aClass45_11.method7369(local95);
							Static505.aClass45_11.ja(0);
							this.anInterface15_1.method7602(true);
							Static505.aClass45_11.method7368();
							local95.V(0, 0, 0, local86, 1);
						}
						try {
							if (Static505.aClass45_11 != null && !(this.anInterface15_1 instanceof Class234)) {
								Static505.aClass45_11.method7386();
							}
						} catch (@Pc(184) Exception_Sub1 local184) {
							Static172.method7826(local184, local184.getMessage() + " (Recovered) " + Static308.aClient1.method1514());
							Static486.method6610(0);
						}
					}
					this.aBoolean544 = false;
				} catch (@Pc(216) Exception local216) {
					continue;
				}
			}
			@Pc(228) long local228 = Static158.method2936();
			@Pc(236) int local236 = (int) (local10 + 20L - local228);
			if (local236 > 0) {
				Static589.method7892((long) local236);
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I")
	public int method6097() {
		if (this.aClass151_24 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass151_24.method3631();
		if (this.aClass151_24.aBoolean302 && this.aClass151_24.anInt4134 > this.anInt7278) {
			return this.anInt7278 + 1;
		} else if (local13 >= 0 && local13 < Static140.aClass151Array1.length - 1) {
			return this.anInt7278 == this.aClass151_24.anInt4131 ? this.aClass151_24.anInt4134 : this.aClass151_24.anInt4131;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)J")
	public long method6098() {
		return this.aLong207;
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)Lclient!ir;")
	public Class151 method6099() {
		return this.aClass151_24;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;JBILclient!ir;)V")
	public synchronized void method6100(@OriginalArg(0) String arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class151 arg3) {
		this.aString70 = arg0;
		this.aClass151_24 = arg3;
		this.aLong207 = arg1;
		this.anInt7278 = arg2;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)I")
	public int method6102() {
		return this.anInt7276;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!no;Z)V")
	public synchronized void method6103(@OriginalArg(0) Interface15 arg0) {
		this.anInterface15_2 = this.anInterface15_1;
		this.anInterface15_1 = arg0;
		this.aLong206 = Static158.method2936();
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
	public void method6104() {
		this.aBoolean545 = true;
	}
}
