import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class207_Sub1 extends Class207 {

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "[Lclient!uc;")
	public final Class355[] aClass355Array1;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "([Lclient!uc;)V")
	public Class207_Sub1(@OriginalArg(0) Class355[] arg0) {
		this.aClass355Array1 = arg0;
	}
}
