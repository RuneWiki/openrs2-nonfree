import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class10_Sub31 extends Class10 {

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	public final int anInt4768;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
	public int anInt4767;

	static {
		new Class182(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(II)V")
	public Class10_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4768 = arg0;
		this.anInt4767 = arg1;
	}
}
