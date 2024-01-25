import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class Class25_Sub4 extends Class25 {

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "Z")
	public boolean aBoolean277 = false;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Z")
	public boolean aBoolean276 = false;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	protected int anInt3915;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
	protected int anInt3916;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
	protected final int anInt3913;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class25_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3915 = arg0;
		this.anInt3916 = arg2;
		this.aBoolean276 = arg4;
		this.aBoolean277 = arg3;
		this.anInt3913 = arg1;
	}
}
