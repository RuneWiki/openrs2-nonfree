import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class149 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
	public int anInt4696;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public int anInt4697;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class149() {
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class149(@OriginalArg(0) Class149 arg0) {
		this.anInt4696 = arg0.anInt4696;
		this.anInt4698 = arg0.anInt4698;
		this.anInt4697 = arg0.anInt4697;
	}
}
