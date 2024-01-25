import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public final class Class164 implements Interface18 {

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "I")
	public final int anInt4803;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(I)V")
	public Class164(@OriginalArg(0) int arg0) {
		this.anInt4803 = arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)Lclient!wv;")
	@Override
	public Class409 method7832() {
		return Static703.aClass409_16;
	}
}
