import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class23 implements Runnable {

	@OriginalMember(owner = "client!as", name = "i", descriptor = "Z")
	private boolean aBoolean55;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "Z")
	private volatile boolean aBoolean56;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "Lclient!caa;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!as", name = "s", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!as", name = "u", descriptor = "I")
	private int anInt539;

	@OriginalMember(owner = "client!as", name = "v", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "I")
	private int anInt540;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "Lclient!lm;")
	private Interface16 anInterface16_1 = new Class272();

	@OriginalMember(owner = "client!as", name = "t", descriptor = "Lclient!lm;")
	private Interface16 anInterface16_2 = null;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)J")
	public long method615() {
		return this.aLong14;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)I")
	public int method616() {
		return this.anInt539;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Lclient!caa;")
	public Class48 method617() {
		return this.aClass48_1;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)I")
	public int method619() {
		if (this.aClass48_1 == null) {
			return 0;
		}
		@Pc(15) int local15 = this.aClass48_1.method1309();
		if (this.aClass48_1.aBoolean131 && this.anInt539 < this.aClass48_1.anInt1435) {
			return this.anInt539 + 1;
		} else if (local15 >= 0 && local15 < Static368.aClass48Array1.length - 1) {
			return this.aClass48_1.anInt1437 == this.anInt539 ? this.aClass48_1.anInt1435 : this.aClass48_1.anInt1437;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Z")
	public synchronized boolean method620() {
		return this.anInterface16_1.method6303(this.aLong13);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(JLclient!caa;ILjava/lang/String;I)V")
	public synchronized void method621(@OriginalArg(0) long arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		this.aLong14 = arg0;
		this.aClass48_1 = arg1;
		this.anInt539 = arg2;
		this.aString4 = arg3;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method622() {
		return this.aString4;
	}

	@OriginalMember(owner = "client!as", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean56) {
			@Pc(10) long local10 = Static48.method1203();
			synchronized (this) {
				try {
					this.anInt540++;
					if (this.anInterface16_1 instanceof Class272) {
						this.anInterface16_1.method6301(this.aBoolean55);
					} else {
						@Pc(27) long local27 = Static48.method1203();
						if (Static141.aClass13_27 == null || this.anInterface16_2 == null || this.anInterface16_2.method6300() == 0 || this.aLong13 < local27 - (long) this.anInterface16_2.method6300()) {
							if (this.anInterface16_2 != null) {
								this.aBoolean55 = true;
								this.anInterface16_2.method6299();
								this.anInterface16_2 = null;
							}
							if (this.aBoolean55) {
								Static123.method2208();
								if (Static141.aClass13_27 != null) {
									Static141.aClass13_27.GA(0);
								}
							}
							this.anInterface16_1.method6301(this.aBoolean55 || Static141.aClass13_27 != null && Static141.aClass13_27.method8084());
						} else {
							@Pc(107) int local107 = (int) ((local27 - this.aLong13) * 255L / (long) this.anInterface16_2.method6300());
							@Pc(112) int local112 = 255 - local107;
							@Pc(118) int local118 = local112 << 24 | 0xFFFFFF;
							Static123.method2208();
							@Pc(126) int local126 = local107 << 24 | 0xFFFFFF;
							Static141.aClass13_27.GA(0);
							@Pc(135) Class31 local135 = Static141.aClass13_27.method8169(Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925, true);
							Static141.aClass13_27.method8127(local135);
							this.anInterface16_2.method6301(true);
							Static141.aClass13_27.method8094();
							local135.method8796(0, 0, 0, local118, 1);
							Static141.aClass13_27.method8127(local135);
							Static141.aClass13_27.GA(0);
							this.anInterface16_1.method6301(true);
							Static141.aClass13_27.method8094();
							local135.method8796(0, 0, 0, local126, 1);
						}
						try {
							if (Static141.aClass13_27 != null && !(this.anInterface16_1 instanceof Class272)) {
								Static141.aClass13_27.method8129();
							}
						} catch (@Pc(185) Exception_Sub1 local185) {
							Static25.method7457(local185, local185.getMessage() + " (Recovered) " + Static509.aClient1.method1714());
							Static99.method1936(true, 0);
						}
					}
					@Pc(219) Container local219;
					if (Static80.aFrame2 != null) {
						local219 = Static80.aFrame2;
					} else if (Static107.anApplet1 == null) {
						local219 = Static253.anApplet_Sub1_1;
					} else {
						local219 = Static107.anApplet1;
					}
					local219.getSize();
					local219.getSize();
					if (Static80.aFrame2 == local219) {
						Static80.aFrame2.getInsets();
					}
					this.aBoolean55 = false;
					if (Static141.aClass13_27 != null && !(this.anInterface16_1 instanceof Class272) && this.aClass48_1.method1309() < Static58.aClass48_20.method1309()) {
						Static141.method2565();
					}
				} catch (@Pc(264) Exception local264) {
					continue;
				}
			}
			@Pc(276) long local276 = Static48.method1203();
			@Pc(285) int local285 = (int) (local10 + 20L - local276);
			if (local285 > 0) {
				Static440.method6322((long) local285);
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!lm;Z)V")
	public synchronized void method623(@OriginalArg(0) Interface16 arg0) {
		this.anInterface16_2 = this.anInterface16_1;
		this.anInterface16_1 = arg0;
		this.aLong13 = Static48.method1203();
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(I)I")
	public int method624() {
		return this.anInt540;
	}

	@OriginalMember(owner = "client!as", name = "e", descriptor = "(I)V")
	public void method625() {
		this.aBoolean56 = true;
	}

	@OriginalMember(owner = "client!as", name = "f", descriptor = "(I)V")
	public synchronized void method626() {
		this.aBoolean55 = true;
	}
}
