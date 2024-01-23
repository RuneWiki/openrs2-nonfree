import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class94 {

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "Z")
	public boolean aBoolean184 = true;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	public int anInt3556;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
	public int anInt3558;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	public int anInt3559;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
	public int anInt3553;

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
	public int anInt3557;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
	public int anInt3561;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt3556 = arg5;
		this.anInt3558 = arg1;
		this.anInt3559 = arg3;
		this.anInt3553 = arg2;
		this.aBoolean184 = arg6;
		this.anInt3557 = arg0;
		this.anInt3561 = arg4;
	}
}
