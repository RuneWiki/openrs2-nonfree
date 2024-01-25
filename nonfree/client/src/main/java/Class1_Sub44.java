import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public final class Class1_Sub44 extends Class1 {

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
	public volatile int anInt7961 = -1;

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString73;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub44(@OriginalArg(0) String arg0) {
		this.aString73 = arg0;
	}
}
