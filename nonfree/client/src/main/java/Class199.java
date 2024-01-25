import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public final class Class199 {

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_38;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
	private final int anInt6066;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!h;I)V")
	public Class199(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass32_Sub2_38 = arg0;
		this.anInt6066 = this.aClass32_Sub2_38.anOpengl2.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "()V")
	public void method5168() {
		this.aClass32_Sub2_38.anOpengl2.glEndList();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	public void method5169(@OriginalArg(0) int arg0) {
		this.aClass32_Sub2_38.anOpengl2.glNewList(this.anInt6066 + arg0, 4864);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(C)V")
	public void method5170(@OriginalArg(0) char arg0) {
		this.aClass32_Sub2_38.anOpengl2.glCallList(this.anInt6066 + arg0);
	}
}
