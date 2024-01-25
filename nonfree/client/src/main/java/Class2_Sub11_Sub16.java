import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class2_Sub11_Sub16 extends Class2_Sub11 {

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
	public int anInt5499;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
	public int anInt5500;

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
	public int anInt5501;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
	public int anInt5503;

	@OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
	public int anInt5510;

	@OriginalMember(owner = "client!rg", name = "T", descriptor = "Lclient!dj;")
	public final Class44 aClass44_2;

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "Lclient!ci;")
	public final Class32 aClass32_1;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!dj;Lclient!om;)V")
	public Class2_Sub11_Sub16(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class55_Sub7 arg1) {
		this.aClass44_2 = arg0;
		this.aClass32_1 = Static194.method3507(arg0.anInt1284);
		this.method4899();
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
	public void method4899() {
		this.anInt5501 = this.aClass44_2.anInt1281;
		this.anInt5500 = this.aClass44_2.anInt1279;
		this.anInt5503 = this.aClass44_2.anInt1280;
		if (this.aClass44_2.aClass133_2 != null) {
			this.aClass44_2.aClass133_2.method4330(this.aClass32_1.anInt783, this.aClass32_1.anInt775, this.aClass32_1.anInt781, Static96.anIntArray214);
		}
		this.anInt5499 = Static96.anIntArray214[0];
		this.anInt5510 = Static96.anIntArray214[2];
	}
}
