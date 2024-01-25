import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class61 implements Runnable {

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "Z")
	private boolean aBoolean221;

	@OriginalMember(owner = "client!dga", name = "q", descriptor = "Z")
	private volatile boolean aBoolean222;

	@OriginalMember(owner = "client!dga", name = "r", descriptor = "I")
	private int anInt2791;

	@OriginalMember(owner = "client!dga", name = "t", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!dga", name = "u", descriptor = "I")
	private int anInt2792;

	@OriginalMember(owner = "client!dga", name = "v", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!dga", name = "w", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!dga", name = "y", descriptor = "Lclient!es;")
	private Class90 aClass90_2;

	@OriginalMember(owner = "client!dga", name = "n", descriptor = "Lclient!ffa;")
	private Interface12 anInterface12_1 = new Class301();

	@OriginalMember(owner = "client!dga", name = "s", descriptor = "Lclient!ffa;")
	private Interface12 anInterface12_2 = null;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)I")
	public int method2357() {
		return this.anInt2792;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)Z")
	public synchronized boolean method2358() {
		return this.anInterface12_1.method7300(this.aLong60);
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(B)Lclient!es;")
	public Class90 method2359() {
		return this.aClass90_2;
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method2360() {
		return this.aString17;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BLclient!ffa;)V")
	public synchronized void method2361(@OriginalArg(1) Interface12 arg0) {
		this.anInterface12_2 = this.anInterface12_1;
		this.anInterface12_1 = arg0;
		this.aLong60 = Static582.method8056();
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(B)J")
	public long method2362() {
		return this.aLong59;
	}

	@OriginalMember(owner = "client!dga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean222) {
			@Pc(6) long local6 = Static582.method8056();
			synchronized (this) {
				try {
					this.anInt2791++;
					if (this.anInterface12_1 instanceof Class301) {
						this.anInterface12_1.method7295(this.aBoolean221);
					} else {
						@Pc(23) long local23 = Static582.method8056();
						if (Static467.aClass5_13 == null || this.anInterface12_2 == null || this.anInterface12_2.method7297() == 0 || this.aLong60 < local23 - (long) this.anInterface12_2.method7297()) {
							if (this.anInterface12_2 != null) {
								this.aBoolean221 = true;
								this.anInterface12_2.method7296();
								this.anInterface12_2 = null;
							}
							if (this.aBoolean221) {
								Static465.method6954();
								if (Static467.aClass5_13 != null) {
									Static467.aClass5_13.GA(0);
								}
							}
							this.anInterface12_1.method7295(this.aBoolean221 || Static467.aClass5_13 != null && Static467.aClass5_13.method6182());
						} else {
							@Pc(103) int local103 = (int) ((local23 - this.aLong60) * 255L / (long) this.anInterface12_2.method7297());
							@Pc(108) int local108 = 255 - local103;
							Static465.method6954();
							@Pc(116) int local116 = local108 << 24 | 0xFFFFFF;
							@Pc(122) int local122 = local103 << 24 | 0xFFFFFF;
							Static467.aClass5_13.GA(0);
							@Pc(131) Class4 local131 = Static467.aClass5_13.method6102(Static294.anInt6026, Static277.anInt5899, true);
							Static467.aClass5_13.method6126(local131);
							this.anInterface12_2.method7295(true);
							Static467.aClass5_13.method6139();
							local131.method7711(0, 0, 0, local116, 1);
							Static467.aClass5_13.method6126(local131);
							Static467.aClass5_13.GA(0);
							this.anInterface12_1.method7295(true);
							Static467.aClass5_13.method6139();
							local131.method7711(0, 0, 0, local122, 1);
						}
						try {
							if (Static467.aClass5_13 != null && !(this.anInterface12_1 instanceof Class301)) {
								Static467.aClass5_13.method6117();
							}
						} catch (@Pc(181) Exception_Sub1 local181) {
							Static358.method5809(local181, local181.getMessage() + " (Recovered) " + Static545.aClient1.method2129());
							Static237.method4302(0, true);
						}
					}
					@Pc(215) Container local215;
					if (Static500.aFrame9 != null) {
						local215 = Static500.aFrame9;
					} else if (Static635.anApplet2 == null) {
						local215 = Static560.anApplet_Sub1_1;
					} else {
						local215 = Static635.anApplet2;
					}
					local215.getSize();
					local215.getSize();
					if (Static500.aFrame9 == local215) {
						Static500.aFrame9.getInsets();
					}
					this.aBoolean221 = false;
					if (Static467.aClass5_13 != null && !(this.anInterface12_1 instanceof Class301) && this.aClass90_2.method2772() < Static140.aClass90_21.method2772()) {
						Static266.method4777();
					}
				} catch (@Pc(260) Exception local260) {
					continue;
				}
			}
			@Pc(272) long local272 = Static582.method8056();
			@Pc(280) int local280 = (int) (local6 + 20L - local272);
			if (local280 > 0) {
				Static344.method5698((long) local280);
			}
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(JBILclient!es;Ljava/lang/String;)V")
	public synchronized void method2363(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class90 arg2, @OriginalArg(4) String arg3) {
		this.aLong59 = arg0;
		this.aClass90_2 = arg2;
		this.anInt2792 = arg1;
		this.aString17 = arg3;
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)I")
	public int method2364() {
		if (this.aClass90_2 == null) {
			return 0;
		}
		@Pc(19) int local19 = this.aClass90_2.method2772();
		if (this.aClass90_2.aBoolean257 && this.anInt2792 < this.aClass90_2.anInt3327) {
			return this.anInt2792 + 1;
		} else if (local19 >= 0 && local19 < Static5.aClass90Array1.length - 1) {
			return this.anInt2792 == this.aClass90_2.anInt3323 ? this.aClass90_2.anInt3327 : this.aClass90_2.anInt3323;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)V")
	public void method2365() {
		this.aBoolean222 = true;
	}

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "(B)I")
	public int method2367() {
		return this.anInt2791;
	}

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "(I)V")
	public synchronized void method2369() {
		this.aBoolean221 = true;
	}
}
