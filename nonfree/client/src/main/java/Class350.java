import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class350 {

	@OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
	private int anInt8808;

	@OriginalMember(owner = "client!vfa", name = "i", descriptor = "Lclient!f;")
	private Class14 aClass14_33;

	@OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
	private int anInt8815;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "Z")
	private boolean aBoolean675 = true;

	@OriginalMember(owner = "client!vfa", name = "u", descriptor = "I")
	private int anInt8819 = -1;

	@OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
	private final int anInt8811;

	@OriginalMember(owner = "client!vfa", name = "n", descriptor = "[Lclient!ka;")
	private final Class171[] aClass171Array2;

	@OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
	private final int anInt8818;

	@OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
	private final int anInt8816;

	@OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
	private final int anInt8810;

	@OriginalMember(owner = "client!vfa", name = "j", descriptor = "[Lclient!ka;")
	private final Class171[] aClass171Array1;

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "Lclient!ka;")
	private final Class171 aClass171_1;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(I[Lclient!ka;IIII)V")
	public Class350(@OriginalArg(0) int arg0, @OriginalArg(1) Class171[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8811 = arg3;
		this.aClass171Array2 = arg1;
		this.anInt8818 = arg5;
		this.anInt8816 = arg4;
		this.anInt8810 = arg0;
		if (arg1 == null) {
			this.aClass171Array1 = null;
			this.aClass171_1 = null;
		} else {
			this.aClass171Array1 = new Class171[arg1.length];
			this.aClass171_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
	public void method7334() {
		if (this.aClass171Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass171Array2.length; local6++) {
				this.aClass171Array2[local6].method4046();
			}
		}
		this.aClass14_33 = null;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZLclient!r;)Z")
	public boolean method7336(@OriginalArg(0) int arg0, @OriginalArg(2) Class45 arg1) {
		if (this.anInt8819 != arg0) {
			this.anInt8819 = arg0;
			@Pc(16) int local16 = Static489.method6617(arg0);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (local16 != this.anInt8815) {
				this.aClass14_33 = null;
				this.anInt8815 = local16;
			}
			if (this.aClass171Array2 != null) {
				this.anInt8808 = 0;
				@Pc(50) int[] local50 = new int[this.aClass171Array2.length];
				for (@Pc(52) int local52 = 0; local52 < this.aClass171Array2.length; local52++) {
					@Pc(59) Class171 local59 = this.aClass171Array2[local52];
					if (local59.method4052(this.anInt8811, this.anInt8816, this.anInt8818, this.anInt8819)) {
						local50[this.anInt8808] = local59.anInt4670;
						this.aClass171Array1[this.anInt8808++] = local59;
					}
				}
				Static309.method4509(local50, this.anInt8808 - 1, 0, this.aClass171Array1);
			}
			this.aBoolean675 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean675) {
			this.aBoolean675 = false;
			for (@Pc(133) int local133 = this.anInt8808 - 1; local133 >= 0; local133--) {
				@Pc(144) boolean local144 = this.aClass171Array1[local133].method4053(arg1, this.aClass171_1);
				local122 |= local144;
				this.aBoolean675 |= !local144;
			}
		}
		return local122;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIILclient!r;IIII)V")
	public void method7337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) int local8 = arg0 + arg5 & 0x3FFF;
		if (this.anInt8810 == -1) {
			arg4.J(arg8, arg3, arg1, arg2, arg7, 0);
		} else {
			@Pc(24) Class55 local24 = Static395.anInterface3_11.method4776(this.anInt8810);
			if (this.aClass14_33 == null && Static395.anInterface3_11.method4774(this.anInt8810)) {
				@Pc(60) int[] local60 = local24.aBoolean140 ? Static395.anInterface3_11.method4777(this.anInt8810, this.anInt8815, 0.7F, this.anInt8815) : Static395.anInterface3_11.method4779(this.anInt8815, false, 0.7F, this.anInt8815, this.anInt8810);
				this.aClass14_33 = arg4.method7395(local60, this.anInt8815, this.anInt8815, this.anInt8815);
			}
			if (local24.aBoolean140) {
				arg4.J(arg8, arg3, arg1, arg2, arg7, 0);
			}
			if (this.aClass14_33 != null) {
				@Pc(93) int local93 = local24.aBoolean140 ? 1 : 0;
				@Pc(99) int local99 = arg6 * arg2 / -4096;
				@Pc(112) int local112;
				for (local112 = arg2 * local8 / 4096 + (arg1 - arg2) / 2; local112 > arg2; local112 -= arg2) {
				}
				while (arg2 < local99) {
					local99 -= arg2;
				}
				while (local112 < 0) {
					local112 += arg2;
				}
				while (local99 < 0) {
					local99 += arg2;
				}
				for (@Pc(158) int local158 = local112 - arg2; local158 < arg1; local158 += arg2) {
					for (@Pc(165) int local165 = local99 - arg2; local165 < arg2; local165 += arg2) {
						this.aClass14_33.method7676(local158 + arg8, local165 - -arg3, arg2, arg2, 1, 0, local93);
					}
				}
			}
		}
		for (@Pc(216) int local216 = this.anInt8808 - 1; local216 >= 0; local216--) {
			this.aClass171Array1[local216].method4054(arg4, arg8, arg3, arg1, arg2, arg6, local8);
		}
	}
}
