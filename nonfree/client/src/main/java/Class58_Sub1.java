import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public abstract class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
	protected int anInt4835;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
	protected int anInt4847;

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
	protected int anInt4854;

	@OriginalMember(owner = "client!gq", name = "B", descriptor = "[I")
	private int[] anIntArray407;

	@OriginalMember(owner = "client!gq", name = "G", descriptor = "I")
	protected int anInt4860;

	@OriginalMember(owner = "client!gq", name = "D", descriptor = "Lclient!dq;")
	protected final Class47_Sub1 aClass47_Sub1_10;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
	protected final int anInt4832;

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
	protected final int anInt4836;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!dq;II)V")
	protected Class58_Sub1(@OriginalArg(0) Class47_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass47_Sub1_10 = arg0;
		this.anInt4832 = arg1;
		this.anInt4836 = arg2;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILclient!sg;II)V")
	public abstract void method4270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(FFFFFF)V")
	private void method4287(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt4847 + this.anInt4832 + this.anInt4860;
		@Pc(17) int local17 = this.anInt4854 + this.anInt4836 + this.anInt4835;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt4832 || local17 != this.anInt4836) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4854;
			local65 = local53 * (float) this.anInt4854;
			local71 = local32 * (float) this.anInt4847;
			local77 = local39 * (float) this.anInt4847;
			@Pc(84) float local84 = -local32 * (float) this.anInt4860;
			@Pc(91) float local91 = -local39 * (float) this.anInt4860;
			@Pc(98) float local98 = -local46 * (float) this.anInt4835;
			@Pc(105) float local105 = -local53 * (float) this.anInt4835;
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
		if (local46 < (float) this.aClass47_Sub1_10.anInt1733) {
			local46 = this.aClass47_Sub1_10.anInt1733;
		}
		if (local53 > (float) this.aClass47_Sub1_10.anInt1720) {
			local53 = this.aClass47_Sub1_10.anInt1720;
		}
		if (local59 < (float) this.aClass47_Sub1_10.anInt1738) {
			local59 = this.aClass47_Sub1_10.anInt1738;
		}
		if (local65 > (float) this.aClass47_Sub1_10.anInt1723) {
			local65 = this.aClass47_Sub1_10.anInt1723;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static111.anInt4844 = this.aClass47_Sub1_10.anInt1735;
		Static111.anInt4846 = (int) ((float) ((int) local59 * Static111.anInt4844) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static111.anInt4834 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt4832 / local71);
		Static111.anInt4852 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt4836 / local77);
		Static111.anInt4849 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt4832 / local77);
		Static111.anInt4842 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt4836 / local71);
		Static111.anInt4830 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static111.anInt4850 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static111.anInt4843 = (this.anInt4832 >> 1 << 12) + (Static111.anInt4850 * Static111.anInt4849 >> 4);
		Static111.anInt4859 = (this.anInt4836 >> 1 << 12) + (Static111.anInt4850 * Static111.anInt4842 >> 4);
		Static111.anInt4833 = Static111.anInt4830 * Static111.anInt4834 >> 4;
		Static111.anInt4855 = Static111.anInt4830 * Static111.anInt4852 >> 4;
		Static111.anInt4839 = (int) local46;
		Static111.anInt4848 = (int) local53;
		Static111.anInt4837 = (int) local59;
		Static111.anInt4845 = (int) local65;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "([I[III)V")
	protected abstract void method4288(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "()I")
	@Override
	public final int method4274() {
		return this.anInt4836;
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "()I")
	@Override
	public final int method4286() {
		return this.anInt4854 + this.anInt4836 + this.anInt4835;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)V")
	protected abstract void method4289(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIII)V")
	public abstract void method4276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method4280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4847 = arg0;
		this.anInt4854 = arg1;
		this.anInt4860 = arg2;
		this.anInt4835 = arg3;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "()I")
	@Override
	public final int method4279() {
		return this.anInt4832;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method4281(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass47_Sub1_10.method1576()) {
			throw new IllegalStateException();
		}
		this.method4287(arg0, arg1, arg2, arg3, arg4, arg5);
		Static111.anInt4858 = arg7;
		if (arg6 != 0) {
			Static111.anInt4851 = arg7 >>> 24;
			Static111.anInt4831 = 256 - Static111.anInt4851;
			if (arg6 == 1) {
				Static111.anInt4840 = arg7 >> 16 & 0xFF;
				Static111.anInt4841 = arg7 >> 8 & 0xFF;
				Static111.anInt4838 = arg7 & 0xFF;
			} else {
				Static111.anInt4857 = arg7 >>> 24;
				Static111.anInt4853 = 256 - Static111.anInt4857;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static111.anInt4853 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static111.anInt4853 & 0xFF0000;
				Static111.anInt4856 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method4289(0);
		} else if (arg6 == 1) {
			this.method4289(1);
		} else if (arg6 == 2) {
			this.method4289(2);
		}
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "()I")
	@Override
	public final int method4282() {
		return this.anInt4847 + this.anInt4832 + this.anInt4860;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(FFFFFFLclient!sg;II)V")
	@Override
	protected final void method4275(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class118 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass47_Sub1_10.method1576()) {
			throw new IllegalStateException();
		}
		this.method4287(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class118_Sub1 local18 = (Class118_Sub1) arg6;
		this.method4288(local18.anIntArray315, local18.anIntArray316, Static111.anInt4839 - arg7, -arg8 - (Static111.anInt4845 - Static111.anInt4837));
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method4271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass47_Sub1_10.method1576()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray407 == null) {
			this.anIntArray407 = new int[4];
		}
		this.aClass47_Sub1_10.method2699(this.anIntArray407);
		this.aClass47_Sub1_10.method2681(this.aClass47_Sub1_10.anInt1733, this.aClass47_Sub1_10.anInt1738, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method4282();
		@Pc(40) int local40 = this.method4286();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method4276(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass47_Sub1_10.method2709(this.anIntArray407[0], this.anIntArray407[1], this.anIntArray407[2], this.anIntArray407[3]);
	}
}
