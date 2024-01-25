import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class20 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_2;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
	private final int anInt278;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!tb;I)V")
	public Class20(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass129_Sub2_2 = arg0;
		this.anInt278 = this.aClass129_Sub2_2.anOpengl2.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "()V")
	public void method221() {
		this.aClass129_Sub2_2.anOpengl2.glEndList();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public void method222(@OriginalArg(0) int arg0) {
		this.aClass129_Sub2_2.anOpengl2.glNewList(this.anInt278 + arg0, 4864);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(C)V")
	public void method223(@OriginalArg(0) char arg0) {
		this.aClass129_Sub2_2.anOpengl2.glCallList(this.anInt278 + arg0);
	}
}
