import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	private Class1_Sub30() {
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub30(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString41 = arg0;
	}
}
