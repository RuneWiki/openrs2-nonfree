import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "Lclient!ob;")
	public Class60 aClass60_826;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class2_Sub13() {
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ob;)V")
	public Class2_Sub13(@OriginalArg(0) Class60 arg0) {
		this.aClass60_826 = arg0;
	}
}
