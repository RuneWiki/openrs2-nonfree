import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class138 {

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "Lclient!pa;")
	private Class249 aClass249_1;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "Lclient!ri;")
	private final Class284 aClass284_64;

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "Lclient!ri;")
	private final Class284 aClass284_65;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lclient!ri;Lclient!ri;)V")
	public Class138(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class284 arg1) {
		this.aClass284_64 = arg0;
		this.aClass284_65 = arg1;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILclient!jfa;)Lclient!at;")
	public Interface1 method3598(@OriginalArg(1) Interface9 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class95 local11 = arg0.method6314();
		if (Static138.aClass95_2 == local11) {
			return new Class274((Class224) arg0);
		} else if (Static591.aClass95_10 == local11) {
			return new Class304(this.method3599(), (Class79) arg0);
		} else if (Static6.aClass95_1 == local11) {
			return new Class158(this.aClass284_64, (Class46) arg0);
		} else if (local11 == Static590.aClass95_9) {
			return new Class158_Sub1(this.aClass284_64, (Class46_Sub1) arg0);
		} else if (Static431.aClass95_7 == local11) {
			return new Class94_Sub1(this.aClass284_64, this.aClass284_65, (Class38_Sub2) arg0);
		} else if (local11 == Static337.aClass95_5) {
			return new Class94_Sub2(this.aClass284_64, this.aClass284_65, (Class38_Sub3) arg0);
		} else if (local11 == Static418.aClass95_6) {
			return new Class94_Sub3(this.aClass284_64, this.aClass284_65, (Class38_Sub1) arg0);
		} else if (local11 == Static549.aClass95_8) {
			return new Class343(this.aClass284_64, this.aClass284_65, (Class149) arg0);
		} else if (local11 == Static150.aClass95_3) {
			return new Class86(this.aClass284_64, (Class8) arg0);
		} else if (Static153.aClass95_4 == local11) {
			return new Class94_Sub3_Sub1(this.aClass284_64, this.aClass284_65, (Class38_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)Lclient!pa;")
	private Class249 method3599() {
		if (this.aClass249_1 == null) {
			this.aClass249_1 = new Class249();
		}
		return this.aClass249_1;
	}
}
