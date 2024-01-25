import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class193 implements Runnable {

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "Z")
	private volatile boolean aBoolean387;

	@OriginalMember(owner = "client!kn", name = "s", descriptor = "Z")
	private boolean aBoolean388;

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "J")
	private long aLong167;

	@OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
	private int anInt5320;

	@OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
	private int anInt5321;

	@OriginalMember(owner = "client!kn", name = "x", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!kn", name = "y", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!kn", name = "z", descriptor = "Lclient!bu;")
	private Class45 aClass45_22;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "Lclient!od;")
	private Interface19 anInterface19_1 = new Class101();

	@OriginalMember(owner = "client!kn", name = "u", descriptor = "Lclient!od;")
	private Interface19 anInterface19_2 = null;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)I")
	public int method4856() {
		return this.anInt5320;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)I")
	public int method4857() {
		if (this.aClass45_22 == null) {
			return 0;
		}
		@Pc(20) int local20 = this.aClass45_22.method1209();
		if (this.aClass45_22.aBoolean84 && this.anInt5320 < this.aClass45_22.anInt1148) {
			return this.anInt5320 + 1;
		} else if (local20 >= 0 && Static594.aClass45Array1.length - 1 > local20) {
			return this.aClass45_22.anInt1154 == this.anInt5320 ? this.aClass45_22.anInt1148 : this.aClass45_22.anInt1154;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!od;B)V")
	public synchronized void method4858(@OriginalArg(0) Interface19 arg0) {
		this.anInterface19_2 = this.anInterface19_1;
		this.anInterface19_1 = arg0;
		this.aLong167 = Static524.method7320();
	}

	@OriginalMember(owner = "client!kn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean387) {
			@Pc(6) long local6 = Static524.method7320();
			synchronized (this) {
				try {
					this.anInt5321++;
					if (this.anInterface19_1 instanceof Class101) {
						this.anInterface19_1.method2901(this.aBoolean388);
					} else {
						@Pc(23) long local23 = Static524.method7320();
						if (Static674.aClass13_22 == null || this.anInterface19_2 == null || this.anInterface19_2.method2896() == 0 || this.aLong167 < local23 - (long) this.anInterface19_2.method2896()) {
							if (this.anInterface19_2 != null) {
								this.aBoolean388 = true;
								this.anInterface19_2.method2897();
								this.anInterface19_2 = null;
							}
							if (this.aBoolean388) {
								Static633.method8836();
								if (Static674.aClass13_22 != null) {
									Static674.aClass13_22.GA(0);
								}
							}
							this.anInterface19_1.method2901(this.aBoolean388 || Static674.aClass13_22 != null && Static674.aClass13_22.method8508());
						} else {
							@Pc(106) int local106 = (int) ((local23 - this.aLong167) * 255L / (long) this.anInterface19_2.method2896());
							@Pc(111) int local111 = 255 - local106;
							Static633.method8836();
							@Pc(119) int local119 = local111 << 24 | 0xFFFFFF;
							@Pc(125) int local125 = local106 << 24 | 0xFFFFFF;
							Static674.aClass13_22.GA(0);
							@Pc(134) Class33 local134 = Static674.aClass13_22.method8487(Static312.anInt5191, Static222.anInt4196, true);
							Static674.aClass13_22.method8476(local134);
							this.anInterface19_2.method2901(true);
							Static674.aClass13_22.method8490();
							local134.method7644(0, 0, 0, local119, 1);
							Static674.aClass13_22.method8476(local134);
							Static674.aClass13_22.GA(0);
							this.anInterface19_1.method2901(true);
							Static674.aClass13_22.method8490();
							local134.method7644(0, 0, 0, local125, 1);
						}
						try {
							if (Static674.aClass13_22 != null && !(this.anInterface19_1 instanceof Class101)) {
								Static674.aClass13_22.method8518();
							}
						} catch (@Pc(184) Exception_Sub1 local184) {
							Static503.method7153(local184.getMessage() + " (Recovered) " + Static200.aClient1.method1490(), local184);
							Static382.method5480(true, 0);
						}
					}
					@Pc(218) Container local218;
					if (Static380.aFrame2 != null) {
						local218 = Static380.aFrame2;
					} else if (Static124.anApplet1 == null) {
						local218 = Static95.anApplet_Sub1_1;
					} else {
						local218 = Static124.anApplet1;
					}
					local218.getSize();
					local218.getSize();
					if (local218 == Static380.aFrame2) {
						Static380.aFrame2.getInsets();
					}
					this.aBoolean388 = false;
					if (Static674.aClass13_22 != null && !(this.anInterface19_1 instanceof Class101) && this.aClass45_22.method1209() < Static55.aClass45_19.method1209()) {
						Static135.method5711();
					}
				} catch (@Pc(259) Exception local259) {
					continue;
				}
			}
			@Pc(271) long local271 = Static524.method7320();
			@Pc(279) int local279 = (int) (local6 + 20L - local271);
			if (local279 > 0) {
				Static373.method5403((long) local279);
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
	public synchronized void method4859() {
		this.aBoolean388 = true;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)Z")
	public synchronized boolean method4860() {
		return this.anInterface19_1.method2898(this.aLong167);
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method4862() {
		return this.aString54;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I")
	public int method4863() {
		return this.anInt5321;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)Lclient!bu;")
	public Class45 method4865() {
		return this.aClass45_22;
	}

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)V")
	public void method4866() {
		this.aBoolean387 = true;
	}

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)J")
	public long method4868() {
		return this.aLong168;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/String;Lclient!bu;IJ)V")
	public synchronized void method4869(@OriginalArg(1) String arg0, @OriginalArg(2) Class45 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		this.aClass45_22 = arg1;
		this.anInt5320 = arg2;
		this.aLong168 = arg3;
		this.aString54 = arg0;
	}
}
