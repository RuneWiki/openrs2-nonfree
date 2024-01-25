import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class201 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	public int anInt6077;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
	public boolean aBoolean587;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	public int anInt6082;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	public int anInt6083;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "I")
	public int anInt6087;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "I")
	public int anInt6088;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public int anInt6079 = 16777215;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	public int anInt6084 = 8;

	static {
		new Class34("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!bg;II)V")
	public void method5180(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method4532();
			if (local9 == 0) {
				return;
			}
			this.method5184(local9, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILclient!bg;)V")
	private void method5184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub8 arg2) {
		if (arg0 == 1) {
			this.anInt6084 = arg2.method4556();
		} else if (arg0 == 2) {
			this.aBoolean587 = true;
		} else if (arg0 == 3) {
			this.anInt6088 = arg2.method4551();
			this.anInt6077 = arg2.method4551();
			this.anInt6087 = arg2.method4551();
		} else if (arg0 == 4) {
			this.anInt6083 = arg2.method4532();
		} else if (arg0 == 5) {
			this.anInt6082 = arg2.method4556();
		} else if (arg0 == 6) {
			this.anInt6079 = arg2.method4514();
		}
	}
}
