import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class332 {

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
	private int anInt8444;

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "Lclient!tf;")
	private Class17 aClass17_63;

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
	private int anInt8449;

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "Z")
	private boolean aBoolean655 = true;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
	private int anInt8440 = -1;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
	private final int anInt8439;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "[Lclient!ep;")
	private final Class98[] aClass98Array2;

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
	private final int anInt8448;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
	private final int anInt8441;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
	private final int anInt8437;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "[Lclient!ep;")
	private final Class98[] aClass98Array1;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "Lclient!ep;")
	private final Class98 aClass98_1;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(I[Lclient!ep;IIII)V")
	public Class332(@OriginalArg(0) int arg0, @OriginalArg(1) Class98[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8439 = arg3;
		this.aClass98Array2 = arg1;
		this.anInt8448 = arg5;
		this.anInt8441 = arg4;
		this.anInt8437 = arg0;
		if (arg1 == null) {
			this.aClass98Array1 = null;
			this.aClass98_1 = null;
		} else {
			this.aClass98Array1 = new Class98[arg1.length];
			this.aClass98_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public void method7313() {
		if (this.aClass98Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass98Array2.length; local6++) {
				this.aClass98Array2[local6].method2437();
			}
		}
		this.aClass17_63 = null;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIILclient!ha;II)V")
	public void method7316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class33 arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg2 + arg8 & 0x3FFF;
		if (this.anInt8437 == -1 || this.anInt8449 == 0) {
			arg7.aa(arg3, arg6, arg0, arg5, arg1, 0);
		} else {
			@Pc(25) Class130 local25 = Static195.anInterface9_5.method1558(this.anInt8437);
			if (this.aClass17_63 == null && Static195.anInterface9_5.method1557(this.anInt8437)) {
				@Pc(62) int[] local62 = local25.anInt3119 == 2 ? Static195.anInterface9_5.method1559(this.anInt8437, this.anInt8449, this.anInt8449, 0.7F) : Static195.anInterface9_5.method1555(this.anInt8437, 0.7F, false, this.anInt8449, this.anInt8449);
				this.aClass17_63 = arg7.method8128(local62, this.anInt8449, this.anInt8449, this.anInt8449);
			}
			if (local25.anInt3119 == 2) {
				arg7.aa(arg3, arg6, arg0, arg5, arg1, 0);
			}
			if (this.aClass17_63 != null) {
				@Pc(100) int local100 = local25.anInt3119 == 2 ? 1 : 0;
				@Pc(106) int local106 = arg5 * arg4 / -4096;
				@Pc(119) int local119;
				for (local119 = (arg0 - arg5) / 2 + arg5 * local11 / 4096; local119 > arg5; local119 -= arg5) {
				}
				while (local119 < 0) {
					local119 += arg5;
				}
				while (local106 > arg5) {
					local106 -= arg5;
				}
				while (local106 < 0) {
					local106 += arg5;
				}
				for (@Pc(166) int local166 = local119 - arg5; local166 < arg0; local166 += arg5) {
					for (@Pc(173) int local173 = local106 - arg5; local173 < arg5; local173 += arg5) {
						this.aClass17_63.method5259(local166 + arg3, local173 - -arg6, arg5, arg5, 1, 0, local100);
					}
				}
			}
		}
		for (@Pc(224) int local224 = this.anInt8444 - 1; local224 >= 0; local224--) {
			this.aClass98Array1[local224].method2436(arg7, arg3, arg6, arg0, arg5, arg4, local11);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLclient!ha;I)Z")
	public boolean method7317(@OriginalArg(1) Class33 arg0, @OriginalArg(2) int arg1) {
		@Pc(51) int local51;
		if (this.anInt8440 != arg1) {
			this.anInt8440 = arg1;
			@Pc(12) int local12 = Static125.method2245(arg1);
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 <= 0) {
				local12 = 1;
			}
			if (local12 != this.anInt8449) {
				this.aClass17_63 = null;
				this.anInt8449 = local12;
			}
			if (this.aClass98Array2 != null) {
				this.anInt8444 = 0;
				@Pc(49) int[] local49 = new int[this.aClass98Array2.length];
				for (local51 = 0; local51 < this.aClass98Array2.length; local51++) {
					@Pc(58) Class98 local58 = this.aClass98Array2[local51];
					if (local58.method2438(this.anInt8439, this.anInt8441, this.anInt8448, this.anInt8440)) {
						local49[this.anInt8444] = local58.anInt2517;
						this.aClass98Array1[this.anInt8444++] = local58;
					}
				}
				Static64.method1423(this.anInt8444 - 1, 0, this.aClass98Array1, local49);
			}
			this.aBoolean655 = true;
		}
		@Pc(111) boolean local111 = false;
		if (this.aBoolean655) {
			this.aBoolean655 = false;
			for (local51 = this.anInt8444 - 1; local51 >= 0; local51--) {
				@Pc(141) boolean local141 = this.aClass98Array1[local51].method2432(arg0, this.aClass98_1);
				this.aBoolean655 |= !local141;
				local111 |= local141;
			}
		}
		return local111;
	}
}
