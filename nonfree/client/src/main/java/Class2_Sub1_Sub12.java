import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!go", name = "S", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!go", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!go", name = "db", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!go", name = "V", descriptor = "I")
	private int anInt2632 = 0;

	@OriginalMember(owner = "client!go", name = "Q", descriptor = "[S")
	private final short[] aShortArray22 = new short[257];

	static {
		Math.sqrt(8192.0D);
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(27) int[] local27 = this.method6069(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static391.anInt7118; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local11[local29] = this.aShortArray22[local37];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)[I")
	private int[] method2126(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray208;
		} else if (this.anIntArrayArray11.length <= arg0) {
			return this.anIntArray209;
		} else {
			return this.anIntArrayArray11[arg0];
		}
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V")
	private void method2128() {
		@Pc(8) int[] local8 = this.anIntArrayArray11[0];
		@Pc(13) int[] local13 = this.anIntArrayArray11[1];
		@Pc(22) int[] local22 = this.anIntArrayArray11[this.anIntArrayArray11.length - 2];
		@Pc(36) int[] local36 = this.anIntArrayArray11[this.anIntArrayArray11.length - 1];
		this.anIntArray209 = new int[] { local22[0] + local22[0] - local36[0], -local36[1] + local22[1] + local22[1] };
		this.anIntArray208 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (local13[1] + -local8[1]) };
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt2632 = arg1.method5732();
		this.anIntArrayArray11 = new int[arg1.method5732()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray11.length; local28++) {
			this.anIntArrayArray11[local28][0] = arg1.method5753();
			this.anIntArrayArray11[local28][1] = arg1.method5753();
		}
	}

	@OriginalMember(owner = "client!go", name = "f", descriptor = "(I)V")
	private void method2129() {
		@Pc(4) int local4 = this.anInt2632;
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
				for (local26 = 1; local26 < this.anIntArrayArray11.length - 1 && this.anIntArrayArray11[local26][0] <= local24; local26++) {
				}
				local57 = this.anIntArrayArray11[local26 - 1];
				local62 = this.anIntArrayArray11[local26];
				local71 = this.method2126(local26 - 2)[1];
				local75 = local57[1];
				local79 = local62[1];
				local88 = this.method2126(local26 + 1)[1];
				@Pc(106) int local106 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				@Pc(112) int local112 = local106 * local106 >> 12;
				@Pc(122) int local122 = local88 + local75 - local71 - local79;
				@Pc(130) int local130 = local71 - local75 - local122;
				@Pc(135) int local135 = local79 - local71;
				@Pc(147) int local147 = local112 * (local122 * local106 >> 12) >> 12;
				@Pc(153) int local153 = local130 * local112 >> 12;
				@Pc(159) int local159 = local106 * local135 >> 12;
				@Pc(167) int local167 = local75 + local159 + local153 + local147;
				if (local167 <= -32768) {
					local167 = -32767;
				}
				if (local167 >= 32768) {
					local167 = 32767;
				}
				this.aShortArray22[local4] = (short) local167;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray11.length - 1 > local26 && this.anIntArrayArray11[local26][0] <= local24; local26++) {
				}
				local57 = this.anIntArrayArray11[local26 - 1];
				local62 = this.anIntArrayArray11[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - Static89.anIntArray149[local71 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local75;
				local88 = local57[1] * local79 + local75 * local62[1] >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray22[local4] = (short) local88;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray11.length - 1 && this.anIntArrayArray11[local26][0] <= local24; local26++) {
				}
				local57 = this.anIntArrayArray11[local26 - 1];
				local62 = this.anIntArrayArray11[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - local71;
				local79 = local57[1] * local75 + local62[1] * local71 >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray22[local4] = (short) local79;
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
		if (this.anIntArrayArray11 == null) {
			this.anIntArrayArray11 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray11.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2632 == 2) {
			this.method2128();
		}
		Static155.method2766();
		this.method2129();
	}
}
