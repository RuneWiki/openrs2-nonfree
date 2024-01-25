import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class208 {

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "Lclient!gl;")
	private Class2 aClass2_22;

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
	private int anInt6524;

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
	private int anInt6525;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "Z")
	private boolean aBoolean435 = true;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
	private int anInt6514 = -1;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
	private final int anInt6516;

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "[Lclient!fl;")
	private final Class63[] aClass63Array2;

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
	private final int anInt6520;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
	private final int anInt6512;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
	private final int anInt6515;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "[Lclient!fl;")
	private final Class63[] aClass63Array1;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!fl;")
	private final Class63 aClass63_1;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(I[Lclient!fl;IIII)V")
	public Class208(@OriginalArg(0) int arg0, @OriginalArg(1) Class63[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6516 = arg0;
		this.aClass63Array2 = arg1;
		this.anInt6520 = arg3;
		this.anInt6512 = arg5;
		this.anInt6515 = arg4;
		if (arg1 == null) {
			this.aClass63Array1 = null;
			this.aClass63_1 = null;
		} else {
			this.aClass63Array1 = new Class63[arg1.length];
			this.aClass63_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILclient!e;I)Z")
	public boolean method5819(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1) {
		if (arg0 != this.anInt6514) {
			this.anInt6514 = arg0;
			@Pc(16) int local16 = Static224.method4011(arg0);
			if (local16 > arg0) {
				local16 = Static159.method3097(arg0);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (this.anInt6525 != local16) {
				this.anInt6525 = local16;
				this.aClass2_22 = null;
			}
			if (this.aClass63Array2 != null) {
				this.anInt6524 = 0;
				@Pc(55) int[] local55 = new int[this.aClass63Array2.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass63Array2.length; local57++) {
					@Pc(64) Class63 local64 = this.aClass63Array2[local57];
					if (local64.method2106(this.anInt6520, this.anInt6515, this.anInt6512, this.anInt6514)) {
						local55[this.anInt6524] = local64.anInt2095;
						this.aClass63Array1[this.anInt6524++] = local64;
					}
				}
				Static53.method1258(0, local55, this.anInt6524 - 1, this.aClass63Array1);
			}
			this.aBoolean435 = true;
		}
		@Pc(129) boolean local129 = false;
		if (this.aBoolean435) {
			this.aBoolean435 = false;
			for (@Pc(140) int local140 = this.anInt6524 - 1; local140 >= 0; local140--) {
				@Pc(151) boolean local151 = this.aClass63Array1[local140].method2101(arg1, this.aClass63_1);
				this.aBoolean435 |= !local151;
				local129 |= local151;
			}
		}
		return local129;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
	public void method5822() {
		if (this.aClass63Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass63Array2.length; local6++) {
				this.aClass63Array2[local6].method2098();
			}
		}
		this.aClass2_22 = null;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BILclient!e;IIIIIII)V")
	public void method5823(@OriginalArg(1) int arg0, @OriginalArg(2) Class46 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(19) int local19 = arg4 + arg3 & 0x3FFF;
		if (this.anInt6516 == -1) {
			arg1.method5110(arg6, arg8, arg7, arg0, arg5, 0);
		} else {
			@Pc(39) Class154 local39 = Static143.anInterface2_1.method116(this.anInt6516);
			if (this.aClass2_22 == null && Static143.anInterface2_1.method117(this.anInt6516)) {
				@Pc(75) int[] local75 = local39.aBoolean284 ? Static143.anInterface2_1.method119(this.anInt6516, 0.7F, this.anInt6525, false, this.anInt6525) : Static143.anInterface2_1.method115(this.anInt6516, this.anInt6525, 0.7F, this.anInt6525);
				this.aClass2_22 = arg1.method5167(local75, this.anInt6525, this.anInt6525, this.anInt6525);
			}
			if (!local39.aBoolean284) {
				arg1.method5110(arg6, arg8, arg7, arg0, arg5, 0);
			}
			if (this.aClass2_22 != null) {
				@Pc(108) int local108 = local39.aBoolean284 ? 0 : 1;
				@Pc(114) int local114 = arg2 * arg0 / -4096;
				@Pc(126) int local126;
				for (local126 = arg0 * local19 / 4096 + (arg7 - arg0) / 2; local126 > arg0; local126 -= arg0) {
				}
				while (local126 < 0) {
					local126 += arg0;
				}
				while (local114 > arg0) {
					local114 -= arg0;
				}
				while (local114 < 0) {
					local114 += arg0;
				}
				for (@Pc(168) int local168 = local126 - arg0; local168 < arg7; local168 += arg0) {
					for (@Pc(175) int local175 = local114 - arg0; local175 < arg0; local175 += arg0) {
						this.aClass2_22.method2637(arg6 + local168, local175 - -arg8, arg0, arg0, 0, 0, local108);
					}
				}
			}
		}
		for (@Pc(215) int local215 = this.anInt6524 - 1; local215 >= 0; local215--) {
			this.aClass63Array1[local215].method2103(arg1, arg6, arg8, arg7, arg0, arg2, local19);
		}
	}
}
