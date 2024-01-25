import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class4_Sub4_Sub15 extends Class4_Sub4 {

	@OriginalMember(owner = "client!jr", name = "P", descriptor = "I")
	private int anInt3336 = 204;

	@OriginalMember(owner = "client!jr", name = "T", descriptor = "I")
	private int anInt3340 = 1;

	@OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
	private int anInt3341 = 1;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			for (@Pc(25) int local25 = 0; local25 < Static124.anInt3576; local25++) {
				@Pc(31) int local31 = Static149.anIntArray298[local25];
				@Pc(35) int local35 = Static64.anIntArray148[arg0];
				@Pc(42) int local42 = local31 * this.anInt3340 >> 12;
				@Pc(49) int local49 = this.anInt3341 * local35 >> 12;
				@Pc(59) int local59 = this.anInt3340 * (local31 % (4096 / this.anInt3340));
				@Pc(69) int local69 = this.anInt3341 * (local35 % (4096 / this.anInt3341));
				if (this.anInt3336 > local69) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local11[local25] = 0;
						continue;
					}
					if (this.anInt3336 > local59) {
						local11[local25] = 0;
						continue;
					}
				}
				if (this.anInt3336 > local59) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local11[local25] = 0;
						continue;
					}
				}
				local11[local25] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3340 = arg1.method2380();
		} else if (arg0 == 1) {
			this.anInt3341 = arg1.method2380();
		} else if (arg0 == 2) {
			this.anInt3336 = arg1.method2404();
		}
	}
}
