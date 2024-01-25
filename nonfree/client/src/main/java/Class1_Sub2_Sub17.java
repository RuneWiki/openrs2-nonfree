import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
	public int anInt5754;

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
	public int anInt5755;

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
	public int anInt5756;

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
	public int anInt5761;

	@OriginalMember(owner = "client!sq", name = "N", descriptor = "I")
	public int anInt5764;

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "Lclient!kg;")
	public final Class123 aClass123_2;

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "Lclient!ja;")
	public final Class112 aClass112_1;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!kg;Lclient!kr;)V")
	public Class1_Sub2_Sub17(@OriginalArg(0) Class123 arg0, @OriginalArg(1) Class7_Sub7 arg1) {
		this.aClass123_2 = arg0;
		this.aClass112_1 = Static275.method4910(arg0.anInt3080);
		this.method5028();
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(I)V")
	public void method5028() {
		this.anInt5754 = this.aClass123_2.anInt3082;
		this.anInt5755 = this.aClass123_2.anInt3088;
		this.anInt5764 = this.aClass123_2.anInt3087;
		if (this.aClass123_2.aClass31_4 != null) {
			this.aClass123_2.aClass31_4.method3175(this.aClass112_1.anInt2696, this.aClass112_1.anInt2683, this.aClass112_1.anInt2686, Static136.anIntArray271);
		}
		this.anInt5756 = Static136.anIntArray271[0];
		this.anInt5761 = Static136.anIntArray271[2];
	}
}
