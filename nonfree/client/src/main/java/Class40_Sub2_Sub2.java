import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class40_Sub2_Sub2 extends Class40_Sub2 {

	@OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
	public final int anInt4209 = (int) (Static220.method3314() / 1000L);

	@OriginalMember(owner = "client!ku", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString36;

	@OriginalMember(owner = "client!ku", name = "C", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class40_Sub2_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString36 = arg0;
		this.aShort68 = (short) arg1;
	}
}
