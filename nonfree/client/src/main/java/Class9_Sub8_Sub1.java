import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public final class Class9_Sub8_Sub1 extends Class9_Sub8 {

	@OriginalMember(owner = "client!jda", name = "t", descriptor = "I")
	public final int anInt4531 = (int) (Static587.method7753() / 1000L);

	@OriginalMember(owner = "client!jda", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString60;

	@OriginalMember(owner = "client!jda", name = "r", descriptor = "S")
	public final short aShort57;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class9_Sub8_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString60 = arg0;
		this.aShort57 = (short) arg1;
	}
}
