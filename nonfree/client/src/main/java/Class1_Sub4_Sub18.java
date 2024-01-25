import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class1_Sub4_Sub18 extends Class1_Sub4 {

	@OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
	public int anInt4184;

	@OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
	public int anInt4187;

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
	public int anInt4188;

	@OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
	public int anInt4189;

	@OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
	public int anInt4191;

	@OriginalMember(owner = "client!nf", name = "J", descriptor = "Lclient!jo;")
	public final Class107 aClass107_2;

	@OriginalMember(owner = "client!nf", name = "R", descriptor = "Lclient!jg;")
	public final Class102 aClass102_1;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!jo;Lclient!dj;)V")
	public Class1_Sub4_Sub18(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class32_Sub2 arg1) {
		this.aClass107_2 = arg0;
		this.aClass102_1 = Static78.method1685(arg0.anInt3189);
		this.method3868();
	}

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
	public void method3868() {
		this.anInt4184 = this.aClass107_2.anInt3183;
		this.anInt4191 = this.aClass107_2.anInt3185;
		this.anInt4188 = this.aClass107_2.anInt3186;
		if (this.aClass107_2.aClass129_1 != null) {
			this.aClass107_2.aClass129_1.method5772(this.aClass102_1.anInt3117, this.aClass102_1.anInt3128, this.aClass102_1.anInt3125, Static13.anIntArray28);
		}
		this.anInt4189 = Static13.anIntArray28[0];
		this.anInt4187 = Static13.anIntArray28[2];
	}
}
