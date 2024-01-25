import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!to", name = "v", descriptor = "I")
	public int anInt5736;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "I")
	public final int anInt5732;

	static {
		new Class32(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(II)V")
	public Class2_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5736 = arg1;
		this.anInt5732 = arg0;
	}
}
