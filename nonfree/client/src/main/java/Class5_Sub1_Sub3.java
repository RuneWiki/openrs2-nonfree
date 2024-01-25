import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class5_Sub1_Sub3 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hda", name = "u", descriptor = "I")
	private int anInt4116 = -1;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLclient!mc;)V")
	@Override
	public void method8507(@OriginalArg(1) Class5_Sub41 arg0) {
		this.anInt4116 = arg0.method7860();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!im;B)V")
	@Override
	public void method8505(@OriginalArg(0) Class166 arg0) {
		arg0.method4097(this.anInt4116);
	}
}
