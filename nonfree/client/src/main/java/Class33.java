import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class33 {

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
	private int anInt712;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "Lclient!dp;")
	private Class51 aClass51_1;

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
	private int anInt721;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
	private int anInt713 = -1;

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
	private final int anInt716;

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "I")
	private final int anInt724;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
	private final int anInt720;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
	private final int anInt715;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "[Lclient!vr;")
	private final Class240[] aClass240Array2;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "Lclient!vr;")
	private final Class240 aClass240_1;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "[Lclient!vr;")
	private final Class240[] aClass240Array1;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I[Lclient!vr;IIII)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) Class240[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt716 = arg5;
		this.anInt724 = arg4;
		this.anInt720 = arg0;
		this.anInt715 = arg3;
		this.aClass240Array2 = arg1;
		if (arg1 == null) {
			this.aClass240_1 = null;
			this.aClass240Array1 = null;
		} else {
			this.aClass240Array1 = new Class240[arg1.length];
			this.aClass240_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	public void method561() {
		if (this.aClass240Array2 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass240Array2.length; local14++) {
				this.aClass240Array2[local14].method5285();
			}
		}
		this.aClass51_1 = null;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!tq;IIIIIIZI)V")
	public void method562(@OriginalArg(0) int arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg5 + arg3 & 0x3FFF;
		if (this.anInt720 == -1) {
			arg1.method5321(arg0, arg4, arg6, arg8, arg2, 0);
		} else {
			@Pc(31) Class98 local31 = Static134.anInterface2_2.method4741(this.anInt720);
			if (this.aClass51_1 == null && Static134.anInterface2_2.method4740(this.anInt720)) {
				@Pc(67) int[] local67 = local31.aBoolean200 ? Static134.anInterface2_2.method4742(this.anInt721, this.anInt720, this.anInt721, 0.7F, false) : Static134.anInterface2_2.method4743(0.7F, this.anInt721, this.anInt721, this.anInt720);
				this.aClass51_1 = arg1.method5349(local67, this.anInt721, this.anInt721, this.anInt721);
			}
			if (!local31.aBoolean200) {
				arg1.method5321(arg0, arg4, arg6, arg8, arg2, 0);
			}
			if (this.aClass51_1 != null) {
				@Pc(100) int local100 = local31.aBoolean200 ? 0 : 1;
				@Pc(106) int local106 = arg8 * arg7 / -4096;
				@Pc(119) int local119;
				for (local119 = (arg6 - arg8) / 2 + local7 * arg8 / 4096; local119 > arg8; local119 -= arg8) {
				}
				while (arg8 < local106) {
					local106 -= arg8;
				}
				while (local119 < 0) {
					local119 += arg8;
				}
				while (local106 < 0) {
					local106 += arg8;
				}
				for (@Pc(168) int local168 = local119 - arg8; local168 < arg6; local168 += arg8) {
					for (@Pc(175) int local175 = local106 - arg8; local175 < arg8; local175 += arg8) {
						this.aClass51_1.method4677(local168 + arg0, arg4 + local175, arg8, arg8, 0, 0, local100);
					}
				}
			}
		}
		for (@Pc(215) int local215 = this.anInt712 - 1; local215 >= 0; local215--) {
			this.aClass240Array1[local215].method5283(arg1, arg0, arg4, arg6, arg8, arg7, local7);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!tq;B)Z")
	public boolean method563(@OriginalArg(0) int arg0, @OriginalArg(1) Class164 arg1) {
		if (arg0 != this.anInt713) {
			this.anInt713 = arg0;
			@Pc(16) int local16 = Static183.method1325(arg0);
			if (local16 > arg0) {
				local16 = Static257.method3933(arg0);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (this.anInt721 != local16) {
				this.aClass51_1 = null;
				this.anInt721 = local16;
			}
			if (this.aClass240Array2 != null) {
				this.anInt712 = 0;
				@Pc(59) int[] local59 = new int[this.aClass240Array2.length];
				for (@Pc(61) int local61 = 0; local61 < this.aClass240Array2.length; local61++) {
					@Pc(68) Class240 local68 = this.aClass240Array2[local61];
					if (local68.method5292(this.anInt715, this.anInt724, this.anInt716, this.anInt713)) {
						local59[this.anInt712] = local68.anInt6126;
						this.aClass240Array1[this.anInt712++] = local68;
					}
				}
				Static302.method4522(this.anInt712 - 1, this.aClass240Array1, local59, 0);
			}
			this.aBoolean65 = true;
		}
		@Pc(126) boolean local126 = false;
		if (this.aBoolean65) {
			this.aBoolean65 = false;
			for (@Pc(137) int local137 = this.anInt712 - 1; local137 >= 0; local137--) {
				@Pc(148) boolean local148 = this.aClass240Array1[local137].method5287(arg1, this.aClass240_1);
				local126 |= local148;
				this.aBoolean65 |= !local148;
			}
		}
		return local126;
	}
}
