import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class5_Sub5_Sub2 extends Class5_Sub5 {

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Ljava/lang/String;")
	private String aString23 = null;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "J")
	private long aLong88 = -1L;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method8345(@OriginalArg(1) Class233 arg0) {
		arg0.method5431(this.aString23, this.aLong88);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!rv;I)V")
	@Override
	public void method8349(@OriginalArg(0) Class5_Sub15 arg0) {
		if (arg0.method3642() != 255) {
			arg0.anInt4144--;
			this.aLong88 = arg0.method3634();
		}
		this.aString23 = arg0.method3691();
	}
}
