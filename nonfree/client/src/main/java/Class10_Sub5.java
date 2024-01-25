import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class Class10_Sub5 extends Class10 {

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "Z")
	public boolean aBoolean297 = false;

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "Z")
	public boolean aBoolean299 = false;

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
	protected int anInt4527;

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
	protected int anInt4530;

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
	protected final int anInt4528;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class10_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4527 = arg0;
		this.aBoolean299 = arg4;
		this.aBoolean297 = arg3;
		this.anInt4530 = arg2;
		this.anInt4528 = arg1;
	}
}
