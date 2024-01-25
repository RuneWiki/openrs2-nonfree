import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class162 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!kr;")
	private Class46 aClass46_17;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	private int anInt5508;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
	private int anInt5514;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
	private boolean aBoolean484 = true;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	private int anInt5509 = -1;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
	private final int anInt5510;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
	private final int anInt5515;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "[Lclient!bj;")
	private final Class24[] aClass24Array1;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	private final int anInt5511;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	private final int anInt5505;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "[Lclient!bj;")
	private final Class24[] aClass24Array2;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Lclient!bj;")
	private final Class24 aClass24_1;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I[Lclient!bj;IIII)V")
	public Class162(@OriginalArg(0) int arg0, @OriginalArg(1) Class24[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5510 = arg0;
		this.anInt5515 = arg4;
		this.aClass24Array1 = arg1;
		this.anInt5511 = arg5;
		this.anInt5505 = arg3;
		if (arg1 == null) {
			this.aClass24Array2 = null;
			this.aClass24_1 = null;
		} else {
			this.aClass24Array2 = new Class24[arg1.length];
			this.aClass24_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public void method4653() {
		if (this.aClass24Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass24Array1.length; local10++) {
				this.aClass24Array1[local10].method380();
			}
		}
		this.aClass46_17 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIILclient!dr;)V")
	public void method4655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class37 arg8) {
		@Pc(7) int local7 = arg6 + arg0 & 0x3FFF;
		if (this.anInt5510 == -1) {
			arg8.method3712(arg1, arg4, arg7, arg5, arg2, 0);
		} else {
			@Pc(33) Class89 local33 = Static209.anInterface3_8.method166(this.anInt5510);
			if (this.aClass46_17 == null && Static209.anInterface3_8.method167(this.anInt5510)) {
				@Pc(73) int[] local73 = local33.aBoolean245 ? Static209.anInterface3_8.method165(this.anInt5514, false, this.anInt5514, 0.7F, this.anInt5510) : Static209.anInterface3_8.method164(0.7F, this.anInt5514, this.anInt5510, this.anInt5514);
				this.aClass46_17 = arg8.method3729(local73, this.anInt5514, this.anInt5514, this.anInt5514);
			}
			if (!local33.aBoolean245) {
				arg8.method3712(arg1, arg4, arg7, arg5, arg2, 0);
			}
			if (this.aClass46_17 != null) {
				@Pc(106) int local106 = local33.aBoolean245 ? 0 : 1;
				@Pc(112) int local112 = arg5 * arg3 / -4096;
				@Pc(126) int local126;
				for (local126 = (arg7 - arg5) / 2 + local7 * arg5 / 4096; local126 > arg5; local126 -= arg5) {
				}
				while (arg5 < local112) {
					local112 -= arg5;
				}
				while (local126 < 0) {
					local126 += arg5;
				}
				while (local112 < 0) {
					local112 += arg5;
				}
				for (@Pc(167) int local167 = local126 - arg5; local167 < arg7; local167 += arg5) {
					for (@Pc(173) int local173 = local112 - arg5; local173 < arg5; local173 += arg5) {
						this.aClass46_17.method5026(arg1 + local167, arg4 + local173, arg5, arg5, 0, 0, local106);
					}
				}
			}
		}
		for (@Pc(208) int local208 = this.anInt5508 - 1; local208 >= 0; local208--) {
			this.aClass24Array2[local208].method385(arg8, arg1, arg4, arg7, arg5, arg3, local7);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!dr;)Z")
	public boolean method4657(@OriginalArg(1) int arg0, @OriginalArg(2) Class37 arg1) {
		if (this.anInt5509 != arg0) {
			this.anInt5509 = arg0;
			@Pc(24) int local24 = Static51.method1026(arg0);
			if (local24 > arg0) {
				local24 = Static344.method5603(arg0);
			}
			if (local24 > 512) {
				local24 = 512;
			}
			if (this.anInt5514 != local24) {
				this.aClass46_17 = null;
				this.anInt5514 = local24;
			}
			if (this.aClass24Array1 != null) {
				this.anInt5508 = 0;
				@Pc(63) int[] local63 = new int[this.aClass24Array1.length];
				for (@Pc(65) int local65 = 0; local65 < this.aClass24Array1.length; local65++) {
					@Pc(72) Class24 local72 = this.aClass24Array1[local65];
					if (local72.method378(this.anInt5505, this.anInt5515, this.anInt5511, this.anInt5509)) {
						local63[this.anInt5508] = local72.anInt445;
						this.aClass24Array2[this.anInt5508++] = local72;
					}
				}
				Static80.method1631(0, this.anInt5508 - 1, local63, this.aClass24Array2);
			}
			this.aBoolean484 = true;
		}
		@Pc(125) boolean local125 = false;
		if (this.aBoolean484) {
			this.aBoolean484 = false;
			for (@Pc(136) int local136 = this.anInt5508 - 1; local136 >= 0; local136--) {
				@Pc(147) boolean local147 = this.aClass24Array2[local136].method375(arg1, this.aClass24_1);
				this.aBoolean484 |= !local147;
				local125 |= local147;
			}
		}
		return local125;
	}
}
