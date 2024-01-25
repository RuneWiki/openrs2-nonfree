import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class6_Sub1_Sub9 extends Class6_Sub1 {

	@OriginalMember(owner = "client!et", name = "H", descriptor = "[I")
	private int[] anIntArray127;

	@OriginalMember(owner = "client!et", name = "I", descriptor = "[I")
	private int[] anIntArray128;

	@OriginalMember(owner = "client!et", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!et", name = "R", descriptor = "I")
	private int anInt3361 = 0;

	@OriginalMember(owner = "client!et", name = "J", descriptor = "[S")
	private final short[] aShortArray39 = new short[257];

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
	private void method2790() {
		@Pc(9) int local9 = this.anInt3361;
		@Pc(29) int local29;
		@Pc(27) int local27;
		@Pc(60) int[] local60;
		@Pc(65) int[] local65;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(93) int local93;
		if (local9 == 2) {
			for (local9 = 0; local9 < 257; local9++) {
				local27 = local9 << 4;
				for (local29 = 1; this.anIntArrayArray8.length - 1 > local29 && local27 >= this.anIntArrayArray8[local29][0]; local29++) {
				}
				local60 = this.anIntArrayArray8[local29 - 1];
				local65 = this.anIntArrayArray8[local29];
				local74 = this.method2794(local29 - 2)[1];
				local78 = local60[1];
				local82 = local65[1];
				local93 = this.method2794(local29 + 1)[1];
				@Pc(111) int local111 = (local27 - local60[0] << 12) / (local65[0] - local60[0]);
				@Pc(117) int local117 = local111 * local111 >> 12;
				@Pc(127) int local127 = local93 + local78 - local82 - local74;
				@Pc(134) int local134 = local74 - local127 - local78;
				@Pc(139) int local139 = local82 - local74;
				@Pc(151) int local151 = (local127 * local111 >> 12) * local117 >> 12;
				@Pc(157) int local157 = local117 * local134 >> 12;
				@Pc(163) int local163 = local139 * local111 >> 12;
				@Pc(171) int local171 = local78 + local157 + local151 + local163;
				if (local171 <= -32768) {
					local171 = -32767;
				}
				if (local171 >= 32768) {
					local171 = 32767;
				}
				this.aShortArray39[local9] = (short) local171;
			}
		} else if (local9 == 1) {
			for (local9 = 0; local9 < 257; local9++) {
				local27 = local9 << 4;
				for (local29 = 1; local29 < this.anIntArrayArray8.length - 1 && this.anIntArrayArray8[local29][0] <= local27; local29++) {
				}
				local60 = this.anIntArrayArray8[local29 - 1];
				local65 = this.anIntArrayArray8[local29];
				local74 = (local27 - local60[0] << 12) / (local65[0] - local60[0]);
				local78 = 4096 - Static420.anIntArray408[local74 >> 5 & 0xFF] >> 1;
				local82 = 4096 - local78;
				local93 = local65[1] * local78 + local82 * local60[1] >> 12;
				if (local93 <= -32768) {
					local93 = -32767;
				}
				if (local93 >= 32768) {
					local93 = 32767;
				}
				this.aShortArray39[local9] = (short) local93;
			}
		} else {
			for (local9 = 0; local9 < 257; local9++) {
				local27 = local9 << 4;
				for (local29 = 1; this.anIntArrayArray8.length - 1 > local29 && local27 >= this.anIntArrayArray8[local29][0]; local29++) {
				}
				local60 = this.anIntArrayArray8[local29 - 1];
				local65 = this.anIntArrayArray8[local29];
				local74 = (local27 - local60[0] << 12) / (local65[0] - local60[0]);
				local78 = 4096 - local74;
				local82 = local65[1] * local74 + local78 * local60[1] >> 12;
				if (local82 <= -32768) {
					local82 = -32767;
				}
				if (local82 >= 32768) {
					local82 = 32767;
				}
				this.aShortArray39[local9] = (short) local82;
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(21) int[] local21 = this.method8731(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static53.anInt1787; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray39[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
	private void method2793() {
		@Pc(8) int[] local8 = this.anIntArrayArray8[0];
		@Pc(13) int[] local13 = this.anIntArrayArray8[1];
		@Pc(22) int[] local22 = this.anIntArrayArray8[this.anIntArrayArray8.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray8[this.anIntArrayArray8.length - 1];
		this.anIntArray127 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + local22[1] + -local31[1] };
		this.anIntArray128 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] - -local8[1] };
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(II)[I")
	private int[] method2794(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray128;
		} else if (arg0 >= this.anIntArrayArray8.length) {
			return this.anIntArray127;
		} else {
			return this.anIntArrayArray8[arg0];
		}
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
		if (this.anIntArrayArray8 == null) {
			this.anIntArrayArray8 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray8.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3361 == 2) {
			this.method2793();
		}
		Static621.method8513();
		this.method2790();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt3361 = arg1.method8246();
		this.anIntArrayArray8 = new int[arg1.method8246()][2];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray8.length; local32++) {
			this.anIntArrayArray8[local32][0] = arg1.method8220();
			this.anIntArrayArray8[local32][1] = arg1.method8220();
		}
	}
}
