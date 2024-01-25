import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class101 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "Lclient!q;")
	public Class209 aClass209_2;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "Lclient!fk;")
	public Class101 aClass101_1;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
	public int anInt2801;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
	public int anInt2802;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
	public int anInt2805;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	public final int anInt2800;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
	public final int anInt2803;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(II)V")
	public Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2800 = arg0;
		this.anInt2803 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)Lclient!fk;")
	public Class101 method2362(@OriginalArg(0) int arg0) {
		return new Class101(this.anInt2800, arg0);
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)Lclient!vi;")
	public Class343 method2365() {
		return Static486.method6808(this.anInt2800);
	}
}
