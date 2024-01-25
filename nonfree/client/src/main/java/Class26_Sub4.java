import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class Class26_Sub4 extends Class26 {

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Z")
	public boolean aBoolean202 = false;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	protected final int anInt3475;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	protected int anInt3474;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	protected int anInt3476;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class26_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3475 = arg1;
		this.anInt3474 = arg2;
		this.aBoolean202 = arg4;
		this.aBoolean201 = arg3;
		this.anInt3476 = arg0;
	}
}
