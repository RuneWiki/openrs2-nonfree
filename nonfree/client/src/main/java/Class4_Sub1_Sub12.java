import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class4_Sub1_Sub12 extends Class4_Sub1 {

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "[I")
	private int[] anIntArray165;

	@OriginalMember(owner = "client!gq", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!gq", name = "R", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
	private int anInt3505 = 0;

	@OriginalMember(owner = "client!gq", name = "E", descriptor = "[S")
	private final short[] aShortArray43 = new short[257];

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt3505 = arg1.method4905();
		this.anIntArrayArray22 = new int[arg1.method4905()][2];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray22.length; local24++) {
			this.anIntArrayArray22[local24][0] = arg1.method4936();
			this.anIntArrayArray22[local24][1] = arg1.method4936();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
		if (this.anIntArrayArray22 == null) {
			this.anIntArrayArray22 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray22.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3505 == 2) {
			this.method3148();
		}
		Static165.method3014();
		this.method3147();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)[I")
	private int[] method3144(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray166;
		} else if (this.anIntArrayArray22.length <= arg0) {
			return this.anIntArray165;
		} else {
			return this.anIntArrayArray22[arg0];
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(29) int[] local29 = this.method8392(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static376.anInt7260; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local11[local31] = this.aShortArray43[local39];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)V")
	private void method3147() {
		@Pc(4) int local4 = this.anInt3505;
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
				for (local26 = 1; this.anIntArrayArray22.length - 1 > local26 && local24 >= this.anIntArrayArray22[local26][0]; local26++) {
				}
				local57 = this.anIntArrayArray22[local26 - 1];
				local62 = this.anIntArrayArray22[local26];
				local71 = this.method3144(local26 - 2)[1];
				local75 = local57[1];
				local79 = local62[1];
				local88 = this.method3144(local26 + 1)[1];
				@Pc(106) int local106 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				@Pc(112) int local112 = local106 * local106 >> 12;
				@Pc(122) int local122 = local75 + local88 - local71 - local79;
				@Pc(128) int local128 = local71 - local75 - local122;
				@Pc(133) int local133 = local79 - local71;
				@Pc(145) int local145 = (local122 * local106 >> 12) * local112 >> 12;
				@Pc(151) int local151 = local112 * local128 >> 12;
				@Pc(157) int local157 = local133 * local106 >> 12;
				@Pc(165) int local165 = local75 + local151 + local145 + local157;
				if (local165 <= -32768) {
					local165 = -32767;
				}
				if (local165 >= 32768) {
					local165 = 32767;
				}
				this.aShortArray43[local4] = (short) local165;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray22.length - 1 > local26 && this.anIntArrayArray22[local26][0] <= local24; local26++) {
				}
				local57 = this.anIntArrayArray22[local26 - 1];
				local62 = this.anIntArrayArray22[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - Static239.anIntArray474[local71 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local75;
				local88 = local79 * local57[1] + local75 * local62[1] >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray43[local4] = (short) local88;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray22.length - 1 && local24 >= this.anIntArrayArray22[local26][0]; local26++) {
				}
				local57 = this.anIntArrayArray22[local26 - 1];
				local62 = this.anIntArrayArray22[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - local71;
				local79 = local62[1] * local71 + local75 * local57[1] >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray43[local4] = (short) local79;
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V")
	private void method3148() {
		@Pc(8) int[] local8 = this.anIntArrayArray22[0];
		@Pc(13) int[] local13 = this.anIntArrayArray22[1];
		@Pc(30) int[] local30 = this.anIntArrayArray22[this.anIntArrayArray22.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray22[this.anIntArrayArray22.length - 1];
		this.anIntArray165 = new int[] { local30[0] + local30[0] - local39[0], local30[1] + -local39[1] + local30[1] };
		this.anIntArray166 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] + local8[1] + local8[1] };
	}
}
