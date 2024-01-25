import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class1_Sub46 extends Class1 {

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
	public volatile int anInt8973 = -1;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString99;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub46(@OriginalArg(0) String arg0) {
		this.aString99 = arg0;
	}
}
