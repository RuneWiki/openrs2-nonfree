import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public final class Class60_Sub1_Sub2 extends Class60_Sub1 {

	@OriginalMember(owner = "client!jfa", name = "s", descriptor = "I")
	public final int anInt4490 = (int) (Static416.method5922() / 1000L);

	@OriginalMember(owner = "client!jfa", name = "t", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!jfa", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString37;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class60_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort71 = (short) arg1;
		this.aString37 = arg0;
	}
}
