import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class111_Sub1_Sub1 extends Class111_Sub1 {

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
	public final int anInt4273 = (int) (Static183.method2674() / 1000L);

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString43;

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "S")
	public final short aShort60;

	static {
		new Class142("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class111_Sub1_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString43 = arg0;
		this.aShort60 = (short) arg1;
	}
}
