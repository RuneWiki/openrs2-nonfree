import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
	public int anInt4473;

	@OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
	public int anInt4475;

	@OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
	public int anInt4477;

	@OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
	public int anInt4478;

	@OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
	public int anInt4484;

	@OriginalMember(owner = "client!ol", name = "y", descriptor = "Lclient!hp;")
	public final Class85 aClass85_2;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "Lclient!sb;")
	public final Class183 aClass183_1;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!hp;Lclient!jl;)V")
	public Class1_Sub1_Sub15(@OriginalArg(0) Class85 arg0, @OriginalArg(1) Class15_Sub5 arg1) {
		this.aClass85_2 = arg0;
		this.aClass183_1 = Static125.method2401(arg0.anInt2518);
		this.method4124();
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
	public void method4124() {
		this.anInt4484 = this.aClass85_2.anInt2510;
		this.anInt4477 = this.aClass85_2.anInt2517;
		this.anInt4475 = this.aClass85_2.anInt2509;
		if (this.aClass85_2.aClass21_2 != null) {
			this.aClass85_2.aClass21_2.method2807(this.aClass183_1.anInt5443, this.aClass183_1.anInt5431, this.aClass183_1.anInt5438, Static265.anIntArray643);
		}
		this.anInt4473 = Static265.anIntArray643[2];
		this.anInt4478 = Static265.anIntArray643[0];
	}
}
