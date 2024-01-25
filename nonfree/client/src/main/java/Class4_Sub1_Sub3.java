import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!au", name = "B", descriptor = "[I")
	public static final int[] anIntArray17 = new int[32];

	@OriginalMember(owner = "client!au", name = "y", descriptor = "[I")
	public int[] anIntArray16;

	@OriginalMember(owner = "client!au", name = "I", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3;

	@OriginalMember(owner = "client!au", name = "L", descriptor = "Lclient!gh;")
	public Class81 aClass81_1;

	@OriginalMember(owner = "client!au", name = "O", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!au", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!au", name = "U", descriptor = "Z")
	public boolean aBoolean32 = true;

	static {
		@Pc(9) int local9 = 2;
		for (@Pc(11) int local11 = 0; local11 < 32; local11++) {
			anIntArray17[local11] = local9 - 1;
			local9 += local9;
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(II)Lclient!ho;")
	public Class98 method226(@OriginalArg(0) int arg0) {
		return this.anIntArray18 == null || arg0 < 0 || this.anIntArray18.length < arg0 ? null : Static12.method128(this.anIntArray18[arg0]);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IZI)I")
	public int method227(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray18 == null || arg1 < 0 || this.anIntArray18.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray2[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray2[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray2[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	public void method228() {
		if (this.anIntArray16 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray16.length; local6++) {
				this.anIntArray16[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method229() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray3 == null) {
			return "";
		}
		local10.append(this.aStringArray3[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray3.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray3[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B[ILclient!iv;)V")
	public void method231(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (this.anIntArray18 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray18.length; local16++) {
			if (local16 >= arg0.length) {
				return;
			}
			@Pc(24) int local24 = this.method226(local16).anInt3056;
			if (local24 > 0) {
				arg1.method2526(local24, (long) arg0[local16]);
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!iv;I)V")
	public void method232(@OriginalArg(0) Class4_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2490();
			if (local9 == 0) {
				return;
			}
			this.method235(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!au", name = "f", descriptor = "(I)I")
	public int method233() {
		return this.anIntArray18 == null ? 0 : this.anIntArray18.length;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(Lclient!iv;I)Ljava/lang/String;")
	public String method234(@OriginalArg(0) Class4_Sub12 arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer(80);
		if (this.anIntArray18 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray18.length; local22++) {
				local17.append(this.aStringArray3[local22]);
				local17.append(this.aClass81_1.method2255(this.method226(local22), this.anIntArrayArray2[local22], arg0.method2492(Static12.method128(this.anIntArray18[local22]).anInt3058)));
			}
		}
		local17.append(this.aStringArray3[this.aStringArray3.length - 1]);
		return local17.toString();
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!iv;IZ)V")
	private void method235(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray3 = Static113.method2058(arg0.method2537(), '<');
			return;
		}
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (arg1 == 2) {
			local22 = arg0.method2490();
			this.anIntArray16 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray16[local28] = arg0.method2536();
			}
			return;
		}
		if (arg1 == 3) {
			local22 = arg0.method2490();
			this.anIntArrayArray2 = new int[local22][];
			this.anIntArray18 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				@Pc(67) int local67 = arg0.method2536();
				@Pc(71) Class98 local71 = Static12.method128(local67);
				if (local71 != null) {
					this.anIntArray18[local28] = local67;
					this.anIntArrayArray2[local28] = new int[local71.anInt3057];
					for (@Pc(87) int local87 = 0; local87 < local71.anInt3057; local87++) {
						this.anIntArrayArray2[local28][local87] = arg0.method2536();
					}
				}
			}
			return;
		}
		if (arg1 == 4) {
			this.aBoolean32 = false;
			return;
		}
	}
}
