import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class178 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_33;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "I")
	private final int anInt4558;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!nm;I)V")
	public Class178(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass164_Sub1_33 = arg0;
		this.anInt4558 = this.aClass164_Sub1_33.anOpengl1.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public void method4028(@OriginalArg(0) int arg0) {
		this.aClass164_Sub1_33.anOpengl1.glNewList(this.anInt4558 + arg0, 4864);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(C)V")
	public void method4029(@OriginalArg(0) char arg0) {
		this.aClass164_Sub1_33.anOpengl1.glCallList(this.anInt4558 + arg0);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
	public void method4030() {
		this.aClass164_Sub1_33.anOpengl1.glEndList();
	}
}
