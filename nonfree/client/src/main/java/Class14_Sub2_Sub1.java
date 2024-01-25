import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class14_Sub2_Sub1 extends Class14_Sub2 {

	@OriginalMember(owner = "client!an", name = "p", descriptor = "I")
	public final int anInt455 = (int) (Static205.method3179() / 1000L);

	@OriginalMember(owner = "client!an", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString6;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "S")
	public final short aShort16;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class14_Sub2_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString6 = arg0;
		this.aShort16 = (short) arg1;
	}
}
