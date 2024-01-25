import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class365 {

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "[C")
	private static final char[] aCharArray8 = new char[64];

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	private final int anInt10065;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray8[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray8[local20] = (char) (local20 + 71);
		}
		for (@Pc(34) int local34 = 52; local34 < 62; local34++) {
			aCharArray8[local34] = (char) (local34 + 48 - 52);
		}
		aCharArray8[63] = '/';
		aCharArray8[62] = '+';
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!bi;I)V")
	public Class365(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt10065 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
	public void method8546(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt10065 + arg0, 4864);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(CI)V")
	public void method8548(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt10065);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public void method8549() {
		OpenGL.glEndList();
	}
}
