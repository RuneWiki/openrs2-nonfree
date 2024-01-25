import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class1_Sub37 extends Class1 {

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class1_Sub37() {
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub37(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString55 = arg0;
	}
}
