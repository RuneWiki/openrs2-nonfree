import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!um", name = "R", descriptor = "[I")
	private int[] anIntArray584;

	@OriginalMember(owner = "client!um", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!um", name = "W", descriptor = "[I")
	private int[] anIntArray586;

	@OriginalMember(owner = "client!um", name = "V", descriptor = "[S")
	private short[] aShortArray90 = new short[257];

	@OriginalMember(owner = "client!um", name = "fb", descriptor = "I")
	private int anInt5897 = 0;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "(I)V")
	private void method4574() {
		@Pc(4) int local4 = this.anInt5897;
		@Pc(26) int local26;
		@Pc(24) int local24;
		@Pc(55) int[] local55;
		@Pc(60) int[] local60;
		@Pc(69) int local69;
		@Pc(77) int local77;
		@Pc(73) int local73;
		@Pc(91) int local91;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray43.length - 1 && this.anIntArrayArray43[local26][0] <= local24; local26++) {
				}
				local55 = this.anIntArrayArray43[local26 - 1];
				local60 = this.anIntArrayArray43[local26];
				local69 = this.method4578(local26 - 2)[1];
				local73 = local60[1];
				local77 = local55[1];
				@Pc(82) int local82 = local73 - local69;
				local91 = this.method4578(local26 + 1)[1];
				@Pc(100) int local100 = local91 + local77 - local73 - local69;
				@Pc(107) int local107 = local69 - local77 - local100;
				@Pc(125) int local125 = (local24 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(133) int local133 = local82 * local125 >> 12;
				@Pc(139) int local139 = local125 * local125 >> 12;
				@Pc(149) int local149 = local139 * (local125 * local100 >> 12) >> 12;
				@Pc(155) int local155 = local139 * local107 >> 12;
				@Pc(164) int local164 = local77 + local155 + local149 + local133;
				if (local164 <= -32768) {
					local164 = -32767;
				}
				if (local164 >= 32768) {
					local164 = 32767;
				}
				this.aShortArray90[local4] = (short) local164;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; this.anIntArrayArray43.length - 1 > local26 && local24 >= this.anIntArrayArray43[local26][0]; local26++) {
				}
				local60 = this.anIntArrayArray43[local26];
				local55 = this.anIntArrayArray43[local26 - 1];
				local69 = (local24 - local55[0] << 12) / (local60[0] - local55[0]);
				local77 = 4096 - Static74.anIntArray191[local69 >> 5 & 0xFF] >> 1;
				local73 = 4096 - local77;
				local91 = local73 * local55[1] + local60[1] * local77 >> 12;
				if (local91 <= -32768) {
					local91 = -32767;
				}
				if (local91 >= 32768) {
					local91 = 32767;
				}
				this.aShortArray90[local4] = (short) local91;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local24 = local4 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray43.length - 1 && local24 >= this.anIntArrayArray43[local26][0]; local26++) {
				}
				local55 = this.anIntArrayArray43[local26 - 1];
				local60 = this.anIntArrayArray43[local26];
				local69 = (local24 - local55[0] << 12) / (local60[0] - local55[0]);
				local77 = 4096 - local69;
				local73 = local77 * local55[1] + local69 * local60[1] >> 12;
				if (local73 <= -32768) {
					local73 = -32767;
				}
				if (local73 >= 32768) {
					local73 = 32767;
				}
				this.aShortArray90[local4] = (short) local73;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
		if (this.anIntArrayArray43 == null) {
			this.anIntArrayArray43 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray43.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5897 == 2) {
			this.method4576();
		}
		Static39.method882();
		this.method4574();
	}

	@OriginalMember(owner = "client!um", name = "i", descriptor = "(I)V")
	private void method4576() {
		@Pc(8) int[] local8 = this.anIntArrayArray43[0];
		@Pc(17) int[] local17 = this.anIntArrayArray43[this.anIntArrayArray43.length - 2];
		@Pc(29) int[] local29 = this.anIntArrayArray43[1];
		@Pc(38) int[] local38 = this.anIntArrayArray43[this.anIntArrayArray43.length - 1];
		this.anIntArray586 = new int[] { local8[0] + local8[0] - local29[0], -local29[1] + local8[1] + local8[1] };
		this.anIntArray584 = new int[] { local17[0] + local17[0] - local38[0], local17[1] + -local38[1] + local17[1] };
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(27) int[] local27 = this.method4746(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static75.anInt1848; local29++) {
				@Pc(42) int local42 = local27[local29] >> 4;
				if (local42 < 0) {
					local42 = 0;
				}
				if (local42 > 256) {
					local42 = 256;
				}
				local12[local29] = this.aShortArray90[local42];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt5897 = arg0.method2655();
		this.anIntArrayArray43 = new int[arg0.method2655()][2];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray43.length; local26++) {
			this.anIntArrayArray43[local26][0] = arg0.method2652();
			this.anIntArrayArray43[local26][1] = arg0.method2652();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)[I")
	private int[] method4578(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray586;
		} else if (arg0 >= this.anIntArrayArray43.length) {
			return this.anIntArray584;
		} else {
			return this.anIntArrayArray43[arg0];
		}
	}
}
