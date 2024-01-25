import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public final class Class57 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_10;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
	private final int anInt1735;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!ao;I)V")
	public Class57(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass4_Sub1_10 = arg0;
		this.anInt1735 = this.aClass4_Sub1_10.anOpengl1.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(C)V")
	public void method1809(@OriginalArg(0) char arg0) {
		this.aClass4_Sub1_10.anOpengl1.glCallList(this.anInt1735 + arg0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "()V")
	public void method1810() {
		this.aClass4_Sub1_10.anOpengl1.glEndList();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public void method1811(@OriginalArg(0) int arg0) {
		this.aClass4_Sub1_10.anOpengl1.glNewList(this.anInt1735 + arg0, 4864);
	}
}
