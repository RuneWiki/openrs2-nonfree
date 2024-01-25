import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class Class6_Sub29 extends Class6 {

	@OriginalMember(owner = "client!od", name = "v", descriptor = "F")
	protected float aFloat171;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "I")
	private final int anInt7307;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "I")
	protected int anInt7301;

	@OriginalMember(owner = "client!od", name = "B", descriptor = "I")
	private final int anInt7312;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "I")
	protected int anInt7309;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "I")
	protected int anInt7308;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat171 = arg5;
		this.anInt7307 = arg4;
		this.anInt7301 = arg1;
		this.anInt7312 = arg3;
		this.anInt7309 = arg2;
		this.anInt7308 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZF)V")
	public abstract void method6156(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)I")
	public final int method6157() {
		return this.anInt7307;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)F")
	public final float method6158() {
		return this.aFloat171;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)I")
	public final int method6160() {
		return this.anInt7312;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)I")
	public final int method6161() {
		return this.anInt7301;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V")
	public abstract void method6162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(I)I")
	public final int method6164() {
		return this.anInt7308;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(B)I")
	public final int method6165() {
		return this.anInt7309;
	}
}
