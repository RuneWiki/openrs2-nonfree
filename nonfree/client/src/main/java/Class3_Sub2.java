import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
	public volatile int anInt353 = -1;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString5;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub2(@OriginalArg(0) String arg0) {
		this.aString5 = arg0;
	}
}
