import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public final class Class1_Sub36 extends Class1 {

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "Ljava/lang/String;")
	public String aString138;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	private Class1_Sub36() {
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub36(@OriginalArg(0) String arg0) {
		this.aString138 = arg0;
	}
}
