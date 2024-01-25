import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			Static555.method5097(local16, 0, Static236.anInt4609, Static305.anIntArray416[arg0]);
		}
		return local16;
	}
}
