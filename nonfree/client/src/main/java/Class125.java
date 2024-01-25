import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class125 {

	@OriginalMember(owner = "client!li", name = "l", descriptor = "I")
	private int anInt3289;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "Lclient!of;")
	private Class40 aClass40_11;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "I")
	private int anInt3290;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Z")
	private boolean aBoolean236 = true;

	@OriginalMember(owner = "client!li", name = "r", descriptor = "I")
	private int anInt3292 = -1;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	private final int anInt3285;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "I")
	private final int anInt3291;

	@OriginalMember(owner = "client!li", name = "y", descriptor = "I")
	private final int anInt3299;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	private final int anInt3295;

	@OriginalMember(owner = "client!li", name = "o", descriptor = "[Lclient!la;")
	private final Class122[] aClass122Array2;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "[Lclient!la;")
	private final Class122[] aClass122Array1;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "Lclient!la;")
	private final Class122 aClass122_1;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I[Lclient!la;IIII)V")
	public Class125(@OriginalArg(0) int arg0, @OriginalArg(1) Class122[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3285 = arg3;
		this.anInt3291 = arg4;
		this.anInt3299 = arg5;
		this.anInt3295 = arg0;
		this.aClass122Array2 = arg1;
		if (arg1 == null) {
			this.aClass122_1 = null;
			this.aClass122Array1 = null;
		} else {
			this.aClass122Array1 = new Class122[arg1.length];
			this.aClass122_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!ja;I)Z")
	public boolean method3403(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1) {
		if (arg0 != this.anInt3292) {
			this.anInt3292 = arg0;
			@Pc(16) int local16 = Static247.method4066(arg0);
			if (local16 > arg0) {
				local16 = Static62.method1001(arg0);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (this.anInt3290 != local16) {
				this.anInt3290 = local16;
				this.aClass40_11 = null;
			}
			if (this.aClass122Array2 != null) {
				this.anInt3289 = 0;
				@Pc(49) int[] local49 = new int[this.aClass122Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass122Array2.length; local51++) {
					@Pc(58) Class122 local58 = this.aClass122Array2[local51];
					if (local58.method3305(this.anInt3285, this.anInt3291, this.anInt3299, this.anInt3292)) {
						local49[this.anInt3289] = local58.anInt3170;
						this.aClass122Array1[this.anInt3289++] = local58;
					}
				}
				Static144.method2692(local49, this.anInt3289 - 1, 0, this.aClass122Array1);
			}
			this.aBoolean236 = true;
		}
		@Pc(115) boolean local115 = false;
		if (this.aBoolean236) {
			this.aBoolean236 = false;
			for (@Pc(126) int local126 = this.anInt3289 - 1; local126 >= 0; local126--) {
				@Pc(137) boolean local137 = this.aClass122Array1[local126].method3302(arg1, this.aClass122_1);
				local115 |= local137;
				this.aBoolean236 |= !local137;
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIILclient!ja;IIIIIZ)V")
	public void method3404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class81 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(11) int local11 = arg6 + arg7 & 0x3FFF;
		if (this.anInt3295 == -1) {
			arg3.method2962(arg4, arg5, arg1, arg2, arg0, 0);
		} else {
			@Pc(22) Class82 local22 = Static10.anInterface2_1.method346(this.anInt3295);
			if (this.aClass40_11 == null && Static10.anInterface2_1.method349(this.anInt3295)) {
				@Pc(58) int[] local58 = local22.aBoolean158 ? Static10.anInterface2_1.method347(this.anInt3290, this.anInt3295, this.anInt3290, 0.7F, false) : Static10.anInterface2_1.method345(this.anInt3295, this.anInt3290, 0.7F, this.anInt3290);
				this.aClass40_11 = arg3.method2996(local58, this.anInt3290, this.anInt3290, this.anInt3290);
			}
			if (!local22.aBoolean158) {
				arg3.method2962(arg4, arg5, arg1, arg2, arg0, 0);
			}
			if (this.aClass40_11 != null) {
				@Pc(91) int local91 = local22.aBoolean158 ? 0 : 1;
				@Pc(97) int local97 = arg2 * arg8 / -4096;
				@Pc(111) int local111;
				for (local111 = (arg1 - arg2) / 2 + arg2 * local11 / 4096; local111 > arg2; local111 -= arg2) {
				}
				while (local97 > arg2) {
					local97 -= arg2;
				}
				while (local111 < 0) {
					local111 += arg2;
				}
				while (local97 < 0) {
					local97 += arg2;
				}
				for (@Pc(160) int local160 = local111 - arg2; local160 < arg1; local160 += arg2) {
					for (@Pc(167) int local167 = local97 - arg2; local167 < arg2; local167 += arg2) {
						this.aClass40_11.method5082(arg4 + local160, arg5 + local167, arg2, arg2, 0, 0, local91);
					}
				}
			}
		}
		for (@Pc(212) int local212 = this.anInt3289 - 1; local212 >= 0; local212--) {
			this.aClass122Array1[local212].method3310(arg3, arg4, arg5, arg1, arg2, arg8, local11);
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	public void method3406() {
		if (this.aClass122Array2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass122Array2.length; local10++) {
				this.aClass122Array2[local10].method3309();
			}
		}
		this.aClass40_11 = null;
	}
}
