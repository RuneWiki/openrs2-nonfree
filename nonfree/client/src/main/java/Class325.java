import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class325 implements Runnable {

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Z")
	private volatile boolean aBoolean570;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Z")
	private boolean aBoolean571;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
	private int anInt8522;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "Lclient!rr;")
	private Class331 aClass331_2;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "J")
	private long aLong286;

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "J")
	private long aLong287;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
	private int anInt8523;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "Ljava/lang/String;")
	private String aString108;

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "Lclient!uf;")
	private Interface24 anInterface24_1 = new Class316();

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "Lclient!uf;")
	private Interface24 anInterface24_2 = null;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!uf;B)V")
	public synchronized void method7272(@OriginalArg(0) Interface24 arg0) {
		this.anInterface24_2 = this.anInterface24_1;
		this.anInterface24_1 = arg0;
		this.aLong287 = Static517.method6965();
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Z")
	public synchronized boolean method7273() {
		return this.anInterface24_1.method7120(this.aLong287);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)J")
	public long method7276() {
		return this.aLong286;
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
	public synchronized void method7277() {
		this.aBoolean571 = true;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V")
	public void method7278() {
		this.aBoolean570 = true;
	}

	@OriginalMember(owner = "client!rg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean570) {
			@Pc(8) long local8 = Static517.method6965();
			synchronized (this) {
				try {
					this.anInt8522++;
					if (this.anInterface24_1 instanceof Class316) {
						this.anInterface24_1.method7119(this.aBoolean571);
					} else {
						@Pc(33) long local33 = Static517.method6965();
						if (Static153.aClass22_4 == null || this.anInterface24_2 == null || this.anInterface24_2.method7122() == 0 || this.aLong287 < local33 - (long) this.anInterface24_2.method7122()) {
							if (this.anInterface24_2 != null) {
								this.aBoolean571 = true;
								this.anInterface24_2.method7121();
								this.anInterface24_2 = null;
							}
							if (this.aBoolean571) {
								Static598.method7697();
								if (Static153.aClass22_4 != null) {
									Static153.aClass22_4.GA(0);
								}
							}
							this.anInterface24_1.method7119(this.aBoolean571 || Static153.aClass22_4 != null && Static153.aClass22_4.method9340());
						} else {
							@Pc(130) int local130 = (int) ((local33 - this.aLong287) * 255L / (long) this.anInterface24_2.method7122());
							@Pc(135) int local135 = 255 - local130;
							Static598.method7697();
							@Pc(143) int local143 = local130 << 24 | 0xFFFFFF;
							@Pc(149) int local149 = local135 << 24 | 0xFFFFFF;
							Static153.aClass22_4.GA(0);
							@Pc(158) Class178 local158 = Static153.aClass22_4.method9361(Static681.anInt10652, Static76.anInt1720, true);
							Static153.aClass22_4.method9325(local158);
							this.anInterface24_2.method7119(true);
							Static153.aClass22_4.method9351();
							local158.method7616(0, 0, 0, local149, 1);
							Static153.aClass22_4.method9325(local158);
							Static153.aClass22_4.GA(0);
							this.anInterface24_1.method7119(true);
							Static153.aClass22_4.method9351();
							local158.method7616(0, 0, 0, local143, 1);
						}
						try {
							if (Static153.aClass22_4 != null && !(this.anInterface24_1 instanceof Class316)) {
								Static153.aClass22_4.method9358();
							}
						} catch (@Pc(210) Exception_Sub1 local210) {
							Static275.method4893(local210.getMessage() + " (Recovered) " + Static459.aClient1.method1842(), local210);
							Static36.method1127(true, 0);
						}
					}
					@Pc(241) Container local241;
					if (Static628.aFrame2 != null) {
						local241 = Static628.aFrame2;
					} else if (Static41.anApplet1 == null) {
						local241 = Static229.anApplet_Sub1_1;
					} else {
						local241 = Static41.anApplet1;
					}
					local241.getSize();
					local241.getSize();
					if (local241 == Static628.aFrame2) {
						Static628.aFrame2.getInsets();
					}
					this.aBoolean571 = false;
					if (Static153.aClass22_4 != null && !(this.anInterface24_1 instanceof Class316) && this.aClass331_2.method7410() < Static572.aClass331_21.method7410()) {
						Static205.method3108();
					}
				} catch (@Pc(292) Exception local292) {
					continue;
				}
			}
			@Pc(304) long local304 = Static517.method6965();
			@Pc(312) int local312 = (int) (local8 + 20L - local304);
			if (local312 > 0) {
				Static550.method7219((long) local312);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)Lclient!rr;")
	public Class331 method7279() {
		return this.aClass331_2;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I")
	public int method7280() {
		if (this.aClass331_2 == null) {
			return 0;
		}
		@Pc(14) int local14 = this.aClass331_2.method7410();
		if (this.aClass331_2.aBoolean584 && this.anInt8523 < this.aClass331_2.anInt8681) {
			return this.anInt8523 + 1;
		} else if (local14 >= 0 && Static238.aClass331Array1.length - 1 > local14) {
			return this.anInt8523 == this.aClass331_2.anInt8680 ? this.aClass331_2.anInt8681 : this.aClass331_2.anInt8680;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IJLclient!rr;BLjava/lang/String;)V")
	public synchronized void method7281(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class331 arg2, @OriginalArg(4) String arg3) {
		this.aClass331_2 = arg2;
		this.aLong286 = arg1;
		this.aString108 = arg3;
		this.anInt8523 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method7282() {
		return this.aString108;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)I")
	public int method7283() {
		return this.anInt8522;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)I")
	public int method7284() {
		return this.anInt8523;
	}
}
