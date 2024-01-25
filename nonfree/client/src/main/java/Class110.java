import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public class Class110 {

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "Lclient!dm;")
	private Class1_Sub7 aClass1_Sub7_6;

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "[I")
	public int[] anIntArray467;

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "I")
	public int anInt5913;

	@OriginalMember(owner = "client!hv", name = "A", descriptor = "I")
	public int anInt5916;

	@OriginalMember(owner = "client!hv", name = "C", descriptor = "I")
	private int anInt5918;

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
	private final int anInt5905 = 32;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "Z")
	private boolean aBoolean383 = false;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "J")
	private long aLong178 = Static101.method1557();

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
	private int anInt5914 = 0;

	@OriginalMember(owner = "client!hv", name = "v", descriptor = "Z")
	private boolean aBoolean384 = true;

	@OriginalMember(owner = "client!hv", name = "z", descriptor = "I")
	private int anInt5915 = 0;

	@OriginalMember(owner = "client!hv", name = "y", descriptor = "J")
	private long aLong179 = 0L;

	@OriginalMember(owner = "client!hv", name = "B", descriptor = "I")
	private int anInt5917 = 0;

	@OriginalMember(owner = "client!hv", name = "E", descriptor = "[Lclient!dm;")
	private final Class1_Sub7[] aClass1_Sub7Array6 = new Class1_Sub7[8];

	@OriginalMember(owner = "client!hv", name = "D", descriptor = "J")
	private long aLong180 = 0L;

	@OriginalMember(owner = "client!hv", name = "x", descriptor = "[Lclient!dm;")
	private final Class1_Sub7[] aClass1_Sub7Array5 = new Class1_Sub7[8];

	@OriginalMember(owner = "client!hv", name = "F", descriptor = "I")
	private int anInt5919 = 0;

	static {
		new Class84("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "()V")
	protected void method4774() throws Exception {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
	public void method4775(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V")
	public final synchronized void method4776() {
		this.aBoolean384 = true;
		try {
			this.method4781();
		} catch (@Pc(16) Exception local16) {
			this.method4779();
			this.aLong179 = Static101.method1557() + 2000L;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V")
	public final synchronized void method4777() {
		if (this.aBoolean383) {
			return;
		}
		@Pc(12) long local12 = Static101.method1557();
		try {
			if (local12 > this.aLong178 + 500000L) {
				this.aLong178 = local12 - 500000L;
			}
			while (local12 > this.aLong178 + 5000L) {
				this.method4788();
				this.aLong178 += 256000 / Static78.anInt1548;
			}
		} catch (@Pc(61) Exception local61) {
			this.aLong178 = local12;
		}
		if (this.anIntArray467 == null) {
			return;
		}
		try {
			if (this.aLong179 != 0L) {
				if (local12 < this.aLong179) {
					return;
				}
				this.method4775(this.anInt5913);
				this.aBoolean384 = true;
				this.aLong179 = 0L;
			}
			@Pc(96) int local96 = this.method4783();
			if (this.anInt5919 - local96 > this.anInt5915) {
				this.anInt5915 = this.anInt5919 - local96;
			}
			@Pc(116) int local116 = this.anInt5918 + this.anInt5916;
			if (local116 + 256 > 16384) {
				local116 = 16128;
			}
			if (local116 + 256 > this.anInt5913) {
				this.anInt5913 += 1024;
				if (this.anInt5913 > 16384) {
					this.anInt5913 = 16384;
				}
				this.method4779();
				local96 = 0;
				this.method4775(this.anInt5913);
				this.aBoolean384 = true;
				if (this.anInt5913 < local116 + 256) {
					local116 = this.anInt5913 - 256;
					this.anInt5918 = local116 - this.anInt5916;
				}
			}
			while (local96 < local116) {
				this.method4786(this.anIntArray467);
				local96 += 256;
				this.method4774();
			}
			if (local12 > this.aLong180) {
				if (this.aBoolean384) {
					this.aBoolean384 = false;
				} else if (this.anInt5915 == 0 && this.anInt5917 == 0) {
					this.method4779();
					this.aLong179 = local12 + 2000L;
					return;
				} else {
					this.anInt5918 = Math.min(this.anInt5917, this.anInt5915);
					this.anInt5917 = this.anInt5915;
				}
				this.aLong180 = local12 + 2000L;
				this.anInt5915 = 0;
			}
			this.anInt5919 = local96;
		} catch (@Pc(254) Exception local254) {
			this.method4779();
			this.aLong179 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)V")
	public final synchronized void method4778() {
		if (Static412.aClass189_1 != null) {
			@Pc(15) boolean local15 = true;
			for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
				if (Static412.aClass189_1.aClass110Array1[local17] == this) {
					Static412.aClass189_1.aClass110Array1[local17] = null;
				}
				if (Static412.aClass189_1.aClass110Array1[local17] != null) {
					local15 = false;
				}
			}
			if (local15) {
				Static412.aClass189_1.aBoolean370 = true;
				while (Static412.aClass189_1.aBoolean371) {
					Static67.method1189(50L);
				}
				Static412.aClass189_1 = null;
			}
		}
		this.method4779();
		this.anIntArray467 = null;
		this.aBoolean383 = true;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "()V")
	protected void method4779() {
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "()V")
	protected void method4781() throws Exception {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!dm;)V")
	public final synchronized void method4782(@OriginalArg(1) Class1_Sub7 arg0) {
		this.aClass1_Sub7_6 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "()I")
	protected int method4783() throws Exception {
		return this.anInt5913;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4784(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
	public final void method4785() {
		this.aBoolean384 = true;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([II)V")
	private void method4786(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static93.aBoolean97) {
			local1 = 512;
		}
		Static460.method4219(arg0, 0, local1);
		this.anInt5914 -= 256;
		if (this.aClass1_Sub7_6 != null && this.anInt5914 <= 0) {
			this.anInt5914 += Static78.anInt1548 >> 4;
			Static61.method1096(this.aClass1_Sub7_6);
			this.method4787(this.aClass1_Sub7_6, this.aClass1_Sub7_6.method5929());
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			@Pc(56) int local56;
			label103: while (local47 != 0) {
				@Pc(61) int local61;
				if (local49 < 0) {
					local56 = local49 & 0x3;
					local61 = -(local49 >> 2);
				} else {
					local56 = local49;
					local61 = 0;
				}
				for (@Pc(72) int local72 = local47 >>> local56 & 0x11111111; local72 != 0; local72 >>>= 0x4) {
					if ((local72 & 0x1) != 0) {
						local47 &= ~(0x1 << local56);
						@Pc(88) Class1_Sub7 local88 = null;
						@Pc(93) Class1_Sub7 local93 = this.aClass1_Sub7Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub32 local97 = local93.aClass1_Sub32_5;
								if (local97 == null || local97.anInt4939 <= local61) {
									local93.aBoolean486 = true;
									@Pc(121) int local121 = local93.method5926();
									local45 += local121;
									if (local97 != null) {
										local97.anInt4939 += local121;
									}
									if (local45 >= this.anInt5905) {
										break label103;
									}
									@Pc(140) Class1_Sub7 local140 = local93.method5930();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7644;
										while (local140 != null) {
											this.method4787(local140, local145 * local140.method5929() >> 8);
											local140 = local93.method5932();
										}
									}
									@Pc(164) Class1_Sub7 local164 = local93.aClass1_Sub7_8;
									local93.aClass1_Sub7_8 = null;
									if (local88 == null) {
										this.aClass1_Sub7Array6[local56] = local164;
									} else {
										local88.aClass1_Sub7_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub7Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub7_8;
								}
							}
						}
					}
					local56 += 4;
					local61++;
				}
				local49--;
			}
			for (local56 = 0; local56 < 8; local56++) {
				@Pc(207) Class1_Sub7 local207 = this.aClass1_Sub7Array6[local56];
				this.aClass1_Sub7Array6[local56] = this.aClass1_Sub7Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub7 local221 = local207.aClass1_Sub7_8;
					local207.aClass1_Sub7_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt5914 < 0) {
			this.anInt5914 = 0;
		}
		if (this.aClass1_Sub7_6 != null) {
			this.aClass1_Sub7_6.method5928(arg0, 0, 256);
		}
		this.aLong178 = Static101.method1557();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!dm;IB)V")
	private void method4787(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 >> 5;
		@Pc(18) Class1_Sub7 local18 = this.aClass1_Sub7Array5[local13];
		if (local18 == null) {
			this.aClass1_Sub7Array6[local13] = arg0;
		} else {
			local18.aClass1_Sub7_8 = arg0;
		}
		this.aClass1_Sub7Array5[local13] = arg0;
		arg0.anInt7644 = arg1;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V")
	private void method4788() {
		this.anInt5914 -= 256;
		if (this.anInt5914 < 0) {
			this.anInt5914 = 0;
		}
		if (this.aClass1_Sub7_6 != null) {
			this.aClass1_Sub7_6.method5927(256);
		}
	}
}
