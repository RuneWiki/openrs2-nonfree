import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class64 {

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
	private int anInt1658;

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
	private int anInt1663;

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "Lclient!it;")
	private Class28 aClass28_4;

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
	private int anInt1664 = -1;

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "Z")
	private boolean aBoolean118 = true;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "[Lclient!pg;")
	private final Class270[] aClass270Array2;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
	private final int anInt1662;

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
	private final int anInt1665;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
	private final int anInt1656;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
	private final int anInt1659;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "[Lclient!pg;")
	private final Class270[] aClass270Array1;

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "Lclient!pg;")
	private final Class270 aClass270_1;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I[Lclient!pg;IIII)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) Class270[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass270Array2 = arg1;
		this.anInt1662 = arg4;
		this.anInt1665 = arg3;
		this.anInt1656 = arg0;
		this.anInt1659 = arg5;
		if (arg1 == null) {
			this.aClass270Array1 = null;
			this.aClass270_1 = null;
		} else {
			this.aClass270Array1 = new Class270[arg1.length];
			this.aClass270_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public void method1357() {
		if (this.aClass270Array2 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass270Array2.length; local15++) {
				this.aClass270Array2[local15].method6409();
			}
		}
		this.aClass28_4 = null;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!ha;I)Z")
	public boolean method1360(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1) {
		if (arg0 != this.anInt1664) {
			this.anInt1664 = arg0;
			@Pc(16) int local16 = Static460.method6846(arg0);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (local16 != this.anInt1658) {
				this.aClass28_4 = null;
				this.anInt1658 = local16;
			}
			if (this.aClass270Array2 != null) {
				this.anInt1663 = 0;
				@Pc(50) int[] local50 = new int[this.aClass270Array2.length];
				for (@Pc(52) int local52 = 0; local52 < this.aClass270Array2.length; local52++) {
					@Pc(59) Class270 local59 = this.aClass270Array2[local52];
					if (local59.method6414(this.anInt1665, this.anInt1662, this.anInt1659, this.anInt1664)) {
						local50[this.anInt1663] = local59.anInt7294;
						this.aClass270Array1[this.anInt1663++] = local59;
					}
				}
				Static534.method7879(0, local50, this.anInt1663 - 1, this.aClass270Array1);
			}
			this.aBoolean118 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean118) {
			this.aBoolean118 = false;
			for (@Pc(133) int local133 = this.anInt1663 - 1; local133 >= 0; local133--) {
				@Pc(144) boolean local144 = this.aClass270Array1[local133].method6412(arg1, this.aClass270_1);
				local122 |= local144;
				this.aBoolean118 |= !local144;
			}
		}
		return local122;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIILclient!ha;IIII)V")
	public void method1361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class133 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg7 + arg8 & 0x3FFF;
		if (this.anInt1656 == -1 || this.anInt1658 == 0) {
			arg4.aa(arg1, arg0, arg3, arg5, arg2, 0);
		} else {
			@Pc(40) Class145 local40 = Static116.anInterface3_7.method4656(this.anInt1656);
			if (this.aClass28_4 == null && Static116.anInterface3_7.method4654(this.anInt1656)) {
				@Pc(77) int[] local77 = local40.anInt3988 == 2 ? Static116.anInterface3_7.method4658(0.7F, this.anInt1658, this.anInt1658, this.anInt1656) : Static116.anInterface3_7.method4653(0.7F, this.anInt1658, this.anInt1656, this.anInt1658, false);
				this.aClass28_4 = arg4.method7261(local77, this.anInt1658, this.anInt1658, this.anInt1658);
			}
			if (local40.anInt3988 == 2) {
				arg4.aa(arg1, arg0, arg3, arg5, arg2, 0);
			}
			if (this.aClass28_4 != null) {
				@Pc(113) int local113 = local40.anInt3988 == 2 ? 1 : 0;
				@Pc(119) int local119 = arg5 * arg6 / -4096;
				@Pc(133) int local133;
				for (local133 = (arg3 - arg5) / 2 + local11 * arg5 / 4096; local133 > arg5; local133 -= arg5) {
				}
				while (local133 < 0) {
					local133 += arg5;
				}
				while (local119 > arg5) {
					local119 -= arg5;
				}
				while (local119 < 0) {
					local119 += arg5;
				}
				for (@Pc(176) int local176 = local133 - arg5; local176 < arg3; local176 += arg5) {
					for (@Pc(182) int local182 = local119 - arg5; local182 < arg5; local182 += arg5) {
						this.aClass28_4.method4051(local176 + arg1, arg0 + local182, arg5, arg5, 1, 0, local113);
					}
				}
			}
		}
		for (@Pc(221) int local221 = this.anInt1663 - 1; local221 >= 0; local221--) {
			this.aClass270Array1[local221].method6408(arg4, arg1, arg0, arg3, arg5, arg6, local11);
		}
	}
}
