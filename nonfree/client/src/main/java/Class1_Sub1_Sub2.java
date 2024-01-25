import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
	public final int anInt6758 = (int) (Static574.method8210() / 1000L);

	@OriginalMember(owner = "client!ni", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString70;

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "S")
	public final short aShort79;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString70 = arg0;
		this.aShort79 = (short) arg1;
	}
}
