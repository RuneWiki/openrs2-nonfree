import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public final class Class34_Sub3_Sub1 extends Class34_Sub3 {

	@OriginalMember(owner = "client!fha", name = "u", descriptor = "I")
	public final int anInt3082 = (int) (Static15.method380() / 1000L);

	@OriginalMember(owner = "client!fha", name = "s", descriptor = "S")
	public final short aShort33;

	@OriginalMember(owner = "client!fha", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString43;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class34_Sub3_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort33 = (short) arg1;
		this.aString43 = arg0;
	}
}
