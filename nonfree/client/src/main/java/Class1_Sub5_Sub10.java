import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class1_Sub5_Sub10 extends Class1_Sub5 {

	@OriginalMember(owner = "client!kh", name = "S", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!kh", name = "X", descriptor = "[I")
	private int[] anIntArray305;

	@OriginalMember(owner = "client!kh", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!kh", name = "Z", descriptor = "[S")
	private final short[] aShortArray48 = new short[257];

	@OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
	private int anInt3116 = 0;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(Z)V")
	private void method2654() {
		@Pc(8) int[] local8 = this.anIntArrayArray27[0];
		@Pc(13) int[] local13 = this.anIntArrayArray27[1];
		@Pc(22) int[] local22 = this.anIntArrayArray27[this.anIntArrayArray27.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray27[this.anIntArrayArray27.length - 1];
		this.anIntArray305 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
		this.anIntArray304 = new int[] { local22[0] + local22[0] - local31[0], -local31[1] - (-local22[1] - local22[1]) };
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
		if (this.anIntArrayArray27 == null) {
			this.anIntArrayArray27 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray27.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3116 == 2) {
			this.method2654();
		}
		Static341.method5649();
		this.method2655();
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
	private void method2655() {
		@Pc(4) int local4 = this.anInt3116;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(59) int[] local59;
		@Pc(64) int[] local64;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray27.length - 1 && this.anIntArrayArray27[local24][0] <= local22; local24++) {
				}
				local59 = this.anIntArrayArray27[local24 - 1];
				local64 = this.anIntArrayArray27[local24];
				local73 = this.method2656(local24 - 2)[1];
				local77 = local59[1];
				local81 = local64[1];
				local90 = this.method2656(local24 + 1)[1];
				@Pc(108) int local108 = (local22 - local59[0] << 12) / (local64[0] - local59[0]);
				@Pc(114) int local114 = local108 * local108 >> 12;
				@Pc(125) int local125 = local90 + local77 - local73 - local81;
				@Pc(133) int local133 = local73 - local125 - local77;
				@Pc(138) int local138 = local81 - local73;
				@Pc(150) int local150 = local114 * (local108 * local125 >> 12) >> 12;
				@Pc(156) int local156 = local133 * local114 >> 12;
				@Pc(162) int local162 = local108 * local138 >> 12;
				@Pc(172) int local172 = local150 + local156 + local162 + local77;
				if (local172 <= -32768) {
					local172 = -32767;
				}
				if (local172 >= 32768) {
					local172 = 32767;
				}
				this.aShortArray48[local4] = (short) local172;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray27.length - 1 && this.anIntArrayArray27[local24][0] <= local22; local24++) {
				}
				local59 = this.anIntArrayArray27[local24 - 1];
				local64 = this.anIntArrayArray27[local24];
				local73 = (local22 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - Static13.anIntArray10[local73 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local77;
				local90 = local64[1] * local77 + local81 * local59[1] >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray48[local4] = (short) local90;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray27.length - 1 > local24 && this.anIntArrayArray27[local24][0] <= local22; local24++) {
				}
				local59 = this.anIntArrayArray27[local24 - 1];
				local64 = this.anIntArrayArray27[local24];
				local73 = (local22 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - local73;
				local81 = local77 * local59[1] + local73 * local64[1] >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray48[local4] = (short) local81;
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3116 = arg0.method5720();
		this.anIntArrayArray27 = new int[arg0.method5720()][2];
		for (@Pc(19) int local19 = 0; local19 < this.anIntArrayArray27.length; local19++) {
			this.anIntArrayArray27[local19][0] = arg0.method5715();
			this.anIntArrayArray27[local19][1] = arg0.method5715();
		}
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)[I")
	private int[] method2656(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray305;
		} else if (arg0 >= this.anIntArrayArray27.length) {
			return this.anIntArray304;
		} else {
			return this.anIntArrayArray27[arg0];
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(25) int[] local25 = this.method5802(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static75.anInt1566; local27++) {
				@Pc(35) int local35 = local25[local27] >> 4;
				if (local35 < 0) {
					local35 = 0;
				}
				if (local35 > 256) {
					local35 = 256;
				}
				local11[local27] = this.aShortArray48[local35];
			}
		}
		return local11;
	}
}
