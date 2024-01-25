import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class3_Sub2_Sub7 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cr", name = "J", descriptor = "[I")
	public static final int[] anIntArray92 = new int[4096];

	static {
		for (@Pc(42) int local42 = 0; local42 < 4096; local42++) {
			anIntArray92[local42] = Static344.method5029(local42);
		}
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			Static735.method9184(local16, 0, Static636.anInt10302, Static123.anIntArray113[arg0]);
		}
		return local16;
	}
}
