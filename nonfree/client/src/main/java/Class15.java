import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class15 {

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Z")
	public boolean aBoolean87 = true;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
	public final int anInt978;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
	public final int anInt967;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public final int anInt975;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	public final int anInt974;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public final int anInt968;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	public final int anInt976;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt978 = arg4;
		this.anInt967 = arg3;
		this.anInt975 = arg0;
		this.anInt974 = arg5;
		this.anInt968 = arg1;
		this.aBoolean87 = arg6;
		this.anInt976 = arg2;
	}
}
