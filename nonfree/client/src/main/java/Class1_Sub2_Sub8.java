import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!fg", name = "U", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "[S")
	private short[] aShortArray15 = new short[257];

	@OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
	private int anInt1406 = 0;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
		if (this.anIntArrayArray3 == null) {
			this.anIntArrayArray3 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray3.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1406 == 2) {
			this.method1180();
		}
		Static44.method777();
		this.method1179();
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(B)V")
	private void method1179() {
		@Pc(16) int local16 = this.anInt1406;
		@Pc(37) int local37;
		@Pc(35) int local35;
		@Pc(73) int[] local73;
		@Pc(66) int[] local66;
		@Pc(82) int local82;
		@Pc(86) int local86;
		@Pc(90) int local90;
		@Pc(99) int local99;
		if (local16 == 2) {
			for (local16 = 0; local16 < 257; local16++) {
				local35 = local16 << 4;
				for (local37 = 1; local37 < this.anIntArrayArray3.length - 1 && local35 >= this.anIntArrayArray3[local37][0]; local37++) {
				}
				local66 = this.anIntArrayArray3[local37];
				local73 = this.anIntArrayArray3[local37 - 1];
				local82 = this.method1185(local37 - 2)[1];
				local86 = local73[1];
				local90 = local66[1];
				local99 = this.method1185(local37 + 1)[1];
				@Pc(116) int local116 = (local35 - local73[0] << 12) / (local66[0] - local73[0]);
				@Pc(122) int local122 = local116 * local116 >> 12;
				@Pc(132) int local132 = local99 + local86 - local82 - local90;
				@Pc(139) int local139 = local82 - local86 - local132;
				@Pc(144) int local144 = local90 - local82;
				@Pc(156) int local156 = (local132 * local116 >> 12) * local122 >> 12;
				@Pc(162) int local162 = local116 * local144 >> 12;
				@Pc(168) int local168 = local122 * local139 >> 12;
				@Pc(176) int local176 = local86 + local162 + local168 + local156;
				if (local176 <= -32768) {
					local176 = -32767;
				}
				if (local176 >= 32768) {
					local176 = 32767;
				}
				this.aShortArray15[local16] = (short) local176;
			}
		} else if (local16 == 1) {
			for (local16 = 0; local16 < 257; local16++) {
				local35 = local16 << 4;
				for (local37 = 1; this.anIntArrayArray3.length - 1 > local37 && local35 >= this.anIntArrayArray3[local37][0]; local37++) {
				}
				local73 = this.anIntArrayArray3[local37 - 1];
				local66 = this.anIntArrayArray3[local37];
				local82 = (local35 - local73[0] << 12) / (local66[0] - local73[0]);
				local86 = 4096 - Static36.anIntArray54[local82 >> 5 & 0xFF] >> 1;
				local90 = 4096 - local86;
				local99 = local86 * local66[1] + local90 * local73[1] >> 12;
				if (local99 <= -32768) {
					local99 = -32767;
				}
				if (local99 >= 32768) {
					local99 = 32767;
				}
				this.aShortArray15[local16] = (short) local99;
			}
		} else {
			for (local16 = 0; local16 < 257; local16++) {
				local35 = local16 << 4;
				for (local37 = 1; local37 < this.anIntArrayArray3.length - 1 && this.anIntArrayArray3[local37][0] <= local35; local37++) {
				}
				local73 = this.anIntArrayArray3[local37 - 1];
				local66 = this.anIntArrayArray3[local37];
				local82 = (local35 - local73[0] << 12) / (local66[0] - local73[0]);
				local86 = 4096 - local82;
				local90 = local82 * local66[1] + local73[1] * local86 >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray15[local16] = (short) local90;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(B)V")
	private void method1180() {
		@Pc(8) int[] local8 = this.anIntArrayArray3[1];
		@Pc(21) int[] local21 = this.anIntArrayArray3[0];
		@Pc(30) int[] local30 = this.anIntArrayArray3[this.anIntArrayArray3.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray3[this.anIntArrayArray3.length - 1];
		this.anIntArray111 = new int[] { local21[0] + local21[0] - local8[0], local21[1] + -local8[1] + local21[1] };
		this.anIntArray112 = new int[] { local30[0] + local30[0] - local39[0], local30[1] + -local39[1] + local30[1] };
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt1406 = arg0.method2595();
		this.anIntArrayArray3 = new int[arg0.method2595()][2];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArrayArray3.length; local25++) {
			this.anIntArrayArray3[local25][0] = arg0.method2593();
			this.anIntArrayArray3[local25][1] = arg0.method2593();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(29) int[] local29 = this.method4570(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static299.anInt5670; local31++) {
				@Pc(40) int local40 = local29[local31] >> 4;
				if (local40 < 0) {
					local40 = 0;
				}
				if (local40 > 256) {
					local40 = 256;
				}
				local18[local31] = this.aShortArray15[local40];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)[I")
	private int[] method1185(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray111;
		} else if (arg0 >= this.anIntArrayArray3.length) {
			return this.anIntArray112;
		} else {
			return this.anIntArrayArray3[arg0];
		}
	}
}
