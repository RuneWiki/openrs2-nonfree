import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
	public final int anInt5461 = (int) (Static429.method5935() / 1000L);

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "S")
	public final short aShort85;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub3_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString71 = arg0;
		this.aShort85 = (short) arg1;
	}
}
