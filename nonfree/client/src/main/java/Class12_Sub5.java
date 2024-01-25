import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class Class12_Sub5 extends Class12 {

	@OriginalMember(owner = "client!of", name = "q", descriptor = "Z")
	public boolean aBoolean442 = false;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Z")
	public boolean aBoolean441 = false;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "I")
	protected int anInt5657;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "I")
	protected final int anInt5653;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "I")
	protected int anInt5658;

	static {
		new Class221("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class12_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5657 = arg2;
		this.anInt5653 = arg1;
		this.aBoolean441 = arg4;
		this.anInt5658 = arg0;
		this.aBoolean442 = arg3;
	}
}
