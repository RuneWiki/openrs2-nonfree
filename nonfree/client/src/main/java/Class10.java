import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class10 {

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	private int anInt102;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!nf;")
	private Class102 aClass102_1;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "Z")
	private boolean aBoolean15 = true;

	@OriginalMember(owner = "client!af", name = "u", descriptor = "I")
	private int anInt115 = -1;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "I")
	private final int anInt104;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "I")
	private final int anInt105;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "I")
	private final int anInt113;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	private final int anInt112;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "[Lclient!av;")
	private final Class26[] aClass26Array2;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "[Lclient!av;")
	private final Class26[] aClass26Array1;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "Lclient!av;")
	private final Class26 aClass26_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I[Lclient!av;IIII)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) Class26[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt104 = arg0;
		this.anInt105 = arg5;
		this.anInt113 = arg4;
		this.anInt112 = arg3;
		this.aClass26Array2 = arg1;
		if (arg1 == null) {
			this.aClass26_1 = null;
			this.aClass26Array1 = null;
		} else {
			this.aClass26Array1 = new Class26[arg1.length];
			this.aClass26_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IBIIILclient!ha;IIII)V")
	public void method88(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class16 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg8 + arg6 & 0x3FFF;
		if (this.anInt104 == -1 || this.anInt102 == 0) {
			arg4.aa(arg2, arg5, arg0, arg1, arg7, 0);
		} else {
			@Pc(34) Class342 local34 = Static449.anInterface5_10.method5193(this.anInt104);
			if (this.aClass102_1 == null && Static449.anInterface5_10.method5197(this.anInt104)) {
				@Pc(73) int[] local73 = local34.anInt9280 == 2 ? Static449.anInterface5_10.method5195(this.anInt102, this.anInt104, 0.7F, this.anInt102) : Static449.anInterface5_10.method5192(0.7F, this.anInt102, false, this.anInt104, this.anInt102);
				this.aClass102_1 = arg4.method8131(this.anInt102, local73, this.anInt102, this.anInt102);
			}
			if (local34.anInt9280 == 2) {
				arg4.aa(arg2, arg5, arg0, arg1, arg7, 0);
			}
			if (this.aClass102_1 != null) {
				@Pc(111) int local111 = local34.anInt9280 == 2 ? 1 : 0;
				@Pc(117) int local117 = arg1 * arg3 / -4096;
				@Pc(131) int local131;
				for (local131 = (arg0 - arg1) / 2 + local7 * arg1 / 4096; local131 > arg1; local131 -= arg1) {
				}
				while (local131 < 0) {
					local131 += arg1;
				}
				while (local117 > arg1) {
					local117 -= arg1;
				}
				while (local117 < 0) {
					local117 += arg1;
				}
				for (@Pc(180) int local180 = local131 - arg1; local180 < arg0; local180 += arg1) {
					for (@Pc(186) int local186 = local117 - arg1; local186 < arg1; local186 += arg1) {
						this.aClass102_1.method6970(arg2 + local180, local186 - -arg5, arg1, arg1, 1, 0, local111);
					}
				}
			}
		}
		for (@Pc(241) int local241 = this.anInt106 - 1; local241 >= 0; local241--) {
			this.aClass26Array1[local241].method953(arg4, arg2, arg5, arg0, arg1, arg3, local7);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ha;I)Z")
	public boolean method91(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt115) {
			this.anInt115 = arg1;
			@Pc(12) int local12 = Static675.method8723(arg1);
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 <= 0) {
				local12 = 1;
			}
			if (this.anInt102 != local12) {
				this.anInt102 = local12;
				this.aClass102_1 = null;
			}
			if (this.aClass26Array2 != null) {
				this.anInt106 = 0;
				@Pc(47) int[] local47 = new int[this.aClass26Array2.length];
				for (@Pc(49) int local49 = 0; local49 < this.aClass26Array2.length; local49++) {
					@Pc(56) Class26 local56 = this.aClass26Array2[local49];
					if (local56.method945(this.anInt112, this.anInt113, this.anInt105, this.anInt115)) {
						local47[this.anInt106] = local56.anInt917;
						this.aClass26Array1[this.anInt106++] = local56;
					}
				}
				Static549.method4302(this.anInt106 - 1, 0, this.aClass26Array1, local47);
			}
			this.aBoolean15 = true;
		}
		@Pc(113) boolean local113 = false;
		if (this.aBoolean15) {
			this.aBoolean15 = false;
			for (@Pc(129) int local129 = this.anInt106 - 1; local129 >= 0; local129--) {
				@Pc(140) boolean local140 = this.aClass26Array1[local129].method955(arg0, this.aClass26_1);
				local113 |= local140;
				this.aBoolean15 |= !local140;
			}
		}
		return local113;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
	public void method93() {
		if (this.aClass26Array2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass26Array2.length; local10++) {
				this.aClass26Array2[local10].method948();
			}
		}
		this.aClass102_1 = null;
	}
}
