import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fu", name = "R", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!fu", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!fu", name = "V", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!fu", name = "N", descriptor = "[S")
	private final short[] aShortArray28 = new short[257];

	@OriginalMember(owner = "client!fu", name = "X", descriptor = "I")
	private int anInt2473 = 0;

	static {
		new Class256("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt2473 = arg1.method3737();
		this.anIntArrayArray18 = new int[arg1.method3737()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray18.length; local20++) {
			this.anIntArrayArray18[local20][0] = arg1.method3711();
			this.anIntArrayArray18[local20][1] = arg1.method3711();
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(26) int[] local26 = this.method6037(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static131.anInt2581; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local16[local28] = this.aShortArray28[local36];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V")
	private void method1814() {
		@Pc(8) int local8 = this.anInt2473;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(63) int[] local63;
		@Pc(68) int[] local68;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray18.length - 1 && local26 >= this.anIntArrayArray18[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray18[local28 - 1];
				local68 = this.anIntArrayArray18[local28];
				local77 = this.method1816(local28 - 2)[1];
				local81 = local63[1];
				local85 = local68[1];
				local94 = this.method1816(local28 + 1)[1];
				@Pc(111) int local111 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(117) int local117 = local111 * local111 >> 12;
				@Pc(127) int local127 = local94 + local81 - local77 - local85;
				@Pc(135) int local135 = local77 - local127 - local81;
				@Pc(140) int local140 = local85 - local77;
				@Pc(152) int local152 = (local111 * local127 >> 12) * local117 >> 12;
				@Pc(158) int local158 = local117 * local135 >> 12;
				@Pc(164) int local164 = local140 * local111 >> 12;
				@Pc(173) int local173 = local164 + local158 + local152 + local81;
				if (local173 <= -32768) {
					local173 = -32767;
				}
				if (local173 >= 32768) {
					local173 = 32767;
				}
				this.aShortArray28[local8] = (short) local173;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray18.length - 1 > local28 && local26 >= this.anIntArrayArray18[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray18[local28 - 1];
				local68 = this.anIntArrayArray18[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - Static171.anIntArray220[local77 >> 5 & 0xFF] >> 1;
				local85 = 4096 - local81;
				local94 = local63[1] * local85 + local81 * local68[1] >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray28[local8] = (short) local94;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray18.length - 1 > local28 && local26 >= this.anIntArrayArray18[local28][0]; local28++) {
				}
				local63 = this.anIntArrayArray18[local28 - 1];
				local68 = this.anIntArrayArray18[local28];
				local77 = (local26 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - local77;
				local85 = local63[1] * local81 + local77 * local68[1] >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray28[local8] = (short) local85;
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(B)V")
	@Override
	public void method6034() {
		if (this.anIntArrayArray18 == null) {
			this.anIntArrayArray18 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray18.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2473 == 2) {
			this.method1818();
		}
		Static10.method210();
		this.method1814();
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(IB)[I")
	private int[] method1816(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray141;
		} else if (this.anIntArrayArray18.length <= arg0) {
			return this.anIntArray140;
		} else {
			return this.anIntArrayArray18[arg0];
		}
	}

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)V")
	private void method1818() {
		@Pc(8) int[] local8 = this.anIntArrayArray18[0];
		@Pc(13) int[] local13 = this.anIntArrayArray18[1];
		@Pc(28) int[] local28 = this.anIntArrayArray18[this.anIntArrayArray18.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray18[this.anIntArrayArray18.length - 1];
		this.anIntArray140 = new int[] { local28[0] + local28[0] - local37[0], local28[1] - (local37[1] - local28[1]) };
		this.anIntArray141 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - -local8[1] - local13[1] };
	}
}
