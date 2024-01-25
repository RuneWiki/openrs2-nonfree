import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!es", name = "j", descriptor = "Z")
	public boolean aBoolean481 = false;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "Z")
	public boolean aBoolean480 = false;

	@OriginalMember(owner = "client!es", name = "c", descriptor = "I")
	protected final int anInt7154;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "I")
	protected int anInt7159;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "I")
	protected int anInt7157;

	@OriginalMember(owner = "client!es", name = "d", descriptor = "S")
	public final short aShort99;

	static {
		new Class198("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.anInt7154 = arg1;
		this.aBoolean481 = arg4;
		this.anInt7159 = arg2;
		this.anInt7157 = arg0;
		this.aShort99 = (short) arg3;
		this.aBoolean480 = arg5;
	}
}
