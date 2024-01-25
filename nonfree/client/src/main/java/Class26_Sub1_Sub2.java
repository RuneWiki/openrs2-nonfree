import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public final class Class26_Sub1_Sub2 extends Class26_Sub1 {

	@OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
	public final int anInt6645 = (int) (Static184.method3422() / 1000L);

	@OriginalMember(owner = "client!oaa", name = "t", descriptor = "S")
	public final short aShort89;

	@OriginalMember(owner = "client!oaa", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString78;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class26_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort89 = (short) arg1;
		this.aString78 = arg0;
	}
}
