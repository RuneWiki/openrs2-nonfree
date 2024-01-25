import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class2_Sub23_Sub1 extends Class2_Sub23 {

	static {
		new Class209("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I)V")
	public Class2_Sub23_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BF)V")
	public void method3246(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray130[super.anInt6952++] = (byte) (local6 >> 24);
		super.aByteArray130[super.anInt6952++] = (byte) (local6 >> 16);
		super.aByteArray130[super.anInt6952++] = (byte) (local6 >> 8);
		super.aByteArray130[super.anInt6952++] = (byte) local6;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IF)V")
	public void method3249(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = NativeStream.floatToRawIntBits(arg0);
		super.aByteArray130[super.anInt6952++] = (byte) local6;
		super.aByteArray130[super.anInt6952++] = (byte) (local6 >> 8);
		super.aByteArray130[super.anInt6952++] = (byte) (local6 >> 16);
		super.aByteArray130[super.anInt6952++] = (byte) (local6 >> 24);
	}
}
