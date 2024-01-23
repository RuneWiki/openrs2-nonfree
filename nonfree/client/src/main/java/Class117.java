import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class117 {

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Z")
	public boolean aBoolean392 = true;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	public int anInt4433;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "I")
	public int anInt4431;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "I")
	public int anInt4430;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	public int anInt4425;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "I")
	public int anInt4434;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	public int anInt4432;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean392 = arg6;
		this.anInt4433 = arg2;
		this.anInt4431 = arg5;
		this.anInt4430 = arg0;
		this.anInt4425 = arg1;
		this.anInt4434 = arg4;
		this.anInt4432 = arg3;
	}
}
