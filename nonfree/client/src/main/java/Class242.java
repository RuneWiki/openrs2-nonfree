import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class242 {

	@OriginalMember(owner = "client!un", name = "g", descriptor = "I")
	private int anInt6712;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "I")
	private int anInt6714;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "Lclient!l;")
	private Class57 aClass57_24;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Z")
	private boolean aBoolean606 = true;

	@OriginalMember(owner = "client!un", name = "m", descriptor = "I")
	private int anInt6716 = -1;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "[Lclient!ad;")
	private final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!un", name = "t", descriptor = "I")
	private final int anInt6721;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "I")
	private final int anInt6708;

	@OriginalMember(owner = "client!un", name = "v", descriptor = "I")
	private final int anInt6722;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "I")
	private final int anInt6717;

	@OriginalMember(owner = "client!un", name = "u", descriptor = "[Lclient!ad;")
	private final Class5[] aClass5Array2;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Lclient!ad;")
	private final Class5 aClass5_1;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(I[Lclient!ad;IIII)V")
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) Class5[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass5Array1 = arg1;
		this.anInt6721 = arg0;
		this.anInt6708 = arg3;
		this.anInt6722 = arg4;
		this.anInt6717 = arg5;
		if (arg1 == null) {
			this.aClass5_1 = null;
			this.aClass5Array2 = null;
		} else {
			this.aClass5Array2 = new Class5[arg1.length];
			this.aClass5_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BILclient!ya;)Z")
	public boolean method5248(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(57) int local57;
		if (this.anInt6716 != arg0) {
			this.anInt6716 = arg0;
			@Pc(20) int local20 = Static370.method4949(arg0);
			if (local20 > arg0) {
				local20 = Static159.method2696(arg0);
			}
			if (local20 > 512) {
				local20 = 512;
			}
			if (local20 != this.anInt6714) {
				this.aClass57_24 = null;
				this.anInt6714 = local20;
			}
			if (this.aClass5Array1 != null) {
				this.anInt6712 = 0;
				@Pc(55) int[] local55 = new int[this.aClass5Array1.length];
				for (local57 = 0; local57 < this.aClass5Array1.length; local57++) {
					@Pc(64) Class5 local64 = this.aClass5Array1[local57];
					if (local64.method33(this.anInt6708, this.anInt6722, this.anInt6717, this.anInt6716)) {
						local55[this.anInt6712] = local64.anInt34;
						this.aClass5Array2[this.anInt6712++] = local64;
					}
				}
				Static264.method3813(local55, this.anInt6712 - 1, 0, this.aClass5Array2);
			}
			this.aBoolean606 = true;
		}
		@Pc(121) boolean local121 = false;
		if (this.aBoolean606) {
			this.aBoolean606 = false;
			for (local57 = this.anInt6712 - 1; local57 >= 0; local57--) {
				@Pc(143) boolean local143 = this.aClass5Array2[local57].method39(arg1, this.aClass5_1);
				this.aBoolean606 |= !local143;
				local121 |= local143;
			}
		}
		return local121;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	public void method5253() {
		if (this.aClass5Array1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass5Array1.length; local6++) {
				this.aClass5Array1[local6].method31();
			}
		}
		this.aClass57_24 = null;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIILclient!ya;IIII)V")
	public void method5255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class19 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) int local12 = arg3 + arg0 & 0x3FFF;
		if (this.anInt6721 == -1) {
			arg5.O(arg1, arg2, arg6, arg8, arg7, 0);
		} else {
			@Pc(32) Class251 local32 = Static402.anInterface7_8.method2396(this.anInt6721);
			if (this.aClass57_24 == null && Static402.anInterface7_8.method2392(this.anInt6721)) {
				@Pc(70) int[] local70 = local32.aBoolean640 ? Static402.anInterface7_8.method2393(false, this.anInt6721, 0.7F, this.anInt6714, this.anInt6714) : Static402.anInterface7_8.method2395(this.anInt6721, 0.7F, this.anInt6714, this.anInt6714);
				this.aClass57_24 = arg5.method4265(local70, this.anInt6714, this.anInt6714, this.anInt6714);
			}
			if (!local32.aBoolean640) {
				arg5.O(arg1, arg2, arg6, arg8, arg7, 0);
			}
			if (this.aClass57_24 != null) {
				@Pc(103) int local103 = local32.aBoolean640 ? 0 : 1;
				@Pc(109) int local109 = arg4 * arg8 / -4096;
				@Pc(121) int local121;
				for (local121 = (arg6 - arg8) / 2 + arg8 * local12 / 4096; local121 > arg8; local121 -= arg8) {
				}
				while (local121 < 0) {
					local121 += arg8;
				}
				while (arg8 < local109) {
					local109 -= arg8;
				}
				while (local109 < 0) {
					local109 += arg8;
				}
				for (@Pc(167) int local167 = local121 - arg8; local167 < arg6; local167 += arg8) {
					for (@Pc(174) int local174 = local109 - arg8; local174 < arg8; local174 += arg8) {
						this.aClass57_24.s(arg1 + local167, local174 + arg2, arg8, arg8, 1, 0, local103);
					}
				}
			}
		}
		for (@Pc(209) int local209 = this.anInt6712 - 1; local209 >= 0; local209--) {
			this.aClass5Array2[local209].method38(arg5, arg1, arg2, arg6, arg8, arg4, local12);
		}
	}
}
