import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class24 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Z")
	public boolean aBoolean127 = true;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	public int anInt503;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public int anInt504;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public int anInt505;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt502 = arg0;
		this.anInt503 = arg1;
		this.anInt504 = arg2;
		this.anInt505 = arg3;
		this.anInt506 = arg4;
		this.anInt507 = arg5;
		this.aBoolean127 = arg6;
	}
}
