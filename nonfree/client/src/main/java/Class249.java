import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class249 implements Runnable {

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "Z")
	private volatile boolean aBoolean559;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "Z")
	private boolean aBoolean560;

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "Ljava/lang/String;")
	private String aString89;

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
	private int anInt7496;

	@OriginalMember(owner = "client!nj", name = "A", descriptor = "Lclient!hd;")
	private Class138 aClass138_23;

	@OriginalMember(owner = "client!nj", name = "B", descriptor = "J")
	private long aLong197;

	@OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
	private int anInt7497;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "Lclient!b;")
	private Interface1 anInterface1_1 = new Class221();

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "Lclient!b;")
	private Interface1 anInterface1_2 = null;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
	public int method6622() {
		if (this.aClass138_23 == null) {
			return 0;
		}
		@Pc(21) int local21 = this.aClass138_23.method4023();
		if (this.aClass138_23.aBoolean350 && this.aClass138_23.anInt4447 > this.anInt7497) {
			return this.anInt7497 + 1;
		} else if (local21 >= 0 && Static570.aClass138Array1.length - 1 > local21) {
			return this.anInt7497 == this.aClass138_23.anInt4448 ? this.aClass138_23.anInt4447 : this.aClass138_23.anInt4448;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	public int method6623() {
		return this.anInt7497;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;BIJLclient!hd;)V")
	public synchronized void method6626(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) Class138 arg3) {
		this.aLong196 = arg2;
		this.aClass138_23 = arg3;
		this.aString89 = arg0;
		this.anInt7497 = arg1;
	}

	@OriginalMember(owner = "client!nj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean559) {
			@Pc(6) long local6 = Static99.method1701();
			synchronized (this) {
				try {
					this.anInt7496++;
					if (this.anInterface1_1 instanceof Class221) {
						this.anInterface1_1.method7813(this.aBoolean560);
					} else {
						@Pc(23) long local23 = Static99.method1701();
						if (Static607.aClass101_15 == null || this.anInterface1_2 == null || this.anInterface1_2.method7812() == 0 || this.aLong197 < local23 - (long) this.anInterface1_2.method7812()) {
							if (this.anInterface1_2 != null) {
								this.aBoolean560 = true;
								this.anInterface1_2.method7814();
								this.anInterface1_2 = null;
							}
							if (this.aBoolean560) {
								Static510.method7943();
								if (Static607.aClass101_15 != null) {
									Static607.aClass101_15.GA(0);
								}
							}
							this.anInterface1_1.method7813(this.aBoolean560 || Static607.aClass101_15 != null && Static607.aClass101_15.method8110());
						} else {
							@Pc(102) int local102 = (int) ((local23 - this.aLong197) * 255L / (long) this.anInterface1_2.method7812());
							@Pc(106) int local106 = 255 - local102;
							@Pc(112) int local112 = local102 << 24 | 0xFFFFFF;
							@Pc(118) int local118 = local106 << 24 | 0xFFFFFF;
							Static510.method7943();
							Static607.aClass101_15.GA(0);
							@Pc(129) Class71 local129 = Static607.aClass101_15.method8079(Static406.anInt7570, Static19.anInt352, true);
							Static607.aClass101_15.method8104(local129);
							this.anInterface1_2.method7813(true);
							Static607.aClass101_15.method8072();
							local129.method7697(0, 0, 0, local118, 1);
							Static607.aClass101_15.method8104(local129);
							Static607.aClass101_15.GA(0);
							this.anInterface1_1.method7813(true);
							Static607.aClass101_15.method8072();
							local129.method7697(0, 0, 0, local112, 1);
						}
						try {
							if (Static607.aClass101_15 != null && !(this.anInterface1_1 instanceof Class221)) {
								Static607.aClass101_15.method8142();
							}
						} catch (@Pc(179) Exception_Sub1 local179) {
							Static165.method3319(local179, local179.getMessage() + " (Recovered) " + Static493.aClient1.method1463());
							Static389.method6560(true, 0);
						}
					}
					@Pc(211) Container local211;
					if (Static46.aFrame1 != null) {
						local211 = Static46.aFrame1;
					} else if (Static637.anApplet2 == null) {
						local211 = Static172.anApplet_Sub1_1;
					} else {
						local211 = Static637.anApplet2;
					}
					local211.getSize();
					local211.getSize();
					if (local211 == Static46.aFrame1) {
						Static46.aFrame1.getInsets();
					}
					this.aBoolean560 = false;
					if (Static607.aClass101_15 != null && !(this.anInterface1_1 instanceof Class221) && this.aClass138_23.method4023() < Static214.aClass138_20.method4023()) {
						Static5.method98();
					}
				} catch (@Pc(258) Exception local258) {
					continue;
				}
			}
			@Pc(270) long local270 = Static99.method1701();
			@Pc(277) int local277 = (int) (local6 + 20L - local270);
			if (local277 > 0) {
				Static650.method9565((long) local277);
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)I")
	public int method6627() {
		return this.anInt7496;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Z")
	public synchronized boolean method6628() {
		return this.anInterface1_1.method7817(this.aLong197);
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
	public synchronized void method6632() {
		this.aBoolean560 = true;
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V")
	public void method6633() {
		this.aBoolean559 = true;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!b;I)V")
	public synchronized void method6634(@OriginalArg(0) Interface1 arg0) {
		this.anInterface1_2 = this.anInterface1_1;
		this.anInterface1_1 = arg0;
		this.aLong197 = Static99.method1701();
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method6635() {
		return this.aString89;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(Z)J")
	public long method6636() {
		return this.aLong196;
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)Lclient!hd;")
	public Class138 method6637() {
		return this.aClass138_23;
	}
}
