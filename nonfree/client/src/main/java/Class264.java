import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class264 implements Runnable {

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "Z")
	private boolean aBoolean581;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "Z")
	private volatile boolean aBoolean582;

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "Ljava/lang/String;")
	private String aString104;

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
	private int anInt7650;

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "I")
	private int anInt7651;

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "Lclient!sp;")
	private Class344 aClass344_1;

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "J")
	private long aLong258;

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "J")
	private long aLong259;

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "Lclient!rp;")
	private Interface23 anInterface23_1 = new Class353();

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "Lclient!rp;")
	private Interface23 anInterface23_2 = null;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!sp;Ljava/lang/String;IJ)V")
	public synchronized void method6401(@OriginalArg(1) Class344 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		this.anInt7650 = arg2;
		this.aString104 = arg1;
		this.aLong259 = arg3;
		this.aClass344_1 = arg0;
	}

	@OriginalMember(owner = "client!nv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean582) {
			@Pc(12) long local12 = Static626.method8479();
			synchronized (this) {
				try {
					this.anInt7651++;
					if (this.anInterface23_1 instanceof Class353) {
						this.anInterface23_1.method8326(this.aBoolean581);
					} else {
						@Pc(29) long local29 = Static626.method8479();
						if (Static488.aClass67_12 == null || this.anInterface23_2 == null || this.anInterface23_2.method8330() == 0 || this.aLong258 < local29 - (long) this.anInterface23_2.method8330()) {
							if (this.anInterface23_2 != null) {
								this.aBoolean581 = true;
								this.anInterface23_2.method8329();
								this.anInterface23_2 = null;
							}
							if (this.aBoolean581) {
								Static458.method6794();
								if (Static488.aClass67_12 != null) {
									Static488.aClass67_12.GA(0);
								}
							}
							this.anInterface23_1.method8326(this.aBoolean581 || Static488.aClass67_12 != null && Static488.aClass67_12.method7684());
						} else {
							@Pc(78) int local78 = (int) ((local29 - this.aLong258) * 255L / (long) this.anInterface23_2.method8330());
							@Pc(82) int local82 = 255 - local78;
							@Pc(88) int local88 = local82 << 24 | 0xFFFFFF;
							@Pc(94) int local94 = local78 << 24 | 0xFFFFFF;
							Static458.method6794();
							Static488.aClass67_12.GA(0);
							@Pc(105) Class9 local105 = Static488.aClass67_12.method7670(Static575.anInt9435, Static272.anInt5005, true);
							Static488.aClass67_12.method7704(local105);
							this.anInterface23_2.method8326(true);
							Static488.aClass67_12.method7645();
							local105.method8621(0, 0, 0, local88, 1);
							Static488.aClass67_12.method7704(local105);
							Static488.aClass67_12.GA(0);
							this.anInterface23_1.method8326(true);
							Static488.aClass67_12.method7645();
							local105.method8621(0, 0, 0, local94, 1);
						}
						try {
							if (Static488.aClass67_12 != null && !(this.anInterface23_1 instanceof Class353)) {
								Static488.aClass67_12.method7676();
							}
						} catch (@Pc(210) Exception_Sub1 local210) {
							Static64.method799(local210.getMessage() + " (Recovered) " + Static556.aClient1.method1159(), local210);
							Static718.method9389(0, true);
						}
					}
					@Pc(246) Container local246;
					if (Static131.aFrame1 != null) {
						local246 = Static131.aFrame1;
					} else if (Static395.anApplet1 == null) {
						local246 = Static31.anApplet_Sub1_3;
					} else {
						local246 = Static395.anApplet1;
					}
					local246.getSize();
					local246.getSize();
					if (Static131.aFrame1 == local246) {
						Static131.aFrame1.getInsets();
					}
					this.aBoolean581 = false;
					if (Static488.aClass67_12 != null && !(this.anInterface23_1 instanceof Class353) && this.aClass344_1.method8153() < Static593.aClass344_21.method8153()) {
						Static599.method8246();
					}
				} catch (@Pc(301) Exception local301) {
					continue;
				}
			}
			@Pc(313) long local313 = Static626.method8479();
			@Pc(321) int local321 = (int) (local12 + 20L - local313);
			if (local321 > 0) {
				Static564.method7845((long) local321);
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "(I)Lclient!sp;")
	public Class344 method6402() {
		return this.aClass344_1;
	}

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "(I)V")
	public synchronized void method6403() {
		this.aBoolean581 = true;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)J")
	public long method6404() {
		return this.aLong259;
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)I")
	public int method6406() {
		return this.anInt7650;
	}

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "(I)Ljava/lang/String;")
	public String method6407() {
		return this.aString104;
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(I)V")
	public void method6409() {
		this.aBoolean582 = true;
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(I)Z")
	public synchronized boolean method6410() {
		return this.anInterface23_1.method8328(this.aLong258);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!rp;Z)V")
	public synchronized void method6411(@OriginalArg(0) Interface23 arg0) {
		this.anInterface23_2 = this.anInterface23_1;
		this.anInterface23_1 = arg0;
		this.aLong258 = Static626.method8479();
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)I")
	public int method6412() {
		if (this.aClass344_1 == null) {
			return 0;
		}
		@Pc(20) int local20 = this.aClass344_1.method8153();
		if (this.aClass344_1.aBoolean693 && this.anInt7650 < this.aClass344_1.anInt9668) {
			return this.anInt7650 + 1;
		} else if (local20 >= 0 && local20 < Static142.aClass344Array1.length - 1) {
			return this.anInt7650 == this.aClass344_1.anInt9660 ? this.aClass344_1.anInt9668 : this.aClass344_1.anInt9660;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "(I)I")
	public int method6413() {
		return this.anInt7651;
	}
}
