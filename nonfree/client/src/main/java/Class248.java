import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class248 {

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
	private int anInt6677;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "Lclient!aq;")
	private Class5 aClass5_18;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
	private int anInt6684;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Z")
	private boolean aBoolean495 = true;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	private int anInt6683 = -1;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "[Lclient!sg;")
	private final Class207[] aClass207Array1;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	private final int anInt6678;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
	private final int anInt6687;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	private final int anInt6685;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	private final int anInt6679;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "Lclient!sg;")
	private final Class207 aClass207_1;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "[Lclient!sg;")
	private final Class207[] aClass207Array2;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I[Lclient!sg;IIII)V")
	public Class248(@OriginalArg(0) int arg0, @OriginalArg(1) Class207[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass207Array1 = arg1;
		this.anInt6678 = arg5;
		this.anInt6687 = arg0;
		this.anInt6685 = arg3;
		this.anInt6679 = arg4;
		if (arg1 == null) {
			this.aClass207_1 = null;
			this.aClass207Array2 = null;
		} else {
			this.aClass207Array2 = new Class207[arg1.length];
			this.aClass207_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public void method5709() {
		if (this.aClass207Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass207Array1.length; local10++) {
				this.aClass207Array1[local10].method4959();
			}
		}
		this.aClass5_18 = null;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!km;IB)Z")
	public boolean method5710(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6683 != arg1) {
			this.anInt6683 = arg1;
			@Pc(16) int local16 = Static353.method5359(arg1);
			if (arg1 < local16) {
				local16 = Static321.method4947(arg1);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (this.anInt6684 != local16) {
				this.anInt6684 = local16;
				this.aClass5_18 = null;
			}
			if (this.aClass207Array1 != null) {
				this.anInt6677 = 0;
				@Pc(49) int[] local49 = new int[this.aClass207Array1.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass207Array1.length; local51++) {
					@Pc(58) Class207 local58 = this.aClass207Array1[local51];
					if (local58.method4951(this.anInt6685, this.anInt6679, this.anInt6678, this.anInt6683)) {
						local49[this.anInt6677] = local58.anInt5644;
						this.aClass207Array2[this.anInt6677++] = local58;
					}
				}
				Static125.method2260(local49, this.aClass207Array2, 0, this.anInt6677 - 1);
			}
			this.aBoolean495 = true;
		}
		@Pc(115) boolean local115 = false;
		if (this.aBoolean495) {
			this.aBoolean495 = false;
			for (@Pc(126) int local126 = this.anInt6677 - 1; local126 >= 0; local126--) {
				@Pc(137) boolean local137 = this.aClass207Array2[local126].method4952(arg0, this.aClass207_1);
				local115 |= local137;
				this.aBoolean495 |= !local137;
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIILclient!km;IIBI)V")
	public void method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class82 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg4 + arg6 & 0x3FFF;
		if (this.anInt6687 == -1) {
			arg5.method4482(arg3, arg1, arg7, arg0, arg8, 0);
		} else {
			@Pc(31) Class182 local31 = Static99.anInterface1_1.method2849(this.anInt6687);
			if (this.aClass5_18 == null && Static99.anInterface1_1.method2846(this.anInt6687)) {
				@Pc(67) int[] local67 = local31.aBoolean362 ? Static99.anInterface1_1.method2850(false, this.anInt6684, 0.7F, this.anInt6687, this.anInt6684) : Static99.anInterface1_1.method2848(this.anInt6684, 0.7F, this.anInt6687, this.anInt6684);
				this.aClass5_18 = arg5.method4456(local67, this.anInt6684, this.anInt6684, this.anInt6684);
			}
			if (!local31.aBoolean362) {
				arg5.method4482(arg3, arg1, arg7, arg0, arg8, 0);
			}
			if (this.aClass5_18 != null) {
				@Pc(100) int local100 = local31.aBoolean362 ? 0 : 1;
				@Pc(106) int local106 = arg2 * arg0 / -4096;
				@Pc(118) int local118;
				for (local118 = (arg7 - arg0) / 2 + arg0 * local7 / 4096; local118 > arg0; local118 -= arg0) {
				}
				while (local118 < 0) {
					local118 += arg0;
				}
				while (arg0 < local106) {
					local106 -= arg0;
				}
				while (local106 < 0) {
					local106 += arg0;
				}
				for (@Pc(160) int local160 = local118 - arg0; local160 < arg7; local160 += arg0) {
					for (@Pc(167) int local167 = local106 - arg0; local167 < arg0; local167 += arg0) {
						this.aClass5_18.method5000(local160 + arg3, arg1 + local167, arg0, arg0, 0, 0, local100);
					}
				}
			}
		}
		for (@Pc(207) int local207 = this.anInt6677 - 1; local207 >= 0; local207--) {
			this.aClass207Array2[local207].method4955(arg5, arg3, arg1, arg7, arg0, arg2, local7);
		}
	}
}
