import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class61 implements Interface14 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
	public final int anInt1272;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I)V")
	public Class61(@OriginalArg(0) int arg0) {
		this.anInt1272 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Lclient!ve;")
	@Override
	public Class370 method7954() {
		return Static188.aClass370_3;
	}
}
