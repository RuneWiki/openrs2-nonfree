import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class4_Sub4_Sub2 extends Class4_Sub4 {

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
	private int anInt540;

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
	private int anInt544;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
	private int anInt551;

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
	private int anInt536 = 8;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
	private int anInt543 = 0;

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
	private int anInt541 = 81;

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
	private int anInt548 = 4;

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
	private int anInt538 = 1024;

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
	private int anInt535 = 1024;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
	private int anInt547 = 204;

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
	private int anInt539 = 409;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = Static450.anIntArray619[arg0] + this.anInt543; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (local25 < this.anInt536 && local32 >= this.anIntArray109[local25]) {
				local25++;
			}
			@Pc(63) int local63 = local25 - 1;
			@Pc(74) boolean local74 = (local25 & 0x1) == 0;
			@Pc(79) int local79 = this.anIntArray109[local25];
			@Pc(86) int local86 = this.anIntArray109[local25 - 1];
			if (local32 > local86 + this.anInt540 && local32 < local79 - this.anInt540) {
				for (@Pc(101) int local101 = 0; local101 < Static560.anInt9394; local101++) {
					@Pc(105) int local105 = 0;
					@Pc(114) int local114 = local74 ? this.anInt538 : -this.anInt538;
					@Pc(125) int local125;
					for (local125 = (this.anInt551 * local114 >> 12) + Static80.anIntArray212[local101]; local125 < 0; local125 += 4096) {
					}
					while (local125 > 4096) {
						local125 -= 4096;
					}
					while (local105 < this.anInt548 && local125 >= this.anIntArrayArray17[local63][local105]) {
						local105++;
					}
					@Pc(155) int local155 = local105 - 1;
					@Pc(162) int local162 = this.anIntArrayArray17[local63][local105];
					@Pc(169) int local169 = this.anIntArrayArray17[local63][local155];
					if (local169 + this.anInt540 < local125 && local125 < local162 - this.anInt540) {
						local13[local101] = this.anIntArrayArray16[local63][local155];
					} else {
						local13[local101] = 0;
					}
				}
			} else {
				Static602.method1584(local13, 0, Static560.anInt9394, 0);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
	private void method520() {
		@Pc(12) Random local12 = new Random((long) this.anInt536);
		this.anInt544 = 4096 / this.anInt536;
		this.anInt551 = 4096 / this.anInt548;
		this.anInt540 = this.anInt541 / 2;
		@Pc(35) int local35 = this.anInt551 / 2;
		this.anIntArray109 = new int[this.anInt536 + 1];
		@Pc(47) int local47 = this.anInt544 / 2;
		this.anIntArrayArray16 = new int[this.anInt536][this.anInt548];
		this.anIntArrayArray17 = new int[this.anInt536][this.anInt548 + 1];
		this.anIntArray109[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt536; local74++) {
			@Pc(81) int local81;
			@Pc(93) int local93;
			if (local74 > 0) {
				local81 = this.anInt544;
				local93 = (Static87.method2047(4096, local12) - 2048) * this.anInt547 >> 12;
				@Pc(101) int local101 = local81 + (local47 * local93 >> 12);
				this.anIntArray109[local74] = this.anIntArray109[local74 - 1] + local101;
			}
			this.anIntArrayArray17[local74][0] = 0;
			for (local81 = 0; local81 < this.anInt548; local81++) {
				if (local81 > 0) {
					local93 = this.anInt551;
					@Pc(147) int local147 = (Static87.method2047(4096, local12) - 2048) * this.anInt539 >> 12;
					local93 += local35 * local147 >> 12;
					this.anIntArrayArray17[local74][local81] = local93 + this.anIntArrayArray17[local74][local81 - 1];
				}
				this.anIntArrayArray16[local74][local81] = this.anInt535 <= 0 ? 4096 : 4096 - Static87.method2047(this.anInt535, local12);
			}
			this.anIntArrayArray17[local74][this.anInt548] = 4096;
		}
		this.anIntArray109[this.anInt536] = 4096;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt548 = arg1.method6015();
		} else if (arg0 == 1) {
			this.anInt536 = arg1.method6015();
		} else if (arg0 == 2) {
			this.anInt539 = arg1.method5982();
		} else if (arg0 == 3) {
			this.anInt547 = arg1.method5982();
		} else if (arg0 == 4) {
			this.anInt538 = arg1.method5982();
		} else if (arg0 == 5) {
			this.anInt543 = arg1.method5982();
		} else if (arg0 == 6) {
			this.anInt541 = arg1.method5982();
		} else if (arg0 == 7) {
			this.anInt535 = arg1.method5982();
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
		this.method520();
	}
}
