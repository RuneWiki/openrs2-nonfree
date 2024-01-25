import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
	public volatile int anInt464 = -1;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString5;

	static {
		new Class96("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub4(@OriginalArg(0) String arg0) {
		this.aString5 = arg0;
	}
}
