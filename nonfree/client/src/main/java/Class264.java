import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class264 implements Runnable {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Z")
	private volatile boolean aBoolean531;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Z")
	private boolean aBoolean532;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
	private int anInt6655;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	private int anInt6656;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "Ljava/lang/String;")
	private String aString95;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "Lclient!paa;")
	private Class261 aClass261_24;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "J")
	private long aLong184;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!hs;")
	private Interface12 anInterface12_1 = new Class140();

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "Lclient!hs;")
	private Interface12 anInterface12_2 = null;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I")
	public int method5509() {
		if (this.aClass261_24 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass261_24.method5483();
		if (this.aClass261_24.aBoolean528 && this.anInt6655 < this.aClass261_24.anInt6593) {
			return this.anInt6655 + 1;
		} else if (local13 >= 0 && local13 < Static432.aClass261Array1.length - 1) {
			return this.anInt6655 == this.aClass261_24.anInt6597 ? this.aClass261_24.anInt6593 : this.aClass261_24.anInt6597;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(JLjava/lang/String;Lclient!paa;II)V")
	public synchronized void method5510(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class261 arg2, @OriginalArg(4) int arg3) {
		this.aLong183 = arg0;
		this.aClass261_24 = arg2;
		this.anInt6655 = arg3;
		this.aString95 = arg1;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)J")
	public long method5511() {
		return this.aLong183;
	}

	@OriginalMember(owner = "client!pd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean531) {
			@Pc(6) long local6 = Static362.method5133();
			synchronized (this) {
				try {
					if (this.anInterface12_1 instanceof Class140) {
						this.anInterface12_1.method2483(this.aBoolean532);
					} else {
						this.anInt6656++;
						@Pc(31) long local31 = Static362.method5133();
						if (Static417.aClass162_17 == null || this.anInterface12_2 == null || this.anInterface12_2.method2485() == 0 || this.aLong184 < local31 - (long) this.anInterface12_2.method2485()) {
							if (this.anInterface12_2 != null) {
								this.aBoolean532 = true;
								this.anInterface12_2.method2487();
								this.anInterface12_2 = null;
							}
							if (this.aBoolean532) {
								Static539.method7062();
								if (Static417.aClass162_17 != null) {
									Static417.aClass162_17.ja(0);
								}
							}
							this.anInterface12_1.method2483(this.aBoolean532 || Static417.aClass162_17 != null && Static417.aClass162_17.method6848());
						} else {
							@Pc(111) int local111 = (int) ((local31 - this.aLong184) * 255L / (long) this.anInterface12_2.method2485());
							@Pc(115) int local115 = 255 - local111;
							@Pc(121) int local121 = local115 << 24 | 0xFFFFFF;
							Static539.method7062();
							@Pc(129) int local129 = local111 << 24 | 0xFFFFFF;
							Static417.aClass162_17.ja(0);
							@Pc(138) Class38 local138 = Static417.aClass162_17.method6825(Static172.anInt2621, Static187.anInt8962);
							Static417.aClass162_17.method6886(local138);
							this.anInterface12_2.method2483(true);
							Static417.aClass162_17.method6847();
							local138.V(0, 0, 0, local121, 1);
							Static417.aClass162_17.method6886(local138);
							Static417.aClass162_17.ja(0);
							this.anInterface12_1.method2483(true);
							Static417.aClass162_17.method6847();
							local138.V(0, 0, 0, local129, 1);
						}
						try {
							if (Static417.aClass162_17 != null && !(this.anInterface12_1 instanceof Class140)) {
								Static417.aClass162_17.method6842();
							}
						} catch (@Pc(187) Exception_Sub1 local187) {
							Static357.method5094(local187, local187.getMessage() + " (Recovered) " + Static474.aClient1.method1140());
							Static368.method6714(0);
						}
					}
					this.aBoolean532 = false;
				} catch (@Pc(212) Exception local212) {
					continue;
				}
			}
			@Pc(224) long local224 = Static362.method5133();
			@Pc(232) int local232 = (int) (local6 + 20L - local224);
			if (local232 > 0) {
				Static263.method3671((long) local232);
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)I")
	public int method5512() {
		return this.anInt6656;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method5513() {
		return this.aString95;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	public synchronized void method5514() {
		this.aBoolean532 = true;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)I")
	public int method5515() {
		return this.anInt6655;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	public void method5518() {
		this.aBoolean531 = true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!hs;I)V")
	public synchronized void method5519(@OriginalArg(0) Interface12 arg0) {
		this.anInterface12_2 = this.anInterface12_1;
		this.anInterface12_1 = arg0;
		this.aLong184 = Static362.method5133();
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)Z")
	public synchronized boolean method5520() {
		return this.anInterface12_1.method2486(this.aLong184);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)Lclient!paa;")
	public Class261 method5521() {
		return this.aClass261_24;
	}
}
