import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	private Class1_Sub42() {
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub42(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString66 = arg0;
	}
}
