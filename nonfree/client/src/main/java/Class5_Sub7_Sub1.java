import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class5_Sub7_Sub1 extends Class5_Sub7 {

	@OriginalMember(owner = "client!fd", name = "W", descriptor = "[I")
	public static int[] anIntArray157 = new int[256];

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "Lclient!ca;")
	public final Class10 aClass10_5 = new Class10();

	@OriginalMember(owner = "client!fd", name = "N", descriptor = "Lclient!ue;")
	public final Class5_Sub7_Sub3 aClass5_Sub7_Sub3_1 = new Class5_Sub7_Sub3();

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "Lclient!v;")
	private final Class5_Sub7_Sub4 aClass5_Sub7_Sub4_1;

	static {
		for (@Pc(29) int local29 = 0; local29 < 256; local29++) {
			@Pc(32) int local32 = local29;
			for (@Pc(34) int local34 = 0; local34 < 8; local34++) {
				if ((local32 & 0x1) == 1) {
					local32 = local32 >>> 1 ^ 0xEDB88320;
				} else {
					local32 >>>= 0x1;
				}
			}
			anIntArray157[local29] = local32;
		}
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!v;)V")
	public Class5_Sub7_Sub1(@OriginalArg(0) Class5_Sub7_Sub4 arg0) {
		this.aClass5_Sub7_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "()Lclient!u;")
	@Override
	public Class5_Sub7 method2024() {
		@Pc(9) Class5_Sub1 local9 = (Class5_Sub1) this.aClass10_5.method230();
		if (local9 == null) {
			return null;
		} else if (local9.aClass5_Sub7_Sub2_1 == null) {
			return this.method2026();
		} else {
			return local9.aClass5_Sub7_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
	@Override
	public void method2023(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class5_Sub1 local11 = (Class5_Sub1) this.aClass10_5.method230(); local11 != null; local11 = (Class5_Sub1) this.aClass10_5.method233()) {
			if (!this.aClass5_Sub7_Sub4_1.method2051(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local11.anInt81 >= local21) {
						this.method665(local11, local21);
						local11.anInt81 -= local21;
						break;
					}
					this.method665(local11, local11.anInt81);
					local21 -= local11.anInt81;
				} while (!this.aClass5_Sub7_Sub4_1.method2048(local11));
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!ad;I)V")
	private void method665(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass5_Sub7_Sub4_1.anIntArray446[arg0.anInt74] & 0x4) != 0 && arg0.anInt80 < 0) {
			@Pc(30) int local30 = this.aClass5_Sub7_Sub4_1.anIntArray456[arg0.anInt74] / Static1.anInt3;
			@Pc(40) int local40 = (local30 + 1048575 - arg0.anInt91) / local30;
			arg0.anInt91 = arg1 * local30 + arg0.anInt91 & 0xFFFFF;
			if (local40 <= arg1) {
				if (this.aClass5_Sub7_Sub4_1.anIntArray450[arg0.anInt74] == 0) {
					arg0.aClass5_Sub7_Sub2_1 = Static128.method1022(arg0.aClass5_Sub5_Sub1_1, arg0.aClass5_Sub7_Sub2_1.method1027(), arg0.aClass5_Sub7_Sub2_1.method1004(), arg0.aClass5_Sub7_Sub2_1.method1020());
				} else {
					arg0.aClass5_Sub7_Sub2_1 = Static128.method1022(arg0.aClass5_Sub5_Sub1_1, arg0.aClass5_Sub7_Sub2_1.method1027(), 0, arg0.aClass5_Sub7_Sub2_1.method1020());
					this.aClass5_Sub7_Sub4_1.method2039(arg0.aClass5_Sub12_1.aShortArray6[arg0.anInt90] < 0, arg0);
				}
				if (arg0.aClass5_Sub12_1.aShortArray6[arg0.anInt90] < 0) {
					arg0.aClass5_Sub7_Sub2_1.method1028(-1);
				}
				arg1 = arg0.anInt91 / local30;
			}
		}
		arg0.aClass5_Sub7_Sub2_1.method2023(arg1);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "([III)V")
	@Override
	public void method2025(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub7_Sub3_1.method2025(arg0, arg1, arg2);
		@Pc(15) int local15 = arg2 + arg1;
		for (@Pc(21) Class5_Sub1 local21 = (Class5_Sub1) this.aClass10_5.method230(); local21 != null; local21 = (Class5_Sub1) this.aClass10_5.method233()) {
			if (!this.aClass5_Sub7_Sub4_1.method2051(local21)) {
				@Pc(31) int local31 = arg2;
				@Pc(33) int local33 = arg1;
				do {
					if (local31 <= local21.anInt81) {
						this.method666(arg0, local33, local31, local15, local21);
						local21.anInt81 -= local31;
						break;
					}
					this.method666(arg0, local33, local21.anInt81, local15, local21);
					local31 -= local21.anInt81;
					local33 += local21.anInt81;
				} while (!this.aClass5_Sub7_Sub4_1.method2048(local21));
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([IIIILclient!ad;I)V")
	private void method666(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub1 arg4) {
		if ((this.aClass5_Sub7_Sub4_1.anIntArray446[arg4.anInt74] & 0x4) != 0 && arg4.anInt80 < 0) {
			@Pc(28) int local28 = this.aClass5_Sub7_Sub4_1.anIntArray456[arg4.anInt74] / Static1.anInt3;
			while (true) {
				@Pc(39) int local39 = (local28 + 1048575 - arg4.anInt91) / local28;
				if (arg2 < local39) {
					arg4.anInt91 += local28 * arg2;
					break;
				}
				arg4.aClass5_Sub7_Sub2_1.method2025(arg0, arg1, local39);
				arg2 -= local39;
				@Pc(60) int local60 = Static1.anInt3 / 100;
				arg1 += local39;
				@Pc(68) int local68 = 262144 / local28;
				@Pc(71) Class5_Sub7_Sub2 local71 = arg4.aClass5_Sub7_Sub2_1;
				arg4.anInt91 += local28 * local39 - 1048576;
				if (local68 < local60) {
					local60 = local68;
				}
				if (this.aClass5_Sub7_Sub4_1.anIntArray450[arg4.anInt74] == 0) {
					arg4.aClass5_Sub7_Sub2_1 = Static128.method1022(arg4.aClass5_Sub5_Sub1_1, local71.method1027(), local71.method1004(), local71.method1020());
				} else {
					arg4.aClass5_Sub7_Sub2_1 = Static128.method1022(arg4.aClass5_Sub5_Sub1_1, local71.method1027(), 0, local71.method1020());
					this.aClass5_Sub7_Sub4_1.method2039(arg4.aClass5_Sub12_1.aShortArray6[arg4.anInt90] < 0, arg4);
					arg4.aClass5_Sub7_Sub2_1.method1036(local60, local71.method1004());
				}
				if (arg4.aClass5_Sub12_1.aShortArray6[arg4.anInt90] < 0) {
					arg4.aClass5_Sub7_Sub2_1.method1028(-1);
				}
				local71.method1038(local60);
				local71.method2025(arg0, arg1, arg3 - arg1);
				if (local71.method1002()) {
					this.aClass5_Sub7_Sub3_1.method2011(local71);
				}
			}
		}
		arg4.aClass5_Sub7_Sub2_1.method2025(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
	@Override
	public int method2021() {
		return 0;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "()Lclient!u;")
	@Override
	public Class5_Sub7 method2026() {
		@Pc(9) Class5_Sub1 local9;
		do {
			local9 = (Class5_Sub1) this.aClass10_5.method233();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass5_Sub7_Sub2_1 == null);
		return local9.aClass5_Sub7_Sub2_1;
	}
}
