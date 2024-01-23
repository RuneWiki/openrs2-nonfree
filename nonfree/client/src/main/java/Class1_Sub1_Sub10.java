import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
	private int anInt1377 = 2000;

	@OriginalMember(owner = "client!el", name = "P", descriptor = "I")
	private int anInt1376 = 4096;

	@OriginalMember(owner = "client!el", name = "R", descriptor = "I")
	private int anInt1378 = 0;

	@OriginalMember(owner = "client!el", name = "ab", descriptor = "I")
	private int anInt1385 = 16;

	@OriginalMember(owner = "client!el", name = "db", descriptor = "I")
	private int anInt1386 = 0;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(21) int local21 = this.anInt1376 >> 1;
			@Pc(26) int[][] local26 = this.aClass176_41.method4470();
			@Pc(33) Random local33 = new Random((long) this.anInt1378);
			for (@Pc(35) int local35 = 0; local35 < this.anInt1377; local35++) {
				@Pc(64) int local64 = this.anInt1376 <= 0 ? this.anInt1386 : this.anInt1386 + Static14.method284(this.anInt1376, local33) - local21;
				@Pc(69) int local69 = Static14.method284(Static131.anInt2513, local33);
				@Pc(75) int local75 = local64 >> 4 & 0xFF;
				@Pc(80) int local80 = Static14.method284(Static219.anInt4483, local33);
				@Pc(91) int local91 = local80 + (Static187.anIntArray407[local75] * this.anInt1385 >> 12);
				@Pc(102) int local102 = (this.anInt1385 * Static134.anIntArray305[local75] >> 12) + local69;
				@Pc(107) int local107 = local91 - local80;
				@Pc(111) int local111 = local102 - local69;
				if (local111 != 0 || local107 != 0) {
					if (local107 < 0) {
						local107 = -local107;
					}
					if (local111 < 0) {
						local111 = -local111;
					}
					@Pc(143) boolean local143 = local107 > local111;
					@Pc(148) int local148;
					@Pc(150) int local150;
					if (local143) {
						local148 = local69;
						local150 = local102;
						local102 = local91;
						local91 = local150;
						local69 = local80;
						local80 = local148;
					}
					if (local69 > local102) {
						local148 = local69;
						local69 = local102;
						local102 = local148;
						local150 = local80;
						local80 = local91;
						local91 = local150;
					}
					local150 = local102 - local69;
					@Pc(182) int local182 = local91 - local80;
					if (local182 < 0) {
						local182 = -local182;
					}
					local148 = local80;
					@Pc(198) int local198 = -local150 / 2;
					@Pc(202) int local202 = 2048 / local150;
					@Pc(212) int local212 = 1024 - (Static14.method284(4096, local33) >> 2);
					@Pc(223) int local223 = local80 >= local91 ? -1 : 1;
					for (@Pc(225) int local225 = local69; local225 < local102; local225++) {
						local198 += local182;
						@Pc(247) int local247 = local212 + (local225 + -local69) * local202 + 1024;
						@Pc(251) int local251 = local225 & Static11.anInt321;
						@Pc(255) int local255 = Static9.anInt244 & local148;
						if (local198 > 0) {
							local198 += -local150;
							local148 += local223;
						}
						if (local143) {
							local26[local255][local251] = local247;
						} else {
							local26[local251][local255] = local247;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1378 = arg0.method3122();
		} else if (arg1 == 1) {
			this.anInt1377 = arg0.method3107();
		} else if (arg1 == 2) {
			this.anInt1385 = arg0.method3122();
		} else if (arg1 == 3) {
			this.anInt1386 = arg0.method3107();
		} else if (arg1 == 4) {
			this.anInt1376 = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
		Static173.method2622();
	}
}
