import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class327 {

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Lclient!td;")
	private Class24 aClass24_32;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	private int anInt9301;

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
	private int anInt9302;

	@OriginalMember(owner = "client!tr", name = "r", descriptor = "Z")
	private boolean aBoolean672 = true;

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
	private int anInt9306 = -1;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
	private final int anInt9299;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
	private final int anInt9303;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "[Lclient!vw;")
	private final Class365[] aClass365Array1;

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
	private final int anInt9308;

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
	private final int anInt9300;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "[Lclient!vw;")
	private final Class365[] aClass365Array2;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "Lclient!vw;")
	private final Class365 aClass365_1;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(I[Lclient!vw;IIII)V")
	public Class327(@OriginalArg(0) int arg0, @OriginalArg(1) Class365[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9299 = arg3;
		this.anInt9303 = arg4;
		this.aClass365Array1 = arg1;
		this.anInt9308 = arg0;
		this.anInt9300 = arg5;
		if (arg1 == null) {
			this.aClass365Array2 = null;
			this.aClass365_1 = null;
		} else {
			this.aClass365Array2 = new Class365[arg1.length];
			this.aClass365_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!ha;BI)Z")
	public boolean method8022(@OriginalArg(0) Class5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt9306) {
			this.anInt9306 = arg1;
			@Pc(16) int local16 = Static274.method4478(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt9302 != local16) {
				this.anInt9302 = local16;
				this.aClass24_32 = null;
			}
			if (this.aClass365Array1 != null) {
				this.anInt9301 = 0;
				@Pc(46) int[] local46 = new int[this.aClass365Array1.length];
				for (@Pc(48) int local48 = 0; local48 < this.aClass365Array1.length; local48++) {
					@Pc(55) Class365 local55 = this.aClass365Array1[local48];
					if (local55.method8511(this.anInt9299, this.anInt9303, this.anInt9300, this.anInt9306)) {
						local46[this.anInt9301] = local55.anInt9941;
						this.aClass365Array2[this.anInt9301++] = local55;
					}
				}
				Static353.method5833(this.aClass365Array2, this.anInt9301 - 1, 0, local46);
			}
			this.aBoolean672 = true;
		}
		@Pc(110) boolean local110 = false;
		if (this.aBoolean672) {
			this.aBoolean672 = false;
			for (@Pc(121) int local121 = this.anInt9301 - 1; local121 >= 0; local121--) {
				@Pc(132) boolean local132 = this.aClass365Array2[local121].method8510(arg0, this.aClass365_1);
				this.aBoolean672 |= !local132;
				local110 |= local132;
			}
		}
		return local110;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
	public void method8023() {
		if (this.aClass365Array1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass365Array1.length; local6++) {
				this.aClass365Array1[local6].method8509();
			}
		}
		this.aClass24_32 = null;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIIIILclient!ha;I)V")
	public void method8025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class5 arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg2 + arg5 & 0x3FFF;
		if (this.anInt9308 == -1 || this.anInt9302 == 0) {
			arg7.aa(arg1, arg8, arg4, arg3, arg6, 0);
		} else {
			@Pc(42) Class195 local42 = Static390.anInterface7_13.method8118(this.anInt9308);
			if (this.aClass24_32 == null && Static390.anInterface7_13.method8115(this.anInt9308)) {
				@Pc(79) int[] local79 = local42.anInt5424 == 2 ? Static390.anInterface7_13.method8117(this.anInt9302, 0.7F, this.anInt9302, this.anInt9308) : Static390.anInterface7_13.method8116(false, this.anInt9302, this.anInt9308, this.anInt9302, 0.7F);
				this.aClass24_32 = arg7.method7536(local79, this.anInt9302, this.anInt9302, this.anInt9302);
			}
			if (local42.anInt5424 == 2) {
				arg7.aa(arg1, arg8, arg4, arg3, arg6, 0);
			}
			if (this.aClass24_32 != null) {
				@Pc(117) int local117 = local42.anInt5424 == 2 ? 1 : 0;
				@Pc(123) int local123 = arg0 * arg3 / -4096;
				@Pc(137) int local137;
				for (local137 = (arg4 - arg3) / 2 + local7 * arg3 / 4096; local137 > arg3; local137 -= arg3) {
				}
				while (local137 < 0) {
					local137 += arg3;
				}
				while (local123 > arg3) {
					local123 -= arg3;
				}
				while (local123 < 0) {
					local123 += arg3;
				}
				for (@Pc(187) int local187 = local137 - arg3; local187 < arg4; local187 += arg3) {
					for (@Pc(194) int local194 = local123 - arg3; local194 < arg3; local194 += arg3) {
						this.aClass24_32.method8562(local187 + arg1, arg8 + local194, arg3, arg3, 1, 0, local117);
					}
				}
			}
		}
		for (@Pc(229) int local229 = this.anInt9301 - 1; local229 >= 0; local229--) {
			this.aClass365Array2[local229].method8512(arg7, arg1, arg8, arg4, arg3, arg0, local7);
		}
	}
}
