import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public final class Class221 implements Interface24 {

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
	public final int anInt5453;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(I)V")
	public Class221(@OriginalArg(0) int arg0) {
		this.anInt5453 = arg0;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)Lclient!ag;")
	@Override
	public Class8 method8040() {
		return Static498.aClass8_7;
	}
}
