import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class189 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
	public int anInt4915;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
	public int anInt4916;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	public int anInt4917;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	public int anInt4918;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class189() {
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!kg;)V")
	public Class189(@OriginalArg(0) Class189 arg0) {
		this.anInt4917 = arg0.anInt4917;
		this.anInt4918 = arg0.anInt4918;
		this.anInt4916 = arg0.anInt4916;
		this.anInt4915 = arg0.anInt4915;
	}
}
