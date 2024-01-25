import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class6_Sub15_Sub2 extends Class6_Sub15 {

	static {
		new Class231("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
	public Class6_Sub15_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BF)V")
	public void method3139(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray51[super.anInt3487++] = (byte) (local6 >> 24);
		super.aByteArray51[super.anInt3487++] = (byte) (local6 >> 16);
		super.aByteArray51[super.anInt3487++] = (byte) (local6 >> 8);
		super.aByteArray51[super.anInt3487++] = (byte) local6;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(BF)V")
	public void method3142(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray51[super.anInt3487++] = (byte) local6;
		super.aByteArray51[super.anInt3487++] = (byte) (local6 >> 8);
		super.aByteArray51[super.anInt3487++] = (byte) (local6 >> 16);
		super.aByteArray51[super.anInt3487++] = (byte) (local6 >> 24);
	}
}
