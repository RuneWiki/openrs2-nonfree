import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class106 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
	public int anInt2723;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
	public int anInt2724;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
	public int anInt2725;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
	public int anInt2726;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class106() {
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!fp;)V")
	public Class106(@OriginalArg(0) Class106 arg0) {
		this.anInt2725 = arg0.anInt2725;
		this.anInt2724 = arg0.anInt2724;
		this.anInt2726 = arg0.anInt2726;
		this.anInt2723 = arg0.anInt2723;
	}
}
