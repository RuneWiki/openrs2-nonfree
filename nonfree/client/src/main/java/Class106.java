import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class106 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
	public int anInt2800;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
	public int anInt2801;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "Lclient!m;")
	public Class128 aClass128_3;

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "Lclient!fr;")
	public Class106 aClass106_1;

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
	public int anInt2809;

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
	public final int anInt2810;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
	public final int anInt2799;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(II)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2810 = arg1;
		this.anInt2799 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!fr;I)V")
	public Class106(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1) {
		this.aClass106_1 = arg0;
		this.anInt2799 = this.aClass106_1.anInt2799;
		this.anInt2810 = this.aClass106_1.anInt2810 + arg1;
		this.aClass128_3 = this.aClass106_1.aClass128_3;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)Lclient!fr;")
	public Class106 method2618(@OriginalArg(0) int arg0) {
		return new Class106(this.anInt2799, arg0);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)Lclient!pg;")
	public Class226 method2621() {
		return Static111.method2227(this.anInt2799);
	}
}
