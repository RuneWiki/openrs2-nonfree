import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class2_Sub3_Sub29 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sl", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!sl", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
	private int anInt9483;

	@OriginalMember(owner = "client!sl", name = "W", descriptor = "[I")
	private int[] anIntArray616;

	@OriginalMember(owner = "client!sl", name = "X", descriptor = "I")
	private int anInt9489;

	@OriginalMember(owner = "client!sl", name = "Z", descriptor = "I")
	private int anInt9491;

	@OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
	private int anInt9479 = 1024;

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
	private int anInt9480 = 1024;

	@OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
	private int anInt9485 = 0;

	@OriginalMember(owner = "client!sl", name = "Y", descriptor = "I")
	private int anInt9490 = 4;

	@OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
	private int anInt9486 = 81;

	@OriginalMember(owner = "client!sl", name = "bb", descriptor = "I")
	private int anInt9493 = 409;

	@OriginalMember(owner = "client!sl", name = "eb", descriptor = "I")
	private int anInt9494 = 204;

	@OriginalMember(owner = "client!sl", name = "ab", descriptor = "I")
	private int anInt9492 = 8;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V")
	private void method7888() {
		@Pc(12) Random local12 = new Random((long) this.anInt9492);
		this.anInt9489 = this.anInt9486 / 2;
		this.anInt9483 = 4096 / this.anInt9490;
		this.anInt9491 = 4096 / this.anInt9492;
		@Pc(35) int local35 = this.anInt9483 / 2;
		this.anIntArray616 = new int[this.anInt9492 + 1];
		@Pc(47) int local47 = this.anInt9491 / 2;
		this.anIntArrayArray54 = new int[this.anInt9492][this.anInt9490 + 1];
		this.anIntArrayArray53 = new int[this.anInt9492][this.anInt9490];
		this.anIntArray616[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt9492; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt9491;
				local98 = (Static42.method1597(4096, local12) - 2048) * this.anInt9494 >> 12;
				@Pc(106) int local106 = local86 + (local98 * local47 >> 12);
				this.anIntArray616[local76] = local106 + this.anIntArray616[local76 - 1];
			}
			this.anIntArrayArray54[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt9490; local86++) {
				if (local86 > 0) {
					local98 = this.anInt9483;
					@Pc(149) int local149 = (Static42.method1597(4096, local12) - 2048) * this.anInt9493 >> 12;
					local98 += local35 * local149 >> 12;
					this.anIntArrayArray54[local76][local86] = this.anIntArrayArray54[local76][local86 - 1] + local98;
				}
				this.anIntArrayArray53[local76][local86] = this.anInt9479 <= 0 ? 4096 : 4096 - Static42.method1597(this.anInt9479, local12);
			}
			this.anIntArrayArray54[local76][this.anInt9490] = 4096;
		}
		this.anIntArray616[this.anInt9492] = 4096;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9490 = arg0.method8383();
		} else if (arg1 == 1) {
			this.anInt9492 = arg0.method8383();
		} else if (arg1 == 2) {
			this.anInt9493 = arg0.method8326();
		} else if (arg1 == 3) {
			this.anInt9494 = arg0.method8326();
		} else if (arg1 == 4) {
			this.anInt9480 = arg0.method8326();
		} else if (arg1 == 5) {
			this.anInt9485 = arg0.method8326();
		} else if (arg1 == 6) {
			this.anInt9486 = arg0.method8326();
		} else if (arg1 == 7) {
			this.anInt9479 = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt9485 + Static547.anIntArray641[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (this.anInt9492 > local17 && local24 >= this.anIntArray616[local17]) {
				local17++;
			}
			@Pc(56) int local56 = local17 - 1;
			@Pc(67) boolean local67 = (local17 & 0x1) == 0;
			@Pc(72) int local72 = this.anIntArray616[local17];
			@Pc(79) int local79 = this.anIntArray616[local17 - 1];
			if (this.anInt9489 + local79 < local24 && local72 - this.anInt9489 > local24) {
				for (@Pc(97) int local97 = 0; local97 < Static222.anInt4971; local97++) {
					@Pc(101) int local101 = 0;
					@Pc(110) int local110 = local67 ? this.anInt9480 : -this.anInt9480;
					@Pc(121) int local121;
					for (local121 = Static464.anIntArray556[local97] + (local110 * this.anInt9483 >> 12); local121 < 0; local121 += 4096) {
					}
					while (local121 > 4096) {
						local121 -= 4096;
					}
					while (this.anInt9490 > local101 && local121 >= this.anIntArrayArray54[local56][local101]) {
						local101++;
					}
					@Pc(162) int local162 = local101 - 1;
					@Pc(169) int local169 = this.anIntArrayArray54[local56][local162];
					@Pc(176) int local176 = this.anIntArrayArray54[local56][local101];
					if (local121 > this.anInt9489 + local169 && local121 < local176 - this.anInt9489) {
						local11[local97] = this.anIntArrayArray53[local56][local162];
					} else {
						local11[local97] = 0;
					}
				}
			} else {
				Static653.method7725(local11, 0, Static222.anInt4971, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
		this.method7888();
	}
}
