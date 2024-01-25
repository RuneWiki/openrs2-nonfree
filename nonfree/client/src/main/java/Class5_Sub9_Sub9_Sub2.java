import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class5_Sub9_Sub9_Sub2 extends Class5_Sub9_Sub9 {

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class5_Sub9_Sub9_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject6 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method4683() {
		return false;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4684() {
		return this.anObject6;
	}
}
