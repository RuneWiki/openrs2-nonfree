import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public final class Class5_Sub5_Sub6 extends Class5_Sub5 {

	@OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
	private int anInt6791 = -1;

	static {
		new Class209("", 73);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!rv;I)V")
	@Override
	public void method8349(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt6791 = arg0.method3698();
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method8345(@OriginalArg(1) Class233 arg0) {
		arg0.method5412(this.anInt6791);
	}
}
