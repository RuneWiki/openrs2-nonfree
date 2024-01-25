import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class163 implements Runnable {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "Z")
	private volatile boolean aBoolean326;

	@OriginalMember(owner = "client!it", name = "o", descriptor = "Z")
	private boolean aBoolean327;

	@OriginalMember(owner = "client!it", name = "v", descriptor = "I")
	private int anInt4294;

	@OriginalMember(owner = "client!it", name = "w", descriptor = "J")
	private long aLong122;

	@OriginalMember(owner = "client!it", name = "x", descriptor = "J")
	private long aLong123;

	@OriginalMember(owner = "client!it", name = "z", descriptor = "Lclient!fga;")
	private Class103 aClass103_24;

	@OriginalMember(owner = "client!it", name = "A", descriptor = "Ljava/lang/String;")
	private String aString40;

	@OriginalMember(owner = "client!it", name = "B", descriptor = "I")
	private int anInt4295;

	@OriginalMember(owner = "client!it", name = "u", descriptor = "Lclient!ida;")
	private Interface10 anInterface10_1 = new Class184();

	@OriginalMember(owner = "client!it", name = "y", descriptor = "Lclient!ida;")
	private Interface10 anInterface10_2 = null;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I")
	public int method3458() {
		if (this.aClass103_24 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass103_24.method2088();
		if (this.aClass103_24.aBoolean196 && this.anInt4294 < this.aClass103_24.anInt2631) {
			return this.anInt4294 + 1;
		} else if (local13 >= 0 && Static423.aClass103Array1.length - 1 > local13) {
			return this.aClass103_24.anInt2628 == this.anInt4294 ? this.aClass103_24.anInt2631 : this.aClass103_24.anInt2628;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)Z")
	public synchronized boolean method3459() {
		return this.anInterface10_1.method6294(this.aLong122);
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
	public synchronized void method3460() {
		this.aBoolean327 = true;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!ida;)V")
	public synchronized void method3461(@OriginalArg(1) Interface10 arg0) {
		this.anInterface10_2 = this.anInterface10_1;
		this.anInterface10_1 = arg0;
		this.aLong122 = Static413.method5668();
	}

	@OriginalMember(owner = "client!it", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean326) {
			@Pc(10) long local10 = Static413.method5668();
			synchronized (this) {
				try {
					if (this.anInterface10_1 instanceof Class184) {
						this.anInterface10_1.method6292(this.aBoolean327);
					} else {
						this.anInt4295++;
						@Pc(35) long local35 = Static413.method5668();
						if (Static16.aClass134_1 == null || this.anInterface10_2 == null || this.anInterface10_2.method6291() == 0 || this.aLong122 < local35 - (long) this.anInterface10_2.method6291()) {
							if (this.anInterface10_2 != null) {
								this.aBoolean327 = true;
								this.anInterface10_2.method6293();
								this.anInterface10_2 = null;
							}
							if (this.aBoolean327) {
								Static190.method2922();
								if (Static16.aClass134_1 != null) {
									Static16.aClass134_1.ja(0);
								}
							}
							this.anInterface10_1.method6292(this.aBoolean327 || Static16.aClass134_1 != null && Static16.aClass134_1.method6951());
						} else {
							@Pc(72) int local72 = (int) ((local35 - this.aLong122) * 255L / (long) this.anInterface10_2.method6291());
							@Pc(77) int local77 = 255 - local72;
							@Pc(83) int local83 = local72 << 24 | 0xFFFFFF;
							Static190.method2922();
							@Pc(91) int local91 = local77 << 24 | 0xFFFFFF;
							Static16.aClass134_1.ja(0);
							@Pc(100) Class22 local100 = Static16.aClass134_1.method6950(Static130.anInt2566, Static499.anInt4149);
							Static16.aClass134_1.method6935(local100);
							this.anInterface10_2.method6292(true);
							Static16.aClass134_1.method6907();
							local100.V(0, 0, 0, local91, 1);
							Static16.aClass134_1.method6935(local100);
							Static16.aClass134_1.ja(0);
							this.anInterface10_1.method6292(true);
							Static16.aClass134_1.method6907();
							local100.V(0, 0, 0, local83, 1);
						}
						try {
							if (Static16.aClass134_1 != null && !(this.anInterface10_1 instanceof Class184)) {
								Static16.aClass134_1.method6944();
							}
						} catch (@Pc(189) Exception_Sub1 local189) {
							Static345.method4708(local189, local189.getMessage() + " (Recovered) " + Static399.aClient1.method1124());
							Static523.method7235(0);
						}
					}
					this.aBoolean327 = false;
				} catch (@Pc(214) Exception local214) {
					continue;
				}
			}
			@Pc(226) long local226 = Static413.method5668();
			@Pc(234) int local234 = (int) (local10 + 20L - local226);
			if (local234 > 0) {
				Static391.method5400((long) local234);
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "(I)J")
	public long method3462() {
		return this.aLong123;
	}

	@OriginalMember(owner = "client!it", name = "e", descriptor = "(I)Lclient!fga;")
	public Class103 method3463() {
		return this.aClass103_24;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V")
	public void method3468() {
		this.aBoolean326 = true;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)I")
	public int method3469() {
		return this.anInt4295;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)I")
	public int method3470() {
		return this.anInt4294;
	}

	@OriginalMember(owner = "client!it", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method3471() {
		return this.aString40;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(JLjava/lang/String;ILclient!fga;I)V")
	public synchronized void method3472(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class103 arg3) {
		this.aString40 = arg1;
		this.anInt4294 = arg2;
		this.aClass103_24 = arg3;
		this.aLong123 = arg0;
	}
}
