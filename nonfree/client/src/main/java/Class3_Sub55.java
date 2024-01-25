import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class3_Sub55 extends Class3 {

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
	public volatile int anInt10339 = -1;

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString133;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub55(@OriginalArg(0) String arg0) {
		this.aString133 = arg0;
	}
}
