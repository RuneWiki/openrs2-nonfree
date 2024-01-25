import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
	public int anInt8952;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "B")
	public byte aByte108;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Z")
	public final boolean aBoolean675;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "B")
	public final byte aByte107;

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "S")
	public short aShort126;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "S")
	public short aShort124;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "S")
	public short aShort125;

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
	public int anInt8947;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
	public int anInt8949;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
	public int anInt8954;

	static {
		new Class45("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aByte108 = (byte) arg0;
		this.aBoolean675 = arg8;
		this.aByte107 = arg9;
		this.aShort126 = (short) arg5;
		this.aShort123 = (short) arg6;
		this.aShort124 = (short) arg4;
		this.aShort125 = (short) arg7;
		this.anInt8947 = arg2;
		this.anInt8949 = arg3;
		this.anInt8954 = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)I")
	public abstract int method7798();

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(B)V")
	public void method7800() {
	}
}
