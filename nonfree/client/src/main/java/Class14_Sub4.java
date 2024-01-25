import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public final class Class14_Sub4 extends Class14 {

	@OriginalMember(owner = "client!au", name = "m", descriptor = "I")
	public volatile int anInt458 = -1;

	@OriginalMember(owner = "client!au", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString5;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class14_Sub4(@OriginalArg(0) String arg0) {
		this.aString5 = arg0;
	}
}
