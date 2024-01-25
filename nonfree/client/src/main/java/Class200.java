import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jma")
public final class Class200 {

	@OriginalMember(owner = "client!jma", name = "b", descriptor = "I")
	public int anInt4706;

	@OriginalMember(owner = "client!jma", name = "a", descriptor = "I")
	public int anInt4707;

	@OriginalMember(owner = "client!jma", name = "c", descriptor = "I")
	public int anInt4708;

	@OriginalMember(owner = "client!jma", name = "<init>", descriptor = "()V")
	public Class200() {
	}

	@OriginalMember(owner = "client!jma", name = "<init>", descriptor = "(Lclient!jma;)V")
	public Class200(@OriginalArg(0) Class200 arg0) {
		this.anInt4708 = arg0.anInt4708;
		this.anInt4706 = arg0.anInt4706;
		this.anInt4707 = arg0.anInt4707;
	}
}
