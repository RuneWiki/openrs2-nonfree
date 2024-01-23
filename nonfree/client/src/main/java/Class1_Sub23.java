import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!og", name = "s", descriptor = "Ljava/lang/String;")
	public String aString123;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub23(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString123 = arg0;
	}
}
