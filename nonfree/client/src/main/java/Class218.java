import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class218 {

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_40;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
	private final int anInt6508;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!hj;I)V")
	public Class218(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass2_Sub1_40 = arg0;
		this.anInt6508 = this.aClass2_Sub1_40.anOpengl1.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public void method5674(@OriginalArg(0) int arg0) {
		this.aClass2_Sub1_40.anOpengl1.glNewList(this.anInt6508 + arg0, 4864);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()V")
	public void method5675() {
		this.aClass2_Sub1_40.anOpengl1.glEndList();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(C)V")
	public void method5676(@OriginalArg(0) char arg0) {
		this.aClass2_Sub1_40.anOpengl1.glCallList(this.anInt6508 + arg0);
	}
}
