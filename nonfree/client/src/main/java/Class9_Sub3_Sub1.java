import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class9_Sub3_Sub1 extends Class9_Sub3 {

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
	public final int anInt3132 = (int) (Static191.method3071() / 1000L);

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "S")
	public final short aShort41;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString21;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class9_Sub3_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort41 = (short) arg1;
		this.aString21 = arg0;
	}
}
