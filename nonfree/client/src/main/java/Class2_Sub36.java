import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class2_Sub36 extends Class2 {

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	public volatile int anInt6974 = -1;

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub36(@OriginalArg(0) String arg0) {
		this.aString76 = arg0;
	}
}
