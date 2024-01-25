import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class23_Sub1_Sub1 extends Class23_Sub1 {

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
	public final int anInt588 = (int) (Static354.method4966() / 1000L);

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!bm", name = "w", descriptor = "S")
	public final short aShort9;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString3 = arg0;
		this.aShort9 = (short) arg1;
	}
}
