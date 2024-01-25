import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class218 {

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "Lclient!hu;")
	private Class44 aClass44_19;

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
	private int anInt5801;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
	private int anInt5803;

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
	private int anInt5805 = -1;

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "Z")
	private boolean aBoolean484 = true;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
	private final int anInt5800;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
	private final int anInt5799;

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "[Lclient!gd;")
	private final Class123[] aClass123Array2;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
	private final int anInt5807;

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
	private final int anInt5804;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "[Lclient!gd;")
	private final Class123[] aClass123Array1;

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "Lclient!gd;")
	private final Class123 aClass123_1;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I[Lclient!gd;IIII)V")
	public Class218(@OriginalArg(0) int arg0, @OriginalArg(1) Class123[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5800 = arg3;
		this.anInt5799 = arg4;
		this.aClass123Array2 = arg1;
		this.anInt5807 = arg0;
		this.anInt5804 = arg5;
		if (arg1 == null) {
			this.aClass123Array1 = null;
			this.aClass123_1 = null;
		} else {
			this.aClass123Array1 = new Class123[arg1.length];
			this.aClass123_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
	public void method5166() {
		if (this.aClass123Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass123Array2.length; local6++) {
				this.aClass123Array2[local6].method2682();
			}
		}
		this.aClass44_19 = null;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILclient!ha;)Z")
	public boolean method5168(@OriginalArg(1) int arg0, @OriginalArg(2) Class126 arg1) {
		if (arg0 != this.anInt5805) {
			this.anInt5805 = arg0;
			@Pc(18) int local18 = Static473.method6912(arg0);
			if (local18 > 512) {
				local18 = 512;
			}
			if (local18 <= 0) {
				local18 = 1;
			}
			if (local18 != this.anInt5803) {
				this.aClass44_19 = null;
				this.anInt5803 = local18;
			}
			if (this.aClass123Array2 != null) {
				this.anInt5801 = 0;
				@Pc(50) int[] local50 = new int[this.aClass123Array2.length];
				for (@Pc(52) int local52 = 0; local52 < this.aClass123Array2.length; local52++) {
					@Pc(59) Class123 local59 = this.aClass123Array2[local52];
					if (local59.method2681(this.anInt5800, this.anInt5799, this.anInt5804, this.anInt5805)) {
						local50[this.anInt5801] = local59.anInt3143;
						this.aClass123Array1[this.anInt5801++] = local59;
					}
				}
				Static465.method6354(this.anInt5801 - 1, 0, local50, this.aClass123Array1);
			}
			this.aBoolean484 = true;
		}
		@Pc(121) boolean local121 = false;
		if (this.aBoolean484) {
			this.aBoolean484 = false;
			for (@Pc(132) int local132 = this.anInt5801 - 1; local132 >= 0; local132--) {
				@Pc(143) boolean local143 = this.aClass123Array1[local132].method2676(arg1, this.aClass123_1);
				local121 |= local143;
				this.aBoolean484 |= !local143;
			}
		}
		return local121;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIILclient!ha;IBIIII)V")
	public void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class126 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg4 + arg2 & 0x3FFF;
		if (this.anInt5807 == -1 || this.anInt5803 == 0) {
			arg3.aa(arg1, arg7, arg8, arg6, arg0, 0);
		} else {
			@Pc(34) Class321 local34 = Static102.anInterface8_2.method7813(this.anInt5807);
			if (this.aClass44_19 == null && Static102.anInterface8_2.method7811(this.anInt5807)) {
				@Pc(73) int[] local73 = local34.anInt8901 == 2 ? Static102.anInterface8_2.method7815(this.anInt5803, this.anInt5803, 0.7F, this.anInt5807) : Static102.anInterface8_2.method7812(this.anInt5803, 0.7F, false, this.anInt5807, this.anInt5803);
				this.aClass44_19 = arg3.method7017(this.anInt5803, this.anInt5803, local73, this.anInt5803);
			}
			if (local34.anInt8901 == 2) {
				arg3.aa(arg1, arg7, arg8, arg6, arg0, 0);
			}
			if (this.aClass44_19 != null) {
				@Pc(111) int local111 = local34.anInt8901 == 2 ? 1 : 0;
				@Pc(117) int local117 = arg5 * arg6 / -4096;
				@Pc(130) int local130;
				for (local130 = arg6 * local7 / 4096 + (arg8 - arg6) / 2; local130 > arg6; local130 -= arg6) {
				}
				while (arg6 < local117) {
					local117 -= arg6;
				}
				while (local130 < 0) {
					local130 += arg6;
				}
				while (local117 < 0) {
					local117 += arg6;
				}
				for (@Pc(179) int local179 = local130 - arg6; local179 < arg8; local179 += arg6) {
					for (@Pc(186) int local186 = local117 - arg6; local186 < arg6; local186 += arg6) {
						this.aClass44_19.method5310(arg1 + local179, arg7 + local186, arg6, arg6, 1, 0, local111);
					}
				}
			}
		}
		for (@Pc(237) int local237 = this.anInt5801 - 1; local237 >= 0; local237--) {
			this.aClass123Array1[local237].method2683(arg3, arg1, arg7, arg8, arg6, arg5, local7);
		}
	}
}
