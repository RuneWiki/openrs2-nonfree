import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class276 implements Runnable {

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Z")
	private volatile boolean aBoolean524;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Z")
	private boolean aBoolean525;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
	private int anInt7314;

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
	private int anInt7317;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "Ljava/lang/String;")
	private String aString84;

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "Lclient!kq;")
	private Class202 aClass202_24;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!fp;")
	private Interface7 anInterface7_1 = new Class107();

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Lclient!fp;")
	private Interface7 anInterface7_2 = null;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Z")
	public synchronized boolean method6053() {
		return this.anInterface7_1.method7199(this.aLong209);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public synchronized void method6054() {
		this.aBoolean525 = true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!fp;B)V")
	public synchronized void method6055(@OriginalArg(0) Interface7 arg0) {
		this.anInterface7_2 = this.anInterface7_1;
		this.anInterface7_1 = arg0;
		this.aLong209 = Static184.method3422();
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)I")
	public int method6056() {
		return this.anInt7314;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;BLclient!kq;IJ)V")
	public synchronized void method6057(@OriginalArg(0) String arg0, @OriginalArg(2) Class202 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		this.aClass202_24 = arg1;
		this.aLong210 = arg3;
		this.aString84 = arg0;
		this.anInt7314 = arg2;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method6058() {
		return this.aString84;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)I")
	public int method6059() {
		return this.anInt7317;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public void method6060() {
		this.aBoolean524 = true;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)I")
	public int method6063() {
		if (this.aClass202_24 == null) {
			return 0;
		}
		@Pc(19) int local19 = this.aClass202_24.method4437();
		if (this.aClass202_24.aBoolean394 && this.aClass202_24.anInt5248 > this.anInt7314) {
			return this.anInt7314 + 1;
		} else if (local19 >= 0 && local19 < Static384.aClass202Array1.length - 1) {
			return this.anInt7314 == this.aClass202_24.anInt5246 ? this.aClass202_24.anInt5248 : this.aClass202_24.anInt5246;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)J")
	public long method6065() {
		return this.aLong210;
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Lclient!kq;")
	public Class202 method6066() {
		return this.aClass202_24;
	}

	@OriginalMember(owner = "client!qa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean524) {
			@Pc(10) long local10 = Static184.method3422();
			synchronized (this) {
				try {
					if (this.anInterface7_1 instanceof Class107) {
						this.anInterface7_1.method7200(this.aBoolean525);
					} else {
						this.anInt7317++;
						@Pc(27) long local27 = Static184.method3422();
						if (Static185.aClass66_14 == null || this.anInterface7_2 == null || this.anInterface7_2.method7203() == 0 || this.aLong209 < local27 - (long) this.anInterface7_2.method7203()) {
							if (this.anInterface7_2 != null) {
								this.aBoolean525 = true;
								this.anInterface7_2.method7201();
								this.anInterface7_2 = null;
							}
							if (this.aBoolean525) {
								Static485.method6744();
								if (Static185.aClass66_14 != null) {
									Static185.aClass66_14.D(0);
								}
							}
							this.anInterface7_1.method7200(this.aBoolean525 || Static185.aClass66_14 != null && Static185.aClass66_14.method6828());
						} else {
							@Pc(103) int local103 = (int) ((local27 - this.aLong209) * 255L / (long) this.anInterface7_2.method7203());
							@Pc(108) int local108 = 255 - local103;
							@Pc(114) int local114 = local108 << 24 | 0xFFFFFF;
							Static485.method6744();
							@Pc(122) int local122 = local103 << 24 | 0xFFFFFF;
							Static185.aClass66_14.D(0);
							@Pc(131) Class13 local131 = Static185.aClass66_14.method6856(Static2.anInt29, Static19.anInt390);
							Static185.aClass66_14.method6827(local131);
							this.anInterface7_2.method7200(true);
							Static185.aClass66_14.method6780();
							local131.I(0, 0, 0, local114, 1);
							Static185.aClass66_14.method6827(local131);
							Static185.aClass66_14.D(0);
							this.anInterface7_1.method7200(true);
							Static185.aClass66_14.method6780();
							local131.I(0, 0, 0, local122, 1);
						}
						try {
							if (Static185.aClass66_14 != null && !(this.anInterface7_1 instanceof Class107)) {
								Static185.aClass66_14.method6847();
							}
						} catch (@Pc(180) Exception_Sub1 local180) {
							Static473.method6593(local180, local180.getMessage() + " (Recovered) " + Static81.aClient7.method1214());
							Static8.method7640(0);
						}
					}
					this.aBoolean525 = false;
				} catch (@Pc(212) Exception local212) {
					continue;
				}
			}
			@Pc(224) long local224 = Static184.method3422();
			@Pc(232) int local232 = (int) (local10 + 20L - local224);
			if (local232 > 0) {
				Static55.method845((long) local232);
			}
		}
	}
}
