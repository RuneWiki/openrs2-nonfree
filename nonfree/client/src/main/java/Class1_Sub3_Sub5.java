import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class1_Sub3_Sub5 extends Class1_Sub3 {

	static {
		new Class45("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			Static556.method7040(local9, 0, Static254.anInt4973, Static392.anIntArray673[arg0]);
		}
		return local9;
	}
}
