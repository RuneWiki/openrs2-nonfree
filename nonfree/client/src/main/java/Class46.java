import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class46 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	private int anInt1384;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	private int anInt1385;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "Lclient!kb;")
	private Class52 aClass52_4;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Z")
	private boolean aBoolean111 = true;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "I")
	private int anInt1390 = -1;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "[Lclient!je;")
	private final Class108[] aClass108Array1;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "I")
	private final int anInt1394;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "I")
	private final int anInt1387;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "I")
	private final int anInt1388;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "I")
	private final int anInt1392;

	@OriginalMember(owner = "client!da", name = "r", descriptor = "[Lclient!je;")
	private final Class108[] aClass108Array2;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "Lclient!je;")
	private final Class108 aClass108_1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I[Lclient!je;IIII)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) Class108[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass108Array1 = arg1;
		this.anInt1394 = arg5;
		this.anInt1387 = arg3;
		this.anInt1388 = arg0;
		this.anInt1392 = arg4;
		if (arg1 == null) {
			this.aClass108_1 = null;
			this.aClass108Array2 = null;
		} else {
			this.aClass108Array2 = new Class108[arg1.length];
			this.aClass108_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	public void method1115() {
		if (this.aClass108Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass108Array1.length; local4++) {
				this.aClass108Array1[local4].method2951();
			}
		}
		this.aClass52_4 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!pe;II)Z")
	public boolean method1116(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1390 != arg1) {
			this.anInt1390 = arg1;
			@Pc(16) int local16 = Static271.method4522(arg1);
			if (local16 > arg1) {
				local16 = Static108.method1053(arg1);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (this.anInt1385 != local16) {
				this.aClass52_4 = null;
				this.anInt1385 = local16;
			}
			if (this.aClass108Array1 != null) {
				this.anInt1384 = 0;
				@Pc(55) int[] local55 = new int[this.aClass108Array1.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass108Array1.length; local57++) {
					@Pc(64) Class108 local64 = this.aClass108Array1[local57];
					if (local64.method2950(this.anInt1387, this.anInt1392, this.anInt1394, this.anInt1390)) {
						local55[this.anInt1384] = local64.anInt3227;
						this.aClass108Array2[this.anInt1384++] = local64;
					}
				}
				Static93.method1898(local55, this.anInt1384 - 1, this.aClass108Array2, 0);
			}
			this.aBoolean111 = true;
		}
		@Pc(126) boolean local126 = false;
		if (this.aBoolean111) {
			this.aBoolean111 = false;
			for (@Pc(137) int local137 = this.anInt1384 - 1; local137 >= 0; local137--) {
				@Pc(148) boolean local148 = this.aClass108Array2[local137].method2952(arg0, this.aClass108_1);
				this.aBoolean111 |= !local148;
				local126 |= local148;
			}
		}
		return local126;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIILclient!pe;)V")
	public void method1117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class89 arg8) {
		@Pc(5) int local5 = arg3 + arg7 & 0x3FFF;
		if (this.anInt1388 == -1) {
			arg8.method5439(arg6, arg1, arg5, arg2, arg4, 0);
		} else {
			@Pc(30) Class18 local30 = Static12.anInterface6_1.method5614(this.anInt1388);
			if (this.aClass52_4 == null && Static12.anInterface6_1.method5615(this.anInt1388)) {
				@Pc(70) int[] local70 = local30.aBoolean13 ? Static12.anInterface6_1.method5616(this.anInt1385, this.anInt1385, this.anInt1388, false, 0.7F) : Static12.anInterface6_1.method5613(0.7F, this.anInt1388, this.anInt1385, this.anInt1385);
				this.aClass52_4 = arg8.method5409(local70, this.anInt1385, this.anInt1385, this.anInt1385);
			}
			if (!local30.aBoolean13) {
				arg8.method5439(arg6, arg1, arg5, arg2, arg4, 0);
			}
			if (this.aClass52_4 != null) {
				@Pc(103) int local103 = local30.aBoolean13 ? 0 : 1;
				@Pc(109) int local109 = arg2 * arg0 / -4096;
				@Pc(122) int local122;
				for (local122 = (arg5 - arg2) / 2 + local5 * arg2 / 4096; local122 > arg2; local122 -= arg2) {
				}
				while (arg2 < local109) {
					local109 -= arg2;
				}
				while (local122 < 0) {
					local122 += arg2;
				}
				while (local109 < 0) {
					local109 += arg2;
				}
				for (@Pc(168) int local168 = local122 - arg2; local168 < arg5; local168 += arg2) {
					for (@Pc(174) int local174 = local109 - arg2; local174 < arg2; local174 += arg2) {
						this.aClass52_4.method4127(local168 + arg6, local174 - -arg1, arg2, arg2, 0, 0, local103);
					}
				}
			}
		}
		for (@Pc(209) int local209 = this.anInt1384 - 1; local209 >= 0; local209--) {
			this.aClass108Array2[local209].method2957(arg8, arg6, arg1, arg5, arg2, arg0, local5);
		}
	}
}
