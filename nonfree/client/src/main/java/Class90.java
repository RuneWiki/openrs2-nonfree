import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class90 {

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	private int anInt2888;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
	private int anInt2895;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "Lclient!ae;")
	private Class4 aClass4_8;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	private int anInt2889 = -1;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "Z")
	private boolean aBoolean206 = true;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
	private final int anInt2899;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	private final int anInt2896;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "[Lclient!ls;")
	private final Class128[] aClass128Array1;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
	private final int anInt2890;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
	private final int anInt2893;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "[Lclient!ls;")
	private final Class128[] aClass128Array2;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Lclient!ls;")
	private final Class128 aClass128_1;

	static {
		new Class106("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I[Lclient!ls;IIII)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) Class128[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2899 = arg0;
		this.anInt2896 = arg5;
		this.aClass128Array1 = arg1;
		this.anInt2890 = arg4;
		this.anInt2893 = arg3;
		if (arg1 == null) {
			this.aClass128Array2 = null;
			this.aClass128_1 = null;
		} else {
			this.aClass128Array2 = new Class128[arg1.length];
			this.aClass128_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIZIIILclient!fp;)V")
	public void method2728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class63 arg8) {
		@Pc(12) int local12 = arg5 + arg2 & 0x3FFF;
		if (this.anInt2899 == -1) {
			arg8.method4653(arg7, arg6, arg0, arg1, arg4, 0);
		} else {
			@Pc(33) Class178 local33 = Static185.anInterface3_4.method5486(this.anInt2899);
			if (this.aClass4_8 == null && Static185.anInterface3_4.method5485(this.anInt2899)) {
				@Pc(69) int[] local69 = local33.aBoolean391 ? Static185.anInterface3_4.method5487(this.anInt2888, false, this.anInt2888, this.anInt2899, 0.7F) : Static185.anInterface3_4.method5488(this.anInt2899, this.anInt2888, this.anInt2888, 0.7F);
				this.aClass4_8 = arg8.method4587(local69, this.anInt2888, this.anInt2888, this.anInt2888);
			}
			if (!local33.aBoolean391) {
				arg8.method4653(arg7, arg6, arg0, arg1, arg4, 0);
			}
			if (this.aClass4_8 != null) {
				@Pc(102) int local102 = local33.aBoolean391 ? 0 : 1;
				@Pc(108) int local108 = arg3 * arg1 / -4096;
				@Pc(121) int local121;
				for (local121 = (arg0 - arg1) / 2 + arg1 * local12 / 4096; local121 > arg1; local121 -= arg1) {
				}
				while (local121 < 0) {
					local121 += arg1;
				}
				while (local108 > arg1) {
					local108 -= arg1;
				}
				while (local108 < 0) {
					local108 += arg1;
				}
				for (@Pc(174) int local174 = local121 - arg1; local174 < arg0; local174 += arg1) {
					for (@Pc(181) int local181 = local108 - arg1; local181 < arg1; local181 += arg1) {
						this.aClass4_8.method5955(arg7 + local174, local181 + arg6, arg1, arg1, 0, 0, local102);
					}
				}
			}
		}
		for (@Pc(220) int local220 = this.anInt2895 - 1; local220 >= 0; local220--) {
			this.aClass128Array2[local220].method3563(arg8, arg7, arg6, arg0, arg1, arg3, local12);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!fp;I)Z")
	public boolean method2735(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1) {
		if (this.anInt2889 != arg0) {
			this.anInt2889 = arg0;
			@Pc(29) int local29 = Static73.method1617(arg0);
			if (local29 > arg0) {
				local29 = Static294.method5142(arg0);
			}
			if (local29 > 512) {
				local29 = 512;
			}
			if (local29 != this.anInt2888) {
				this.anInt2888 = local29;
				this.aClass4_8 = null;
			}
			if (this.aClass128Array1 != null) {
				this.anInt2895 = 0;
				@Pc(64) int[] local64 = new int[this.aClass128Array1.length];
				for (@Pc(66) int local66 = 0; local66 < this.aClass128Array1.length; local66++) {
					@Pc(73) Class128 local73 = this.aClass128Array1[local66];
					if (local73.method3570(this.anInt2893, this.anInt2890, this.anInt2896, this.anInt2889)) {
						local64[this.anInt2895] = local73.anInt3826;
						this.aClass128Array2[this.anInt2895++] = local73;
					}
				}
				Static359.method5940(local64, this.aClass128Array2, 0, this.anInt2895 - 1);
			}
			this.aBoolean206 = true;
		}
		@Pc(126) boolean local126 = false;
		if (this.aBoolean206) {
			this.aBoolean206 = false;
			for (@Pc(137) int local137 = this.anInt2895 - 1; local137 >= 0; local137--) {
				@Pc(148) boolean local148 = this.aClass128Array2[local137].method3562(arg1, this.aClass128_1);
				this.aBoolean206 |= !local148;
				local126 |= local148;
			}
		}
		return local126;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public void method2736() {
		if (this.aClass128Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass128Array1.length; local15++) {
				this.aClass128Array1[local15].method3561();
			}
		}
		this.aClass4_8 = null;
	}
}
