import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class2_Sub51 extends Class2 {

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "Ljava/lang/String;")
	public String aString118;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
	private Class2_Sub51() {
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub51(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString118 = arg0;
	}
}
