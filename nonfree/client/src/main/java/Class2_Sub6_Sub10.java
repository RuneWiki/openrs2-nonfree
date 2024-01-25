import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class2_Sub6_Sub10 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
	public int anInt5717;

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
	public int anInt5718;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
	public int anInt5719;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
	public int anInt5720;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
	public int anInt5721;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "Lclient!uc;")
	public final Class363 aClass363_1;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "Lclient!ve;")
	public final Class379 aClass379_1;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!uc;Lclient!hv;)V")
	public Class2_Sub6_Sub10(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class4_Sub7 arg1) {
		this.aClass363_1 = arg0;
		this.aClass379_1 = this.aClass363_1.method8646();
		this.method5143();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void method5143() {
		this.anInt5720 = this.aClass363_1.anInt9786;
		this.anInt5719 = this.aClass363_1.anInt9787;
		this.anInt5717 = this.aClass363_1.anInt9783;
		if (this.aClass363_1.aClass86_10 != null) {
			this.aClass363_1.aClass86_10.method7033(this.aClass379_1.anInt10442, this.aClass379_1.anInt10433, this.aClass379_1.anInt10443, Static347.anIntArray374);
		}
		this.anInt5718 = Static347.anIntArray374[0];
		this.anInt5721 = Static347.anIntArray374[2];
	}
}
