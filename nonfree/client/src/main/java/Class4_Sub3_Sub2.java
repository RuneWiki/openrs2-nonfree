import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class4_Sub3_Sub2 extends Class4_Sub3 {

	@OriginalMember(owner = "client!paa", name = "z", descriptor = "I")
	public final int anInt6794 = (int) (Static12.method647() / 1000L);

	@OriginalMember(owner = "client!paa", name = "x", descriptor = "S")
	public final short aShort100;

	@OriginalMember(owner = "client!paa", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString48;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub3_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort100 = (short) arg1;
		this.aString48 = arg0;
	}
}
