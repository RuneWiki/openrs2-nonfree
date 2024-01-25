import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public final class Class5_Sub5_Sub11 extends Class5_Sub5 {

	@OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
	private int anInt9672;

	@OriginalMember(owner = "client!uca", name = "r", descriptor = "Ljava/lang/String;")
	private String aString104;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method8345(@OriginalArg(1) Class233 arg0) {
		arg0.method5423(this.anInt9672, this.aString104);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!rv;I)V")
	@Override
	public void method8349(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt9672 = arg0.method3671();
		this.aString104 = arg0.method3661();
	}
}
