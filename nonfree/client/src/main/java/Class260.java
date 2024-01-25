import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class260 implements Runnable {

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "Z")
	private boolean aBoolean506;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "Z")
	private volatile boolean aBoolean507;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "Ljava/lang/String;")
	private String aString76;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "J")
	private long aLong308;

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
	private int anInt7047;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "J")
	private long aLong309;

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "Lclient!vv;")
	private Class350 aClass350_2;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
	private int anInt7049;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "Lclient!uh;")
	private Interface22 anInterface22_1 = new Class21();

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "Lclient!uh;")
	private Interface22 anInterface22_2 = null;

	static {
		new Class37("", 73);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)J")
	public long method5788() {
		return this.aLong309;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public String method5789() {
		return this.aString76;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public void method5790() {
		this.aBoolean507 = true;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)I")
	public int method5791() {
		return this.anInt7047;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)I")
	public int method5792() {
		if (this.aClass350_2 == null) {
			return 0;
		}
		@Pc(19) int local19 = this.aClass350_2.method7664();
		if (this.aClass350_2.aBoolean676 && this.aClass350_2.anInt9280 > this.anInt7049) {
			return this.anInt7049 + 1;
		} else if (local19 >= 0 && local19 < Static295.aClass350Array1.length - 1) {
			return this.aClass350_2.anInt9278 == this.anInt7049 ? this.aClass350_2.anInt9280 : this.aClass350_2.anInt9278;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)Lclient!vv;")
	public Class350 method5793() {
		return this.aClass350_2;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!uh;I)V")
	public synchronized void method5794(@OriginalArg(0) Interface22 arg0) {
		this.anInterface22_2 = this.anInterface22_1;
		this.anInterface22_1 = arg0;
		this.aLong308 = Static255.method4035();
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)Z")
	public synchronized boolean method5795() {
		return this.anInterface22_1.method1803(this.aLong308);
	}

	@OriginalMember(owner = "client!pp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean507) {
			@Pc(6) long local6 = Static255.method4035();
			synchronized (this) {
				try {
					if (this.anInterface22_1 instanceof Class21) {
						this.anInterface22_1.method1805(this.aBoolean506);
					} else {
						this.anInt7047++;
						@Pc(31) long local31 = Static255.method4035();
						if (Static136.aClass12_8 == null || this.anInterface22_2 == null || this.anInterface22_2.method1807() == 0 || this.aLong308 < local31 - (long) this.anInterface22_2.method1807()) {
							if (this.anInterface22_2 != null) {
								this.aBoolean506 = true;
								this.anInterface22_2.method1806();
								this.anInterface22_2 = null;
							}
							if (this.aBoolean506) {
								Static548.method7475();
								if (Static136.aClass12_8 != null) {
									Static136.aClass12_8.ja(0);
								}
							}
							this.anInterface22_1.method1805(this.aBoolean506 || Static136.aClass12_8 != null && Static136.aClass12_8.method6431());
						} else {
							@Pc(67) int local67 = (int) ((local31 - this.aLong308) * 255L / (long) this.anInterface22_2.method1807());
							@Pc(72) int local72 = 255 - local67;
							@Pc(78) int local78 = local72 << 24 | 0xFFFFFF;
							Static548.method7475();
							@Pc(86) int local86 = local67 << 24 | 0xFFFFFF;
							Static136.aClass12_8.ja(0);
							@Pc(95) Class10 local95 = Static136.aClass12_8.method6420(Static443.anInt7718, Static300.anInt5516);
							Static136.aClass12_8.method6432(local95);
							this.anInterface22_2.method1805(true);
							Static136.aClass12_8.method6462();
							local95.V(0, 0, 0, local78, 1);
							Static136.aClass12_8.method6432(local95);
							Static136.aClass12_8.ja(0);
							this.anInterface22_1.method1805(true);
							Static136.aClass12_8.method6462();
							local95.V(0, 0, 0, local86, 1);
						}
						try {
							if (Static136.aClass12_8 != null && !(this.anInterface22_1 instanceof Class21)) {
								Static136.aClass12_8.method6416();
							}
						} catch (@Pc(184) Exception_Sub1 local184) {
							Static259.method4059(local184.getMessage() + " (Recovered) " + Static550.aClient1.method1539(), local184);
							Static69.method1449(0);
						}
					}
					this.aBoolean506 = false;
				} catch (@Pc(209) Exception local209) {
					continue;
				}
			}
			@Pc(221) long local221 = Static255.method4035();
			@Pc(229) int local229 = (int) (local6 + 20L - local221);
			if (local229 > 0) {
				Static423.method5918((long) local229);
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(JIZLjava/lang/String;Lclient!vv;)V")
	public synchronized void method5796(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class350 arg3) {
		this.aLong309 = arg0;
		this.aClass350_2 = arg3;
		this.aString76 = arg2;
		this.anInt7049 = arg1;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
	public synchronized void method5798() {
		this.aBoolean506 = true;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(Z)I")
	public int method5800() {
		return this.anInt7049;
	}
}
