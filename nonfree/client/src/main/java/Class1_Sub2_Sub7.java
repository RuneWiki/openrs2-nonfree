import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "[I")
	private int[] anIntArray103;

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "F")
	private float aFloat1;

	@OriginalMember(owner = "client!ei", name = "X", descriptor = "Z")
	public boolean aBoolean68 = false;

	@OriginalMember(owner = "client!ei", name = "W", descriptor = "Lclient!eg;")
	private final Class28 aClass28_1;

	@OriginalMember(owner = "client!ei", name = "hb", descriptor = "Z")
	public final boolean aBoolean70;

	@OriginalMember(owner = "client!ei", name = "T", descriptor = "Z")
	public boolean aBoolean67;

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
	public final int anInt1236;

	@OriginalMember(owner = "client!ei", name = "eb", descriptor = "Z")
	private boolean aBoolean69;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "Z")
	private boolean aBoolean66;

	@OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
	public int anInt1238;

	@OriginalMember(owner = "client!ei", name = "gb", descriptor = "I")
	private int anInt1245;

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
	private int anInt1234;

	@OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
	private int anInt1240;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!fj;)V")
	public Class1_Sub2_Sub7(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass28_1 = new Class28(arg0);
		@Pc(14) int local14 = arg0.method2771();
		this.aBoolean70 = (local14 & 0x1) != 0;
		this.aBoolean67 = (local14 & 0x2) != 0;
		@Pc(45) int local45 = arg0.method2771();
		this.anInt1236 = 0x1 << (local45 & 0x7) + 1;
		this.aBoolean69 = (local45 & 0x8) != 0;
		this.aBoolean66 = (local45 & 0x80) != 0;
		this.anInt1238 = arg0.method2765();
		this.anInt1245 = arg0.method2771();
		if (this.anInt1245 == 255) {
			this.anInt1245 = 256;
		}
		this.anInt1234 = arg0.method2770();
		this.anInt1240 = arg0.method2770();
		arg0.method2771();
		arg0.method2771();
		arg0.method2771();
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub7() {
		this.aClass28_1 = new Class28();
		this.anInt1236 = 64;
		this.aBoolean70 = true;
	}

	@OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IFLclient!ve;ILclient!ef;)[I")
	public int[] method900(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(4) Interface2 arg3) {
		if (this.anIntArray103 == null || this.aFloat1 != arg1) {
			if (!this.aClass28_1.method858(arg3, arg2)) {
				return null;
			}
			@Pc(42) int local42 = arg0 < this.anInt1236 ? arg0 : this.anInt1236;
			this.anIntArray103 = this.aClass28_1.method855(true, arg3, this.aBoolean66, arg2, local42, local42, (double) arg1);
			this.aFloat1 = arg1;
			if (this.aBoolean69) {
				@Pc(66) int[] local66 = new int[local42];
				@Pc(69) int[] local69 = new int[local42];
				@Pc(72) int[] local72 = new int[local42];
				@Pc(77) int[] local77 = new int[local42 * local42];
				@Pc(85) int local85 = local42 - 1;
				@Pc(88) int local88 = local42;
				@Pc(89) int local89 = local42;
				@Pc(93) int local93 = local42 - 1;
				@Pc(97) int local97 = local42 * local42;
				@Pc(103) int local103;
				for (@Pc(99) int local99 = 2; local99 >= 0; local99--) {
					for (local103 = local93; local103 >= 0; local103--) {
						local88--;
						@Pc(111) int local111 = this.anIntArray103[local88];
						local66[local103] += local111 >> 16 & 0xFF;
						local72[local103] += local111 >> 8 & 0xFF;
						local69[local103] += local111 & 0xFF;
					}
					if (local88 == 0) {
						local88 = local97;
					}
				}
				@Pc(157) int local157 = local97;
				for (@Pc(159) int local159 = local85; local159 >= 0; local159--) {
					@Pc(164) int local164 = 0;
					@Pc(166) int local166 = 0;
					@Pc(167) int local167 = 0;
					@Pc(169) int local169 = 1;
					for (local103 = 2; local103 >= 0; local103--) {
						local169--;
						local166 += local69[local169];
						local167 += local66[local169];
						local164 += local72[local169];
						if (local169 == 0) {
							local169 = local42;
						}
					}
					@Pc(207) int local207 = 1;
					for (local103 = local93; local103 >= 0; local103--) {
						local169--;
						@Pc(216) int local216 = local164 / 9;
						@Pc(220) int local220 = local166 / 9;
						@Pc(224) int local224 = local167 / 9;
						local207--;
						local157--;
						local77[local157] = local220 | local216 << 8 | local224 << 16;
						local164 += local72[local169] - local72[local207];
						local166 += local69[local169] - local69[local207];
						local167 += local66[local169] - local66[local207];
						if (local169 == 0) {
							local169 = local42;
						}
						if (local207 == 0) {
							local207 = local42;
						}
					}
					for (local103 = local93; local103 >= 0; local103--) {
						local88--;
						@Pc(301) int local301 = this.anIntArray103[local88];
						local89--;
						@Pc(307) int local307 = this.anIntArray103[local89];
						local66[local103] += (local301 >> 16 & 0xFF) - (local307 >> 16 & 0xFF);
						local72[local103] += (local301 >> 8 & 0xFF) - ((local307 & 0xFFE9) >> 8);
						local69[local103] += (local301 & 0xFF) - (local307 & 0xFF);
					}
					if (local89 == 0) {
						local89 = local97;
					}
					if (local88 == 0) {
						local88 = local97;
					}
				}
				this.anIntArray103 = local77;
			}
		}
		return this.anIntArray103;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(II)V")
	public void method902(@OriginalArg(1) int arg0) {
		if (this.anIntArray103 == null || this.anInt1240 == 0 && this.anInt1234 == 0) {
			return;
		}
		@Pc(28) int local28 = this.anInt1234 * arg0;
		if (Static83.anIntArray169 == null || Static83.anIntArray169.length < this.anIntArray103.length) {
			Static83.anIntArray169 = new int[this.anIntArray103.length];
		}
		@Pc(56) int local56 = this.anIntArray103.length == 4096 ? 64 : 128;
		@Pc(60) int local60 = this.anIntArray103.length;
		@Pc(64) int local64 = local60 - 1;
		@Pc(71) int local71 = this.anInt1240 * arg0 * local56;
		@Pc(75) int local75 = local56 - 1;
		for (@Pc(77) int local77 = 0; local77 < local60; local77 += local56) {
			@Pc(85) int local85 = local64 & local71 + local77;
			for (@Pc(87) int local87 = 0; local87 < local56; local87++) {
				@Pc(93) int local93 = local87 + local77;
				@Pc(101) int local101 = (local75 & local28 + local87) + local85;
				Static83.anIntArray169[local93] = this.anIntArray103[local101];
			}
		}
		@Pc(126) int[] local126 = this.anIntArray103;
		this.anIntArray103 = Static83.anIntArray169;
		Static83.anIntArray169 = local126;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ve;ILclient!ef;)Z")
	public boolean method903(@OriginalArg(0) Class69 arg0, @OriginalArg(2) Interface2 arg1) {
		return this.aClass28_1.method858(arg1, arg0);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ef;IBLclient!ve;)[I")
	public int[] method907(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class69 arg2) {
		if (this.aClass28_1.method858(arg0, arg2)) {
			@Pc(34) int local34 = this.anInt1236 > arg1 ? arg1 : this.anInt1236;
			return this.aClass28_1.method855(false, arg0, this.aBoolean66, arg2, local34, local34, 1.0D);
		} else {
			return null;
		}
	}
}
