import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class6_Sub8_Sub20 extends Class6_Sub8 {

	@OriginalMember(owner = "client!la", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!la", name = "N", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!la", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "I")
	private int anInt5697;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "I")
	private int anInt5700;

	@OriginalMember(owner = "client!la", name = "J", descriptor = "I")
	private int anInt5702;

	@OriginalMember(owner = "client!la", name = "K", descriptor = "I")
	private int anInt5694 = 8;

	@OriginalMember(owner = "client!la", name = "S", descriptor = "I")
	private int anInt5701 = 409;

	@OriginalMember(owner = "client!la", name = "M", descriptor = "I")
	private int anInt5703 = 1024;

	@OriginalMember(owner = "client!la", name = "O", descriptor = "I")
	private int anInt5705 = 0;

	@OriginalMember(owner = "client!la", name = "U", descriptor = "I")
	private int anInt5693 = 4;

	@OriginalMember(owner = "client!la", name = "R", descriptor = "I")
	private int anInt5706 = 81;

	@OriginalMember(owner = "client!la", name = "C", descriptor = "I")
	private int anInt5695 = 1024;

	@OriginalMember(owner = "client!la", name = "G", descriptor = "I")
	private int anInt5708 = 204;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(B)V")
	private void method5159() {
		@Pc(12) Random local12 = new Random((long) this.anInt5694);
		this.anInt5700 = 4096 / this.anInt5694;
		this.anInt5697 = 4096 / this.anInt5693;
		this.anInt5702 = this.anInt5706 / 2;
		@Pc(35) int local35 = this.anInt5697 / 2;
		this.anIntArray332 = new int[this.anInt5694 + 1];
		this.anIntArrayArray33 = new int[this.anInt5694][this.anInt5693];
		this.anIntArrayArray32 = new int[this.anInt5694][this.anInt5693 + 1];
		@Pc(63) int local63 = this.anInt5700 / 2;
		this.anIntArray332[0] = 0;
		for (@Pc(75) int local75 = 0; local75 < this.anInt5694; local75++) {
			@Pc(87) int local87;
			@Pc(99) int local99;
			if (local75 > 0) {
				local87 = this.anInt5700;
				local99 = (Static196.method3692(local12, 4096) - 2048) * this.anInt5708 >> 12;
				@Pc(107) int local107 = local87 + (local99 * local63 >> 12);
				this.anIntArray332[local75] = local107 + this.anIntArray332[local75 - 1];
			}
			this.anIntArrayArray32[local75][0] = 0;
			for (local87 = 0; local87 < this.anInt5693; local87++) {
				if (local87 > 0) {
					local99 = this.anInt5697;
					@Pc(149) int local149 = (Static196.method3692(local12, 4096) - 2048) * this.anInt5701 >> 12;
					local99 += local35 * local149 >> 12;
					this.anIntArrayArray32[local75][local87] = local99 + this.anIntArrayArray32[local75][local87 - 1];
				}
				this.anIntArrayArray33[local75][local87] = this.anInt5703 <= 0 ? 4096 : 4096 - Static196.method3692(local12, this.anInt5703);
			}
			this.anIntArrayArray32[local75][this.anInt5693] = 4096;
		}
		this.anIntArray332[this.anInt5694] = 4096;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(25) int local25 = 0;
			@Pc(33) int local33;
			for (local33 = Static424.anIntArray466[arg0] + this.anInt5705; local33 < 0; local33 += 4096) {
			}
			while (local33 > 4096) {
				local33 -= 4096;
			}
			while (this.anInt5694 > local25 && this.anIntArray332[local25] <= local33) {
				local25++;
			}
			@Pc(75) int local75 = local25 - 1;
			@Pc(86) boolean local86 = (local25 & 0x1) == 0;
			@Pc(91) int local91 = this.anIntArray332[local25];
			@Pc(98) int local98 = this.anIntArray332[local25 - 1];
			if (local33 > local98 + this.anInt5702 && local91 - this.anInt5702 > local33) {
				for (@Pc(127) int local127 = 0; local127 < Static83.anInt1268; local127++) {
					@Pc(131) int local131 = 0;
					@Pc(141) int local141 = local86 ? this.anInt5695 : -this.anInt5695;
					@Pc(153) int local153;
					for (local153 = Static2.anIntArray1[local127] + (local141 * this.anInt5697 >> 12); local153 < 0; local153 += 4096) {
					}
					while (local153 > 4096) {
						local153 -= 4096;
					}
					while (this.anInt5693 > local131 && this.anIntArrayArray32[local75][local131] <= local153) {
						local131++;
					}
					@Pc(193) int local193 = local131 - 1;
					@Pc(200) int local200 = this.anIntArrayArray32[local75][local131];
					@Pc(207) int local207 = this.anIntArrayArray32[local75][local193];
					if (local153 > this.anInt5702 + local207 && local153 < local200 - this.anInt5702) {
						local11[local127] = this.anIntArrayArray33[local75][local193];
					} else {
						local11[local127] = 0;
					}
				}
			} else {
				Static695.method5644(local11, 0, Static83.anInt1268, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5693 = arg1.method3030();
		} else if (arg0 == 1) {
			this.anInt5694 = arg1.method3030();
		} else if (arg0 == 2) {
			this.anInt5701 = arg1.method3018();
		} else if (arg0 == 3) {
			this.anInt5708 = arg1.method3018();
		} else if (arg0 == 4) {
			this.anInt5695 = arg1.method3018();
		} else if (arg0 == 5) {
			this.anInt5705 = arg1.method3018();
		} else if (arg0 == 6) {
			this.anInt5706 = arg1.method3018();
		} else if (arg0 == 7) {
			this.anInt5703 = arg1.method3018();
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
		this.method5159();
	}
}
