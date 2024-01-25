import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class64 {

	@OriginalMember(owner = "client!er", name = "g", descriptor = "Lclient!aa;")
	private Class2 aClass2_1;

	@OriginalMember(owner = "client!er", name = "m", descriptor = "I")
	private int anInt1800;

	@OriginalMember(owner = "client!er", name = "o", descriptor = "I")
	private int anInt1801;

	@OriginalMember(owner = "client!er", name = "l", descriptor = "I")
	private int anInt1799 = -1;

	@OriginalMember(owner = "client!er", name = "n", descriptor = "Z")
	private boolean aBoolean111 = true;

	@OriginalMember(owner = "client!er", name = "d", descriptor = "I")
	private final int anInt1794;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "I")
	private final int anInt1795;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "I")
	private final int anInt1792;

	@OriginalMember(owner = "client!er", name = "h", descriptor = "I")
	private final int anInt1796;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "[Lclient!kf;")
	private final Class127[] aClass127Array2;

	@OriginalMember(owner = "client!er", name = "c", descriptor = "[Lclient!kf;")
	private final Class127[] aClass127Array1;

	@OriginalMember(owner = "client!er", name = "k", descriptor = "Lclient!kf;")
	private final Class127 aClass127_1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(I[Lclient!kf;IIII)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) Class127[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1794 = arg3;
		this.anInt1795 = arg0;
		this.anInt1792 = arg5;
		this.anInt1796 = arg4;
		this.aClass127Array2 = arg1;
		if (arg1 == null) {
			this.aClass127_1 = null;
			this.aClass127Array1 = null;
		} else {
			this.aClass127Array1 = new Class127[arg1.length];
			this.aClass127_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!qa;IIIIIIII)V")
	public void method1676(@OriginalArg(1) Class167 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg1 + arg6 & 0x3FFF;
		if (this.anInt1795 == -1) {
			arg0.M(arg4, arg5, arg2, arg8, arg7, 0);
		} else {
			@Pc(29) Class105 local29 = Static295.anInterface7_7.method4417(this.anInt1795);
			if (this.aClass2_1 == null && Static295.anInterface7_7.method4420(this.anInt1795)) {
				@Pc(65) int[] local65 = local29.aBoolean234 ? Static295.anInterface7_7.method4418(this.anInt1795, this.anInt1801, this.anInt1801, 0.7F) : Static295.anInterface7_7.method4416(this.anInt1795, false, this.anInt1801, this.anInt1801, 0.7F);
				this.aClass2_1 = arg0.method6021(local65, this.anInt1801, this.anInt1801, this.anInt1801);
			}
			if (local29.aBoolean234) {
				arg0.M(arg4, arg5, arg2, arg8, arg7, 0);
			}
			if (this.aClass2_1 != null) {
				@Pc(98) int local98 = local29.aBoolean234 ? 1 : 0;
				@Pc(104) int local104 = arg8 * arg3 / -4096;
				@Pc(117) int local117;
				for (local117 = arg8 * local7 / 4096 + (arg2 - arg8) / 2; local117 > arg8; local117 -= arg8) {
				}
				while (local117 < 0) {
					local117 += arg8;
				}
				while (local104 > arg8) {
					local104 -= arg8;
				}
				while (local104 < 0) {
					local104 += arg8;
				}
				for (@Pc(170) int local170 = local117 - arg8; local170 < arg2; local170 += arg8) {
					for (@Pc(176) int local176 = local104 - arg8; local176 < arg8; local176 += arg8) {
						this.aClass2_1.XA(arg4 + local170, local176 + arg5, arg8, arg8, 1, 0, local98);
					}
				}
			}
		}
		for (@Pc(221) int local221 = this.anInt1800 - 1; local221 >= 0; local221--) {
			this.aClass127Array1[local221].method3173(arg0, arg4, arg5, arg2, arg8, arg3, local7);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	public void method1677() {
		if (this.aClass127Array2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass127Array2.length; local10++) {
				this.aClass127Array2[local10].method3174();
			}
		}
		this.aClass2_1 = null;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILclient!qa;)Z")
	public boolean method1678(@OriginalArg(0) int arg0, @OriginalArg(2) Class167 arg1) {
		if (arg0 != this.anInt1799) {
			this.anInt1799 = arg0;
			@Pc(18) int local18 = Static146.method2292(arg0);
			if (local18 > 512) {
				local18 = 512;
			}
			if (local18 <= 0) {
				local18 = 1;
			}
			if (local18 != this.anInt1801) {
				this.aClass2_1 = null;
				this.anInt1801 = local18;
			}
			if (this.aClass127Array2 != null) {
				this.anInt1800 = 0;
				@Pc(48) int[] local48 = new int[this.aClass127Array2.length];
				for (@Pc(50) int local50 = 0; local50 < this.aClass127Array2.length; local50++) {
					@Pc(57) Class127 local57 = this.aClass127Array2[local50];
					if (local57.method3172(this.anInt1794, this.anInt1796, this.anInt1792, this.anInt1799)) {
						local48[this.anInt1800] = local57.anInt3678;
						this.aClass127Array1[this.anInt1800++] = local57;
					}
				}
				Static324.method4495(this.anInt1800 - 1, local48, this.aClass127Array1, 0);
			}
			this.aBoolean111 = true;
		}
		@Pc(110) boolean local110 = false;
		if (this.aBoolean111) {
			this.aBoolean111 = false;
			for (@Pc(121) int local121 = this.anInt1800 - 1; local121 >= 0; local121--) {
				@Pc(132) boolean local132 = this.aClass127Array1[local121].method3170(arg1, this.aClass127_1);
				this.aBoolean111 |= !local132;
				local110 |= local132;
			}
		}
		return local110;
	}
}
