import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class107 {

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "Lclient!qg;")
	private Class87 aClass87_9;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
	private int anInt3210;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
	private int anInt3211;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Z")
	private boolean aBoolean215 = true;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
	private int anInt3207 = -1;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	private final int anInt3203;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
	private final int anInt3205;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	private final int anInt3204;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
	private final int anInt3206;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "[Lclient!ka;")
	private final Class139[] aClass139Array2;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "Lclient!ka;")
	private final Class139 aClass139_1;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "[Lclient!ka;")
	private final Class139[] aClass139Array1;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I[Lclient!ka;IIII)V")
	public Class107(@OriginalArg(0) int arg0, @OriginalArg(1) Class139[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3203 = arg0;
		this.anInt3205 = arg3;
		this.anInt3204 = arg5;
		this.anInt3206 = arg4;
		this.aClass139Array2 = arg1;
		if (arg1 == null) {
			this.aClass139_1 = null;
			this.aClass139Array1 = null;
		} else {
			this.aClass139Array1 = new Class139[arg1.length];
			this.aClass139_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIILclient!eq;III)V")
	public void method2640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class66 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg1 + arg4 & 0x3FFF;
		if (this.anInt3203 == -1) {
			arg6.method5004(arg2, arg7, arg5, arg8, arg3, 0);
		} else {
			@Pc(32) Class184 local32 = Static125.anInterface8_3.method5566(this.anInt3203);
			if (this.aClass87_9 == null && Static125.anInterface8_3.method5562(this.anInt3203)) {
				@Pc(68) int[] local68 = local32.aBoolean324 ? Static125.anInterface8_3.method5563(this.anInt3203, this.anInt3210, false, 0.7F, this.anInt3210) : Static125.anInterface8_3.method5564(0.7F, this.anInt3210, this.anInt3210, this.anInt3203);
				this.aClass87_9 = arg6.method5018(local68, this.anInt3210, this.anInt3210, this.anInt3210);
			}
			if (!local32.aBoolean324) {
				arg6.method5004(arg2, arg7, arg5, arg8, arg3, 0);
			}
			if (this.aClass87_9 != null) {
				@Pc(101) int local101 = local32.aBoolean324 ? 0 : 1;
				@Pc(107) int local107 = arg8 * arg0 / -4096;
				@Pc(120) int local120;
				for (local120 = (arg5 - arg8) / 2 + local7 * arg8 / 4096; local120 > arg8; local120 -= arg8) {
				}
				while (local120 < 0) {
					local120 += arg8;
				}
				while (arg8 < local107) {
					local107 -= arg8;
				}
				while (local107 < 0) {
					local107 += arg8;
				}
				for (@Pc(167) int local167 = local120 - arg8; local167 < arg5; local167 += arg8) {
					for (@Pc(174) int local174 = local107 - arg8; local174 < arg8; local174 += arg8) {
						this.aClass87_9.method6571(arg2 + local167, arg7 + local174, arg8, arg8, 1, 0, local101);
					}
				}
			}
		}
		for (@Pc(217) int local217 = this.anInt3211 - 1; local217 >= 0; local217--) {
			this.aClass139Array1[local217].method3137(arg6, arg2, arg7, arg5, arg8, arg0, local7);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
	public void method2641() {
		if (this.aClass139Array2 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass139Array2.length; local16++) {
				this.aClass139Array2[local16].method3139();
			}
		}
		this.aClass87_9 = null;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZILclient!eq;)Z")
	public boolean method2643(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1) {
		if (this.anInt3207 != arg0) {
			this.anInt3207 = arg0;
			@Pc(21) int local21 = Static52.method1203(arg0);
			if (local21 > arg0) {
				local21 = Static31.method761(arg0);
			}
			if (local21 > 512) {
				local21 = 512;
			}
			if (local21 != this.anInt3210) {
				this.aClass87_9 = null;
				this.anInt3210 = local21;
			}
			if (this.aClass139Array2 != null) {
				this.anInt3211 = 0;
				@Pc(62) int[] local62 = new int[this.aClass139Array2.length];
				for (@Pc(64) int local64 = 0; local64 < this.aClass139Array2.length; local64++) {
					@Pc(71) Class139 local71 = this.aClass139Array2[local64];
					if (local71.method3132(this.anInt3205, this.anInt3206, this.anInt3204, this.anInt3207)) {
						local62[this.anInt3211] = local71.anInt3810;
						this.aClass139Array1[this.anInt3211++] = local71;
					}
				}
				Static416.method6104(0, local62, this.aClass139Array1, this.anInt3211 - 1);
			}
			this.aBoolean215 = true;
		}
		@Pc(124) boolean local124 = false;
		if (this.aBoolean215) {
			this.aBoolean215 = false;
			for (@Pc(135) int local135 = this.anInt3211 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass139Array1[local135].method3134(arg1, this.aClass139_1);
				this.aBoolean215 |= !local146;
				local124 |= local146;
			}
		}
		return local124;
	}
}
