import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class15_Sub2_Sub2 extends Class15_Sub2 {

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
	public final int anInt1181 = (int) (Static99.method1701() / 1000L);

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "S")
	public final short aShort19;

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString12;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class15_Sub2_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort19 = (short) arg1;
		this.aString12 = arg0;
	}
}
