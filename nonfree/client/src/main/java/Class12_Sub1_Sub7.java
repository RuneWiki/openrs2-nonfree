import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class12_Sub1_Sub7 extends Class12_Sub1 {

	@OriginalMember(owner = "client!eca", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!eca", name = "T", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!eca", name = "W", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!eca", name = "J", descriptor = "I")
	private int anInt2515 = 0;

	@OriginalMember(owner = "client!eca", name = "F", descriptor = "[S")
	private final short[] aShortArray38 = new short[257];

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "(I)V")
	private void method2266() {
		@Pc(12) int local12 = this.anInt2515;
		@Pc(32) int local32;
		@Pc(30) int local30;
		@Pc(63) int[] local63;
		@Pc(68) int[] local68;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (local12 == 2) {
			for (local12 = 0; local12 < 257; local12++) {
				local30 = local12 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray25.length - 1 && this.anIntArrayArray25[local32][0] <= local30; local32++) {
				}
				local63 = this.anIntArrayArray25[local32 - 1];
				local68 = this.anIntArrayArray25[local32];
				local77 = this.method2272(local32 - 2)[1];
				local81 = local63[1];
				local85 = local68[1];
				local94 = this.method2272(local32 + 1)[1];
				@Pc(112) int local112 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				@Pc(118) int local118 = local112 * local112 >> 12;
				@Pc(128) int local128 = local81 + local94 - local77 - local85;
				@Pc(135) int local135 = local77 - local81 - local128;
				@Pc(140) int local140 = local85 - local77;
				@Pc(152) int local152 = (local128 * local112 >> 12) * local118 >> 12;
				@Pc(158) int local158 = local135 * local118 >> 12;
				@Pc(164) int local164 = local140 * local112 >> 12;
				@Pc(172) int local172 = local81 + local164 + local152 + local158;
				if (local172 <= -32768) {
					local172 = -32767;
				}
				if (local172 >= 32768) {
					local172 = 32767;
				}
				this.aShortArray38[local12] = (short) local172;
			}
		} else if (local12 == 1) {
			for (local12 = 0; local12 < 257; local12++) {
				local30 = local12 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray25.length - 1 && this.anIntArrayArray25[local32][0] <= local30; local32++) {
				}
				local63 = this.anIntArrayArray25[local32 - 1];
				local68 = this.anIntArrayArray25[local32];
				local77 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - Static95.anIntArray196[local77 >> 5 & 0xFF] >> 1;
				local85 = 4096 - local81;
				local94 = local63[1] * local85 + local68[1] * local81 >> 12;
				if (local94 <= -32768) {
					local94 = -32767;
				}
				if (local94 >= 32768) {
					local94 = 32767;
				}
				this.aShortArray38[local12] = (short) local94;
			}
		} else {
			for (local12 = 0; local12 < 257; local12++) {
				local30 = local12 << 4;
				for (local32 = 1; local32 < this.anIntArrayArray25.length - 1 && local30 >= this.anIntArrayArray25[local32][0]; local32++) {
				}
				local63 = this.anIntArrayArray25[local32 - 1];
				local68 = this.anIntArrayArray25[local32];
				local77 = (local30 - local63[0] << 12) / (local68[0] - local63[0]);
				local81 = 4096 - local77;
				local85 = local63[1] * local81 + local77 * local68[1] >> 12;
				if (local85 <= -32768) {
					local85 = -32767;
				}
				if (local85 >= 32768) {
					local85 = 32767;
				}
				this.aShortArray38[local12] = (short) local85;
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "(I)V")
	private void method2269() {
		@Pc(8) int[] local8 = this.anIntArrayArray25[0];
		@Pc(13) int[] local13 = this.anIntArrayArray25[1];
		@Pc(22) int[] local22 = this.anIntArrayArray25[this.anIntArrayArray25.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray25[this.anIntArrayArray25.length - 1];
		this.anIntArray214 = new int[] { local22[0] + local22[0] - local37[0], -local37[1] + local22[1] + local22[1] };
		this.anIntArray213 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (-local8[1] - -local13[1]) };
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
		if (this.anIntArrayArray25 == null) {
			this.anIntArrayArray25 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray25.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2515 == 2) {
			this.method2269();
		}
		Static431.method6596();
		this.method2266();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2515 = arg0.method5216();
		this.anIntArrayArray25 = new int[arg0.method5216()][2];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArrayArray25.length; local23++) {
			this.anIntArrayArray25[local23][0] = arg0.method5199();
			this.anIntArrayArray25[local23][1] = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)[I")
	private int[] method2272(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray213;
		} else if (arg0 >= this.anIntArrayArray25.length) {
			return this.anIntArray214;
		} else {
			return this.anIntArrayArray25[arg0];
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(28) int[] local28 = this.method7795(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static357.anInt6670; local30++) {
				@Pc(38) int local38 = local28[local30] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local11[local30] = this.aShortArray38[local38];
			}
		}
		return local11;
	}
}
