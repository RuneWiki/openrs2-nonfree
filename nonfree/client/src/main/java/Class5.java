import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public abstract class Class5 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "[I")
	public static final int[] anIntArray11 = new int[128];

	static {
		for (@Pc(12) int local12 = 0; local12 < anIntArray11.length; local12++) {
			anIntArray11[local12] = -1;
		}
		for (@Pc(28) int local28 = 65; local28 <= 90; local28++) {
			anIntArray11[local28] = local28 - 65;
		}
		for (@Pc(41) int local41 = 97; local41 <= 122; local41++) {
			anIntArray11[local41] = local41 + 26 - 97;
		}
		for (@Pc(58) int local58 = 48; local58 <= 57; local58++) {
			anIntArray11[local58] = local58 + 52 - 48;
		}
		anIntArray11[45] = anIntArray11[47] = 63;
		anIntArray11[42] = anIntArray11[43] = 62;
		new Class88("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	protected Class5() {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Lclient!aca;")
	public abstract Interface1 method210();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Z")
	public abstract boolean method211(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	public abstract void method213();

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
	public abstract void method214();
}
