import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
	public volatile int anInt7261 = -1;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString78;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub42(@OriginalArg(0) String arg0) {
		this.aString78 = arg0;
	}
}
