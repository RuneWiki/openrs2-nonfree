import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!on", name = "s", descriptor = "Z")
	public final boolean aBoolean336;

	@OriginalMember(owner = "client!on", name = "x", descriptor = "I")
	public final int anInt4461;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "I")
	public final int anInt4457;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "I")
	public final int anInt4460;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "I")
	public final int anInt4459;

	@OriginalMember(owner = "client!on", name = "u", descriptor = "I")
	public final int anInt4458;

	static {
		new Class32("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean336 = arg5;
		this.anInt4461 = arg3;
		this.anInt4457 = arg2;
		this.anInt4460 = arg4;
		this.anInt4459 = arg0;
		this.anInt4458 = arg1;
	}
}
