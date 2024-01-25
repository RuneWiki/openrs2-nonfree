import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class163 implements Runnable {

	@OriginalMember(owner = "client!is", name = "s", descriptor = "Z")
	private boolean aBoolean354;

	@OriginalMember(owner = "client!is", name = "w", descriptor = "Z")
	private volatile boolean aBoolean355;

	@OriginalMember(owner = "client!is", name = "y", descriptor = "Lclient!uf;")
	private Class325 aClass325_1;

	@OriginalMember(owner = "client!is", name = "z", descriptor = "I")
	private int anInt4681;

	@OriginalMember(owner = "client!is", name = "A", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!is", name = "B", descriptor = "I")
	private int anInt4682;

	@OriginalMember(owner = "client!is", name = "C", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!is", name = "D", descriptor = "Ljava/lang/String;")
	private String aString47;

	@OriginalMember(owner = "client!is", name = "q", descriptor = "Lclient!vt;")
	private Interface24 anInterface24_1 = new Class161();

	@OriginalMember(owner = "client!is", name = "x", descriptor = "Lclient!vt;")
	private Interface24 anInterface24_2 = null;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method3923() {
		return this.aString47;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(B)I")
	public int method3924() {
		if (this.aClass325_1 == null) {
			return 0;
		}
		@Pc(15) int local15 = this.aClass325_1.method7780();
		if (this.aClass325_1.aBoolean801 && this.aClass325_1.anInt9607 > this.anInt4682) {
			return this.anInt4682 + 1;
		} else if (local15 >= 0 && local15 < Static507.aClass325Array1.length - 1) {
			return this.anInt4682 == this.aClass325_1.anInt9605 ? this.aClass325_1.anInt9607 : this.aClass325_1.anInt9605;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(B)I")
	public int method3926() {
		return this.anInt4682;
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(B)I")
	public int method3928() {
		return this.anInt4681;
	}

	@OriginalMember(owner = "client!is", name = "e", descriptor = "(B)Z")
	public synchronized boolean method3929() {
		return this.anInterface24_1.method6801(this.aLong138);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!vt;B)V")
	public synchronized void method3930(@OriginalArg(0) Interface24 arg0) {
		this.anInterface24_2 = this.anInterface24_1;
		this.anInterface24_1 = arg0;
		this.aLong138 = Static376.method6088();
	}

	@OriginalMember(owner = "client!is", name = "f", descriptor = "(B)V")
	public synchronized void method3931() {
		this.aBoolean354 = true;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Lclient!uf;")
	public Class325 method3934() {
		return this.aClass325_1;
	}

	@OriginalMember(owner = "client!is", name = "g", descriptor = "(B)J")
	public long method3935() {
		return this.aLong137;
	}

	@OriginalMember(owner = "client!is", name = "h", descriptor = "(B)V")
	public void method3936() {
		this.aBoolean355 = true;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(JILjava/lang/String;ILclient!uf;)V")
	public synchronized void method3937(@OriginalArg(0) long arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class325 arg3) {
		this.aString47 = arg1;
		this.anInt4682 = arg2;
		this.aClass325_1 = arg3;
		this.aLong137 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean355) {
			@Pc(6) long local6 = Static376.method6088();
			synchronized (this) {
				try {
					if (this.anInterface24_1 instanceof Class161) {
						this.anInterface24_1.method6799(this.aBoolean354);
					} else {
						this.anInt4681++;
						@Pc(23) long local23 = Static376.method6088();
						if (Static546.aClass15_16 == null || this.anInterface24_2 == null || this.anInterface24_2.method6804() == 0 || this.aLong138 < local23 - (long) this.anInterface24_2.method6804()) {
							if (this.anInterface24_2 != null) {
								this.aBoolean354 = true;
								this.anInterface24_2.method6803();
								this.anInterface24_2 = null;
							}
							if (this.aBoolean354) {
								Static251.method4499();
								if (Static546.aClass15_16 != null) {
									Static546.aClass15_16.D(0);
								}
							}
							this.anInterface24_1.method6799(this.aBoolean354 || Static546.aClass15_16 != null && Static546.aClass15_16.method5322());
						} else {
							@Pc(63) int local63 = (int) ((local23 - this.aLong138) * 255L / (long) this.anInterface24_2.method6804());
							@Pc(67) int local67 = 255 - local63;
							@Pc(73) int local73 = local67 << 24 | 0xFFFFFF;
							Static251.method4499();
							@Pc(81) int local81 = local63 << 24 | 0xFFFFFF;
							Static546.aClass15_16.D(0);
							@Pc(90) Class37 local90 = Static546.aClass15_16.method5308(Static582.anInt10234, Static294.anInt10217);
							Static546.aClass15_16.method5339(local90);
							this.anInterface24_2.method6799(true);
							Static546.aClass15_16.method5303();
							local90.I(0, 0, 0, local73, 1);
							Static546.aClass15_16.method5339(local90);
							Static546.aClass15_16.D(0);
							this.anInterface24_1.method6799(true);
							Static546.aClass15_16.method5303();
							local90.I(0, 0, 0, local81, 1);
						}
						try {
							if (Static546.aClass15_16 != null && !(this.anInterface24_1 instanceof Class161)) {
								Static546.aClass15_16.method5355();
							}
						} catch (@Pc(179) Exception_Sub1 local179) {
							Static468.method7192(local179.getMessage() + " (Recovered) " + Static173.aClient1.method1687(), local179);
							Static63.method1592(0);
						}
					}
					this.aBoolean354 = false;
				} catch (@Pc(211) Exception local211) {
					continue;
				}
			}
			@Pc(223) long local223 = Static376.method6088();
			@Pc(231) int local231 = (int) (local6 + 20L - local223);
			if (local231 > 0) {
				Static1.method125((long) local231);
			}
		}
	}
}
