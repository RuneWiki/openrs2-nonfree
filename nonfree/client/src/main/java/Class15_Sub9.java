import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public final class Class15_Sub9 extends Class15 {

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "Lclient!eu;")
	private Class2_Sub21 aClass2_Sub21_3;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
	private final int anInt3531;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	private final int anInt3529;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub9(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt3531 = arg0.method8575();
		this.anInt3529 = arg0.method8581(-17416);
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9377() {
		if (this.aClass2_Sub21_3 == null) {
			this.aClass2_Sub21_3 = Static729.method2358(Static177.aClass254_66, this.anInt3531, 0);
		}
		if (this.aClass2_Sub21_3 == null) {
			return false;
		} else {
			return Static56.method898(this.aClass2_Sub21_3);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static313.method4362(this.anInt3529, this.aClass2_Sub21_3);
	}
}
