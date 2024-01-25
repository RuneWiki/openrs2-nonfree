import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!af", name = "v", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	private Class1_Sub2() {
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString1 = arg0;
	}
}
