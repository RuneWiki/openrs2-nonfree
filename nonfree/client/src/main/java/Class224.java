import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class224 {

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "Lclient!f;")
	private Class10 aClass10_25;

	@OriginalMember(owner = "client!nda", name = "l", descriptor = "I")
	private int anInt6107;

	@OriginalMember(owner = "client!nda", name = "o", descriptor = "I")
	private int anInt6110;

	@OriginalMember(owner = "client!nda", name = "k", descriptor = "I")
	private int anInt6106 = -1;

	@OriginalMember(owner = "client!nda", name = "p", descriptor = "Z")
	private boolean aBoolean438 = true;

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "[Lclient!aba;")
	private final Class5[] aClass5Array2;

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
	private final int anInt6103;

	@OriginalMember(owner = "client!nda", name = "r", descriptor = "I")
	private final int anInt6111;

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
	private final int anInt6101;

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "I")
	private final int anInt6104;

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "[Lclient!aba;")
	private final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!nda", name = "q", descriptor = "Lclient!aba;")
	private final Class5 aClass5_1;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(I[Lclient!aba;IIII)V")
	public Class224(@OriginalArg(0) int arg0, @OriginalArg(1) Class5[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass5Array2 = arg1;
		this.anInt6103 = arg4;
		this.anInt6111 = arg3;
		this.anInt6101 = arg5;
		this.anInt6104 = arg0;
		if (arg1 == null) {
			this.aClass5Array1 = null;
			this.aClass5_1 = null;
		} else {
			this.aClass5Array1 = new Class5[arg1.length];
			this.aClass5_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IBLclient!r;)Z")
	public boolean method5124(@OriginalArg(0) int arg0, @OriginalArg(2) Class12 arg1) {
		if (this.anInt6106 != arg0) {
			this.anInt6106 = arg0;
			@Pc(12) int local12 = Static549.method7478(arg0);
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 <= 0) {
				local12 = 1;
			}
			if (local12 != this.anInt6107) {
				this.aClass10_25 = null;
				this.anInt6107 = local12;
			}
			if (this.aClass5Array2 != null) {
				this.anInt6110 = 0;
				@Pc(46) int[] local46 = new int[this.aClass5Array2.length];
				for (@Pc(48) int local48 = 0; local48 < this.aClass5Array2.length; local48++) {
					@Pc(55) Class5 local55 = this.aClass5Array2[local48];
					if (local55.method85(this.anInt6111, this.anInt6103, this.anInt6101, this.anInt6106)) {
						local46[this.anInt6110] = local55.anInt88;
						this.aClass5Array1[this.anInt6110++] = local55;
					}
				}
				Static14.method459(this.anInt6110 - 1, 0, this.aClass5Array1, local46);
			}
			this.aBoolean438 = true;
		}
		@Pc(121) boolean local121 = false;
		if (this.aBoolean438) {
			this.aBoolean438 = false;
			for (@Pc(132) int local132 = this.anInt6110 - 1; local132 >= 0; local132--) {
				@Pc(143) boolean local143 = this.aClass5Array1[local132].method75(arg1, this.aClass5_1);
				this.aBoolean438 |= !local143;
				local121 |= local143;
			}
		}
		return local121;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIIILclient!r;III)V")
	public void method5125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class12 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) int local8 = arg6 + arg3 & 0x3FFF;
		if (this.anInt6104 == -1) {
			arg5.J(arg1, arg8, arg7, arg0, arg4, 0);
		} else {
			@Pc(35) Class45 local35 = Static352.anInterface5_8.method4043(this.anInt6104);
			if (this.aClass10_25 == null && Static352.anInterface5_8.method4045(this.anInt6104)) {
				@Pc(71) int[] local71 = local35.aBoolean121 ? Static352.anInterface5_8.method4047(this.anInt6107, this.anInt6107, 0.7F, this.anInt6104) : Static352.anInterface5_8.method4048(this.anInt6104, this.anInt6107, false, 0.7F, this.anInt6107);
				this.aClass10_25 = arg5.method6429(local71, this.anInt6107, this.anInt6107, this.anInt6107);
			}
			if (local35.aBoolean121) {
				arg5.J(arg1, arg8, arg7, arg0, arg4, 0);
			}
			if (this.aClass10_25 != null) {
				@Pc(104) int local104 = local35.aBoolean121 ? 1 : 0;
				@Pc(110) int local110 = arg2 * arg0 / -4096;
				@Pc(123) int local123;
				for (local123 = arg0 * local8 / 4096 + (arg7 - arg0) / 2; local123 > arg0; local123 -= arg0) {
				}
				while (local123 < 0) {
					local123 += arg0;
				}
				while (arg0 < local110) {
					local110 -= arg0;
				}
				while (local110 < 0) {
					local110 += arg0;
				}
				for (@Pc(173) int local173 = local123 - arg0; local173 < arg7; local173 += arg0) {
					for (@Pc(180) int local180 = local110 - arg0; local180 < arg0; local180 += arg0) {
						this.aClass10_25.method7680(arg1 + local173, arg8 + local180, arg0, arg0, 1, 0, local104);
					}
				}
			}
		}
		for (@Pc(219) int local219 = this.anInt6110 - 1; local219 >= 0; local219--) {
			this.aClass5Array1[local219].method81(arg5, arg1, arg8, arg7, arg0, arg2, local8);
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V")
	public void method5126() {
		if (this.aClass5Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass5Array2.length; local6++) {
				this.aClass5Array2[local6].method84();
			}
		}
		this.aClass10_25 = null;
	}
}
