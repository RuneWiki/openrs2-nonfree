import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class170 implements Interface2 {

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
	public final int anInt5202;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(I)V")
	public Class170(@OriginalArg(0) int arg0) {
		this.anInt5202 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)Lclient!kq;")
	@Override
	public Class184 method7073() {
		return Static542.aClass184_14;
	}
}
