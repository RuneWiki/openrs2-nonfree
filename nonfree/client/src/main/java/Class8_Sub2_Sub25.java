import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class8_Sub2_Sub25 extends Class8_Sub2 {

	@OriginalMember(owner = "client!nca", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!nca", name = "P", descriptor = "[I")
	private int[] anIntArray382;

	@OriginalMember(owner = "client!nca", name = "U", descriptor = "[I")
	private int[] anIntArray383;

	@OriginalMember(owner = "client!nca", name = "Q", descriptor = "I")
	private int anInt6873 = 0;

	@OriginalMember(owner = "client!nca", name = "R", descriptor = "[S")
	private final short[] aShortArray87 = new short[257];

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "(B)V")
	private void method5630() {
		@Pc(8) int local8 = this.anInt6873;
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
				for (local26 = 1; local26 < this.anIntArrayArray38.length - 1 && local24 >= this.anIntArrayArray38[local26][0]; local26++) {
				}
				local57 = this.anIntArrayArray38[local26 - 1];
				local62 = this.anIntArrayArray38[local26];
				local71 = this.method5633(local26 - 2)[1];
				local75 = local57[1];
				local79 = local62[1];
				local88 = this.method5633(local26 + 1)[1];
				@Pc(106) int local106 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				@Pc(112) int local112 = local106 * local106 >> 12;
				@Pc(122) int local122 = local88 + local75 - local71 - local79;
				@Pc(129) int local129 = local71 - local122 - local75;
				@Pc(133) int local133 = local79 - local71;
				@Pc(145) int local145 = local112 * (local122 * local106 >> 12) >> 12;
				@Pc(151) int local151 = local112 * local129 >> 12;
				@Pc(157) int local157 = local106 * local133 >> 12;
				@Pc(166) int local166 = local157 + local151 + local145 + local75;
				if (local166 <= -32768) {
					local166 = -32767;
				}
				if (local166 >= 32768) {
					local166 = 32767;
				}
				this.aShortArray87[local8] = (short) local166;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local24 = local8 << 4;
				for (local26 = 1; this.anIntArrayArray38.length - 1 > local26 && local24 >= this.anIntArrayArray38[local26][0]; local26++) {
				}
				local57 = this.anIntArrayArray38[local26 - 1];
				local62 = this.anIntArrayArray38[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - Static308.anIntArray360[local71 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local75;
				local88 = local62[1] * local75 + local57[1] * local79 >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray87[local8] = (short) local88;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local24 = local8 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray38.length - 1 && this.anIntArrayArray38[local26][0] <= local24; local26++) {
				}
				local57 = this.anIntArrayArray38[local26 - 1];
				local62 = this.anIntArrayArray38[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - local71;
				local79 = local57[1] * local75 + local62[1] * local71 >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray87[local8] = (short) local79;
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
		if (this.anIntArrayArray38 == null) {
			this.anIntArrayArray38 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray38.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt6873 == 2) {
			this.method5634();
		}
		Static282.method4762();
		this.method5630();
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(27) int[] local27 = this.method8505(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static538.anInt9297; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local11[local29] = this.aShortArray87[local37];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt6873 = arg1.method8525();
		this.anIntArrayArray38 = new int[arg1.method8525()][2];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArrayArray38.length; local30++) {
			this.anIntArrayArray38[local30][0] = arg1.method8578();
			this.anIntArrayArray38[local30][1] = arg1.method8578();
		}
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(BI)[I")
	private int[] method5633(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray382;
		} else if (this.anIntArrayArray38.length <= arg0) {
			return this.anIntArray383;
		} else {
			return this.anIntArrayArray38[arg0];
		}
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(Z)V")
	private void method5634() {
		@Pc(8) int[] local8 = this.anIntArrayArray38[0];
		@Pc(17) int[] local17 = this.anIntArrayArray38[1];
		@Pc(26) int[] local26 = this.anIntArrayArray38[this.anIntArrayArray38.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray38[this.anIntArrayArray38.length - 1];
		this.anIntArray382 = new int[] { local8[0] + local8[0] - local17[0], local8[1] + -local17[1] + local8[1] };
		this.anIntArray383 = new int[] { local26[0] + local26[0] - local35[0], local26[1] - (local35[1] + -local26[1]) };
	}
}
