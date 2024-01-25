import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class247 implements Runnable {

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Z")
	private volatile boolean aBoolean509;

	@OriginalMember(owner = "client!o", name = "s", descriptor = "Z")
	private boolean aBoolean510;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "I")
	private int anInt6581;

	@OriginalMember(owner = "client!o", name = "u", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "Ljava/lang/String;")
	private String aString74;

	@OriginalMember(owner = "client!o", name = "w", descriptor = "J")
	private long aLong160;

	@OriginalMember(owner = "client!o", name = "y", descriptor = "I")
	private int anInt6582;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "Lclient!nw;")
	private Class246 aClass246_24;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Lclient!wl;")
	private Interface24 anInterface24_1 = new Class81();

	@OriginalMember(owner = "client!o", name = "x", descriptor = "Lclient!wl;")
	private Interface24 anInterface24_2 = null;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public void method5318() {
		this.aBoolean509 = true;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)Z")
	public synchronized boolean method5320() {
		return this.anInterface24_1.method2173(this.aLong160);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Lclient!nw;")
	public Class246 method5321() {
		return this.aClass246_24;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)J")
	public long method5322() {
		return this.aLong159;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
	public synchronized void method5325() {
		this.aBoolean510 = true;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)I")
	public int method5326() {
		return this.anInt6582;
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)I")
	public int method5327() {
		return this.anInt6581;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!wl;)V")
	public synchronized void method5328(@OriginalArg(1) Interface24 arg0) {
		this.anInterface24_2 = this.anInterface24_1;
		this.anInterface24_1 = arg0;
		this.aLong160 = Static480.method6650();
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)I")
	public int method5329() {
		if (this.aClass246_24 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass246_24.method5315();
		if (this.aClass246_24.aBoolean508 && this.anInt6582 < this.aClass246_24.anInt6562) {
			return this.anInt6582 + 1;
		} else if (local13 >= 0 && Static124.aClass246Array1.length - 1 > local13) {
			return this.aClass246_24.anInt6557 == this.anInt6582 ? this.aClass246_24.anInt6562 : this.aClass246_24.anInt6557;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method5330() {
		return this.aString74;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(JLjava/lang/String;IILclient!nw;)V")
	public synchronized void method5331(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class246 arg3) {
		this.aClass246_24 = arg3;
		this.aString74 = arg1;
		this.aLong159 = arg0;
		this.anInt6582 = arg2;
	}

	@OriginalMember(owner = "client!o", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean509) {
			@Pc(6) long local6 = Static480.method6650();
			synchronized (this) {
				try {
					if (this.anInterface24_1 instanceof Class81) {
						this.anInterface24_1.method2168(this.aBoolean510);
					} else {
						this.anInt6581++;
						@Pc(31) long local31 = Static480.method6650();
						if (Static31.aClass78_18 == null || this.anInterface24_2 == null || this.anInterface24_2.method2172() == 0 || this.aLong160 < local31 - (long) this.anInterface24_2.method2172()) {
							if (this.anInterface24_2 != null) {
								this.aBoolean510 = true;
								this.anInterface24_2.method2169();
								this.anInterface24_2 = null;
							}
							if (this.aBoolean510) {
								Static8.method4849();
								if (Static31.aClass78_18 != null) {
									Static31.aClass78_18.ja(0);
								}
							}
							this.anInterface24_1.method2168(this.aBoolean510 || Static31.aClass78_18 != null && Static31.aClass78_18.method6787());
						} else {
							@Pc(69) int local69 = (int) ((local31 - this.aLong160) * 255L / (long) this.anInterface24_2.method2172());
							@Pc(74) int local74 = 255 - local69;
							Static8.method4849();
							@Pc(82) int local82 = local74 << 24 | 0xFFFFFF;
							@Pc(88) int local88 = local69 << 24 | 0xFFFFFF;
							Static31.aClass78_18.ja(0);
							@Pc(97) Class5 local97 = Static31.aClass78_18.method6832(Static349.anInt6422, Static594.anInt9806);
							Static31.aClass78_18.method6814(local97);
							this.anInterface24_2.method2168(true);
							Static31.aClass78_18.method6846();
							local97.V(0, 0, 0, local82, 1);
							Static31.aClass78_18.method6814(local97);
							Static31.aClass78_18.ja(0);
							this.anInterface24_1.method2168(true);
							Static31.aClass78_18.method6846();
							local97.V(0, 0, 0, local88, 1);
						}
						try {
							if (Static31.aClass78_18 != null && !(this.anInterface24_1 instanceof Class81)) {
								Static31.aClass78_18.method6820();
							}
						} catch (@Pc(186) Exception_Sub1 local186) {
							Static419.method5957(local186.getMessage() + " (Recovered) " + Static475.aClient1.method1084(), local186);
							Static358.method7632(0);
						}
					}
					this.aBoolean510 = false;
				} catch (@Pc(211) Exception local211) {
					continue;
				}
			}
			@Pc(223) long local223 = Static480.method6650();
			@Pc(231) int local231 = (int) (local6 + 20L - local223);
			if (local231 > 0) {
				Static408.method5841((long) local231);
			}
		}
	}
}
