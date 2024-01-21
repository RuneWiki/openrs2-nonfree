import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!db", name = "s", descriptor = "Lclient!vd;")
	public Class92 aClass92_343;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class1_Sub6() {
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class1_Sub6(@OriginalArg(0) Class92 arg0) {
		this.aClass92_343 = arg0;
	}
}
