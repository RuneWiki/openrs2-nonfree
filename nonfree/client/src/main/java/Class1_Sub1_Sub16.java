import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!iga", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!iga", name = "H", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!iga", name = "Q", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!iga", name = "F", descriptor = "I")
	private int anInt4225 = 0;

	@OriginalMember(owner = "client!iga", name = "U", descriptor = "[S")
	private final short[] aShortArray60 = new short[257];

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		super(1, true);
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt4225 = arg1.method4393();
		this.anIntArrayArray27 = new int[arg1.method4393()][2];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArrayArray27.length; local22++) {
			this.anIntArrayArray27[local22][0] = arg1.method4426();
			this.anIntArrayArray27[local22][1] = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "(B)V")
	private void method3613() {
		@Pc(4) int local4 = this.anInt4225;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(55) int[] local55;
		@Pc(60) int[] local60;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(86) int local86;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray27.length - 1 && local22 >= this.anIntArrayArray27[local24][0]; local24++) {
				}
				local55 = this.anIntArrayArray27[local24 - 1];
				local60 = this.anIntArrayArray27[local24];
				local69 = this.method3618(local24 - 2)[1];
				local73 = local55[1];
				local77 = local60[1];
				local86 = this.method3618(local24 + 1)[1];
				@Pc(104) int local104 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(110) int local110 = local104 * local104 >> 12;
				@Pc(119) int local119 = local86 + local73 - local69 - local77;
				@Pc(127) int local127 = local69 - local119 - local73;
				@Pc(132) int local132 = local77 - local69;
				@Pc(144) int local144 = local110 * (local104 * local119 >> 12) >> 12;
				@Pc(150) int local150 = local110 * local127 >> 12;
				@Pc(156) int local156 = local104 * local132 >> 12;
				@Pc(164) int local164 = local156 + local150 + local144 + local73;
				if (local164 <= -32768) {
					local164 = -32767;
				}
				if (local164 >= 32768) {
					local164 = 32767;
				}
				this.aShortArray60[local4] = (short) local164;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray27.length - 1 && local22 >= this.anIntArrayArray27[local24][0]; local24++) {
				}
				local55 = this.anIntArrayArray27[local24 - 1];
				local60 = this.anIntArrayArray27[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - Static549.anIntArray610[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local77 * local55[1] + local73 * local60[1] >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray60[local4] = (short) local86;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; local24 < this.anIntArrayArray27.length - 1 && this.anIntArrayArray27[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray27[local24 - 1];
				local60 = this.anIntArrayArray27[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - local69;
				local77 = local73 * local55[1] + local69 * local60[1] >> 12;
				if (local77 <= -32768) {
					local77 = -32767;
				}
				if (local77 >= 32768) {
					local77 = 32767;
				}
				this.aShortArray60[local4] = (short) local77;
			}
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
		if (this.anIntArrayArray27 == null) {
			this.anIntArrayArray27 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray27.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4225 == 2) {
			this.method3617();
		}
		Static316.method4803();
		this.method3613();
	}

	@OriginalMember(owner = "client!iga", name = "e", descriptor = "(B)V")
	private void method3617() {
		@Pc(8) int[] local8 = this.anIntArrayArray27[0];
		@Pc(13) int[] local13 = this.anIntArrayArray27[1];
		@Pc(29) int[] local29 = this.anIntArrayArray27[this.anIntArrayArray27.length - 2];
		@Pc(38) int[] local38 = this.anIntArrayArray27[this.anIntArrayArray27.length - 1];
		this.anIntArray256 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
		this.anIntArray257 = new int[] { local29[0] + local29[0] - local38[0], local29[1] + -local38[1] + local29[1] };
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IB)[I")
	private int[] method3618(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray256;
		} else if (arg0 >= this.anIntArrayArray27.length) {
			return this.anIntArray257;
		} else {
			return this.anIntArrayArray27[arg0];
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(27) int[] local27 = this.method7882(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static87.anInt1964; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local11[local29] = this.aShortArray60[local37];
			}
		}
		return local11;
	}
}
