import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	private Class2_Sub27() {
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub27(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString30 = arg0;
	}
}
