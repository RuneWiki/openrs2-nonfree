import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public final class Class346 implements Interface14 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
	public final int anInt9576;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(I)V")
	public Class346(@OriginalArg(0) int arg0) {
		this.anInt9576 = arg0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Lclient!ve;")
	@Override
	public Class370 method7954() {
		return Static528.aClass370_8;
	}
}
