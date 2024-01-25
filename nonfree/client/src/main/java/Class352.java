import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uja")
public final class Class352 implements Runnable {

	@OriginalMember(owner = "client!uja", name = "g", descriptor = "Z")
	private boolean aBoolean839;

	@OriginalMember(owner = "client!uja", name = "l", descriptor = "Z")
	private volatile boolean aBoolean840;

	@OriginalMember(owner = "client!uja", name = "r", descriptor = "Lclient!ob;")
	private Class259 aClass259_23;

	@OriginalMember(owner = "client!uja", name = "t", descriptor = "I")
	private int anInt9926;

	@OriginalMember(owner = "client!uja", name = "u", descriptor = "I")
	private int anInt9927;

	@OriginalMember(owner = "client!uja", name = "v", descriptor = "Ljava/lang/String;")
	private String aString99;

	@OriginalMember(owner = "client!uja", name = "w", descriptor = "J")
	private long aLong281;

	@OriginalMember(owner = "client!uja", name = "x", descriptor = "J")
	private long aLong282;

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "Lclient!df;")
	private Interface5 anInterface5_1 = new Class144();

	@OriginalMember(owner = "client!uja", name = "z", descriptor = "Lclient!df;")
	private Interface5 anInterface5_2 = null;

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ILclient!df;)V")
	public synchronized void method8254(@OriginalArg(1) Interface5 arg0) {
		this.anInterface5_2 = this.anInterface5_1;
		this.anInterface5_1 = arg0;
		this.aLong281 = Static547.method7619();
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)I")
	public int method8255() {
		return this.anInt9927;
	}

	@OriginalMember(owner = "client!uja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean840) {
			@Pc(6) long local6 = Static547.method7619();
			synchronized (this) {
				try {
					this.anInt9927++;
					if (this.anInterface5_1 instanceof Class144) {
						this.anInterface5_1.method8491(this.aBoolean839);
					} else {
						@Pc(31) long local31 = Static547.method7619();
						if (Static208.aClass65_7 == null || this.anInterface5_2 == null || this.anInterface5_2.method8492() == 0 || this.aLong281 < local31 - (long) this.anInterface5_2.method8492()) {
							if (this.anInterface5_2 != null) {
								this.aBoolean839 = true;
								this.anInterface5_2.method8493();
								this.anInterface5_2 = null;
							}
							if (this.aBoolean839) {
								Static236.method3643();
								if (Static208.aClass65_7 != null) {
									Static208.aClass65_7.GA(0);
								}
							}
							this.anInterface5_1.method8491(this.aBoolean839 || Static208.aClass65_7 != null && Static208.aClass65_7.method6947());
						} else {
							@Pc(111) int local111 = (int) ((local31 - this.aLong281) * 255L / (long) this.anInterface5_2.method8492());
							@Pc(116) int local116 = 255 - local111;
							@Pc(122) int local122 = local116 << 24 | 0xFFFFFF;
							@Pc(128) int local128 = local111 << 24 | 0xFFFFFF;
							Static236.method3643();
							Static208.aClass65_7.GA(0);
							@Pc(139) Class50 local139 = Static208.aClass65_7.method6907(Static32.anInt510, Static79.anInt1140, true);
							Static208.aClass65_7.method6951(local139);
							this.anInterface5_2.method8491(true);
							Static208.aClass65_7.method6959();
							local139.method5987(0, 0, 0, local122, 1);
							Static208.aClass65_7.method6951(local139);
							Static208.aClass65_7.GA(0);
							this.anInterface5_1.method8491(true);
							Static208.aClass65_7.method6959();
							local139.method5987(0, 0, 0, local128, 1);
						}
						try {
							if (Static208.aClass65_7 != null && !(this.anInterface5_1 instanceof Class144)) {
								Static208.aClass65_7.method6925();
							}
						} catch (@Pc(189) Exception_Sub1 local189) {
							Static234.method3615(local189, local189.getMessage() + " (Recovered) " + Static209.aClient2.method1794());
							Static428.method6321(0, true);
						}
					}
					@Pc(216) Container local216;
					if (Static147.aFrame1 != null) {
						local216 = Static147.aFrame1;
					} else if (Static639.anApplet2 == null) {
						local216 = Static556.anApplet_Sub1_1;
					} else {
						local216 = Static639.anApplet2;
					}
					local216.getSize();
					local216.getSize();
					if (local216 == Static147.aFrame1) {
						Static147.aFrame1.getInsets();
					}
					this.aBoolean839 = false;
					if (Static208.aClass65_7 != null && !(this.anInterface5_1 instanceof Class144) && this.aClass259_23.method6132() < Static412.aClass259_20.method6132()) {
						Static10.method148();
					}
				} catch (@Pc(257) Exception local257) {
					continue;
				}
			}
			@Pc(269) long local269 = Static547.method7619();
			@Pc(277) int local277 = (int) (local6 + 20L - local269);
			if (local277 > 0) {
				Static579.method8004((long) local277);
			}
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(JLclient!ob;IILjava/lang/String;)V")
	public synchronized void method8256(@OriginalArg(0) long arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		this.aClass259_23 = arg1;
		this.aLong282 = arg0;
		this.aString99 = arg3;
		this.anInt9926 = arg2;
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(I)I")
	public int method8257() {
		return this.anInt9926;
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(I)Lclient!ob;")
	public Class259 method8258() {
		return this.aClass259_23;
	}

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "(I)Z")
	public synchronized boolean method8259() {
		return this.anInterface5_1.method8490(this.aLong281);
	}

	@OriginalMember(owner = "client!uja", name = "e", descriptor = "(I)V")
	public void method8260() {
		this.aBoolean840 = true;
	}

	@OriginalMember(owner = "client!uja", name = "f", descriptor = "(I)I")
	public int method8262() {
		if (this.aClass259_23 == null) {
			return 0;
		}
		@Pc(21) int local21 = this.aClass259_23.method6132();
		if (this.aClass259_23.aBoolean632 && this.anInt9926 < this.aClass259_23.anInt7313) {
			return this.anInt9926 + 1;
		} else if (local21 >= 0 && Static672.aClass259Array1.length - 1 > local21) {
			return this.aClass259_23.anInt7316 == this.anInt9926 ? this.aClass259_23.anInt7313 : this.aClass259_23.anInt7316;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!uja", name = "g", descriptor = "(I)V")
	public synchronized void method8263() {
		this.aBoolean839 = true;
	}

	@OriginalMember(owner = "client!uja", name = "h", descriptor = "(I)J")
	public long method8264() {
		return this.aLong282;
	}

	@OriginalMember(owner = "client!uja", name = "i", descriptor = "(I)Ljava/lang/String;")
	public String method8265() {
		return this.aString99;
	}
}
