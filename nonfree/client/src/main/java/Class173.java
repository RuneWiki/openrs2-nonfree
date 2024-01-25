import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public final class Class173 {

	@OriginalMember(owner = "client!iia", name = "f", descriptor = "Lclient!qa;")
	public Class109 aClass109_4;

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
	public int anInt4949;

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "Lclient!iia;")
	public Class173 aClass173_1;

	@OriginalMember(owner = "client!iia", name = "e", descriptor = "I")
	public int anInt4954;

	@OriginalMember(owner = "client!iia", name = "h", descriptor = "I")
	public int anInt4955;

	@OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
	public final int anInt4950;

	@OriginalMember(owner = "client!iia", name = "k", descriptor = "I")
	public final int anInt4951;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(II)V")
	public Class173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4950 = arg0;
		this.anInt4951 = arg1;
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)Lclient!el;")
	public Class100 method4483() {
		return Static131.method2540(this.anInt4950);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IB)Lclient!iia;")
	public Class173 method4484(@OriginalArg(0) int arg0) {
		return new Class173(this.anInt4950, arg0);
	}
}
