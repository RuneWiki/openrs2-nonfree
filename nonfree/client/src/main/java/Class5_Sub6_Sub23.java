import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kja")
public final class Class5_Sub6_Sub23 extends Class5_Sub6 {

	@OriginalMember(owner = "client!kja", name = "I", descriptor = "[Lclient!eo;")
	public static final Class102[] aClass102Array1 = new Class102[5];

	@OriginalMember(owner = "client!kja", name = "E", descriptor = "[I")
	private int[] anIntArray308;

	@OriginalMember(owner = "client!kja", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!kja", name = "K", descriptor = "[I")
	private int[] anIntArray309;

	@OriginalMember(owner = "client!kja", name = "P", descriptor = "I")
	private int anInt5514 = 0;

	@OriginalMember(owner = "client!kja", name = "B", descriptor = "[S")
	private final short[] aShortArray73 = new short[257];

	static {
		for (@Pc(6) int local6 = 0; local6 < aClass102Array1.length; local6++) {
			aClass102Array1[local6] = new Class102();
		}
	}

	@OriginalMember(owner = "client!kja", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub23() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt5514 = arg0.method3642();
		this.anIntArrayArray45 = new int[arg0.method3642()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray45.length; local28++) {
			this.anIntArrayArray45[local28][0] = arg0.method3698();
			this.anIntArrayArray45[local28][1] = arg0.method3698();
		}
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(Z)V")
	private void method4760() {
		@Pc(4) int local4 = this.anInt5514;
		@Pc(26) int local26;
		@Pc(24) int local24;
		@Pc(57) int[] local57;
		@Pc(62) int[] local62;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray45.length - 1 && local24 >= this.anIntArrayArray45[local26][0]; local26++) {
				}
				local57 = this.anIntArrayArray45[local26 - 1];
				local62 = this.anIntArrayArray45[local26];
				local71 = this.method4762(local26 - 2)[1];
				local75 = local57[1];
				local79 = local62[1];
				local88 = this.method4762(local26 + 1)[1];
				@Pc(105) int local105 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				@Pc(111) int local111 = local105 * local105 >> 12;
				@Pc(120) int local120 = local75 + local88 - local79 - local71;
				@Pc(128) int local128 = local71 - local120 - local75;
				@Pc(133) int local133 = local79 - local71;
				@Pc(145) int local145 = (local120 * local105 >> 12) * local111 >> 12;
				@Pc(151) int local151 = local111 * local128 >> 12;
				@Pc(157) int local157 = local133 * local105 >> 12;
				@Pc(166) int local166 = local75 + local151 + local145 + local157;
				if (local166 <= -32768) {
					local166 = -32767;
				}
				if (local166 >= 32768) {
					local166 = 32767;
				}
				this.aShortArray73[local4] = (short) local166;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray45.length - 1 > local26 && this.anIntArrayArray45[local26][0] <= local24; local26++) {
				}
				local57 = this.anIntArrayArray45[local26 - 1];
				local62 = this.anIntArrayArray45[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - Static24.anIntArray30[local71 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local75;
				local88 = local79 * local57[1] + local62[1] * local75 >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray73[local4] = (short) local88;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray45.length - 1 && local24 >= this.anIntArrayArray45[local26][0]; local26++) {
				}
				local57 = this.anIntArrayArray45[local26 - 1];
				local62 = this.anIntArrayArray45[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - local71;
				local79 = local57[1] * local75 + local62[1] * local71 >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray73[local4] = (short) local79;
			}
		}
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(27) int[] local27 = this.method8117(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static421.anInt7443; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray73[local37];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!kja", name = "e", descriptor = "(B)V")
	private void method4761() {
		@Pc(14) int[] local14 = this.anIntArrayArray45[0];
		@Pc(19) int[] local19 = this.anIntArrayArray45[1];
		@Pc(28) int[] local28 = this.anIntArrayArray45[this.anIntArrayArray45.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray45[this.anIntArrayArray45.length - 1];
		this.anIntArray309 = new int[] { local14[0] + local14[0] - local19[0], local14[1] + local14[1] - local19[1] };
		this.anIntArray308 = new int[] { local28[0] + local28[0] - local37[0], local28[1] - (local37[1] + -local28[1]) };
	}

	@OriginalMember(owner = "client!kja", name = "b", descriptor = "(II)[I")
	private int[] method4762(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray309;
		} else if (arg0 >= this.anIntArrayArray45.length) {
			return this.anIntArray308;
		} else {
			return this.anIntArrayArray45[arg0];
		}
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
		if (this.anIntArrayArray45 == null) {
			this.anIntArrayArray45 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray45.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5514 == 2) {
			this.method4761();
		}
		Static648.method8531();
		this.method4760();
	}
}
