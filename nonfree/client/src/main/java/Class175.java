import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class175 implements Runnable {

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "Z")
	private volatile boolean aBoolean381;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "Z")
	private boolean aBoolean382;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "J")
	private long aLong118;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
	private int anInt4704;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
	private int anInt4707;

	@OriginalMember(owner = "client!jl", name = "w", descriptor = "Lclient!lda;")
	private Class204 aClass204_1;

	@OriginalMember(owner = "client!jl", name = "x", descriptor = "Ljava/lang/String;")
	private String aString37;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Lclient!aca;")
	private Interface1 anInterface1_1 = new Class124();

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "Lclient!aca;")
	private Interface1 anInterface1_2 = null;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!aca;)V")
	public synchronized void method3937(@OriginalArg(1) Interface1 arg0) {
		this.anInterface1_2 = this.anInterface1_1;
		this.anInterface1_1 = arg0;
		this.aLong119 = Static548.method7437();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)I")
	public int method3938() {
		return this.anInt4704;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public synchronized void method3939() {
		this.aBoolean382 = true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!lda;BJILjava/lang/String;)V")
	public synchronized void method3940(@OriginalArg(0) Class204 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		this.anInt4707 = arg2;
		this.aClass204_1 = arg0;
		this.aString37 = arg3;
		this.aLong118 = arg1;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)J")
	public long method3941() {
		return this.aLong118;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)Z")
	public synchronized boolean method3942() {
		return this.anInterface1_1.method5717(this.aLong119);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
	public void method3943() {
		this.aBoolean381 = true;
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)Lclient!lda;")
	public Class204 method3944() {
		return this.aClass204_1;
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method3945() {
		return this.aString37;
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)I")
	public int method3946() {
		if (this.aClass204_1 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass204_1.method4549();
		if (this.aClass204_1.aBoolean427 && this.anInt4707 < this.aClass204_1.anInt5420) {
			return this.anInt4707 + 1;
		} else if (local13 >= 0 && local13 < Static272.aClass204Array1.length - 1) {
			return this.anInt4707 == this.aClass204_1.anInt5422 ? this.aClass204_1.anInt5420 : this.aClass204_1.anInt5422;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean381) {
			@Pc(6) long local6 = Static548.method7437();
			synchronized (this) {
				try {
					if (this.anInterface1_1 instanceof Class124) {
						this.anInterface1_1.method5713(this.aBoolean382);
					} else {
						this.anInt4704++;
						@Pc(31) long local31 = Static548.method7437();
						if (Static307.aClass100_6 == null || this.anInterface1_2 == null || this.anInterface1_2.method5718() == 0 || this.aLong119 < local31 - (long) this.anInterface1_2.method5718()) {
							if (this.anInterface1_2 != null) {
								this.aBoolean382 = true;
								this.anInterface1_2.method5715();
								this.anInterface1_2 = null;
							}
							if (this.aBoolean382) {
								Static468.method6574();
								if (Static307.aClass100_6 != null) {
									Static307.aClass100_6.ja(0);
								}
							}
							this.anInterface1_1.method5713(this.aBoolean382 || Static307.aClass100_6 != null && Static307.aClass100_6.method6192());
						} else {
							@Pc(74) int local74 = (int) ((local31 - this.aLong119) * 255L / (long) this.anInterface1_2.method5718());
							@Pc(79) int local79 = 255 - local74;
							Static468.method6574();
							@Pc(87) int local87 = local79 << 24 | 0xFFFFFF;
							@Pc(93) int local93 = local74 << 24 | 0xFFFFFF;
							Static307.aClass100_6.ja(0);
							@Pc(102) Class39 local102 = Static307.aClass100_6.method6204(Static140.anInt2937, Static120.anInt2371);
							Static307.aClass100_6.method6221(local102);
							this.anInterface1_2.method5713(true);
							Static307.aClass100_6.method6228();
							local102.V(0, 0, 0, local87, 1);
							Static307.aClass100_6.method6221(local102);
							Static307.aClass100_6.ja(0);
							this.anInterface1_1.method5713(true);
							Static307.aClass100_6.method6228();
							local102.V(0, 0, 0, local93, 1);
						}
						try {
							if (Static307.aClass100_6 != null && !(this.anInterface1_1 instanceof Class124)) {
								Static307.aClass100_6.method6238();
							}
						} catch (@Pc(191) Exception_Sub1 local191) {
							Static58.method946(local191.getMessage() + " (Recovered) " + Static413.aClient1.method1076(), local191);
							Static547.method5859(0);
						}
					}
					this.aBoolean382 = false;
				} catch (@Pc(216) Exception local216) {
					continue;
				}
			}
			@Pc(228) long local228 = Static548.method7437();
			@Pc(236) int local236 = (int) (local6 + 20L - local228);
			if (local236 > 0) {
				Static459.method6498((long) local236);
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "(B)I")
	public int method3947() {
		return this.anInt4707;
	}
}
