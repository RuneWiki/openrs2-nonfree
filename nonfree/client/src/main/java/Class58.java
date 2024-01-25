import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class58 {

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
	private int anInt1633;

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Lclient!rg;")
	private Class27 aClass27_7;

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
	private int anInt1639;

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
	private int anInt1641 = -1;

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "[Lclient!lq;")
	private final Class143[] aClass143Array2;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
	private final int anInt1636;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
	private final int anInt1632;

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
	private final int anInt1642;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
	private final int anInt1634;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "[Lclient!lq;")
	private final Class143[] aClass143Array1;

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "Lclient!lq;")
	private final Class143 aClass143_1;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I[Lclient!lq;IIII)V")
	public Class58(@OriginalArg(0) int arg0, @OriginalArg(1) Class143[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass143Array2 = arg1;
		this.anInt1636 = arg3;
		this.anInt1632 = arg0;
		this.anInt1642 = arg5;
		this.anInt1634 = arg4;
		if (arg1 == null) {
			this.aClass143Array1 = null;
			this.aClass143_1 = null;
		} else {
			this.aClass143Array1 = new Class143[arg1.length];
			this.aClass143_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILclient!oj;)Z")
	public boolean method1289(@OriginalArg(0) int arg0, @OriginalArg(2) Class48 arg1) {
		if (this.anInt1641 != arg0) {
			this.anInt1641 = arg0;
			@Pc(26) int local26 = Static279.method4638(arg0);
			if (local26 > arg0) {
				local26 = Static65.method1195(arg0);
			}
			if (local26 > 512) {
				local26 = 512;
			}
			if (this.anInt1633 != local26) {
				this.anInt1633 = local26;
				this.aClass27_7 = null;
			}
			if (this.aClass143Array2 != null) {
				this.anInt1639 = 0;
				@Pc(63) int[] local63 = new int[this.aClass143Array2.length];
				for (@Pc(65) int local65 = 0; local65 < this.aClass143Array2.length; local65++) {
					@Pc(72) Class143 local72 = this.aClass143Array2[local65];
					if (local72.method3691(this.anInt1636, this.anInt1634, this.anInt1642, this.anInt1641)) {
						local63[this.anInt1639] = local72.anInt4151;
						this.aClass143Array1[this.anInt1639++] = local72;
					}
				}
				Static96.method1640(this.anInt1639 - 1, this.aClass143Array1, 0, local63);
			}
			this.aBoolean128 = true;
		}
		@Pc(125) boolean local125 = false;
		if (this.aBoolean128) {
			this.aBoolean128 = false;
			for (@Pc(136) int local136 = this.anInt1639 - 1; local136 >= 0; local136--) {
				@Pc(147) boolean local147 = this.aClass143Array1[local136].method3690(arg1, this.aClass143_1);
				local125 |= local147;
				this.aBoolean128 |= !local147;
			}
		}
		return local125;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIILclient!oj;IIII)V")
	public void method1290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class48 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg7 + arg2 & 0x3FFF;
		if (this.anInt1632 == -1) {
			arg5.method2470(arg3, arg8, arg4, arg1, arg6, 0);
		} else {
			@Pc(21) Class166 local21 = Static194.anInterface3_5.method1278(this.anInt1632);
			if (this.aClass27_7 == null && Static194.anInterface3_5.method1277(this.anInt1632)) {
				@Pc(57) int[] local57 = local21.aBoolean342 ? Static194.anInterface3_5.method1279(false, this.anInt1632, this.anInt1633, 0.7F, this.anInt1633) : Static194.anInterface3_5.method1281(this.anInt1632, 0.7F, this.anInt1633, this.anInt1633);
				this.aClass27_7 = arg5.method2456(local57, this.anInt1633, this.anInt1633, this.anInt1633);
			}
			if (!local21.aBoolean342) {
				arg5.method2470(arg3, arg8, arg4, arg1, arg6, 0);
			}
			if (this.aClass27_7 != null) {
				@Pc(90) int local90 = local21.aBoolean342 ? 0 : 1;
				@Pc(96) int local96 = arg0 * arg1 / -4096;
				@Pc(109) int local109;
				for (local109 = arg1 * local11 / 4096 + (arg4 - arg1) / 2; local109 > arg1; local109 -= arg1) {
				}
				while (local96 > arg1) {
					local96 -= arg1;
				}
				while (local109 < 0) {
					local109 += arg1;
				}
				while (local96 < 0) {
					local96 += arg1;
				}
				for (@Pc(155) int local155 = local109 - arg1; local155 < arg4; local155 += arg1) {
					for (@Pc(162) int local162 = local96 - arg1; local162 < arg1; local162 += arg1) {
						this.aClass27_7.method5334(arg3 + local155, arg8 + local162, arg1, arg1, 0, 0, local90);
					}
				}
			}
		}
		for (@Pc(211) int local211 = this.anInt1639 - 1; local211 >= 0; local211--) {
			this.aClass143Array1[local211].method3689(arg5, arg3, arg8, arg4, arg1, arg0, local11);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
	public void method1291() {
		if (this.aClass143Array2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass143Array2.length; local10++) {
				this.aClass143Array2[local10].method3695();
			}
		}
		this.aClass27_7 = null;
	}
}
