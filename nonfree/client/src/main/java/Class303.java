import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class303 {

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
	private final int anInt8094;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!ep;I)V")
	public Class303(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt8094 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IC)V")
	public void method6856(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt8094);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public void method6857() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
	public void method6859(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt8094 + arg0, 4864);
	}
}
