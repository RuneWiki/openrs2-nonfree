import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public final class Class3_Sub49 extends Class3 {

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
	public final int anInt10003;

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "Z")
	public final boolean aBoolean830;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
	public final int anInt10002;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
	public final int anInt10004;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
	public final int anInt10005;

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
	public final int anInt10008;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt10003 = arg1;
		this.aBoolean830 = arg5;
		this.anInt10002 = arg2;
		this.anInt10004 = arg3;
		this.anInt10005 = arg4;
		this.anInt10008 = arg0;
	}
}
