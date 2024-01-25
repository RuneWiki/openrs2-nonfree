import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class108 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!f;")
	private Class8 aClass8_12;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
	private int anInt3370;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	private int anInt3372;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	private int anInt3368 = -1;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Z")
	private boolean aBoolean287 = true;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
	private final int anInt3377;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	private final int anInt3373;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "[Lclient!lp;")
	private final Class144[] aClass144Array1;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
	private final int anInt3375;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
	private final int anInt3364;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "Lclient!lp;")
	private final Class144 aClass144_1;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "[Lclient!lp;")
	private final Class144[] aClass144Array2;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[Lclient!lp;IIII)V")
	public Class108(@OriginalArg(0) int arg0, @OriginalArg(1) Class144[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3377 = arg0;
		this.anInt3373 = arg4;
		this.aClass144Array1 = arg1;
		this.anInt3375 = arg5;
		this.anInt3364 = arg3;
		if (arg1 == null) {
			this.aClass144_1 = null;
			this.aClass144Array2 = null;
		} else {
			this.aClass144Array2 = new Class144[arg1.length];
			this.aClass144_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIILclient!qa;II)V")
	public void method2711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class172 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) int local8 = arg7 + arg1 & 0x3FFF;
		if (this.anInt3377 == -1) {
			arg6.NA(arg8, arg0, arg5, arg3, arg4, 0);
		} else {
			@Pc(25) Class76 local25 = Static265.anInterface5_5.method3918(this.anInt3377);
			if (this.aClass8_12 == null && Static265.anInterface5_5.method3921(this.anInt3377)) {
				@Pc(61) int[] local61 = local25.aBoolean212 ? Static265.anInterface5_5.method3920(this.anInt3377, this.anInt3372, this.anInt3372, false, 0.7F) : Static265.anInterface5_5.method3919(this.anInt3377, this.anInt3372, 0.7F, this.anInt3372);
				this.aClass8_12 = arg6.method5478(local61, this.anInt3372, this.anInt3372, this.anInt3372);
			}
			if (!local25.aBoolean212) {
				arg6.NA(arg8, arg0, arg5, arg3, arg4, 0);
			}
			if (this.aClass8_12 != null) {
				@Pc(94) int local94 = local25.aBoolean212 ? 0 : 1;
				@Pc(100) int local100 = arg3 * arg2 / -4096;
				@Pc(112) int local112;
				for (local112 = arg3 * local8 / 4096 + (arg5 - arg3) / 2; local112 > arg3; local112 -= arg3) {
				}
				while (local100 > arg3) {
					local100 -= arg3;
				}
				while (local112 < 0) {
					local112 += arg3;
				}
				while (local100 < 0) {
					local100 += arg3;
				}
				for (@Pc(154) int local154 = local112 - arg3; local154 < arg5; local154 += arg3) {
					for (@Pc(161) int local161 = local100 - arg3; local161 < arg3; local161 += arg3) {
						this.aClass8_12.M(local154 + arg8, local161 + arg0, arg3, arg3, 1, 0, local94);
					}
				}
			}
		}
		for (@Pc(215) int local215 = this.anInt3370 - 1; local215 >= 0; local215--) {
			this.aClass144Array2[local215].method3554(arg6, arg8, arg0, arg5, arg3, arg2, local8);
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public void method2713() {
		if (this.aClass144Array1 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass144Array1.length; local8++) {
				this.aClass144Array1[local8].method3551();
			}
		}
		this.aClass8_12 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!qa;I)Z")
	public boolean method2716(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt3368) {
			this.anInt3368 = arg1;
			@Pc(12) int local12 = Static288.method4088(arg1);
			if (arg1 < local12) {
				local12 = Static102.method1790(arg1);
			}
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 != this.anInt3372) {
				this.aClass8_12 = null;
				this.anInt3372 = local12;
			}
			if (this.aClass144Array1 != null) {
				this.anInt3370 = 0;
				@Pc(51) int[] local51 = new int[this.aClass144Array1.length];
				for (@Pc(53) int local53 = 0; local53 < this.aClass144Array1.length; local53++) {
					@Pc(60) Class144 local60 = this.aClass144Array1[local53];
					if (local60.method3550(this.anInt3364, this.anInt3373, this.anInt3375, this.anInt3368)) {
						local51[this.anInt3370] = local60.anInt4478;
						this.aClass144Array2[this.anInt3370++] = local60;
					}
				}
				Static371.method4862(this.anInt3370 - 1, this.aClass144Array2, local51, 0);
			}
			this.aBoolean287 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean287) {
			this.aBoolean287 = false;
			for (@Pc(133) int local133 = this.anInt3370 - 1; local133 >= 0; local133--) {
				@Pc(144) boolean local144 = this.aClass144Array2[local133].method3548(arg0, this.aClass144_1);
				this.aBoolean287 |= !local144;
				local122 |= local144;
			}
		}
		return local122;
	}
}
