import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class16_Sub6_Sub2 extends Class16_Sub6 {

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
	public final int anInt6081 = (int) (Static48.method1203() / 1000L);

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "S")
	public final short aShort83;

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString50;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class16_Sub6_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort83 = (short) arg1;
		this.aString50 = arg0;
	}
}
