import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class6_Sub4_Sub3 extends Class6_Sub4 {

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!um;")
	public final Class244 aClass244_23 = new Class244();

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "Lclient!uh;")
	public final Class6_Sub4_Sub4 aClass6_Sub4_Sub4_1 = new Class6_Sub4_Sub4();

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "Lclient!bk;")
	private final Class6_Sub4_Sub2 aClass6_Sub4_Sub2_2;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!bk;)V")
	public Class6_Sub4_Sub3(@OriginalArg(0) Class6_Sub4_Sub2 arg0) {
		this.aClass6_Sub4_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([III)V")
	@Override
	public void method5898(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_Sub4_Sub4_1.method5898(arg0, arg1, arg2);
		for (@Pc(17) Class6_Sub10 local17 = (Class6_Sub10) this.aClass244_23.method5976(); local17 != null; local17 = (Class6_Sub10) this.aClass244_23.method5964()) {
			if (!this.aClass6_Sub4_Sub2_2.method714(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt1687) {
						this.method3997(local27 + local29, local17, arg0, local29, local27);
						local17.anInt1687 -= local27;
						break;
					}
					this.method3997(local29 + local27, local17, arg0, local29, local17.anInt1687);
					local27 -= local17.anInt1687;
					local29 += local17.anInt1687;
				} while (!this.aClass6_Sub4_Sub2_2.method718(local29, local27, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "()Lclient!cb;")
	@Override
	public Class6_Sub4 method5901() {
		@Pc(9) Class6_Sub10 local9;
		do {
			local9 = (Class6_Sub10) this.aClass244_23.method5964();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass6_Sub4_Sub1_1 == null);
		return local9.aClass6_Sub4_Sub1_1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!d;[III)V")
	private void method3997(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub10 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass6_Sub4_Sub2_2.anIntArray42[arg1.anInt1691] & 0x4) != 0 && arg1.anInt1693 < 0) {
			@Pc(32) int local32 = this.aClass6_Sub4_Sub2_2.anIntArray44[arg1.anInt1691] / Static275.anInt4927;
			while (true) {
				@Pc(43) int local43 = (local32 + 1048575 - arg1.anInt1685) / local32;
				if (arg4 < local43) {
					arg1.anInt1685 += arg4 * local32;
					break;
				}
				arg1.aClass6_Sub4_Sub1_1.method5898(arg2, arg3, local43);
				arg3 += local43;
				arg4 -= local43;
				arg1.anInt1685 += local43 * local32 - 1048576;
				@Pc(78) int local78 = Static275.anInt4927 / 100;
				@Pc(82) int local82 = 262144 / local32;
				if (local78 > local82) {
					local78 = local82;
				}
				@Pc(90) Class6_Sub4_Sub1 local90 = arg1.aClass6_Sub4_Sub1_1;
				if (this.aClass6_Sub4_Sub2_2.lb[arg1.anInt1691] == 0) {
					arg1.aClass6_Sub4_Sub1_1 = Static452.method430(arg1.aClass6_Sub17_Sub1_1, local90.method455(), local90.method440(), local90.method458());
				} else {
					arg1.aClass6_Sub4_Sub1_1 = Static452.method430(arg1.aClass6_Sub17_Sub1_1, local90.method455(), 0, local90.method458());
					this.aClass6_Sub4_Sub2_2.method725(arg1, arg1.aClass6_Sub35_1.aShortArray93[arg1.anInt1694] < 0);
					arg1.aClass6_Sub4_Sub1_1.method448(local78, local90.method440());
				}
				if (arg1.aClass6_Sub35_1.aShortArray93[arg1.anInt1694] < 0) {
					arg1.aClass6_Sub4_Sub1_1.method435(-1);
				}
				local90.method460(local78);
				local90.method5898(arg2, arg3, arg0 - arg3);
				if (local90.method439()) {
					this.aClass6_Sub4_Sub4_1.method5905(local90);
				}
			}
		}
		arg1.aClass6_Sub4_Sub1_1.method5898(arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()I")
	@Override
	public int method5900() {
		return 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZLclient!d;)V")
	private void method3998(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub10 arg1) {
		if ((this.aClass6_Sub4_Sub2_2.anIntArray42[arg1.anInt1691] & 0x4) != 0 && arg1.anInt1693 < 0) {
			@Pc(26) int local26 = this.aClass6_Sub4_Sub2_2.anIntArray44[arg1.anInt1691] / Static275.anInt4927;
			@Pc(36) int local36 = (local26 + 1048575 - arg1.anInt1685) / local26;
			arg1.anInt1685 = arg1.anInt1685 + local26 * arg0 & 0xFFFFF;
			if (local36 <= arg0) {
				if (this.aClass6_Sub4_Sub2_2.lb[arg1.anInt1691] == 0) {
					arg1.aClass6_Sub4_Sub1_1 = Static452.method430(arg1.aClass6_Sub17_Sub1_1, arg1.aClass6_Sub4_Sub1_1.method455(), arg1.aClass6_Sub4_Sub1_1.method440(), arg1.aClass6_Sub4_Sub1_1.method458());
				} else {
					arg1.aClass6_Sub4_Sub1_1 = Static452.method430(arg1.aClass6_Sub17_Sub1_1, arg1.aClass6_Sub4_Sub1_1.method455(), 0, arg1.aClass6_Sub4_Sub1_1.method458());
					this.aClass6_Sub4_Sub2_2.method725(arg1, arg1.aClass6_Sub35_1.aShortArray93[arg1.anInt1694] < 0);
				}
				if (arg1.aClass6_Sub35_1.aShortArray93[arg1.anInt1694] < 0) {
					arg1.aClass6_Sub4_Sub1_1.method435(-1);
				}
				arg0 = arg1.anInt1685 / local26;
			}
		}
		arg1.aClass6_Sub4_Sub1_1.method5899(arg0);
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "()Lclient!cb;")
	@Override
	public Class6_Sub4 method5904() {
		@Pc(9) Class6_Sub10 local9 = (Class6_Sub10) this.aClass244_23.method5976();
		if (local9 == null) {
			return null;
		} else if (local9.aClass6_Sub4_Sub1_1 == null) {
			return this.method5901();
		} else {
			return local9.aClass6_Sub4_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	@Override
	public void method5899(@OriginalArg(0) int arg0) {
		this.aClass6_Sub4_Sub4_1.method5899(arg0);
		for (@Pc(15) Class6_Sub10 local15 = (Class6_Sub10) this.aClass244_23.method5976(); local15 != null; local15 = (Class6_Sub10) this.aClass244_23.method5964()) {
			if (!this.aClass6_Sub4_Sub2_2.method714(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt1687) {
						this.method3998(local25, local15);
						local15.anInt1687 -= local25;
						break;
					}
					this.method3998(local15.anInt1687, local15);
					local25 -= local15.anInt1687;
				} while (!this.aClass6_Sub4_Sub2_2.method718(0, local25, null, local15));
			}
		}
	}
}
