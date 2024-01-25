import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class4_Sub42 extends Class4 {

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
	public volatile int anInt8816 = -1;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString86;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub42(@OriginalArg(0) String arg0) {
		this.aString86 = arg0;
	}
}
