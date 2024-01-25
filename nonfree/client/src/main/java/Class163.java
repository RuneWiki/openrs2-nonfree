import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class163 implements Runnable {

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "Z")
	private volatile boolean aBoolean329;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "Z")
	private boolean aBoolean330;

	@OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
	private int anInt5042;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
	private int anInt5044;

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "J")
	private long aLong122;

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "Ljava/lang/String;")
	private String aString125;

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "Lclient!fl;")
	private Class106 aClass106_23;

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "J")
	private long aLong123;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "Lclient!vv;")
	private Interface23 anInterface23_1 = new Class264();

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "Lclient!vv;")
	private Interface23 anInterface23_2 = null;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method4022() {
		return this.aString125;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)Lclient!fl;")
	public Class106 method4023() {
		return this.aClass106_23;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)I")
	public int method4024() {
		return this.anInt5044;
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)J")
	public long method4025() {
		return this.aLong123;
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V")
	public synchronized void method4027() {
		this.aBoolean330 = true;
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)I")
	public int method4028() {
		if (this.aClass106_23 == null) {
			return 0;
		}
		@Pc(15) int local15 = this.aClass106_23.method2842();
		if (this.aClass106_23.aBoolean250 && this.aClass106_23.anInt3500 > this.anInt5044) {
			return this.anInt5044 + 1;
		} else if (local15 >= 0 && local15 < Static367.aClass106Array1.length - 1) {
			return this.anInt5044 == this.aClass106_23.anInt3505 ? this.aClass106_23.anInt3500 : this.aClass106_23.anInt3505;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLclient!vv;)V")
	public synchronized void method4029(@OriginalArg(1) Interface23 arg0) {
		this.anInterface23_2 = this.anInterface23_1;
		this.anInterface23_1 = arg0;
		this.aLong122 = Static96.method2000();
	}

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)Z")
	public synchronized boolean method4030() {
		return this.anInterface23_1.method8168(this.aLong122);
	}

	@OriginalMember(owner = "client!jq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean329) {
			@Pc(10) long local10 = Static96.method2000();
			synchronized (this) {
				try {
					if (this.anInterface23_1 instanceof Class264) {
						this.anInterface23_1.method8172(this.aBoolean330);
					} else {
						this.anInt5042++;
						@Pc(35) long local35 = Static96.method2000();
						if (Static319.aClass31_11 == null || this.anInterface23_2 == null || this.anInterface23_2.method8170() == 0 || this.aLong122 < local35 - (long) this.anInterface23_2.method8170()) {
							if (this.anInterface23_2 != null) {
								this.aBoolean330 = true;
								this.anInterface23_2.method8171();
								this.anInterface23_2 = null;
							}
							if (this.aBoolean330) {
								Static239.method3812();
								if (Static319.aClass31_11 != null) {
									Static319.aClass31_11.ja(0);
								}
							}
							this.anInterface23_1.method8172(this.aBoolean330 || Static319.aClass31_11 != null && Static319.aClass31_11.method8028());
						} else {
							@Pc(114) int local114 = (int) ((local35 - this.aLong122) * 255L / (long) this.anInterface23_2.method8170());
							@Pc(118) int local118 = 255 - local114;
							Static239.method3812();
							@Pc(126) int local126 = local118 << 24 | 0xFFFFFF;
							@Pc(132) int local132 = local114 << 24 | 0xFFFFFF;
							Static319.aClass31_11.ja(0);
							@Pc(141) Class73 local141 = Static319.aClass31_11.method8080(Static34.anInt3201, Static492.anInt8445);
							Static319.aClass31_11.method8020(local141);
							this.anInterface23_2.method8172(true);
							Static319.aClass31_11.method8087();
							local141.V(0, 0, 0, local126, 1);
							Static319.aClass31_11.method8020(local141);
							Static319.aClass31_11.ja(0);
							this.anInterface23_1.method8172(true);
							Static319.aClass31_11.method8087();
							local141.V(0, 0, 0, local132, 1);
						}
						try {
							if (Static319.aClass31_11 != null && !(this.anInterface23_1 instanceof Class264)) {
								Static319.aClass31_11.method8082();
							}
						} catch (@Pc(190) Exception_Sub1 local190) {
							Static332.method1390(local190, local190.getMessage() + " (Recovered) " + Static507.aClient1.method1698());
							Static47.method1180(0);
						}
					}
					this.aBoolean330 = false;
				} catch (@Pc(215) Exception local215) {
					continue;
				}
			}
			@Pc(227) long local227 = Static96.method2000();
			@Pc(236) int local236 = (int) (local10 + 20L - local227);
			if (local236 > 0) {
				Static373.method5240((long) local236);
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(B)V")
	public void method4031() {
		this.aBoolean329 = true;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!fl;JILjava/lang/String;)V")
	public synchronized void method4032(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) long arg2, @OriginalArg(4) String arg3) {
		this.aString125 = arg3;
		this.aClass106_23 = arg1;
		this.aLong123 = arg2;
		this.anInt5044 = arg0;
	}

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)I")
	public int method4033() {
		return this.anInt5042;
	}
}
