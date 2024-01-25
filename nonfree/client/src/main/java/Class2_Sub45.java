import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class2_Sub45 extends Class2 {

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
	public final int anInt8880;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
	public final int anInt8879;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
	public final int anInt8876;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
	public final int anInt8877;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
	public final int anInt8875;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "Z")
	public final boolean aBoolean642;

	static {
		new Class202("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt8880 = arg4;
		this.anInt8879 = arg1;
		this.anInt8876 = arg0;
		this.anInt8877 = arg3;
		this.anInt8875 = arg2;
		this.aBoolean642 = arg5;
	}
}
