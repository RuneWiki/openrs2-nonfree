import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class8 implements Runnable {

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Z")
	private boolean aBoolean8;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Z")
	private volatile boolean aBoolean9;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "J")
	private long aLong4;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
	private int anInt131;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Lclient!jj;")
	private Class167 aClass167_1;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!dca;")
	private Interface5 anInterface5_1 = new Class367();

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "Lclient!dca;")
	private Interface5 anInterface5_2 = null;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I")
	public int method168() {
		if (this.aClass167_1 == null) {
			return 0;
		}
		@Pc(19) int local19 = this.aClass167_1.method4891();
		if (this.aClass167_1.aBoolean438 && this.aClass167_1.anInt5651 > this.anInt131) {
			return this.anInt131 + 1;
		} else if (local19 >= 0 && Static217.aClass167Array2.length - 1 > local19) {
			return this.anInt131 == this.aClass167_1.anInt5653 ? this.aClass167_1.anInt5651 : this.aClass167_1.anInt5653;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!jj;Ljava/lang/String;IJZ)V")
	public synchronized void method169(@OriginalArg(0) Class167 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		this.aString1 = arg1;
		this.anInt131 = arg2;
		this.aLong5 = arg3;
		this.aClass167_1 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean9) {
			@Pc(10) long local10 = Static277.method5091();
			synchronized (this) {
				try {
					this.anInt133++;
					if (this.anInterface5_1 instanceof Class367) {
						this.anInterface5_1.method9012(this.aBoolean8);
					} else {
						@Pc(35) long local35 = Static277.method5091();
						if (Static186.aClass20_4 == null || this.anInterface5_2 == null || this.anInterface5_2.method9009() == 0 || this.aLong4 < local35 - (long) this.anInterface5_2.method9009()) {
							if (this.anInterface5_2 != null) {
								this.aBoolean8 = true;
								this.anInterface5_2.method9013();
								this.anInterface5_2 = null;
							}
							if (this.aBoolean8) {
								Static390.method6424();
								if (Static186.aClass20_4 != null) {
									Static186.aClass20_4.GA(0);
								}
							}
							this.anInterface5_1.method9012(this.aBoolean8 || Static186.aClass20_4 != null && Static186.aClass20_4.method7258());
						} else {
							@Pc(71) int local71 = (int) ((local35 - this.aLong4) * 255L / (long) this.anInterface5_2.method9009());
							@Pc(76) int local76 = 255 - local71;
							@Pc(82) int local82 = local76 << 24 | 0xFFFFFF;
							@Pc(88) int local88 = local71 << 24 | 0xFFFFFF;
							Static390.method6424();
							Static186.aClass20_4.GA(0);
							@Pc(99) Class46 local99 = Static186.aClass20_4.method7232(Static81.anInt2497, Static423.anInt7984, true);
							Static186.aClass20_4.method7284(local99);
							this.anInterface5_2.method9012(true);
							Static186.aClass20_4.method7275();
							local99.method6203(0, 0, 0, local82, 1);
							Static186.aClass20_4.method7284(local99);
							Static186.aClass20_4.GA(0);
							this.anInterface5_1.method9012(true);
							Static186.aClass20_4.method7275();
							local99.method6203(0, 0, 0, local88, 1);
						}
						try {
							if (Static186.aClass20_4 != null && !(this.anInterface5_1 instanceof Class367)) {
								Static186.aClass20_4.method7292();
							}
						} catch (@Pc(189) Exception_Sub1 local189) {
							Static408.method6625(local189.getMessage() + " (Recovered) " + Static30.aClient1.method2211(), local189);
							Static316.method5509(true, 0);
						}
					}
					@Pc(214) Container local214;
					if (Static255.aFrame2 != null) {
						local214 = Static255.aFrame2;
					} else if (Static334.anApplet2 == null) {
						local214 = Static297.anApplet_Sub1_1;
					} else {
						local214 = Static334.anApplet2;
					}
					local214.getSize();
					local214.getSize();
					if (Static255.aFrame2 == local214) {
						Static255.aFrame2.getInsets();
					}
					this.aBoolean8 = false;
					if (Static186.aClass20_4 != null && !(this.anInterface5_1 instanceof Class367) && this.aClass167_1.method4891() < Static265.aClass167_21.method4891()) {
						Static407.method6619();
					}
				} catch (@Pc(257) Exception local257) {
					continue;
				}
			}
			@Pc(269) long local269 = Static277.method5091();
			@Pc(278) int local278 = (int) (local10 + 20L - local269);
			if (local278 > 0) {
				Static190.method3914((long) local278);
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method171() {
		return this.aString1;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
	public void method172() {
		this.aBoolean9 = true;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)I")
	public int method173() {
		return this.anInt131;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!dca;)V")
	public synchronized void method174(@OriginalArg(1) Interface5 arg0) {
		this.anInterface5_2 = this.anInterface5_1;
		this.anInterface5_1 = arg0;
		this.aLong4 = Static277.method5091();
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Z")
	public synchronized boolean method175() {
		return this.anInterface5_1.method9010(this.aLong4);
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)J")
	public long method176() {
		return this.aLong5;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)Lclient!jj;")
	public Class167 method177() {
		return this.aClass167_1;
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)I")
	public int method178() {
		return this.anInt133;
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
	public synchronized void method179() {
		this.aBoolean8 = true;
	}
}
