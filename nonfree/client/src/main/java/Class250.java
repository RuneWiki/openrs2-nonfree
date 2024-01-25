import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class250 implements Interface12 {

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
	public final int anInt7272;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V")
	public Class250(@OriginalArg(0) int arg0) {
		this.anInt7272 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class136 method5811() {
		return Static364.aClass136_98;
	}
}
