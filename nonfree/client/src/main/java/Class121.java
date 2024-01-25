import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class121 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "I")
	public int anInt3157;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	public int anInt3160;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
	public int[] anIntArray379;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "[Lclient!oa;")
	public Class149[] aClass149Array1;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray119;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "[I")
	public int[] anIntArray380;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "[I")
	public int[] anIntArray381;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "[I")
	public int[] anIntArray382;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Lclient!oa;")
	public Class149 aClass149_1;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "[I")
	public int[] anIntArray383;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray120;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "I")
	public int anInt3162;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	public final int anInt3159;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "([BI)V")
	public Class121(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3159 = Static266.method4503(arg0.length, arg0);
		if (this.anInt3159 != arg1) {
			throw new RuntimeException();
		}
		this.method3301(arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([BI)V")
	private void method3301(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class6_Sub10 local12 = new Class6_Sub10(Static90.method1536(arg0));
		@Pc(16) int local16 = local12.method3972();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt3162 = local12.method3979();
		} else {
			this.anInt3162 = 0;
		}
		@Pc(47) int local47 = local12.method3972();
		this.anInt3160 = local12.method4021();
		@Pc(54) int local54 = 0;
		this.anIntArray381 = new int[this.anInt3160];
		@Pc(61) int local61 = -1;
		for (@Pc(69) int local69 = 0; local69 < this.anInt3160; local69++) {
			this.anIntArray381[local69] = local54 += local12.method4021();
			if (this.anIntArray381[local69] > local61) {
				local61 = this.anIntArray381[local69];
			}
		}
		this.anInt3157 = local61 + 1;
		this.anIntArrayArray120 = new int[this.anInt3157][];
		this.anIntArray380 = new int[this.anInt3157];
		this.anIntArray382 = new int[this.anInt3157];
		this.anIntArray379 = new int[this.anInt3157];
		this.anIntArray383 = new int[this.anInt3157];
		@Pc(137) int local137;
		@Pc(151) int local151;
		if (local47 != 0) {
			this.anIntArray378 = new int[this.anInt3157];
			for (local137 = 0; local137 < this.anInt3157; local137++) {
				this.anIntArray378[local137] = -1;
			}
			for (local151 = 0; local151 < this.anInt3160; local151++) {
				this.anIntArray378[this.anIntArray381[local151]] = local12.method3979();
			}
			this.aClass149_1 = new Class149(this.anIntArray378);
		}
		for (local137 = 0; local137 < this.anInt3160; local137++) {
			this.anIntArray380[this.anIntArray381[local137]] = local12.method3979();
		}
		for (local151 = 0; local151 < this.anInt3160; local151++) {
			this.anIntArray383[this.anIntArray381[local151]] = local12.method3979();
		}
		for (@Pc(223) int local223 = 0; local223 < this.anInt3160; local223++) {
			this.anIntArray382[this.anIntArray381[local223]] = local12.method4021();
		}
		@Pc(253) int local253;
		@Pc(260) int local260;
		@Pc(268) int local268;
		@Pc(270) int local270;
		@Pc(287) int local287;
		for (@Pc(246) int local246 = 0; local246 < this.anInt3160; local246++) {
			local253 = this.anIntArray381[local246];
			local54 = 0;
			local260 = this.anIntArray382[local253];
			this.anIntArrayArray120[local253] = new int[local260];
			local268 = -1;
			for (local270 = 0; local270 < local260; local270++) {
				local287 = this.anIntArrayArray120[local253][local270] = local54 += local12.method4021();
				if (local268 < local287) {
					local268 = local287;
				}
			}
			this.anIntArray379[local253] = local268 + 1;
			if (local268 + 1 == local260) {
				this.anIntArrayArray120[local253] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.aClass149Array1 = new Class149[local61 + 1];
		this.anIntArrayArray119 = new int[local61 + 1][];
		for (local253 = 0; local253 < this.anInt3160; local253++) {
			local260 = this.anIntArray381[local253];
			local268 = this.anIntArray382[local260];
			this.anIntArrayArray119[local260] = new int[this.anIntArray379[local260]];
			for (local270 = 0; local270 < this.anIntArray379[local260]; local270++) {
				this.anIntArrayArray119[local260][local270] = -1;
			}
			for (local287 = 0; local287 < local268; local287++) {
				@Pc(400) int local400;
				if (this.anIntArrayArray120[local260] == null) {
					local400 = local287;
				} else {
					local400 = this.anIntArrayArray120[local260][local287];
				}
				this.anIntArrayArray119[local260][local400] = local12.method3979();
			}
			this.aClass149Array1[local260] = new Class149(this.anIntArrayArray119[local260]);
		}
	}
}
