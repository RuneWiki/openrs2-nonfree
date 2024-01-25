import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class230 {

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
	private int anInt6532;

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
	private int anInt6533;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "Lclient!o;")
	private Class80 aClass80_22;

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "Z")
	private boolean aBoolean433 = true;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
	private int anInt6522 = -1;

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "[Lclient!mc;")
	private final Class161[] aClass161Array2;

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
	private final int anInt6527;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
	private final int anInt6531;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
	private final int anInt6526;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
	private final int anInt6536;

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "[Lclient!mc;")
	private final Class161[] aClass161Array1;

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "Lclient!mc;")
	private final Class161 aClass161_1;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(I[Lclient!mc;IIII)V")
	public Class230(@OriginalArg(0) int arg0, @OriginalArg(1) Class161[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass161Array2 = arg1;
		this.anInt6527 = arg3;
		this.anInt6531 = arg0;
		this.anInt6526 = arg5;
		this.anInt6536 = arg4;
		if (arg1 == null) {
			this.aClass161Array1 = null;
			this.aClass161_1 = null;
		} else {
			this.aClass161Array1 = new Class161[arg1.length];
			this.aClass161_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLclient!za;I)Z")
	public boolean method5129(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6522 != arg1) {
			this.anInt6522 = arg1;
			@Pc(20) int local20 = Static186.method3002(arg1);
			if (local20 > arg1) {
				local20 = Static68.method1346(arg1);
			}
			if (local20 > 512) {
				local20 = 512;
			}
			if (this.anInt6532 != local20) {
				this.aClass80_22 = null;
				this.anInt6532 = local20;
			}
			if (this.aClass161Array2 != null) {
				this.anInt6533 = 0;
				@Pc(53) int[] local53 = new int[this.aClass161Array2.length];
				for (@Pc(55) int local55 = 0; local55 < this.aClass161Array2.length; local55++) {
					@Pc(62) Class161 local62 = this.aClass161Array2[local55];
					if (local62.method3594(this.anInt6527, this.anInt6536, this.anInt6526, this.anInt6522)) {
						local53[this.anInt6533] = local62.anInt4460;
						this.aClass161Array1[this.anInt6533++] = local62;
					}
				}
				Static377.method155(this.aClass161Array1, 0, this.anInt6533 - 1, local53);
			}
			this.aBoolean433 = true;
		}
		@Pc(115) boolean local115 = false;
		if (this.aBoolean433) {
			this.aBoolean433 = false;
			for (@Pc(131) int local131 = this.anInt6533 - 1; local131 >= 0; local131--) {
				@Pc(142) boolean local142 = this.aClass161Array1[local131].method3587(arg0, this.aClass161_1);
				this.aBoolean433 |= !local142;
				local115 |= local142;
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
	public void method5131() {
		if (this.aClass161Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass161Array2.length; local6++) {
				this.aClass161Array2[local6].method3590();
			}
		}
		this.aClass80_22 = null;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!za;IIIIIIIII)V")
	public void method5133(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg7 + arg8 & 0x3FFF;
		if (this.anInt6531 == -1) {
			arg0.P(arg1, arg6, arg5, arg3, arg4, 0);
		} else {
			@Pc(29) Class259 local29 = Static147.anInterface7_3.method4447(this.anInt6531);
			if (this.aClass80_22 == null && Static147.anInterface7_3.method4450(this.anInt6531)) {
				@Pc(65) int[] local65 = local29.aBoolean475 ? Static147.anInterface7_3.method4448(false, this.anInt6532, 0.7F, this.anInt6531, this.anInt6532) : Static147.anInterface7_3.method4451(this.anInt6532, this.anInt6531, 0.7F, this.anInt6532);
				this.aClass80_22 = arg0.method5823(local65, this.anInt6532, this.anInt6532, this.anInt6532);
			}
			if (!local29.aBoolean475) {
				arg0.P(arg1, arg6, arg5, arg3, arg4, 0);
			}
			if (this.aClass80_22 != null) {
				@Pc(98) int local98 = local29.aBoolean475 ? 0 : 1;
				@Pc(104) int local104 = arg3 * arg2 / -4096;
				@Pc(117) int local117;
				for (local117 = arg3 * local11 / 4096 + (arg5 - arg3) / 2; local117 > arg3; local117 -= arg3) {
				}
				while (local117 < 0) {
					local117 += arg3;
				}
				while (arg3 < local104) {
					local104 -= arg3;
				}
				while (local104 < 0) {
					local104 += arg3;
				}
				for (@Pc(159) int local159 = local117 - arg3; local159 < arg5; local159 += arg3) {
					for (@Pc(166) int local166 = local104 - arg3; local166 < arg3; local166 += arg3) {
						this.aClass80_22.ya(local159 + arg1, local166 + arg6, arg3, arg3, 1, 0, local98);
					}
				}
			}
		}
		for (@Pc(216) int local216 = this.anInt6533 - 1; local216 >= 0; local216--) {
			this.aClass161Array1[local216].method3597(arg0, arg1, arg6, arg5, arg3, arg2, local11);
		}
	}
}
