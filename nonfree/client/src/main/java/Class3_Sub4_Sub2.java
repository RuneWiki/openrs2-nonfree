import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class Class3_Sub4_Sub2 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
	public final int anInt10195;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub4_Sub2(@OriginalArg(0) int arg0) {
		this.anInt10195 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)Z")
	public abstract boolean method8738();

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method8739();
}
