import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Z")
	public boolean aBoolean291 = false;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Z")
	public boolean aBoolean292 = false;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	protected int anInt4089;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	protected final int anInt4087;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	protected int anInt4088;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4089 = arg2;
		this.anInt4087 = arg1;
		this.aBoolean291 = arg4;
		this.aBoolean292 = arg3;
		this.anInt4088 = arg0;
	}
}
