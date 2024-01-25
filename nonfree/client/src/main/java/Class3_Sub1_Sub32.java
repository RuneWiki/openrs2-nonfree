import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class3_Sub1_Sub32 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(31) int[][] local31 = this.method5551(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			for (@Pc(45) int local45 = 0; local45 < Static238.anInt4221; local45++) {
				local13[local45] = (local35[local45] + local39[local45] + local43[local45]) / 3;
			}
		}
		return local13;
	}
}
