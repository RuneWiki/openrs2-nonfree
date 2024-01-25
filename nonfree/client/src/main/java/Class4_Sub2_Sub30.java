import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class4_Sub2_Sub30 extends Class4_Sub2 {

	@OriginalMember(owner = "client!sfa", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!sfa", name = "M", descriptor = "[I")
	private int[] anIntArray528;

	@OriginalMember(owner = "client!sfa", name = "S", descriptor = "[I")
	private int[] anIntArray529;

	@OriginalMember(owner = "client!sfa", name = "O", descriptor = "[S")
	private final short[] aShortArray128 = new short[257];

	@OriginalMember(owner = "client!sfa", name = "U", descriptor = "I")
	private int anInt9082 = 0;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)V")
	private void method6962() {
		@Pc(16) int[] local16 = this.anIntArrayArray52[0];
		@Pc(21) int[] local21 = this.anIntArrayArray52[1];
		@Pc(30) int[] local30 = this.anIntArrayArray52[this.anIntArrayArray52.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray52[this.anIntArrayArray52.length - 1];
		this.anIntArray528 = new int[] { local30[0] + local30[0] - local39[0], local30[1] - (-local30[1] - -local39[1]) };
		this.anIntArray529 = new int[] { local16[0] + local16[0] - local21[0], local16[1] - local21[1] - -local16[1] };
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
		if (this.anIntArrayArray52 == null) {
			this.anIntArrayArray52 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray52.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt9082 == 2) {
			this.method6962();
		}
		Static374.method5814();
		this.method6966();
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(II)[I")
	private int[] method6964(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray529;
		} else if (this.anIntArrayArray52.length <= arg0) {
			return this.anIntArray528;
		} else {
			return this.anIntArrayArray52[arg0];
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt9082 = arg0.method7004();
		this.anIntArrayArray52 = new int[arg0.method7004()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray52.length; local28++) {
			this.anIntArrayArray52[local28][0] = arg0.method7054();
			this.anIntArrayArray52[local28][1] = arg0.method7054();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(27) int[] local27 = this.method8208(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static417.anInt5248; local29++) {
				@Pc(37) int local37 = local27[local29] >> 4;
				if (local37 < 0) {
					local37 = 0;
				}
				if (local37 > 256) {
					local37 = 256;
				}
				local17[local29] = this.aShortArray128[local37];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V")
	private void method6966() {
		@Pc(13) int local13 = this.anInt9082;
		@Pc(33) int local33;
		@Pc(31) int local31;
		@Pc(64) int[] local64;
		@Pc(69) int[] local69;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(86) int local86;
		@Pc(95) int local95;
		if (local13 == 2) {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; local33 < this.anIntArrayArray52.length - 1 && local31 >= this.anIntArrayArray52[local33][0]; local33++) {
				}
				local64 = this.anIntArrayArray52[local33 - 1];
				local69 = this.anIntArrayArray52[local33];
				local78 = this.method6964(local33 - 2)[1];
				local82 = local64[1];
				local86 = local69[1];
				local95 = this.method6964(local33 + 1)[1];
				@Pc(112) int local112 = (local31 - local64[0] << 12) / (local69[0] - local64[0]);
				@Pc(118) int local118 = local112 * local112 >> 12;
				@Pc(129) int local129 = local95 + local82 - local78 - local86;
				@Pc(135) int local135 = local78 - local82 - local129;
				@Pc(140) int local140 = local86 - local78;
				@Pc(152) int local152 = local118 * (local129 * local112 >> 12) >> 12;
				@Pc(158) int local158 = local135 * local118 >> 12;
				@Pc(164) int local164 = local140 * local112 >> 12;
				@Pc(174) int local174 = local158 + local152 + local164 + local82;
				if (local174 <= -32768) {
					local174 = -32767;
				}
				if (local174 >= 32768) {
					local174 = 32767;
				}
				this.aShortArray128[local13] = (short) local174;
			}
		} else if (local13 == 1) {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; this.anIntArrayArray52.length - 1 > local33 && local31 >= this.anIntArrayArray52[local33][0]; local33++) {
				}
				local64 = this.anIntArrayArray52[local33 - 1];
				local69 = this.anIntArrayArray52[local33];
				local78 = (local31 - local64[0] << 12) / (local69[0] - local64[0]);
				local82 = 4096 - Static365.anIntArray392[local78 >> 5 & 0xFF] >> 1;
				local86 = 4096 - local82;
				local95 = local86 * local64[1] + local69[1] * local82 >> 12;
				if (local95 <= -32768) {
					local95 = -32767;
				}
				if (local95 >= 32768) {
					local95 = 32767;
				}
				this.aShortArray128[local13] = (short) local95;
			}
		} else {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; this.anIntArrayArray52.length - 1 > local33 && this.anIntArrayArray52[local33][0] <= local31; local33++) {
				}
				local64 = this.anIntArrayArray52[local33 - 1];
				local69 = this.anIntArrayArray52[local33];
				local78 = (local31 - local64[0] << 12) / (local69[0] - local64[0]);
				local82 = 4096 - local78;
				local86 = local64[1] * local82 + local78 * local69[1] >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray128[local13] = (short) local86;
			}
		}
	}
}
