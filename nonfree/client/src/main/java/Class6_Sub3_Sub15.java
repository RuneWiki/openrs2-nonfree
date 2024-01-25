import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class6_Sub3_Sub15 extends Class6_Sub3 {

	@OriginalMember(owner = "client!iv", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!iv", name = "O", descriptor = "[I")
	private int[] anIntArray412;

	@OriginalMember(owner = "client!iv", name = "Q", descriptor = "[I")
	private int[] anIntArray413;

	@OriginalMember(owner = "client!iv", name = "B", descriptor = "I")
	private int anInt3791 = 0;

	@OriginalMember(owner = "client!iv", name = "S", descriptor = "[S")
	private final short[] aShortArray76 = new short[257];

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(21) int[] local21 = this.method7824(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static447.anInt8568; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray76[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt3791 = arg1.method6041();
		this.anIntArrayArray49 = new int[arg1.method6041()][2];
		for (@Pc(32) int local32 = 0; local32 < this.anIntArrayArray49.length; local32++) {
			this.anIntArrayArray49[local32][0] = arg1.method6006();
			this.anIntArrayArray49[local32][1] = arg1.method6006();
		}
	}

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(I)V")
	private void method3260() {
		@Pc(8) int[] local8 = this.anIntArrayArray49[0];
		@Pc(13) int[] local13 = this.anIntArrayArray49[1];
		@Pc(30) int[] local30 = this.anIntArrayArray49[this.anIntArrayArray49.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray49[this.anIntArrayArray49.length - 1];
		this.anIntArray412 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - local13[1] - -local8[1] };
		this.anIntArray413 = new int[] { local30[0] + local30[0] - local39[0], local30[1] + -local39[1] + local30[1] };
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
		if (this.anIntArrayArray49 == null) {
			this.anIntArrayArray49 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray49.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3791 == 2) {
			this.method3260();
		}
		Static369.method5426();
		this.method3264();
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(II)[I")
	private int[] method3263(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray412;
		} else if (this.anIntArrayArray49.length <= arg0) {
			return this.anIntArray413;
		} else {
			return this.anIntArrayArray49[arg0];
		}
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)V")
	private void method3264() {
		@Pc(16) int local16 = this.anInt3791;
		@Pc(38) int local38;
		@Pc(36) int local36;
		@Pc(73) int[] local73;
		@Pc(78) int[] local78;
		@Pc(87) int local87;
		@Pc(91) int local91;
		@Pc(95) int local95;
		@Pc(104) int local104;
		if (local16 == 2) {
			for (local16 = 0; local16 < 257; local16++) {
				local36 = local16 << 4;
				for (local38 = 1; local38 < this.anIntArrayArray49.length - 1 && this.anIntArrayArray49[local38][0] <= local36; local38++) {
				}
				local73 = this.anIntArrayArray49[local38 - 1];
				local78 = this.anIntArrayArray49[local38];
				local87 = this.method3263(local38 - 2)[1];
				local91 = local73[1];
				local95 = local78[1];
				local104 = this.method3263(local38 + 1)[1];
				@Pc(121) int local121 = (local36 - local73[0] << 12) / (local78[0] - local73[0]);
				@Pc(127) int local127 = local121 * local121 >> 12;
				@Pc(137) int local137 = local104 + local91 - local87 - local95;
				@Pc(145) int local145 = local87 - local91 - local137;
				@Pc(149) int local149 = local95 - local87;
				@Pc(161) int local161 = (local121 * local137 >> 12) * local127 >> 12;
				@Pc(167) int local167 = local145 * local127 >> 12;
				@Pc(173) int local173 = local121 * local149 >> 12;
				@Pc(182) int local182 = local161 + local167 + local173 + local91;
				if (local182 <= -32768) {
					local182 = -32767;
				}
				if (local182 >= 32768) {
					local182 = 32767;
				}
				this.aShortArray76[local16] = (short) local182;
			}
		} else if (local16 == 1) {
			for (local16 = 0; local16 < 257; local16++) {
				local36 = local16 << 4;
				for (local38 = 1; this.anIntArrayArray49.length - 1 > local38 && local36 >= this.anIntArrayArray49[local38][0]; local38++) {
				}
				local73 = this.anIntArrayArray49[local38 - 1];
				local78 = this.anIntArrayArray49[local38];
				local87 = (local36 - local73[0] << 12) / (local78[0] - local73[0]);
				local91 = 4096 - Static205.anIntArray395[local87 >> 5 & 0xFF] >> 1;
				local95 = 4096 - local91;
				local104 = local91 * local78[1] + local95 * local73[1] >> 12;
				if (local104 <= -32768) {
					local104 = -32767;
				}
				if (local104 >= 32768) {
					local104 = 32767;
				}
				this.aShortArray76[local16] = (short) local104;
			}
		} else {
			for (local16 = 0; local16 < 257; local16++) {
				local36 = local16 << 4;
				for (local38 = 1; local38 < this.anIntArrayArray49.length - 1 && this.anIntArrayArray49[local38][0] <= local36; local38++) {
				}
				local73 = this.anIntArrayArray49[local38 - 1];
				local78 = this.anIntArrayArray49[local38];
				local87 = (local36 - local73[0] << 12) / (local78[0] - local73[0]);
				local91 = 4096 - local87;
				local95 = local78[1] * local87 + local91 * local73[1] >> 12;
				if (local95 <= -32768) {
					local95 = -32767;
				}
				if (local95 >= 32768) {
					local95 = 32767;
				}
				this.aShortArray76[local16] = (short) local95;
			}
		}
	}
}
