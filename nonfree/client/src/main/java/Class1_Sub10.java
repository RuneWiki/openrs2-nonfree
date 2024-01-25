import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	private Class1_Sub10() {
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub10(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString41 = arg0;
	}
}
