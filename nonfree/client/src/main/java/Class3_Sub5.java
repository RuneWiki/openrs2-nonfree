import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Z")
	public boolean aBoolean319 = false;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "Z")
	public boolean aBoolean320 = false;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
	protected int anInt5119;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
	protected int anInt5122;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
	protected final int anInt5120;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean320 = arg3;
		this.anInt5119 = arg2;
		this.anInt5122 = arg0;
		this.aBoolean319 = arg4;
		this.anInt5120 = arg1;
	}
}
