import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class Class1_Sub6_Sub15 extends Class1_Sub6 {

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
	public int anInt8153;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
	public int anInt8156;

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
	public int anInt8158;

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
	public int anInt8159;

	@OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
	public int anInt8161;

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "Lclient!in;")
	public final Class158 aClass158_2;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "Lclient!cfa;")
	public final Class50 aClass50_1;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!in;Lclient!mca;)V")
	public Class1_Sub6_Sub15(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class8_Sub7 arg1) {
		this.aClass158_2 = arg0;
		this.aClass50_1 = this.aClass158_2.method3423();
		this.method6554();
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
	public void method6554() {
		this.anInt8156 = this.aClass158_2.anInt4244;
		this.anInt8159 = this.aClass158_2.anInt4247;
		this.anInt8161 = this.aClass158_2.anInt4249;
		if (this.aClass158_2.aClass113_1 != null) {
			this.aClass158_2.aClass113_1.wa(this.aClass50_1.anInt1085, this.aClass50_1.anInt1091, this.aClass50_1.anInt1088, Static387.anIntArray523);
		}
		this.anInt8158 = Static387.anIntArray523[0];
		this.anInt8153 = Static387.anIntArray523[2];
	}
}
