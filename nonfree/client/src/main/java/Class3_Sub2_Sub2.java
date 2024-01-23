import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!af", name = "P", descriptor = "I")
	private int anInt168 = 1;

	@OriginalMember(owner = "client!af", name = "M", descriptor = "I")
	private int anInt165 = 1;

	@OriginalMember(owner = "client!af", name = "O", descriptor = "I")
	private int anInt167 = 204;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt168 = arg1.method3915();
		} else if (arg0 == 1) {
			this.anInt165 = arg1.method3915();
		} else if (arg0 == 2) {
			this.anInt167 = arg1.method3948();
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			for (@Pc(26) int local26 = 0; local26 < Static22.anInt421; local26++) {
				@Pc(37) int local37 = Static185.anIntArray424[local26];
				@Pc(41) int local41 = Static205.anIntArray450[arg0];
				@Pc(48) int local48 = local37 * this.anInt168 >> 12;
				@Pc(55) int local55 = local41 * this.anInt165 >> 12;
				@Pc(65) int local65 = this.anInt168 * (local37 % (4096 / this.anInt168));
				@Pc(75) int local75 = local41 % (4096 / this.anInt165) * this.anInt165;
				if (local75 < this.anInt167) {
					for (local48 -= local55; local48 < 0; local48 += 4) {
					}
					while (local48 > 3) {
						local48 -= 4;
					}
					if (local48 != 1) {
						local16[local26] = 0;
						continue;
					}
					if (this.anInt167 > local65) {
						local16[local26] = 0;
						continue;
					}
				}
				if (local65 < this.anInt167) {
					for (local48 -= local55; local48 < 0; local48 += 4) {
					}
					while (local48 > 3) {
						local48 -= 4;
					}
					if (local48 > 0) {
						local16[local26] = 0;
						continue;
					}
				}
				local16[local26] = 4096;
			}
		}
		return local16;
	}
}
