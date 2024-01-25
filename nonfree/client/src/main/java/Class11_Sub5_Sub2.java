import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class11_Sub5_Sub2 extends Class11_Sub5 {

	@OriginalMember(owner = "client!li", name = "x", descriptor = "I")
	public final int anInt5858 = (int) (Static438.method6517() / 1000L);

	@OriginalMember(owner = "client!li", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "S")
	public final short aShort84;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class11_Sub5_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString57 = arg0;
		this.aShort84 = (short) arg1;
	}
}
