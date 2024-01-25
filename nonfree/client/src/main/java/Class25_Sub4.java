import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class Class25_Sub4 extends Class25 {

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
	public final int anInt5873;

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
	protected final int anInt5872;

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
	protected int anInt5876;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
	protected int anInt5875;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIII)V")
	protected Class25_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5873 = arg3;
		this.anInt5872 = arg1;
		this.anInt5876 = arg0;
		this.anInt5875 = arg2;
	}
}
