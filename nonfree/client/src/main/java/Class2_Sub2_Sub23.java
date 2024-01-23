import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class2_Sub2_Sub23 extends Class2_Sub2 {

	@OriginalMember(owner = "client!of", name = "eb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!of", name = "gb", descriptor = "[I")
	private int[] anIntArray557;

	@OriginalMember(owner = "client!of", name = "ob", descriptor = "[I")
	private int[] anIntArray558;

	@OriginalMember(owner = "client!of", name = "S", descriptor = "[S")
	private short[] aShortArray109 = new short[257];

	@OriginalMember(owner = "client!of", name = "mb", descriptor = "I")
	private int anInt3391 = 0;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub23() {
		super(1, true);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)[I")
	private int[] method2647(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray558;
		} else if (arg0 >= this.anIntArrayArray33.length) {
			return this.anIntArray557;
		} else {
			return this.anIntArrayArray33[arg0];
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt3391 = arg0.method2122();
		this.anIntArrayArray33 = new int[arg0.method2122()][2];
		for (@Pc(20) int local20 = 0; local20 < this.anIntArrayArray33.length; local20++) {
			this.anIntArrayArray33[local20][0] = arg0.method2095();
			this.anIntArrayArray33[local20][1] = arg0.method2095();
		}
	}

	@OriginalMember(owner = "client!of", name = "i", descriptor = "(I)V")
	private void method2649() {
		@Pc(8) int[] local8 = this.anIntArrayArray33[0];
		@Pc(17) int[] local17 = this.anIntArrayArray33[this.anIntArrayArray33.length - 2];
		@Pc(22) int[] local22 = this.anIntArrayArray33[1];
		@Pc(31) int[] local31 = this.anIntArrayArray33[this.anIntArrayArray33.length - 1];
		this.anIntArray557 = new int[] { local17[0] + local17[0] - local31[0], local17[1] - local31[1] - -local17[1] };
		this.anIntArray558 = new int[] { local8[0] + local8[0] - local22[0], local8[1] + -local22[1] + local8[1] };
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
		if (this.anIntArrayArray33 == null) {
			this.anIntArrayArray33 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray33.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3391 == 2) {
			this.method2649();
		}
		Static97.method1685();
		this.method2652();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(17) int[] local17 = this.method3955(0, arg0);
			for (@Pc(19) int local19 = 0; local19 < Static54.anInt953; local19++) {
				@Pc(27) int local27 = local17[local19] >> 4;
				if (local27 < 0) {
					local27 = 0;
				}
				if (local27 > 256) {
					local27 = 256;
				}
				local7[local19] = this.aShortArray109[local27];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!of", name = "j", descriptor = "(I)V")
	private void method2652() {
		@Pc(15) int local15 = this.anInt3391;
		@Pc(35) int local35;
		@Pc(33) int local33;
		@Pc(75) int[] local75;
		@Pc(68) int[] local68;
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(101) int local101;
		if (local15 == 2) {
			for (local15 = 0; local15 < 257; local15++) {
				local33 = local15 << 4;
				for (local35 = 1; this.anIntArrayArray33.length - 1 > local35 && this.anIntArrayArray33[local35][0] <= local33; local35++) {
				}
				local68 = this.anIntArrayArray33[local35];
				local75 = this.anIntArrayArray33[local35 - 1];
				local84 = this.method2647(local35 - 2)[1];
				local88 = local75[1];
				local92 = local68[1];
				local101 = this.method2647(local35 + 1)[1];
				@Pc(112) int local112 = local101 + local88 - local84 - local92;
				@Pc(129) int local129 = (local33 - local75[0] << 12) / (local68[0] - local75[0]);
				@Pc(136) int local136 = local84 - local88 - local112;
				@Pc(142) int local142 = local129 * local129 >> 12;
				@Pc(147) int local147 = local92 - local84;
				@Pc(159) int local159 = local142 * (local112 * local129 >> 12) >> 12;
				@Pc(165) int local165 = local142 * local136 >> 12;
				@Pc(171) int local171 = local147 * local129 >> 12;
				@Pc(179) int local179 = local88 + local171 + local165 + local159;
				if (local179 <= -32768) {
					local179 = -32767;
				}
				if (local179 >= 32768) {
					local179 = 32767;
				}
				this.aShortArray109[local15] = (short) local179;
			}
		} else if (local15 == 1) {
			for (local15 = 0; local15 < 257; local15++) {
				local33 = local15 << 4;
				for (local35 = 1; this.anIntArrayArray33.length - 1 > local35 && local33 >= this.anIntArrayArray33[local35][0]; local35++) {
				}
				local75 = this.anIntArrayArray33[local35 - 1];
				local68 = this.anIntArrayArray33[local35];
				local84 = (local33 - local75[0] << 12) / (local68[0] - local75[0]);
				local88 = 4096 - Static157.anIntArray603[local84 >> 5 & 0xFF] >> 1;
				local92 = 4096 - local88;
				local101 = local68[1] * local88 + local75[1] * local92 >> 12;
				if (local101 <= -32768) {
					local101 = -32767;
				}
				if (local101 >= 32768) {
					local101 = 32767;
				}
				this.aShortArray109[local15] = (short) local101;
			}
		} else {
			for (local15 = 0; local15 < 257; local15++) {
				local33 = local15 << 4;
				for (local35 = 1; this.anIntArrayArray33.length - 1 > local35 && this.anIntArrayArray33[local35][0] <= local33; local35++) {
				}
				local75 = this.anIntArrayArray33[local35 - 1];
				local68 = this.anIntArrayArray33[local35];
				local84 = (local33 - local75[0] << 12) / (local68[0] - local75[0]);
				local88 = 4096 - local84;
				local92 = local84 * local68[1] + local88 * local75[1] >> 12;
				if (local92 <= -32768) {
					local92 = -32767;
				}
				if (local92 >= 32768) {
					local92 = 32767;
				}
				this.aShortArray109[local15] = (short) local92;
			}
		}
	}
}
