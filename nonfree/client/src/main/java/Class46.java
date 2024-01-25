import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class46 {

	@OriginalMember(owner = "client!da", name = "g", descriptor = "I")
	private int anInt1373;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	private int anInt1376;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Lclient!ig;")
	private Class12 aClass12_2;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "Z")
	private boolean aBoolean119 = true;

	@OriginalMember(owner = "client!da", name = "r", descriptor = "I")
	private int anInt1381 = -1;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	private final int anInt1369;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "I")
	private final int anInt1379;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "I")
	private final int anInt1371;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "[Lclient!he;")
	private final Class102[] aClass102Array1;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	private final int anInt1370;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "[Lclient!he;")
	private final Class102[] aClass102Array2;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!he;")
	private final Class102 aClass102_1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I[Lclient!he;IIII)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) Class102[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1369 = arg0;
		this.anInt1379 = arg5;
		this.anInt1371 = arg3;
		this.aClass102Array1 = arg1;
		this.anInt1370 = arg4;
		if (arg1 == null) {
			this.aClass102Array2 = null;
			this.aClass102_1 = null;
		} else {
			this.aClass102Array2 = new Class102[arg1.length];
			this.aClass102_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!qq;II)Z")
	public boolean method1232(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1381 != arg1) {
			this.anInt1381 = arg1;
			@Pc(12) int local12 = Static420.method5696(arg1);
			if (local12 > arg1) {
				local12 = Static191.method2948(arg1);
			}
			if (local12 > 512) {
				local12 = 512;
			}
			if (this.anInt1373 != local12) {
				this.aClass12_2 = null;
				this.anInt1373 = local12;
			}
			if (this.aClass102Array1 != null) {
				this.anInt1376 = 0;
				@Pc(55) int[] local55 = new int[this.aClass102Array1.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass102Array1.length; local57++) {
					@Pc(64) Class102 local64 = this.aClass102Array1[local57];
					if (local64.method2346(this.anInt1371, this.anInt1370, this.anInt1379, this.anInt1381)) {
						local55[this.anInt1376] = local64.anInt2572;
						this.aClass102Array2[this.anInt1376++] = local64;
					}
				}
				Static249.method3849(this.aClass102Array2, 0, this.anInt1376 - 1, local55);
			}
			this.aBoolean119 = true;
		}
		@Pc(121) boolean local121 = false;
		if (this.aBoolean119) {
			this.aBoolean119 = false;
			for (@Pc(132) int local132 = this.anInt1376 - 1; local132 >= 0; local132--) {
				@Pc(143) boolean local143 = this.aClass102Array2[local132].method2342(arg0, this.aClass102_1);
				local121 |= local143;
				this.aBoolean119 |= !local143;
			}
		}
		return local121;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILclient!qq;IIIIII)V")
	public void method1239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg0 + arg4 & 0x3FFF;
		if (this.anInt1369 == -1) {
			arg2.method3559(arg3, arg5, arg6, arg7, arg1, 0);
		} else {
			@Pc(32) Class229 local32 = Static213.anInterface11_5.method2466(this.anInt1369);
			if (this.aClass12_2 == null && Static213.anInterface11_5.method2468(this.anInt1369)) {
				@Pc(70) int[] local70 = local32.aBoolean406 ? Static213.anInterface11_5.method2467(this.anInt1373, false, this.anInt1369, 0.7F, this.anInt1373) : Static213.anInterface11_5.method2465(this.anInt1373, 0.7F, this.anInt1369, this.anInt1373);
				this.aClass12_2 = arg2.method3512(local70, this.anInt1373, this.anInt1373, this.anInt1373);
			}
			if (!local32.aBoolean406) {
				arg2.method3559(arg3, arg5, arg6, arg7, arg1, 0);
			}
			if (this.aClass12_2 != null) {
				@Pc(103) int local103 = local32.aBoolean406 ? 0 : 1;
				@Pc(109) int local109 = arg8 * arg7 / -4096;
				@Pc(121) int local121;
				for (local121 = (arg6 - arg7) / 2 + local7 * arg7 / 4096; local121 > arg7; local121 -= arg7) {
				}
				while (local109 > arg7) {
					local109 -= arg7;
				}
				while (local121 < 0) {
					local121 += arg7;
				}
				while (local109 < 0) {
					local109 += arg7;
				}
				for (@Pc(168) int local168 = local121 - arg7; local168 < arg6; local168 += arg7) {
					for (@Pc(175) int local175 = local109 - arg7; local175 < arg7; local175 += arg7) {
						this.aClass12_2.method5659(arg3 + local168, arg5 + local175, arg7, arg7, 1, 0, local103);
					}
				}
			}
		}
		for (@Pc(218) int local218 = this.anInt1376 - 1; local218 >= 0; local218--) {
			this.aClass102Array2[local218].method2349(arg2, arg3, arg5, arg6, arg7, arg8, local7);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public void method1240() {
		if (this.aClass102Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass102Array1.length; local10++) {
				this.aClass102Array1[local10].method2348();
			}
		}
		this.aClass12_2 = null;
	}
}
