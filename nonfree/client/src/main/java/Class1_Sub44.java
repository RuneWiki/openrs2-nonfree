import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class1_Sub44 extends Class1 {

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	private Class1_Sub44() {
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub44(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString65 = arg0;
	}
}
