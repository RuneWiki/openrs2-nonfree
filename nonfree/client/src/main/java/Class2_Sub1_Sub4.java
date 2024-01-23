import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!cb", name = "R", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "[S")
	private short[] aShortArray4 = new short[257];

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
	private int anInt614 = 0;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)[I")
	private int[] method542(@OriginalArg(0) int arg0) {
		if (arg0 >= 0) {
			return arg0 >= this.anIntArrayArray6.length ? this.anIntArray42 : this.anIntArrayArray6[arg0];
		} else {
			return this.anIntArray43;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt614 = arg0.method4261();
		this.anIntArrayArray6 = new int[arg0.method4261()][2];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArrayArray6.length; local23++) {
			this.anIntArrayArray6[local23][0] = arg0.method4242();
			this.anIntArrayArray6[local23][1] = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V")
	private void method546() {
		@Pc(4) int local4 = this.anInt614;
		@Pc(26) int local26;
		@Pc(24) int local24;
		@Pc(60) int[] local60;
		@Pc(53) int[] local53;
		@Pc(69) int local69;
		@Pc(77) int local77;
		@Pc(73) int local73;
		@Pc(86) int local86;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray6.length - 1 && this.anIntArrayArray6[local26][0] <= local24; local26++) {
				}
				local53 = this.anIntArrayArray6[local26];
				local60 = this.anIntArrayArray6[local26 - 1];
				local69 = this.method542(local26 - 2)[1];
				local73 = local53[1];
				local77 = local60[1];
				local86 = this.method542(local26 + 1)[1];
				@Pc(104) int local104 = (local24 - local60[0] << 12) / (local53[0] - local60[0]);
				@Pc(109) int local109 = local73 - local69;
				@Pc(119) int local119 = local77 + local86 - local69 - local73;
				@Pc(128) int local128 = local69 - local119 - local77;
				@Pc(134) int local134 = local104 * local109 >> 12;
				@Pc(140) int local140 = local104 * local104 >> 12;
				@Pc(150) int local150 = local140 * (local119 * local104 >> 12) >> 12;
				@Pc(156) int local156 = local128 * local140 >> 12;
				@Pc(164) int local164 = local77 + local134 + local156 + local150;
				if (local164 <= -32768) {
					local164 = -32767;
				}
				if (local164 >= 32768) {
					local164 = 32767;
				}
				this.aShortArray4[local4] = (short) local164;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray6.length - 1 && local24 >= this.anIntArrayArray6[local26][0]; local26++) {
				}
				local60 = this.anIntArrayArray6[local26 - 1];
				local53 = this.anIntArrayArray6[local26];
				local69 = (local24 - local60[0] << 12) / (local53[0] - local60[0]);
				local77 = 4096 - Static201.anIntArray347[local69 >> 5 & 0xFF] >> 1;
				local73 = 4096 - local77;
				local86 = local77 * local53[1] + local60[1] * local73 >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray4[local4] = (short) local86;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray6.length - 1 && local24 >= this.anIntArrayArray6[local26][0]; local26++) {
				}
				local60 = this.anIntArrayArray6[local26 - 1];
				local53 = this.anIntArrayArray6[local26];
				local69 = (local24 - local60[0] << 12) / (local53[0] - local60[0]);
				local77 = 4096 - local69;
				local73 = local69 * local53[1] + local60[1] * local77 >> 12;
				if (local73 <= -32768) {
					local73 = -32767;
				}
				if (local73 >= 32768) {
					local73 = 32767;
				}
				this.aShortArray4[local4] = (short) local73;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
		if (this.anIntArrayArray6 == null) {
			this.anIntArrayArray6 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray6.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt614 == 2) {
			this.method547();
		}
		Static216.method3645();
		this.method546();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(23) int[] local23 = this.method4946(arg0, 0);
			for (@Pc(25) int local25 = 0; local25 < Static114.anInt1359; local25++) {
				@Pc(38) int local38 = local23[local25] >> 4;
				if (local38 < 0) {
					local38 = 0;
				}
				if (local38 > 256) {
					local38 = 256;
				}
				local13[local25] = this.aShortArray4[local38];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V")
	private void method547() {
		@Pc(8) int[] local8 = this.anIntArrayArray6[0];
		@Pc(19) int[] local19 = this.anIntArrayArray6[1];
		@Pc(28) int[] local28 = this.anIntArrayArray6[this.anIntArrayArray6.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray6[this.anIntArrayArray6.length - 1];
		this.anIntArray43 = new int[] { local8[0] + local8[0] - local19[0], local8[1] + local8[1] - local19[1] };
		this.anIntArray42 = new int[] { local28[0] + local28[0] - local37[0], local28[1] - (local37[1] + -local28[1]) };
	}
}
