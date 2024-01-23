import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "F")
	private float aFloat5;

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "[I")
	private int[] anIntArray438;

	@OriginalMember(owner = "client!sc", name = "W", descriptor = "Z")
	public boolean aBoolean178 = false;

	@OriginalMember(owner = "client!sc", name = "Y", descriptor = "Lclient!t;")
	private Class109 aClass109_1;

	@OriginalMember(owner = "client!sc", name = "J", descriptor = "Z")
	private boolean aBoolean177;

	@OriginalMember(owner = "client!sc", name = "I", descriptor = "Z")
	private boolean aBoolean176;

	@OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
	private int anInt3872;

	@OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
	private int anInt3877;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class1_Sub1_Sub17(@OriginalArg(0) Class1_Sub17 arg0) {
		this.aClass109_1 = new Class109(arg0);
		this.aBoolean177 = arg0.method2142() == 1;
		this.aBoolean176 = arg0.method2142() == 1;
		arg0.method2142();
		arg0.method2142();
		@Pc(46) int local46 = arg0.method2142() & 0x3;
		this.anInt3872 = arg0.method2155();
		this.anInt3877 = arg0.method2155();
		arg0.method2142();
		arg0.method2142();
	}

	@OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!pa;Lclient!mf;B)Z")
	public boolean method3105(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Interface4 arg1) {
		return this.aClass109_1.method3172(arg1, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!pa;BFZLclient!mf;)[I")
	public int[] method3107(@OriginalArg(0) Class86 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Interface4 arg3) {
		if (this.anIntArray438 == null || this.aFloat5 != arg1) {
			if (!this.aClass109_1.method3172(arg3, arg0)) {
				return null;
			}
			@Pc(37) int local37 = arg2 ? 64 : 128;
			this.anIntArray438 = this.aClass109_1.method3170(this.aBoolean176, arg0, true, arg3, (double) arg1, local37, local37);
			this.aFloat5 = arg1;
			if (this.aBoolean177) {
				@Pc(61) int[] local61 = new int[local37];
				@Pc(64) int[] local64 = new int[local37];
				@Pc(67) int[] local67 = new int[local37];
				@Pc(72) int[] local72 = new int[local37 * local37];
				@Pc(77) int local77 = local37;
				@Pc(78) int local78 = local37;
				@Pc(84) int local84 = local37 - 1;
				@Pc(88) int local88 = local37 - 1;
				@Pc(92) int local92 = local37 * local37;
				@Pc(98) int local98;
				for (@Pc(94) int local94 = 2; local94 >= 0; local94--) {
					for (local98 = local84; local98 >= 0; local98--) {
						local77--;
						@Pc(106) int local106 = this.anIntArray438[local77];
						local61[local98] += local106 >> 16 & 0xFF;
						local67[local98] += local106 >> 8 & 0xFF;
						local64[local98] += local106 & 0xFF;
					}
					if (local77 == 0) {
						local77 = local92;
					}
				}
				@Pc(155) int local155 = local92;
				for (@Pc(157) int local157 = local88; local157 >= 0; local157--) {
					@Pc(161) int local161 = 1;
					@Pc(164) int local164 = 0;
					@Pc(166) int local166 = 0;
					@Pc(167) int local167 = 0;
					@Pc(169) int local169 = 1;
					for (local98 = 2; local98 >= 0; local98--) {
						local169--;
						local164 += local67[local169];
						local167 += local61[local169];
						local166 += local64[local169];
						if (local169 == 0) {
							local169 = local37;
						}
					}
					for (local98 = local84; local98 >= 0; local98--) {
						@Pc(210) int local210 = local166 / 9;
						local169--;
						@Pc(215) int local215 = local164 / 9;
						@Pc(219) int local219 = local167 / 9;
						local155--;
						local72[local155] = local219 << 16 | local215 << 8 | local210;
						local161--;
						local166 += local64[local169] - local64[local161];
						local164 += local67[local169] - local67[local161];
						local167 += local61[local169] - local61[local161];
						if (local169 == 0) {
							local169 = local37;
						}
						if (local161 == 0) {
							local161 = local37;
						}
					}
					for (local98 = local84; local98 >= 0; local98--) {
						local77--;
						@Pc(290) int local290 = this.anIntArray438[local77];
						local78--;
						@Pc(296) int local296 = this.anIntArray438[local78];
						local61[local98] += (local290 >> 16 & 0xFF) - ((local296 & 0xFF5CAC) >> 16);
						local67[local98] += (local290 >> 8 & 0xFF) - ((local296 & 0xFFD1) >> 8);
						local64[local98] += (local290 & 0xFF) - (local296 & 0xFF);
					}
					if (local78 == 0) {
						local78 = local92;
					}
					if (local77 == 0) {
						local77 = local92;
					}
				}
				this.anIntArray438 = local72;
			}
		}
		return this.anIntArray438;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZBLclient!pa;Lclient!mf;)[I")
	public int[] method3108(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class86 arg1, @OriginalArg(3) Interface4 arg2) {
		if (this.aClass109_1.method3172(arg2, arg1)) {
			@Pc(23) int local23 = arg0 ? 64 : 128;
			return this.aClass109_1.method3170(this.aBoolean176, arg1, false, arg2, 1.0D, local23, local23);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)V")
	public void method3111(@OriginalArg(1) int arg0) {
		if (this.anIntArray438 == null || this.anInt3877 == 0 && this.anInt3872 == 0) {
			return;
		}
		if (Static125.anIntArray274 == null || this.anIntArray438.length > Static125.anIntArray274.length) {
			Static125.anIntArray274 = new int[this.anIntArray438.length];
		}
		@Pc(41) int local41 = this.anInt3872 * arg0;
		@Pc(45) int local45 = this.anIntArray438.length;
		@Pc(54) int local54 = this.anIntArray438.length == 4096 ? 64 : 128;
		@Pc(58) int local58 = local45 - 1;
		@Pc(65) int local65 = this.anInt3877 * arg0 * local54;
		@Pc(69) int local69 = local54 - 1;
		for (@Pc(71) int local71 = 0; local71 < local45; local71 += local54) {
			@Pc(80) int local80 = local71 + local65 & local58;
			for (@Pc(82) int local82 = 0; local82 < local54; local82++) {
				@Pc(88) int local88 = local82 + local71;
				@Pc(96) int local96 = (local69 & local41 + local82) + local80;
				Static125.anIntArray274[local88] = this.anIntArray438[local96];
			}
		}
		@Pc(125) int[] local125 = this.anIntArray438;
		this.anIntArray438 = Static125.anIntArray274;
		Static125.anIntArray274 = local125;
	}
}
