import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class360 implements Runnable {

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Z")
	private boolean aBoolean725;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Z")
	private volatile boolean aBoolean726;

	@OriginalMember(owner = "client!va", name = "t", descriptor = "Lclient!gp;")
	private Class131 aClass131_23;

	@OriginalMember(owner = "client!va", name = "u", descriptor = "I")
	private int anInt10398;

	@OriginalMember(owner = "client!va", name = "w", descriptor = "J")
	private long aLong277;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "J")
	private long aLong278;

	@OriginalMember(owner = "client!va", name = "z", descriptor = "Ljava/lang/String;")
	private String aString113;

	@OriginalMember(owner = "client!va", name = "C", descriptor = "I")
	private int anInt10402;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!laa;")
	private Interface17 anInterface17_1 = new Class382();

	@OriginalMember(owner = "client!va", name = "r", descriptor = "Lclient!laa;")
	private Interface17 anInterface17_2 = null;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!laa;Z)V")
	public synchronized void method8663(@OriginalArg(0) Interface17 arg0) {
		this.anInterface17_2 = this.anInterface17_1;
		this.anInterface17_1 = arg0;
		this.aLong277 = Static521.method7499();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)Z")
	public synchronized boolean method8665() {
		return this.anInterface17_1.method9112(this.aLong277);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public void method8666() {
		this.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)I")
	public int method8667() {
		return this.anInt10402;
	}

	@OriginalMember(owner = "client!va", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean726) {
			@Pc(6) long local6 = Static521.method7499();
			synchronized (this) {
				try {
					this.anInt10402++;
					if (this.anInterface17_1 instanceof Class382) {
						this.anInterface17_1.method9113(this.aBoolean725);
					} else {
						@Pc(23) long local23 = Static521.method7499();
						if (Static677.aClass137_47 == null || this.anInterface17_2 == null || this.anInterface17_2.method9111() == 0 || this.aLong277 < local23 - (long) this.anInterface17_2.method9111()) {
							if (this.anInterface17_2 != null) {
								this.aBoolean725 = true;
								this.anInterface17_2.method9116();
								this.anInterface17_2 = null;
							}
							if (this.aBoolean725) {
								Static357.method5405();
								if (Static677.aClass137_47 != null) {
									Static677.aClass137_47.GA(0);
								}
							}
							this.anInterface17_1.method9113(this.aBoolean725 || Static677.aClass137_47 != null && Static677.aClass137_47.method7888());
						} else {
							@Pc(103) int local103 = (int) ((local23 - this.aLong277) * 255L / (long) this.anInterface17_2.method9111());
							@Pc(108) int local108 = 255 - local103;
							@Pc(114) int local114 = local103 << 24 | 0xFFFFFF;
							Static357.method5405();
							@Pc(122) int local122 = local108 << 24 | 0xFFFFFF;
							Static677.aClass137_47.GA(0);
							@Pc(131) Class20 local131 = Static677.aClass137_47.method7925(Static561.anInt9759, Static639.anInt10685, true);
							Static677.aClass137_47.method7884(local131);
							this.anInterface17_2.method9113(true);
							Static677.aClass137_47.method7893();
							local131.method7402(0, 0, 0, local122, 1);
							Static677.aClass137_47.method7884(local131);
							Static677.aClass137_47.GA(0);
							this.anInterface17_1.method9113(true);
							Static677.aClass137_47.method7893();
							local131.method7402(0, 0, 0, local114, 1);
						}
						try {
							if (Static677.aClass137_47 != null && !(this.anInterface17_1 instanceof Class382)) {
								Static677.aClass137_47.method7921();
							}
						} catch (@Pc(181) Exception_Sub1 local181) {
							Static524.method7532(local181.getMessage() + " (Recovered) " + Static243.aClient1.method1454(), local181);
							Static155.method2506(0, true);
						}
					}
					@Pc(215) Container local215;
					if (Static339.aFrame2 != null) {
						local215 = Static339.aFrame2;
					} else if (Static645.anApplet2 == null) {
						local215 = Static164.anApplet_Sub1_1;
					} else {
						local215 = Static645.anApplet2;
					}
					local215.getSize();
					local215.getSize();
					if (Static339.aFrame2 == local215) {
						Static339.aFrame2.getInsets();
					}
					this.aBoolean725 = false;
					if (Static677.aClass137_47 != null && !(this.anInterface17_1 instanceof Class382) && this.aClass131_23.method3020() < Static196.aClass131_19.method3020()) {
						Static230.method3499();
					}
				} catch (@Pc(256) Exception local256) {
					continue;
				}
			}
			@Pc(268) long local268 = Static521.method7499();
			@Pc(277) int local277 = (int) (local6 + 20L - local268);
			if (local277 > 0) {
				Static20.method9254((long) local277);
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
	public synchronized void method8669() {
		this.aBoolean725 = true;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)I")
	public int method8671() {
		if (this.aClass131_23 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass131_23.method3020();
		if (this.aClass131_23.aBoolean274 && this.aClass131_23.anInt3618 > this.anInt10398) {
			return this.anInt10398 + 1;
		} else if (local13 >= 0 && local13 < Static571.aClass131Array1.length - 1) {
			return this.anInt10398 == this.aClass131_23.anInt3620 ? this.aClass131_23.anInt3618 : this.aClass131_23.anInt3620;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/String;JIILclient!gp;)V")
	public synchronized void method8672(@OriginalArg(0) String arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class131 arg3) {
		this.aString113 = arg0;
		this.anInt10398 = arg2;
		this.aClass131_23 = arg3;
		this.aLong278 = arg1;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)Lclient!gp;")
	public Class131 method8673() {
		return this.aClass131_23;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)I")
	public int method8674() {
		return this.anInt10398;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public String method8675() {
		return this.aString113;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)J")
	public long method8676() {
		return this.aLong278;
	}
}
