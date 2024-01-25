import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class98 {

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
	private final int anInt2669;

	static {
		new Class242("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!bv;I)V")
	public Class98(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt2669 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)V")
	public void method2003(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt2669 + arg0, 4864);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	public void method2004() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IC)V")
	public void method2005(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt2669 + arg0);
	}
}
