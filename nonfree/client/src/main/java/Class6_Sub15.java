import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class6_Sub15 extends Class6 {

	@OriginalMember(owner = "client!di", name = "p", descriptor = "I")
	public volatile int anInt1528 = -1;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString24;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub15(@OriginalArg(0) String arg0) {
		this.aString24 = arg0;
	}
}
