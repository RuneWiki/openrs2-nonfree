import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class57 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_14;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	private final int anInt1814;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!po;I)V")
	public Class57(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass59_Sub1_14 = arg0;
		this.anInt1814 = this.aClass59_Sub1_14.anOpengl2.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(C)V")
	public void method1598(@OriginalArg(0) char arg0) {
		this.aClass59_Sub1_14.anOpengl2.glCallList(this.anInt1814 + arg0);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "()V")
	public void method1599() {
		this.aClass59_Sub1_14.anOpengl2.glEndList();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public void method1600(@OriginalArg(0) int arg0) {
		this.aClass59_Sub1_14.anOpengl2.glNewList(this.anInt1814 + arg0, 4864);
	}
}
