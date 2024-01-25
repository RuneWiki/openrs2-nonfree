import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class95 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	public int anInt2938;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	public int anInt2939;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	public int anInt2941;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	public int anInt2943;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "I")
	public int anInt2944;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	public int anInt2945;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "I")
	public int anInt2946;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "I")
	public int anInt2947;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	public int anInt2950;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "I")
	public int anInt2952;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "I")
	public int anInt2953;

	@OriginalMember(owner = "client!el", name = "r", descriptor = "I")
	public int anInt2954;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLclient!el;)Z")
	public boolean method2522(@OriginalArg(1) Class95 arg0) {
		return this.anInt2941 == arg0.anInt2941 && this.anInt2946 == arg0.anInt2946 && arg0.anInt2953 == this.anInt2953;
	}
}
