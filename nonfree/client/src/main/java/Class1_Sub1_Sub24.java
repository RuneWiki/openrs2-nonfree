import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ob", name = "S", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!ob", name = "Y", descriptor = "[I")
	private int[] anIntArray404;

	@OriginalMember(owner = "client!ob", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ob", name = "V", descriptor = "[S")
	private short[] aShortArray82 = new short[257];

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
	private int anInt3454 = 0;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
	private void method2791() {
		@Pc(4) int local4 = this.anInt3454;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(57) int[] local57;
		@Pc(62) int[] local62;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local26 = local4 << 4;
				for (local28 = 1; this.anIntArrayArray28.length - 1 > local28 && local26 >= this.anIntArrayArray28[local28][0]; local28++) {
				}
				local57 = this.anIntArrayArray28[local28 - 1];
				local62 = this.anIntArrayArray28[local28];
				local71 = this.method2792(local28 - 2)[1];
				local75 = local57[1];
				local79 = local62[1];
				local88 = this.method2792(local28 + 1)[1];
				@Pc(106) int local106 = (local26 - local57[0] << 12) / (local62[0] - local57[0]);
				@Pc(116) int local116 = local75 + local88 - local71 - local79;
				@Pc(122) int local122 = local106 * local106 >> 12;
				@Pc(129) int local129 = local71 - local116 - local75;
				@Pc(134) int local134 = local79 - local71;
				@Pc(146) int local146 = (local106 * local116 >> 12) * local122 >> 12;
				@Pc(152) int local152 = local129 * local122 >> 12;
				@Pc(158) int local158 = local106 * local134 >> 12;
				@Pc(166) int local166 = local75 + local158 + local146 + local152;
				if (local166 <= -32768) {
					local166 = -32767;
				}
				if (local166 >= 32768) {
					local166 = 32767;
				}
				this.aShortArray82[local4] = (short) local166;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local26 = local4 << 4;
				for (local28 = 1; this.anIntArrayArray28.length - 1 > local28 && this.anIntArrayArray28[local28][0] <= local26; local28++) {
				}
				local62 = this.anIntArrayArray28[local28];
				local57 = this.anIntArrayArray28[local28 - 1];
				local71 = (local26 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - Static134.anIntArray305[local71 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local75;
				local88 = local62[1] * local75 + local57[1] * local79 >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray82[local4] = (short) local88;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local26 = local4 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray28.length - 1 && this.anIntArrayArray28[local28][0] <= local26; local28++) {
				}
				local62 = this.anIntArrayArray28[local28];
				local57 = this.anIntArrayArray28[local28 - 1];
				local71 = (local26 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - local71;
				local79 = local57[1] * local75 + local62[1] * local71 >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray82[local4] = (short) local79;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)[I")
	private int[] method2792(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray403;
		} else if (this.anIntArrayArray28.length > arg0) {
			return this.anIntArrayArray28[arg0];
		} else {
			return this.anIntArray404;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(27) int[] local27 = this.method4450(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static131.anInt2513; local29++) {
				@Pc(38) int local38 = local27[local29] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local17[local29] = this.aShortArray82[local38];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
		if (this.anIntArrayArray28 == null) {
			this.anIntArrayArray28 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray28.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3454 == 2) {
			this.method2795();
		}
		Static173.method2622();
		this.method2791();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3454 = arg0.method3122();
		this.anIntArrayArray28 = new int[arg0.method3122()][2];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArrayArray28.length; local30++) {
			this.anIntArrayArray28[local30][0] = arg0.method3107();
			this.anIntArrayArray28[local30][1] = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "(I)V")
	private void method2795() {
		@Pc(8) int[] local8 = this.anIntArrayArray28[1];
		@Pc(13) int[] local13 = this.anIntArrayArray28[0];
		@Pc(22) int[] local22 = this.anIntArrayArray28[this.anIntArrayArray28.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray28[this.anIntArrayArray28.length - 1];
		this.anIntArray404 = new int[] { local22[0] + local22[0] - local31[0], -local31[1] + local22[1] + local22[1] };
		this.anIntArray403 = new int[] { local13[0] + local13[0] - local8[0], local13[1] - -local13[1] + -local8[1] };
	}
}
