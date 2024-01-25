import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public final class Class121 {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
	public int anInt2852;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
	public int anInt2853;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
	public int anInt2854;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
	public int anInt2855;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V")
	public Class121() {
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!fv;)V")
	public Class121(@OriginalArg(0) Class121 arg0) {
		this.anInt2852 = arg0.anInt2852;
		this.anInt2853 = arg0.anInt2853;
		this.anInt2855 = arg0.anInt2855;
		this.anInt2854 = arg0.anInt2854;
	}
}
