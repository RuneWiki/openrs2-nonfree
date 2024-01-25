import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
	public final int anInt5724 = (int) (Static95.method1587() / 1000L);

	@OriginalMember(owner = "client!mea", name = "r", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!mea", name = "u", descriptor = "S")
	public final short aShort86;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString57 = arg0;
		this.aShort86 = (short) arg1;
	}
}
