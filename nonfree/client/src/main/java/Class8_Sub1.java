import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public abstract class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
	protected int anInt5046;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
	protected int anInt5053;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "[I")
	private int[] anIntArray469;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
	protected int anInt5057;

	@OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
	protected int anInt5071;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!pq;")
	protected final Class105_Sub2 aClass105_Sub2_10;

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
	protected final int anInt5065;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
	protected final int anInt5049;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!pq;II)V")
	protected Class8_Sub1(@OriginalArg(0) Class105_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass105_Sub2_10 = arg0;
		this.anInt5065 = arg1;
		this.anInt5049 = arg2;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([I[III)V")
	protected abstract void method4399(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)V")
	protected abstract void method4400(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass105_Sub2_10.method4318()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray469 == null) {
			this.anIntArray469 = new int[4];
		}
		this.aClass105_Sub2_10.method4292(this.anIntArray469);
		this.aClass105_Sub2_10.method4265(this.aClass105_Sub2_10.anInt4871, this.aClass105_Sub2_10.anInt4889, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method4381();
		@Pc(40) int local40 = this.method4395();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method4394(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass105_Sub2_10.method4268(this.anIntArray469[0], this.anIntArray469[1], this.anIntArray469[2], this.anIntArray469[3]);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()I")
	@Override
	public final int method4381() {
		return this.anInt5071 + this.anInt5065 + this.anInt5046;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFFFFF)V")
	private void method4401(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5071 + this.anInt5065 + this.anInt5046;
		@Pc(17) int local17 = this.anInt5057 + this.anInt5049 + this.anInt5053;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5065 || local17 != this.anInt5049) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5057;
			local65 = local53 * (float) this.anInt5057;
			local71 = local32 * (float) this.anInt5071;
			local77 = local39 * (float) this.anInt5071;
			@Pc(84) float local84 = -local32 * (float) this.anInt5046;
			@Pc(91) float local91 = -local39 * (float) this.anInt5046;
			@Pc(98) float local98 = -local46 * (float) this.anInt5053;
			@Pc(105) float local105 = -local53 * (float) this.anInt5053;
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
		if (local46 < (float) this.aClass105_Sub2_10.anInt4871) {
			local46 = this.aClass105_Sub2_10.anInt4871;
		}
		if (local53 > (float) this.aClass105_Sub2_10.anInt4885) {
			local53 = this.aClass105_Sub2_10.anInt4885;
		}
		if (local59 < (float) this.aClass105_Sub2_10.anInt4889) {
			local59 = this.aClass105_Sub2_10.anInt4889;
		}
		if (local65 > (float) this.aClass105_Sub2_10.anInt4881) {
			local65 = this.aClass105_Sub2_10.anInt4881;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static7.anInt5055 = this.aClass105_Sub2_10.anInt4868;
		Static7.anInt5059 = (int) ((float) ((int) local59 * Static7.anInt5055) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static7.anInt5072 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5065 / local71);
		Static7.anInt5043 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5049 / local77);
		Static7.anInt5045 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5065 / local77);
		Static7.anInt5050 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5049 / local71);
		Static7.anInt5064 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static7.anInt5066 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static7.anInt5058 = (this.anInt5065 >> 1 << 12) + (Static7.anInt5066 * Static7.anInt5045 >> 4);
		Static7.anInt5051 = (this.anInt5049 >> 1 << 12) + (Static7.anInt5066 * Static7.anInt5050 >> 4);
		Static7.anInt5056 = Static7.anInt5064 * Static7.anInt5072 >> 4;
		Static7.anInt5068 = Static7.anInt5064 * Static7.anInt5043 >> 4;
		Static7.anInt5060 = (int) local46;
		Static7.anInt5061 = (int) local53;
		Static7.anInt5067 = (int) local59;
		Static7.anInt5062 = (int) local65;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method4397(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass105_Sub2_10.method4318()) {
			throw new IllegalStateException();
		}
		this.method4401(arg0, arg1, arg2, arg3, arg4, arg5);
		Static7.anInt5070 = arg7;
		if (arg6 != 0) {
			Static7.anInt5069 = arg7 >>> 24;
			Static7.anInt5048 = 256 - Static7.anInt5069;
			if (arg6 == 1) {
				Static7.anInt5052 = arg7 >> 16 & 0xFF;
				Static7.anInt5047 = arg7 >> 8 & 0xFF;
				Static7.anInt5063 = arg7 & 0xFF;
			} else {
				Static7.anInt5044 = arg7 >>> 24;
				Static7.anInt5054 = 256 - Static7.anInt5044;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static7.anInt5054 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static7.anInt5054 & 0xFF0000;
				Static7.anInt5042 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method4400(0);
		} else if (arg6 == 1) {
			this.method4400(1);
		} else if (arg6 == 2) {
			this.method4400(2);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
	public abstract void method4394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!ud;II)V")
	public abstract void method4384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "()I")
	@Override
	public final int method4382() {
		return this.anInt5049;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "()I")
	@Override
	public final int method4395() {
		return this.anInt5057 + this.anInt5049 + this.anInt5053;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "()I")
	@Override
	public final int method4383() {
		return this.anInt5065;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method4386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5071 = arg0;
		this.anInt5057 = arg1;
		this.anInt5046 = arg2;
		this.anInt5053 = arg3;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFFFFFLclient!ud;II)V")
	@Override
	protected final void method4392(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class15 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass105_Sub2_10.method4318()) {
			throw new IllegalStateException();
		}
		this.method4401(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class15_Sub2 local18 = (Class15_Sub2) arg6;
		this.method4399(local18.anIntArray579, local18.anIntArray580, Static7.anInt5060 - arg7, -arg8 - (Static7.anInt5062 - Static7.anInt5067));
	}
}
