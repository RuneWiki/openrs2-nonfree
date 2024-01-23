import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gl", name = "X", descriptor = "I")
	private int anInt1749;

	@OriginalMember(owner = "client!gl", name = "Z", descriptor = "I")
	private int anInt1751;

	@OriginalMember(owner = "client!gl", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!gl", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!gl", name = "gb", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!gl", name = "jb", descriptor = "I")
	private int anInt1758;

	@OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
	private int anInt1746 = 1024;

	@OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
	private int anInt1741 = 81;

	@OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
	private int anInt1744 = 8;

	@OriginalMember(owner = "client!gl", name = "fb", descriptor = "I")
	private int anInt1755 = 409;

	@OriginalMember(owner = "client!gl", name = "ib", descriptor = "I")
	private int anInt1757 = 1024;

	@OriginalMember(owner = "client!gl", name = "bb", descriptor = "I")
	private int anInt1752 = 4;

	@OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
	private int anInt1742 = 0;

	@OriginalMember(owner = "client!gl", name = "kb", descriptor = "I")
	private int anInt1759 = 204;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "(I)V")
	private void method1520() {
		@Pc(12) Random local12 = new Random((long) this.anInt1744);
		this.anIntArrayArray16 = new int[this.anInt1744][this.anInt1752 + 1];
		this.anInt1758 = 4096 / this.anInt1744;
		this.anInt1751 = 4096 / this.anInt1752;
		this.anIntArrayArray17 = new int[this.anInt1744][this.anInt1752];
		this.anIntArray231 = new int[this.anInt1744 + 1];
		this.anIntArray231[0] = 0;
		this.anInt1749 = this.anInt1741 / 2;
		@Pc(63) int local63 = this.anInt1751 / 2;
		@Pc(72) int local72 = this.anInt1758 / 2;
		for (@Pc(74) int local74 = 0; local74 < this.anInt1744; local74++) {
			@Pc(87) int local87;
			@Pc(99) int local99;
			if (local74 > 0) {
				local87 = this.anInt1758;
				local99 = (Static14.method284(4096, local12) - 2048) * this.anInt1759 >> 12;
				@Pc(107) int local107 = local87 + (local72 * local99 >> 12);
				this.anIntArray231[local74] = this.anIntArray231[local74 - 1] + local107;
			}
			this.anIntArrayArray16[local74][0] = 0;
			for (local87 = 0; local87 < this.anInt1752; local87++) {
				if (local87 > 0) {
					local99 = this.anInt1751;
					@Pc(154) int local154 = (Static14.method284(4096, local12) - 2048) * this.anInt1755 >> 12;
					local99 += local63 * local154 >> 12;
					this.anIntArrayArray16[local74][local87] = this.anIntArrayArray16[local74][local87 - 1] + local99;
				}
				this.anIntArrayArray17[local74][local87] = this.anInt1746 > 0 ? 4096 - Static14.method284(this.anInt1746, local12) : 4096;
			}
			this.anIntArrayArray16[local74][this.anInt1752] = 4096;
		}
		this.anIntArray231[this.anInt1744] = 4096;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1752 = arg0.method3122();
		} else if (arg1 == 1) {
			this.anInt1744 = arg0.method3122();
		} else if (arg1 == 2) {
			this.anInt1755 = arg0.method3107();
		} else if (arg1 == 3) {
			this.anInt1759 = arg0.method3107();
		} else if (arg1 == 4) {
			this.anInt1757 = arg0.method3107();
		} else if (arg1 == 5) {
			this.anInt1742 = arg0.method3107();
		} else if (arg1 == 6) {
			this.anInt1741 = arg0.method3107();
		} else if (arg1 == 7) {
			this.anInt1746 = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
		this.method1520();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(26) int local26 = 0;
			@Pc(34) int local34;
			for (local34 = Static219.anIntArray515[arg0] + this.anInt1742; local34 < 0; local34 += 4096) {
			}
			while (local34 > 4096) {
				local34 -= 4096;
			}
			while (local26 < this.anInt1744 && this.anIntArray231[local26] <= local34) {
				local26++;
			}
			@Pc(65) int local65 = local26 - 1;
			@Pc(76) boolean local76 = (local26 & 0x1) == 0;
			@Pc(83) int local83 = this.anIntArray231[local26 - 1];
			@Pc(88) int local88 = this.anIntArray231[local26];
			if (local83 + this.anInt1749 < local34 && local88 - this.anInt1749 > local34) {
				for (@Pc(107) int local107 = 0; local107 < Static131.anInt2513; local107++) {
					@Pc(116) int local116 = 0;
					@Pc(125) int local125 = local76 ? this.anInt1757 : -this.anInt1757;
					@Pc(136) int local136;
					for (local136 = (this.anInt1751 * local125 >> 12) + Static105.anIntArray261[local107]; local136 < 0; local136 += 4096) {
					}
					while (local136 > 4096) {
						local136 -= 4096;
					}
					while (local116 < this.anInt1752 && local136 >= this.anIntArrayArray16[local65][local116]) {
						local116++;
					}
					@Pc(175) int local175 = this.anIntArrayArray16[local65][local116];
					@Pc(179) int local179 = local116 - 1;
					@Pc(186) int local186 = this.anIntArrayArray16[local65][local179];
					if (local136 > this.anInt1749 + local186 && local136 < local175 - this.anInt1749) {
						local15[local107] = this.anIntArrayArray17[local65][local179];
					} else {
						local15[local107] = 0;
					}
				}
			} else {
				Static300.method487(local15, 0, Static131.anInt2513, 0);
			}
		}
		return local15;
	}
}
