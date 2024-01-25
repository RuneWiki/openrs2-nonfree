import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public final class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!fka", name = "g", descriptor = "[Lclient!gaa;")
	public final Class127[] aClass127Array1;

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "([Lclient!gaa;)V")
	public Class119_Sub1(@OriginalArg(0) Class127[] arg0) {
		this.aClass127Array1 = arg0;
	}
}
