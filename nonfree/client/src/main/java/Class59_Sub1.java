import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	private final int anInt1665;

	static {
		new Class55("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!vd;II[BI)V")
	public Class59_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt1665 = arg2;
		super.aClass51_Sub2_43.method5364(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt7465, 0, super.anInt7474, this.anInt1665, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5760(true);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	@Override
	public void method5755() {
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)V")
	public void method1438() {
		super.aClass51_Sub2_43.method5364(this);
		OpenGL.glTexParameteri(super.anInt7465, 10242, 33071);
	}
}
