import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!r", name = "U", descriptor = "I")
	private int anInt4646 = 204;

	@OriginalMember(owner = "client!r", name = "V", descriptor = "I")
	private int anInt4647 = 1;

	@OriginalMember(owner = "client!r", name = "O", descriptor = "I")
	private int anInt4641 = 1;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4647 = arg0.method3122();
		} else if (arg1 == 1) {
			this.anInt4641 = arg0.method3122();
		} else if (arg1 == 2) {
			this.anInt4646 = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			for (@Pc(17) int local17 = 0; local17 < Static131.anInt2513; local17++) {
				@Pc(24) int local24 = Static105.anIntArray261[local17];
				@Pc(31) int local31 = local24 * this.anInt4647 >> 12;
				@Pc(35) int local35 = Static219.anIntArray515[arg0];
				@Pc(42) int local42 = local35 * this.anInt4641 >> 12;
				@Pc(52) int local52 = this.anInt4647 * (local24 % (4096 / this.anInt4647));
				@Pc(62) int local62 = this.anInt4641 * (local35 % (4096 / this.anInt4641));
				if (this.anInt4646 > local62) {
					for (local31 -= local42; local31 < 0; local31 += 4) {
					}
					while (local31 > 3) {
						local31 -= 4;
					}
					if (local31 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local52 < this.anInt4646) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt4646 > local52) {
					for (local31 -= local42; local31 < 0; local31 += 4) {
					}
					while (local31 > 3) {
						local31 -= 4;
					}
					if (local31 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}
}
