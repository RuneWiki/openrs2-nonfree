import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class339 implements Runnable {

	@OriginalMember(owner = "client!tea", name = "u", descriptor = "Z")
	private volatile boolean aBoolean691;

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "Z")
	private boolean aBoolean692;

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "J")
	private long aLong296;

	@OriginalMember(owner = "client!tea", name = "y", descriptor = "I")
	private int anInt9286;

	@OriginalMember(owner = "client!tea", name = "p", descriptor = "I")
	private int anInt9287;

	@OriginalMember(owner = "client!tea", name = "r", descriptor = "Lclient!sl;")
	private Class331 aClass331_23;

	@OriginalMember(owner = "client!tea", name = "q", descriptor = "J")
	private long aLong297;

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "Ljava/lang/String;")
	private String aString113;

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "Lclient!cka;")
	private Interface9 anInterface9_1 = new Class9();

	@OriginalMember(owner = "client!tea", name = "j", descriptor = "Lclient!cka;")
	private Interface9 anInterface9_2 = null;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)I")
	public int method8107() {
		if (this.aClass331_23 == null) {
			return 0;
		}
		@Pc(14) int local14 = this.aClass331_23.method7957();
		if (this.aClass331_23.aBoolean687 && this.aClass331_23.anInt9107 > this.anInt9287) {
			return this.anInt9287 + 1;
		} else if (local14 >= 0 && local14 < Static42.aClass331Array1.length - 1) {
			return this.anInt9287 == this.aClass331_23.anInt9109 ? this.aClass331_23.anInt9107 : this.aClass331_23.anInt9109;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!cka;B)V")
	public synchronized void method8108(@OriginalArg(0) Interface9 arg0) {
		this.anInterface9_2 = this.anInterface9_1;
		this.anInterface9_1 = arg0;
		this.aLong297 = Static549.method7758();
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method8110() {
		return this.aString113;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)Z")
	public synchronized boolean method8111() {
		return this.anInterface9_1.method3093(this.aLong297);
	}

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "(I)I")
	public int method8113() {
		return this.anInt9286;
	}

	@OriginalMember(owner = "client!tea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean691) {
			@Pc(12) long local12 = Static549.method7758();
			synchronized (this) {
				try {
					this.anInt9286++;
					if (this.anInterface9_1 instanceof Class9) {
						this.anInterface9_1.method3092(this.aBoolean692);
					} else {
						@Pc(37) long local37 = Static549.method7758();
						if (Static202.aClass75_5 == null || this.anInterface9_2 == null || this.anInterface9_2.method3091() == 0 || this.aLong297 < local37 - (long) this.anInterface9_2.method3091()) {
							if (this.anInterface9_2 != null) {
								this.aBoolean692 = true;
								this.anInterface9_2.method3094();
								this.anInterface9_2 = null;
							}
							if (this.aBoolean692) {
								Static17.method220();
								if (Static202.aClass75_5 != null) {
									Static202.aClass75_5.GA(0);
								}
							}
							this.anInterface9_1.method3092(this.aBoolean692 || Static202.aClass75_5 != null && Static202.aClass75_5.method6703());
						} else {
							@Pc(82) int local82 = (int) ((local37 - this.aLong297) * 255L / (long) this.anInterface9_2.method3091());
							@Pc(87) int local87 = 255 - local82;
							Static17.method220();
							@Pc(95) int local95 = local82 << 24 | 0xFFFFFF;
							@Pc(101) int local101 = local87 << 24 | 0xFFFFFF;
							Static202.aClass75_5.GA(0);
							@Pc(110) Class49 local110 = Static202.aClass75_5.method6710(Static535.anInt4128, Static274.anInt3226, true);
							Static202.aClass75_5.method6662(local110);
							this.anInterface9_2.method3092(true);
							Static202.aClass75_5.method6715();
							local110.method8981(0, 0, 0, local101, 1);
							Static202.aClass75_5.method6662(local110);
							Static202.aClass75_5.GA(0);
							this.anInterface9_1.method3092(true);
							Static202.aClass75_5.method6715();
							local110.method8981(0, 0, 0, local95, 1);
						}
						try {
							if (Static202.aClass75_5 != null && !(this.anInterface9_1 instanceof Class9)) {
								Static202.aClass75_5.method6638();
							}
						} catch (@Pc(215) Exception_Sub1 local215) {
							Static550.method7785(local215, local215.getMessage() + " (Recovered) " + Static635.aClient1.method1046());
							Static536.method7652(true, 0);
						}
					}
					@Pc(242) Container local242;
					if (Static637.aFrame3 != null) {
						local242 = Static637.aFrame3;
					} else if (Static371.anApplet1 == null) {
						local242 = Static34.anApplet_Sub1_1;
					} else {
						local242 = Static371.anApplet1;
					}
					local242.getSize();
					local242.getSize();
					if (local242 == Static637.aFrame3) {
						Static637.aFrame3.getInsets();
					}
					this.aBoolean692 = false;
					if (Static202.aClass75_5 != null && !(this.anInterface9_1 instanceof Class9) && this.aClass331_23.method7957() < Static564.aClass331_20.method7957()) {
						Static552.method7812();
					}
				} catch (@Pc(297) Exception local297) {
					continue;
				}
			}
			@Pc(309) long local309 = Static549.method7758();
			@Pc(317) int local317 = (int) (local12 + 20L - local309);
			if (local317 > 0) {
				Static255.method4444((long) local317);
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
	public synchronized void method8114() {
		this.aBoolean692 = true;
	}

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "(I)J")
	public long method8115() {
		return this.aLong296;
	}

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "(I)I")
	public int method8116() {
		return this.anInt9287;
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(B)V")
	public void method8117() {
		this.aBoolean691 = true;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)Lclient!sl;")
	public Class331 method8118() {
		return this.aClass331_23;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(BLclient!sl;IJLjava/lang/String;)V")
	public synchronized void method8119(@OriginalArg(1) Class331 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) String arg3) {
		this.aClass331_23 = arg0;
		this.aString113 = arg3;
		this.anInt9287 = arg1;
		this.aLong296 = arg2;
	}
}
