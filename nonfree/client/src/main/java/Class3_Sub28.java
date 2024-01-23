import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class3_Sub28 extends Class3 {

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "Ljava/lang/String;")
	public String aString183;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub28(@OriginalArg(0) String arg0) {
		this.aString183 = arg0;
	}
}
