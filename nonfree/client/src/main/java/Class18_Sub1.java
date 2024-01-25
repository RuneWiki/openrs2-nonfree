import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public abstract class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "[I")
	private int[] anIntArray1037;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	protected int anInt5235;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
	protected int anInt5237;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	protected int anInt5242;

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
	protected int anInt5245;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "Lclient!et;")
	protected final Class63_Sub1 aClass63_Sub1_7;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	protected final int anInt5244;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
	protected final int anInt5249;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!et;II)V")
	protected Class18_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass63_Sub1_7 = arg0;
		this.anInt5244 = arg1;
		this.anInt5249 = arg2;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
	@Override
	public final int method4563() {
		return this.anInt5244;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass63_Sub1_7.method1514()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray1037 == null) {
			this.anIntArray1037 = new int[4];
		}
		this.aClass63_Sub1_7.method1962(this.anIntArray1037);
		this.aClass63_Sub1_7.method2008(this.aClass63_Sub1_7.anInt1600, this.aClass63_Sub1_7.anInt1610, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method4564();
		@Pc(40) int local40 = this.method4560();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method4557(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass63_Sub1_7.method1958(this.anIntArray1037[0], this.anIntArray1037[1], this.anIntArray1037[2], this.anIntArray1037[3]);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method4567(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass63_Sub1_7.method1514()) {
			throw new IllegalStateException();
		}
		this.method4574(arg0, arg1, arg2, arg3, arg4, arg5);
		Static22.anInt5236 = arg7;
		if (arg6 != 0) {
			Static22.anInt5224 = arg7 >>> 24;
			Static22.anInt5228 = 256 - Static22.anInt5224;
			if (arg6 == 1) {
				Static22.anInt5223 = arg7 >> 16 & 0xFF;
				Static22.anInt5231 = arg7 >> 8 & 0xFF;
				Static22.anInt5246 = arg7 & 0xFF;
			} else {
				Static22.anInt5239 = arg7 >>> 24;
				Static22.anInt5225 = 256 - Static22.anInt5239;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static22.anInt5225 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static22.anInt5225 & 0xFF0000;
				Static22.anInt5238 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method4572(0);
		} else if (arg6 == 1) {
			this.method4572(1);
		} else if (arg6 == 2) {
			this.method4572(2);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(FFFFFFLclient!oj;II)V")
	@Override
	protected final void method4555(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class165 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass63_Sub1_7.method1514()) {
			throw new IllegalStateException();
		}
		this.method4574(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class165_Sub1 local18 = (Class165_Sub1) arg6;
		this.method4573(local18.anIntArray774, local18.anIntArray775, Static22.anInt5243 - arg7, -arg8 - (Static22.anInt5248 - Static22.anInt5241));
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V")
	protected abstract void method4572(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
	public abstract void method4557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([I[III)V")
	protected abstract void method4573(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILclient!oj;II)V")
	public abstract void method4559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class165 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method4552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5242 = arg0;
		this.anInt5235 = arg1;
		this.anInt5245 = arg2;
		this.anInt5237 = arg3;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "()I")
	@Override
	public final int method4564() {
		return this.anInt5242 + this.anInt5244 + this.anInt5245;
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "()I")
	@Override
	public final int method4571() {
		return this.anInt5249;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method4569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(FFFFFF)V")
	private void method4574(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5242 + this.anInt5244 + this.anInt5245;
		@Pc(17) int local17 = this.anInt5235 + this.anInt5249 + this.anInt5237;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5244 || local17 != this.anInt5249) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5235;
			local65 = local53 * (float) this.anInt5235;
			local71 = local32 * (float) this.anInt5242;
			local77 = local39 * (float) this.anInt5242;
			@Pc(84) float local84 = -local32 * (float) this.anInt5245;
			@Pc(91) float local91 = -local39 * (float) this.anInt5245;
			@Pc(98) float local98 = -local46 * (float) this.anInt5237;
			@Pc(105) float local105 = -local53 * (float) this.anInt5237;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass63_Sub1_7.anInt1600) {
			local46 = this.aClass63_Sub1_7.anInt1600;
		}
		if (local53 > (float) this.aClass63_Sub1_7.anInt1620) {
			local53 = this.aClass63_Sub1_7.anInt1620;
		}
		if (local59 < (float) this.aClass63_Sub1_7.anInt1610) {
			local59 = this.aClass63_Sub1_7.anInt1610;
		}
		if (local65 > (float) this.aClass63_Sub1_7.anInt1618) {
			local65 = this.aClass63_Sub1_7.anInt1618;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static22.anInt5251 = this.aClass63_Sub1_7.anInt1623;
		Static22.anInt5234 = (int) ((float) ((int) local59 * Static22.anInt5251) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static22.anInt5233 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5244 / local71);
		Static22.anInt5227 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5249 / local77);
		Static22.anInt5230 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5244 / local77);
		Static22.anInt5250 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5249 / local71);
		Static22.anInt5229 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static22.anInt5232 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static22.anInt5240 = (this.anInt5244 >> 1 << 12) + (Static22.anInt5232 * Static22.anInt5230 >> 4);
		Static22.anInt5247 = (this.anInt5249 >> 1 << 12) + (Static22.anInt5232 * Static22.anInt5250 >> 4);
		Static22.anInt5226 = Static22.anInt5229 * Static22.anInt5233 >> 4;
		Static22.anInt5221 = Static22.anInt5229 * Static22.anInt5227 >> 4;
		Static22.anInt5243 = (int) local46;
		Static22.anInt5222 = (int) local53;
		Static22.anInt5241 = (int) local59;
		Static22.anInt5248 = (int) local65;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()I")
	@Override
	public final int method4560() {
		return this.anInt5235 + this.anInt5249 + this.anInt5237;
	}
}
