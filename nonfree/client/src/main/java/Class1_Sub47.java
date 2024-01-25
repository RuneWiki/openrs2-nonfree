import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class1_Sub47 extends Class1 {

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	private Class1_Sub47() {
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub47(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString69 = arg0;
	}
}
