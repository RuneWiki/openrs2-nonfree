import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class18 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!gj;")
	private Class31 aClass31_14;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	private int anInt451;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
	private int anInt459 = -1;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Z")
	private boolean aBoolean58 = true;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	private final int anInt448;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "[Lclient!ap;")
	private final Class12[] aClass12Array1;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
	private final int anInt456;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	private final int anInt453;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
	private final int anInt458;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "[Lclient!ap;")
	private final Class12[] aClass12Array2;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "Lclient!ap;")
	private final Class12 aClass12_1;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I[Lclient!ap;IIII)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) Class12[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt448 = arg0;
		this.aClass12Array1 = arg1;
		this.anInt456 = arg5;
		this.anInt453 = arg4;
		this.anInt458 = arg3;
		if (arg1 == null) {
			this.aClass12Array2 = null;
			this.aClass12_1 = null;
		} else {
			this.aClass12Array2 = new Class12[arg1.length];
			this.aClass12_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBLclient!ae;)Z")
	public boolean method691(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		if (this.anInt459 != arg0) {
			this.anInt459 = arg0;
			@Pc(12) int local12 = Static216.method3815(arg0);
			if (arg0 < local12) {
				local12 = Static331.method2985(arg0);
			}
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 != this.anInt451) {
				this.anInt451 = local12;
				this.aClass31_14 = null;
			}
			if (this.aClass12Array1 != null) {
				this.anInt452 = 0;
				@Pc(49) int[] local49 = new int[this.aClass12Array1.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass12Array1.length; local51++) {
					@Pc(58) Class12 local58 = this.aClass12Array1[local51];
					if (local58.method615(this.anInt458, this.anInt453, this.anInt456, this.anInt459)) {
						local49[this.anInt452] = local58.anInt357;
						this.aClass12Array2[this.anInt452++] = local58;
					}
				}
				Static291.method5161(local49, this.aClass12Array2, 0, this.anInt452 - 1);
			}
			this.aBoolean58 = true;
		}
		@Pc(115) boolean local115 = false;
		if (this.aBoolean58) {
			this.aBoolean58 = false;
			for (@Pc(132) int local132 = this.anInt452 - 1; local132 >= 0; local132--) {
				@Pc(143) boolean local143 = this.aClass12Array2[local132].method619(arg1, this.aClass12_1);
				local115 |= local143;
				this.aBoolean58 |= !local143;
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public void method694() {
		if (this.aClass12Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass12Array1.length; local10++) {
				this.aClass12Array1[local10].method609();
			}
		}
		this.aClass31_14 = null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIILclient!ae;I)V")
	public void method695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class4 arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg6 + arg1 & 0x3FFF;
		if (this.anInt448 == -1) {
			arg7.method4246(arg2, arg8, arg4, arg3, arg5, 0);
		} else {
			@Pc(32) Class213 local32 = Static326.anInterface7_8.method5778(this.anInt448);
			if (this.aClass31_14 == null && Static326.anInterface7_8.method5780(this.anInt448)) {
				@Pc(68) int[] local68 = local32.aBoolean612 ? Static326.anInterface7_8.method5777(this.anInt451, 0.7F, this.anInt448, this.anInt451, false) : Static326.anInterface7_8.method5781(this.anInt448, this.anInt451, 0.7F, this.anInt451);
				this.aClass31_14 = arg7.method4227(local68, this.anInt451, this.anInt451, this.anInt451);
			}
			if (!local32.aBoolean612) {
				arg7.method4246(arg2, arg8, arg4, arg3, arg5, 0);
			}
			if (this.aClass31_14 != null) {
				@Pc(101) int local101 = local32.aBoolean612 ? 0 : 1;
				@Pc(107) int local107 = arg3 * arg0 / -4096;
				@Pc(119) int local119;
				for (local119 = (arg4 - arg3) / 2 + arg3 * local7 / 4096; local119 > arg3; local119 -= arg3) {
				}
				while (local119 < 0) {
					local119 += arg3;
				}
				while (local107 > arg3) {
					local107 -= arg3;
				}
				while (local107 < 0) {
					local107 += arg3;
				}
				for (@Pc(160) int local160 = local119 - arg3; local160 < arg4; local160 += arg3) {
					for (@Pc(167) int local167 = local107 - arg3; local167 < arg3; local167 += arg3) {
						this.aClass31_14.method4391(arg2 + local160, local167 + arg8, arg3, arg3, 0, 0, local101);
					}
				}
			}
		}
		for (@Pc(202) int local202 = this.anInt452 - 1; local202 >= 0; local202--) {
			this.aClass12Array2[local202].method618(arg7, arg2, arg8, arg4, arg3, arg0, local7);
		}
	}
}
