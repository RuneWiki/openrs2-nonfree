import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class121 implements Runnable {

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "Z")
	private boolean aBoolean288;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "Z")
	private volatile boolean aBoolean289;

	@OriginalMember(owner = "client!gu", name = "t", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!gu", name = "v", descriptor = "Lclient!nr;")
	private Class228 aClass228_1;

	@OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
	private int anInt3959;

	@OriginalMember(owner = "client!gu", name = "x", descriptor = "Ljava/lang/String;")
	private String aString48;

	@OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
	private int anInt3960;

	@OriginalMember(owner = "client!gu", name = "G", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "Lclient!dr;")
	private Interface6 anInterface6_1 = new Class285();

	@OriginalMember(owner = "client!gu", name = "z", descriptor = "Lclient!dr;")
	private Interface6 anInterface6_2 = null;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
	public int method3456() {
		return this.anInt3960;
	}

	@OriginalMember(owner = "client!gu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean289) {
			@Pc(10) long local10 = Static32.method595();
			synchronized (this) {
				try {
					this.anInt3959++;
					if (this.anInterface6_1 instanceof Class285) {
						this.anInterface6_1.method7223(this.aBoolean288);
					} else {
						@Pc(35) long local35 = Static32.method595();
						if (Static162.aClass100_7 == null || this.anInterface6_2 == null || this.anInterface6_2.method7225() == 0 || this.aLong99 < local35 - (long) this.anInterface6_2.method7225()) {
							if (this.anInterface6_2 != null) {
								this.aBoolean288 = true;
								this.anInterface6_2.method7224();
								this.anInterface6_2 = null;
							}
							if (this.aBoolean288) {
								Static27.method485();
								if (Static162.aClass100_7 != null) {
									Static162.aClass100_7.GA(0);
								}
							}
							this.anInterface6_1.method7223(this.aBoolean288 || Static162.aClass100_7 != null && Static162.aClass100_7.method8853());
						} else {
							@Pc(72) int local72 = (int) ((local35 - this.aLong99) * 255L / (long) this.anInterface6_2.method7225());
							@Pc(77) int local77 = 255 - local72;
							@Pc(83) int local83 = local72 << 24 | 0xFFFFFF;
							Static27.method485();
							@Pc(91) int local91 = local77 << 24 | 0xFFFFFF;
							Static162.aClass100_7.GA(0);
							@Pc(100) Class32 local100 = Static162.aClass100_7.method8823(Static321.anInt6137, Static356.anInt6630, true);
							Static162.aClass100_7.method8778(local100);
							this.anInterface6_2.method7223(true);
							Static162.aClass100_7.method8854();
							local100.method5088(0, 0, 0, local91, 1);
							Static162.aClass100_7.method8778(local100);
							Static162.aClass100_7.GA(0);
							this.anInterface6_1.method7223(true);
							Static162.aClass100_7.method8854();
							local100.method5088(0, 0, 0, local83, 1);
						}
						try {
							if (Static162.aClass100_7 != null && !(this.anInterface6_1 instanceof Class285)) {
								Static162.aClass100_7.method8772();
							}
						} catch (@Pc(190) Exception_Sub1 local190) {
							Static619.method8645(local190, local190.getMessage() + " (Recovered) " + Static119.aClient1.method1348());
							Static278.method4875(0, true);
						}
					}
					@Pc(217) Container local217;
					if (Static70.aFrame3 != null) {
						local217 = Static70.aFrame3;
					} else if (Static42.anApplet1 == null) {
						local217 = Static4.anApplet_Sub1_5;
					} else {
						local217 = Static42.anApplet1;
					}
					local217.getSize();
					local217.getSize();
					if (Static70.aFrame3 == local217) {
						Static70.aFrame3.getInsets();
					}
					this.aBoolean288 = false;
					if (Static162.aClass100_7 != null && !(this.anInterface6_1 instanceof Class285) && this.aClass228_1.method6202() < Static385.aClass228_21.method6202()) {
						Static132.method2134();
					}
				} catch (@Pc(262) Exception local262) {
					continue;
				}
			}
			@Pc(274) long local274 = Static32.method595();
			@Pc(281) int local281 = (int) (local10 + 20L - local274);
			if (local281 > 0) {
				Static179.method3254((long) local281);
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public synchronized void method3457() {
		this.aBoolean288 = true;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)Lclient!nr;")
	public Class228 method3458() {
		return this.aClass228_1;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)Z")
	public synchronized boolean method3459() {
		return this.anInterface6_1.method7222(this.aLong99);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(JLjava/lang/String;IILclient!nr;)V")
	public synchronized void method3460(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class228 arg3) {
		this.aLong100 = arg0;
		this.aString48 = arg1;
		this.anInt3960 = arg2;
		this.aClass228_1 = arg3;
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)J")
	public long method3461() {
		return this.aLong100;
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)V")
	public void method3462() {
		this.aBoolean289 = true;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(Z)I")
	public int method3464() {
		return this.anInt3959;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!dr;I)V")
	public synchronized void method3467(@OriginalArg(0) Interface6 arg0) {
		this.anInterface6_2 = this.anInterface6_1;
		this.anInterface6_1 = arg0;
		this.aLong99 = Static32.method595();
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method3468() {
		return this.aString48;
	}

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "(I)I")
	public int method3469() {
		if (this.aClass228_1 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass228_1.method6202();
		if (this.aClass228_1.aBoolean495 && this.aClass228_1.anInt7287 > this.anInt3960) {
			return this.anInt3960 + 1;
		} else if (local13 >= 0 && Static238.aClass228Array1.length - 1 > local13) {
			return this.aClass228_1.anInt7289 == this.anInt3960 ? this.aClass228_1.anInt7287 : this.aClass228_1.anInt7289;
		} else {
			return 100;
		}
	}
}
