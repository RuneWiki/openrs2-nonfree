import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!im", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!im", name = "M", descriptor = "[I")
	private int[] anIntArray289;

	@OriginalMember(owner = "client!im", name = "P", descriptor = "I")
	private int anInt4552;

	@OriginalMember(owner = "client!im", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!im", name = "S", descriptor = "I")
	private int anInt4554;

	@OriginalMember(owner = "client!im", name = "bb", descriptor = "I")
	private int anInt4563;

	@OriginalMember(owner = "client!im", name = "L", descriptor = "I")
	private int anInt4549 = 8;

	@OriginalMember(owner = "client!im", name = "N", descriptor = "I")
	private int anInt4550 = 1024;

	@OriginalMember(owner = "client!im", name = "I", descriptor = "I")
	private int anInt4548 = 409;

	@OriginalMember(owner = "client!im", name = "V", descriptor = "I")
	private int anInt4557 = 1024;

	@OriginalMember(owner = "client!im", name = "X", descriptor = "I")
	private int anInt4559 = 81;

	@OriginalMember(owner = "client!im", name = "O", descriptor = "I")
	private int anInt4551 = 4;

	@OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
	private int anInt4553 = 204;

	@OriginalMember(owner = "client!im", name = "Y", descriptor = "I")
	private int anInt4560 = 0;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(B)V")
	private void method3847() {
		@Pc(12) Random local12 = new Random((long) this.anInt4549);
		this.anInt4563 = 4096 / this.anInt4549;
		this.anInt4552 = 4096 / this.anInt4551;
		this.anInt4554 = this.anInt4559 / 2;
		@Pc(35) int local35 = this.anInt4552 / 2;
		this.anIntArrayArray35 = new int[this.anInt4549][this.anInt4551];
		@Pc(47) int local47 = this.anInt4563 / 2;
		this.anIntArrayArray36 = new int[this.anInt4549][this.anInt4551 + 1];
		this.anIntArray289 = new int[this.anInt4549 + 1];
		this.anIntArray289[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt4549; local74++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local74 > 0) {
				local84 = this.anInt4563;
				local96 = (Static137.method2798(local12, 4096) - 2048) * this.anInt4553 >> 12;
				@Pc(104) int local104 = local84 + (local47 * local96 >> 12);
				this.anIntArray289[local74] = local104 + this.anIntArray289[local74 - 1];
			}
			this.anIntArrayArray36[local74][0] = 0;
			for (local84 = 0; local84 < this.anInt4551; local84++) {
				if (local84 > 0) {
					local96 = this.anInt4552;
					@Pc(147) int local147 = (Static137.method2798(local12, 4096) - 2048) * this.anInt4548 >> 12;
					local96 += local147 * local35 >> 12;
					this.anIntArrayArray36[local74][local84] = local96 + this.anIntArrayArray36[local74][local84 - 1];
				}
				this.anIntArrayArray35[local74][local84] = this.anInt4557 > 0 ? 4096 - Static137.method2798(local12, this.anInt4557) : 4096;
			}
			this.anIntArrayArray36[local74][this.anInt4551] = 4096;
		}
		this.anIntArray289[this.anInt4549] = 4096;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static324.anIntArray440[arg0] + this.anInt4560; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt4549 > local22 && this.anIntArray289[local22] <= local29) {
				local22++;
			}
			@Pc(59) int local59 = local22 - 1;
			@Pc(70) boolean local70 = (local22 & 0x1) == 0;
			@Pc(75) int local75 = this.anIntArray289[local22];
			@Pc(82) int local82 = this.anIntArray289[local22 - 1];
			if (local29 > local82 + this.anInt4554 && local75 - this.anInt4554 > local29) {
				for (@Pc(104) int local104 = 0; local104 < Static131.anInt2935; local104++) {
					@Pc(115) int local115 = local70 ? this.anInt4550 : -this.anInt4550;
					@Pc(117) int local117 = 0;
					@Pc(128) int local128;
					for (local128 = Static361.anIntArray460[local104] + (this.anInt4552 * local115 >> 12); local128 < 0; local128 += 4096) {
					}
					while (local128 > 4096) {
						local128 -= 4096;
					}
					while (local117 < this.anInt4551 && local128 >= this.anIntArrayArray36[local59][local117]) {
						local117++;
					}
					@Pc(164) int local164 = local117 - 1;
					@Pc(171) int local171 = this.anIntArrayArray36[local59][local164];
					@Pc(178) int local178 = this.anIntArrayArray36[local59][local117];
					if (local128 > this.anInt4554 + local171 && local128 < local178 - this.anInt4554) {
						local16[local104] = this.anIntArrayArray35[local59][local164];
					} else {
						local16[local104] = 0;
					}
				}
			} else {
				Static602.method4663(local16, 0, Static131.anInt2935, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
		this.method3847();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4551 = arg1.method6538();
		} else if (arg0 == 1) {
			this.anInt4549 = arg1.method6538();
		} else if (arg0 == 2) {
			this.anInt4548 = arg1.method6535();
		} else if (arg0 == 3) {
			this.anInt4553 = arg1.method6535();
		} else if (arg0 == 4) {
			this.anInt4550 = arg1.method6535();
		} else if (arg0 == 5) {
			this.anInt4560 = arg1.method6535();
		} else if (arg0 == 6) {
			this.anInt4559 = arg1.method6535();
		} else if (arg0 == 7) {
			this.anInt4557 = arg1.method6535();
		}
	}
}
