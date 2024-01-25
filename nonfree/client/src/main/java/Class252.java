import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class252 implements Runnable {

	@OriginalMember(owner = "client!ofa", name = "h", descriptor = "Z")
	private boolean aBoolean485;

	@OriginalMember(owner = "client!ofa", name = "o", descriptor = "Z")
	private volatile boolean aBoolean486;

	@OriginalMember(owner = "client!ofa", name = "q", descriptor = "I")
	private int anInt7280;

	@OriginalMember(owner = "client!ofa", name = "t", descriptor = "Ljava/lang/String;")
	private String aString95;

	@OriginalMember(owner = "client!ofa", name = "u", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!ofa", name = "v", descriptor = "I")
	private int anInt7281;

	@OriginalMember(owner = "client!ofa", name = "w", descriptor = "Lclient!caa;")
	private Class46 aClass46_22;

	@OriginalMember(owner = "client!ofa", name = "x", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "Lclient!cv;")
	private Interface5 anInterface5_1 = new Class291();

	@OriginalMember(owner = "client!ofa", name = "r", descriptor = "Lclient!cv;")
	private Interface5 anInterface5_2 = null;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IZLclient!caa;JLjava/lang/String;)V")
	public synchronized void method6248(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1, @OriginalArg(3) long arg2, @OriginalArg(4) String arg3) {
		this.anInt7281 = arg0;
		this.aString95 = arg3;
		this.aClass46_22 = arg1;
		this.aLong211 = arg2;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method6249() {
		return this.aString95;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)Z")
	public synchronized boolean method6250() {
		return this.anInterface5_1.method7068(this.aLong212);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Z)V")
	public void method6252() {
		this.aBoolean486 = true;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BLclient!cv;)V")
	public synchronized void method6253(@OriginalArg(1) Interface5 arg0) {
		this.anInterface5_2 = this.anInterface5_1;
		this.anInterface5_1 = arg0;
		this.aLong212 = Static566.method7936();
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(Z)I")
	public int method6254() {
		if (this.aClass46_22 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass46_22.method1119();
		if (this.aClass46_22.aBoolean60 && this.aClass46_22.anInt1174 > this.anInt7281) {
			return this.anInt7281 + 1;
		} else if (local13 >= 0 && Static51.aClass46Array1.length - 1 > local13) {
			return this.anInt7281 == this.aClass46_22.anInt1170 ? this.aClass46_22.anInt1174 : this.aClass46_22.anInt1170;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "(I)V")
	public synchronized void method6255() {
		this.aBoolean485 = true;
	}

	@OriginalMember(owner = "client!ofa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean486) {
			@Pc(6) long local6 = Static566.method7936();
			synchronized (this) {
				try {
					this.anInt7280++;
					if (this.anInterface5_1 instanceof Class291) {
						this.anInterface5_1.method7072(this.aBoolean485);
					} else {
						@Pc(23) long local23 = Static566.method7936();
						if (Static546.aClass132_13 == null || this.anInterface5_2 == null || this.anInterface5_2.method7069() == 0 || this.aLong212 < local23 - (long) this.anInterface5_2.method7069()) {
							if (this.anInterface5_2 != null) {
								this.aBoolean485 = true;
								this.anInterface5_2.method7067();
								this.anInterface5_2 = null;
							}
							if (this.aBoolean485) {
								Static240.method3600();
								if (Static546.aClass132_13 != null) {
									Static546.aClass132_13.GA(0);
								}
							}
							this.anInterface5_1.method7072(this.aBoolean485 || Static546.aClass132_13 != null && Static546.aClass132_13.method7447());
						} else {
							@Pc(100) int local100 = (int) ((local23 - this.aLong212) * 255L / (long) this.anInterface5_2.method7069());
							@Pc(104) int local104 = 255 - local100;
							@Pc(110) int local110 = local104 << 24 | 0xFFFFFF;
							Static240.method3600();
							@Pc(118) int local118 = local100 << 24 | 0xFFFFFF;
							Static546.aClass132_13.GA(0);
							@Pc(127) Class9 local127 = Static546.aClass132_13.method7482(Static449.anInt7506, Static348.anInt5935, true);
							Static546.aClass132_13.method7516(local127);
							this.anInterface5_2.method7072(true);
							Static546.aClass132_13.method7499();
							local127.method8919(0, 0, 0, local110, 1);
							Static546.aClass132_13.method7516(local127);
							Static546.aClass132_13.GA(0);
							this.anInterface5_1.method7072(true);
							Static546.aClass132_13.method7499();
							local127.method8919(0, 0, 0, local118, 1);
						}
						try {
							if (Static546.aClass132_13 != null && !(this.anInterface5_1 instanceof Class291)) {
								Static546.aClass132_13.method7461();
							}
						} catch (@Pc(177) Exception_Sub1 local177) {
							Static664.method9007(local177, local177.getMessage() + " (Recovered) " + Static563.aClient1.method1434());
							Static646.method8805(0, true);
						}
					}
					@Pc(211) Container local211;
					if (Static293.aFrame3 != null) {
						local211 = Static293.aFrame3;
					} else if (Static180.anApplet6 == null) {
						local211 = Static131.anApplet_Sub1_1;
					} else {
						local211 = Static180.anApplet6;
					}
					local211.getSize();
					local211.getSize();
					if (Static293.aFrame3 == local211) {
						Static293.aFrame3.getInsets();
					}
					this.aBoolean485 = false;
					if (Static546.aClass132_13 != null && !(this.anInterface5_1 instanceof Class291) && this.aClass46_22.method1119() < Static62.aClass46_19.method1119()) {
						Static464.method6863();
					}
				} catch (@Pc(256) Exception local256) {
					continue;
				}
			}
			@Pc(268) long local268 = Static566.method7936();
			@Pc(276) int local276 = (int) (local6 + 20L - local268);
			if (local276 > 0) {
				Static520.method7923((long) local276);
			}
		}
	}

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "(I)I")
	public int method6256() {
		return this.anInt7280;
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(B)Lclient!caa;")
	public Class46 method6257() {
		return this.aClass46_22;
	}

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "(Z)J")
	public long method6258() {
		return this.aLong211;
	}

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "(I)I")
	public int method6259() {
		return this.anInt7281;
	}
}
