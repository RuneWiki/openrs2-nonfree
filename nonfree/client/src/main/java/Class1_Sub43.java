import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "Ljava/lang/String;")
	public String aString87;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	private Class1_Sub43() {
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub43(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString87 = arg0;
	}
}
