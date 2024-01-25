import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class1_Sub4_Sub20 extends Class1_Sub4 {

	static {
		new Class119("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			Static468.method5037(local9, 0, Static395.anInt6592, Static419.anIntArray472[arg0]);
		}
		return local9;
	}
}
