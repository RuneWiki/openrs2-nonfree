import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
	public volatile int anInt2415 = -1;

	@OriginalMember(owner = "client!eaa", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString31;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub22(@OriginalArg(0) String arg0) {
		this.aString31 = arg0;
	}
}
