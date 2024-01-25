import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public final class Class90_Sub1 extends Class90 {

	@OriginalMember(owner = "client!ega", name = "i", descriptor = "[Lclient!bl;")
	public final Class40[] aClass40Array1;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "([Lclient!bl;)V")
	public Class90_Sub1(@OriginalArg(0) Class40[] arg0) {
		this.aClass40Array1 = arg0;
	}
}
