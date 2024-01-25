import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mha")
public final class Class224 {

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "I")
	private int anInt6153;

	@OriginalMember(owner = "client!mha", name = "m", descriptor = "Lclient!iea;")
	private Class31 aClass31_14;

	@OriginalMember(owner = "client!mha", name = "s", descriptor = "I")
	private int anInt6161;

	@OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
	private int anInt6155 = -1;

	@OriginalMember(owner = "client!mha", name = "q", descriptor = "Z")
	private boolean aBoolean447 = true;

	@OriginalMember(owner = "client!mha", name = "n", descriptor = "I")
	private final int anInt6159;

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "I")
	private final int anInt6152;

	@OriginalMember(owner = "client!mha", name = "i", descriptor = "[Lclient!dn;")
	private final Class80[] aClass80Array1;

	@OriginalMember(owner = "client!mha", name = "j", descriptor = "I")
	private final int anInt6157;

	@OriginalMember(owner = "client!mha", name = "h", descriptor = "I")
	private final int anInt6156;

	@OriginalMember(owner = "client!mha", name = "x", descriptor = "[Lclient!dn;")
	private final Class80[] aClass80Array2;

	@OriginalMember(owner = "client!mha", name = "f", descriptor = "Lclient!dn;")
	private final Class80 aClass80_1;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(I[Lclient!dn;IIII)V")
	public Class224(@OriginalArg(0) int arg0, @OriginalArg(1) Class80[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6159 = arg3;
		this.anInt6152 = arg5;
		this.aClass80Array1 = arg1;
		this.anInt6157 = arg4;
		this.anInt6156 = arg0;
		if (arg1 == null) {
			this.aClass80_1 = null;
			this.aClass80Array2 = null;
		} else {
			this.aClass80Array2 = new Class80[arg1.length];
			this.aClass80_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lclient!ha;IB)Z")
	public boolean method5317(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anInt6155) {
			this.anInt6155 = arg1;
			@Pc(16) int local16 = Static276.method7580(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt6153 != local16) {
				this.aClass31_14 = null;
				this.anInt6153 = local16;
			}
			if (this.aClass80Array1 != null) {
				this.anInt6161 = 0;
				@Pc(53) int[] local53 = new int[this.aClass80Array1.length];
				for (@Pc(55) int local55 = 0; local55 < this.aClass80Array1.length; local55++) {
					@Pc(62) Class80 local62 = this.aClass80Array1[local55];
					if (local62.method1996(this.anInt6159, this.anInt6157, this.anInt6152, this.anInt6155)) {
						local53[this.anInt6161] = local62.anInt2376;
						this.aClass80Array2[this.anInt6161++] = local62;
					}
				}
				Static351.method5266(this.anInt6161 - 1, this.aClass80Array2, local53, 0);
			}
			this.aBoolean447 = true;
		}
		@Pc(115) boolean local115 = false;
		if (this.aBoolean447) {
			this.aBoolean447 = false;
			for (@Pc(131) int local131 = this.anInt6161 - 1; local131 >= 0; local131--) {
				@Pc(142) boolean local142 = this.aClass80Array2[local131].method1990(arg0, this.aClass80_1);
				local115 |= local142;
				this.aBoolean447 |= !local142;
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIIIILclient!ha;II)V")
	public void method5320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class13 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17 = arg3 + arg4 & 0x3FFF;
		if (this.anInt6156 == -1 || this.anInt6153 == 0) {
			arg6.aa(arg2, arg8, arg1, arg5, arg0, 0);
		} else {
			@Pc(34) Class271 local34 = Static65.anInterface2_6.method6027(this.anInt6156);
			if (this.aClass31_14 == null && Static65.anInterface2_6.method6026(this.anInt6156)) {
				@Pc(73) int[] local73 = local34.anInt7162 == 2 ? Static65.anInterface2_6.method6023(this.anInt6153, 0.7F, this.anInt6156, this.anInt6153) : Static65.anInterface2_6.method6024(this.anInt6153, this.anInt6156, false, this.anInt6153, 0.7F);
				this.aClass31_14 = arg6.method8088(this.anInt6153, this.anInt6153, local73, this.anInt6153);
			}
			if (local34.anInt7162 == 2) {
				arg6.aa(arg2, arg8, arg1, arg5, arg0, 0);
			}
			if (this.aClass31_14 != null) {
				@Pc(113) int local113 = local34.anInt7162 == 2 ? 1 : 0;
				@Pc(119) int local119 = arg5 * arg7 / -4096;
				@Pc(133) int local133;
				for (local133 = (arg1 - arg5) / 2 + arg5 * local17 / 4096; local133 > arg5; local133 -= arg5) {
				}
				while (arg5 < local119) {
					local119 -= arg5;
				}
				while (local133 < 0) {
					local133 += arg5;
				}
				while (local119 < 0) {
					local119 += arg5;
				}
				for (@Pc(182) int local182 = local133 - arg5; local182 < arg1; local182 += arg5) {
					for (@Pc(189) int local189 = local119 - arg5; local189 < arg5; local189 += arg5) {
						this.aClass31_14.method8797(local182 + arg2, local189 + arg8, arg5, arg5, 1, 0, local113);
					}
				}
			}
		}
		for (@Pc(239) int local239 = this.anInt6161 - 1; local239 >= 0; local239--) {
			this.aClass80Array2[local239].method1992(arg6, arg2, arg8, arg1, arg5, arg7, local17);
		}
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)V")
	public void method5322() {
		if (this.aClass80Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass80Array1.length; local4++) {
				this.aClass80Array1[local4].method1986();
			}
		}
		this.aClass31_14 = null;
	}
}
