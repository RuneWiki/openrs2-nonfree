import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class7_Sub3_Sub14 extends Class7_Sub3 {

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!jb", name = "O", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "[S")
	private final short[] aShortArray64 = new short[257];

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
	private int anInt3324 = 0;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)[I")
	private int[] method2690(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray297;
		} else if (this.anIntArrayArray27.length <= arg0) {
			return this.anIntArray296;
		} else {
			return this.anIntArrayArray27[arg0];
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	private void method2692() {
		@Pc(8) int local8 = this.anInt3324;
		@Pc(26) int local26;
		@Pc(24) int local24;
		@Pc(57) int[] local57;
		@Pc(62) int[] local62;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local24 = local8 << 4;
				for (local26 = 1; this.anIntArrayArray27.length - 1 > local26 && local24 >= this.anIntArrayArray27[local26][0]; local26++) {
				}
				local57 = this.anIntArrayArray27[local26 - 1];
				local62 = this.anIntArrayArray27[local26];
				local71 = this.method2690(local26 - 2)[1];
				local75 = local57[1];
				local79 = local62[1];
				local88 = this.method2690(local26 + 1)[1];
				@Pc(104) int local104 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				@Pc(110) int local110 = local104 * local104 >> 12;
				@Pc(121) int local121 = local88 + local75 - local79 - local71;
				@Pc(129) int local129 = local71 - local75 - local121;
				@Pc(134) int local134 = local79 - local71;
				@Pc(146) int local146 = (local104 * local121 >> 12) * local110 >> 12;
				@Pc(152) int local152 = local129 * local110 >> 12;
				@Pc(158) int local158 = local104 * local134 >> 12;
				@Pc(166) int local166 = local75 + local158 + local146 + local152;
				if (local166 <= -32768) {
					local166 = -32767;
				}
				if (local166 >= 32768) {
					local166 = 32767;
				}
				this.aShortArray64[local8] = (short) local166;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local24 = local8 << 4;
				for (local26 = 1; this.anIntArrayArray27.length - 1 > local26 && local24 >= this.anIntArrayArray27[local26][0]; local26++) {
				}
				local57 = this.anIntArrayArray27[local26 - 1];
				local62 = this.anIntArrayArray27[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - Static54.anIntArray80[local71 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local75;
				local88 = local75 * local62[1] + local79 * local57[1] >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray64[local8] = (short) local88;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local24 = local8 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray27.length - 1 && this.anIntArrayArray27[local26][0] <= local24; local26++) {
				}
				local57 = this.anIntArrayArray27[local26 - 1];
				local62 = this.anIntArrayArray27[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - local71;
				local79 = local57[1] * local75 + local71 * local62[1] >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray64[local8] = (short) local79;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
		if (this.anIntArrayArray27 == null) {
			this.anIntArrayArray27 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray27.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3324 == 2) {
			this.method2694();
		}
		Static371.method4759();
		this.method2692();
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	private void method2694() {
		@Pc(12) int[] local12 = this.anIntArrayArray27[0];
		@Pc(17) int[] local17 = this.anIntArrayArray27[1];
		@Pc(26) int[] local26 = this.anIntArrayArray27[this.anIntArrayArray27.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray27[this.anIntArrayArray27.length - 1];
		this.anIntArray296 = new int[] { local26[0] + local26[0] - local35[0], -local35[1] - (-local26[1] - local26[1]) };
		this.anIntArray297 = new int[] { local12[0] + local12[0] - local17[0], -local17[1] + local12[1] + local12[1] };
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(26) int[] local26 = this.method5591(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static58.anInt1052; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local16[local28] = this.aShortArray64[local36];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt3324 = arg1.method3981();
		this.anIntArrayArray27 = new int[arg1.method3981()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray27.length; local28++) {
			this.anIntArrayArray27[local28][0] = arg1.method3943();
			this.anIntArrayArray27[local28][1] = arg1.method3943();
		}
	}
}
