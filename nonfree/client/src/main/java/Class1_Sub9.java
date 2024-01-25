import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
	private Class1_Sub9() {
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub9(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString17 = arg0;
	}
}
