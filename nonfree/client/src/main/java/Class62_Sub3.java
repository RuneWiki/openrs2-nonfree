import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class Class62_Sub3 extends Class62 {

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "Z")
	public boolean aBoolean263 = false;

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "Z")
	public boolean aBoolean264 = false;

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
	protected int anInt3044;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	protected final int anInt3035;

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
	protected int anInt3045;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class62_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean264 = arg3;
		this.anInt3044 = arg0;
		this.aBoolean263 = arg4;
		this.anInt3035 = arg1;
		this.anInt3045 = arg2;
	}
}
