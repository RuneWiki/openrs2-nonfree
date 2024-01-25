import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Z")
	public boolean aBoolean205 = false;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Z")
	public boolean aBoolean204 = false;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	protected final int anInt3388;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "I")
	protected int anInt3390;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	protected int anInt3389;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3388 = arg1;
		this.anInt3390 = arg2;
		this.anInt3389 = arg0;
		this.aBoolean205 = arg4;
		this.aBoolean204 = arg3;
	}
}
