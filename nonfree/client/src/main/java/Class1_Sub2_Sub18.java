import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
	public int anInt8093;

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
	public int anInt8095;

	@OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
	public int anInt8097;

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
	public int anInt8098;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
	public int anInt8099;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "Lclient!fr;")
	public final Class106 aClass106_2;

	@OriginalMember(owner = "client!tj", name = "H", descriptor = "Lclient!pg;")
	public final Class226 aClass226_1;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!fr;Lclient!ts;)V")
	public Class1_Sub2_Sub18(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class46_Sub7 arg1) {
		this.aClass106_2 = arg0;
		this.aClass226_1 = this.aClass106_2.method2621();
		this.method7146();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public void method7146() {
		this.anInt8097 = this.aClass106_2.anInt2801;
		this.anInt8093 = this.aClass106_2.anInt2809;
		this.anInt8095 = this.aClass106_2.anInt2800;
		if (this.aClass106_2.aClass128_3 != null) {
			this.aClass106_2.aClass128_3.I(this.aClass226_1.anInt6671, this.aClass226_1.anInt6660, this.aClass226_1.anInt6668, Static327.anIntArray608);
		}
		this.anInt8098 = Static327.anIntArray608[2];
		this.anInt8099 = Static327.anIntArray608[0];
	}
}
