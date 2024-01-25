import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class Class24_Sub5 extends Class24 {

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
	protected int anInt7222;

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
	protected final int anInt7221;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	protected int anInt7219;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
	public final int anInt7223;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIII)V")
	protected Class24_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7222 = arg2;
		this.anInt7221 = arg1;
		this.anInt7219 = arg0;
		this.anInt7223 = arg3;
	}
}
