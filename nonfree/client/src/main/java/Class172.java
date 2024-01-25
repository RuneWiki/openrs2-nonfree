import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class172 {

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "Lclient!rd;")
	public Class263 aClass263_3;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public int anInt4756;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
	public int anInt4758;

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "Lclient!ih;")
	public Class172 aClass172_2;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	public int anInt4763;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
	public final int anInt4760;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	public final int anInt4761;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(II)V")
	public Class172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4760 = arg0;
		this.anInt4761 = arg1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Lclient!ih;")
	public Class172 method4228(@OriginalArg(0) int arg0) {
		return new Class172(this.anInt4760, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Lclient!rha;")
	public Class312 method4231() {
		return Static530.method7847(this.anInt4760);
	}
}
