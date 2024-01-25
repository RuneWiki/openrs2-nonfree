import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class3_Sub49 extends Class3 {

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "Ljava/lang/String;")
	public String aString100;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "()V")
	private Class3_Sub49() {
	}

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub49(@OriginalArg(0) String arg0) {
		this.aString100 = arg0;
	}
}
