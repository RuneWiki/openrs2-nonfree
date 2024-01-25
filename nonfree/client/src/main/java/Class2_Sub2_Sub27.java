import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class2_Sub2_Sub27 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
	private int anInt5914 = 1;

	@OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
	private int anInt5917 = 204;

	@OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
	private int anInt5921 = 1;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5914 = arg0.method5495();
		} else if (arg1 == 1) {
			this.anInt5921 = arg0.method5495();
		} else if (arg1 == 2) {
			this.anInt5917 = arg0.method5500();
		}
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			for (@Pc(25) int local25 = 0; local25 < Static429.anInt6518; local25++) {
				@Pc(31) int local31 = Static365.anIntArray535[local25];
				@Pc(35) int local35 = Static318.anIntArray565[arg0];
				@Pc(42) int local42 = this.anInt5914 * local31 >> 12;
				@Pc(49) int local49 = local35 * this.anInt5921 >> 12;
				@Pc(59) int local59 = local31 % (4096 / this.anInt5914) * this.anInt5914;
				@Pc(69) int local69 = this.anInt5921 * (local35 % (4096 / this.anInt5921));
				if (this.anInt5917 > local69) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local11[local25] = 0;
						continue;
					}
					if (local59 < this.anInt5917) {
						local11[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt5917) {
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
}
