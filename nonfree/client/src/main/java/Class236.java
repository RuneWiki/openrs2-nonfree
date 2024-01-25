import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class236 implements Runnable {

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "Z")
	private volatile boolean aBoolean449;

	@OriginalMember(owner = "client!oga", name = "i", descriptor = "Z")
	private boolean aBoolean450;

	@OriginalMember(owner = "client!oga", name = "s", descriptor = "Lclient!kk;")
	private Class178 aClass178_24;

	@OriginalMember(owner = "client!oga", name = "t", descriptor = "Ljava/lang/String;")
	private String aString57;

	@OriginalMember(owner = "client!oga", name = "u", descriptor = "I")
	private int anInt6491;

	@OriginalMember(owner = "client!oga", name = "v", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!oga", name = "w", descriptor = "I")
	private int anInt6492;

	@OriginalMember(owner = "client!oga", name = "x", descriptor = "J")
	private long aLong179;

	@OriginalMember(owner = "client!oga", name = "n", descriptor = "Lclient!ib;")
	private Interface12 anInterface12_1 = new Class249();

	@OriginalMember(owner = "client!oga", name = "p", descriptor = "Lclient!ib;")
	private Interface12 anInterface12_2 = null;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(JLjava/lang/String;BLclient!kk;I)V")
	public synchronized void method5506(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class178 arg2, @OriginalArg(4) int arg3) {
		this.aString57 = arg1;
		this.aClass178_24 = arg2;
		this.anInt6492 = arg3;
		this.aLong178 = arg0;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BLclient!ib;)V")
	public synchronized void method5507(@OriginalArg(1) Interface12 arg0) {
		this.anInterface12_2 = this.anInterface12_1;
		this.anInterface12_1 = arg0;
		this.aLong179 = Static8.method201();
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)I")
	public int method5508() {
		return this.anInt6491;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)I")
	public int method5509() {
		return this.anInt6492;
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)Lclient!kk;")
	public Class178 method5510() {
		return this.aClass178_24;
	}

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "(I)V")
	public void method5511() {
		this.aBoolean449 = true;
	}

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "(I)V")
	public synchronized void method5512() {
		this.aBoolean450 = true;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method5513() {
		return this.aString57;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)I")
	public int method5514() {
		if (this.aClass178_24 == null) {
			return 0;
		}
		@Pc(18) int local18 = this.aClass178_24.method4392();
		if (this.aClass178_24.aBoolean361 && this.aClass178_24.anInt5104 > this.anInt6492) {
			return this.anInt6492 + 1;
		} else if (local18 >= 0 && Static333.aClass178Array1.length - 1 > local18) {
			return this.aClass178_24.anInt5101 == this.anInt6492 ? this.aClass178_24.anInt5104 : this.aClass178_24.anInt5101;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!oga", name = "f", descriptor = "(I)J")
	public long method5515() {
		return this.aLong178;
	}

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "(I)Z")
	public synchronized boolean method5516() {
		return this.anInterface12_1.method5730(this.aLong179);
	}

	@OriginalMember(owner = "client!oga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean449) {
			@Pc(6) long local6 = Static8.method201();
			synchronized (this) {
				try {
					if (this.anInterface12_1 instanceof Class249) {
						this.anInterface12_1.method5728(this.aBoolean450);
					} else {
						this.anInt6491++;
						@Pc(31) long local31 = Static8.method201();
						if (Static240.aClass14_7 == null || this.anInterface12_2 == null || this.anInterface12_2.method5732() == 0 || this.aLong179 < local31 - (long) this.anInterface12_2.method5732()) {
							if (this.anInterface12_2 != null) {
								this.aBoolean450 = true;
								this.anInterface12_2.method5731();
								this.anInterface12_2 = null;
							}
							if (this.aBoolean450) {
								Static535.method7308();
								if (Static240.aClass14_7 != null) {
									Static240.aClass14_7.D(0);
								}
							}
							this.anInterface12_1.method5728(this.aBoolean450 || Static240.aClass14_7 != null && Static240.aClass14_7.method6901());
						} else {
							@Pc(71) int local71 = (int) ((local31 - this.aLong179) * 255L / (long) this.anInterface12_2.method5732());
							@Pc(76) int local76 = 255 - local71;
							@Pc(82) int local82 = local71 << 24 | 0xFFFFFF;
							Static535.method7308();
							@Pc(90) int local90 = local76 << 24 | 0xFFFFFF;
							Static240.aClass14_7.D(0);
							@Pc(99) Class58 local99 = Static240.aClass14_7.method6862(Static240.anInt4852, Static196.anInt4059);
							Static240.aClass14_7.method6853(local99);
							this.anInterface12_2.method5728(true);
							Static240.aClass14_7.method6858();
							local99.I(0, 0, 0, local90, 1);
							Static240.aClass14_7.method6853(local99);
							Static240.aClass14_7.D(0);
							this.anInterface12_1.method5728(true);
							Static240.aClass14_7.method6858();
							local99.I(0, 0, 0, local82, 1);
						}
						try {
							if (Static240.aClass14_7 != null && !(this.anInterface12_1 instanceof Class249)) {
								Static240.aClass14_7.method6848();
							}
						} catch (@Pc(188) Exception_Sub1 local188) {
							Static256.method4328(local188.getMessage() + " (Recovered) " + Static111.aClient1.method1347(), local188);
							Static293.method4707(0);
						}
					}
					this.aBoolean450 = false;
				} catch (@Pc(213) Exception local213) {
					continue;
				}
			}
			@Pc(225) long local225 = Static8.method201();
			@Pc(234) int local234 = (int) (local6 + 20L - local225);
			if (local234 > 0) {
				Static318.method4952((long) local234);
			}
		}
	}
}
