import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class2_Sub3_Sub13 extends Class2_Sub3 {

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			Static653.method7725(local14, 0, Static222.anInt4971, Static547.anIntArray641[arg0]);
		}
		return local14;
	}
}
