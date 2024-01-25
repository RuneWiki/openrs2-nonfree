import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class139 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	public int anInt4526;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public int anInt4527;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public int anInt4528;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class139() {
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class139(@OriginalArg(0) Class139 arg0) {
		this.anInt4526 = arg0.anInt4526;
		this.anInt4528 = arg0.anInt4528;
		this.anInt4527 = arg0.anInt4527;
	}
}
