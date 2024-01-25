import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public abstract class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "Z")
	public boolean aBoolean427 = false;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Z")
	public boolean aBoolean430 = false;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	protected final int anInt6193;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
	protected int anInt6191;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "S")
	public final short aShort80;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
	protected int anInt6194;

	static {
		new Class231("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class11_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.anInt6193 = arg1;
		this.aBoolean430 = arg5;
		this.anInt6191 = arg2;
		this.aShort80 = (short) arg3;
		this.anInt6194 = arg0;
		this.aBoolean427 = arg4;
	}
}
