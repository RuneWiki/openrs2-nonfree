import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
	public int anInt633;

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
	public int anInt636;

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
	public int anInt638;

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "Lclient!qe;")
	public final Class199 aClass199_1;

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "Lclient!sq;")
	public final Class228 aClass228_1;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!qe;Lclient!bv;)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) Class199 arg0, @OriginalArg(1) Class21_Sub2 arg1) {
		this.aClass199_1 = arg0;
		this.aClass228_1 = this.aClass199_1.method4353();
		this.method499();
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V")
	public void method499() {
		this.anInt638 = this.aClass199_1.anInt5496;
		this.anInt634 = this.aClass199_1.anInt5497;
		this.anInt636 = this.aClass199_1.anInt5502;
		if (this.aClass199_1.aClass31_4 != null) {
			this.aClass199_1.aClass31_4.K(this.aClass228_1.anInt6214, this.aClass228_1.anInt6217, this.aClass228_1.anInt6216, Static202.anIntArray298);
		}
		this.anInt635 = Static202.anIntArray298[0];
		this.anInt633 = Static202.anIntArray298[2];
	}
}
