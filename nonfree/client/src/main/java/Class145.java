import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class145 {

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Z")
	public boolean aBoolean303 = true;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	public int anInt4302;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public int anInt4299;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	public int anInt4298;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
	public int anInt4295;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public int anInt4300;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	public int anInt4297;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4302 = arg3;
		this.anInt4299 = arg0;
		this.anInt4298 = arg4;
		this.anInt4295 = arg5;
		this.anInt4300 = arg2;
		this.aBoolean303 = arg6;
		this.anInt4297 = arg1;
	}
}
