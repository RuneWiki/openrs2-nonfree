import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class147 {

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "[F")
	public static final float[] aFloatArray13 = new float[16384];

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[16384];

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
	private final int anInt3752;

	static {
		@Pc(11) double local11 = 3.834951969714103E-4D;
		for (@Pc(13) int local13 = 0; local13 < 16384; local13++) {
			aFloatArray14[local13] = (float) Math.sin((double) local13 * local11);
			aFloatArray13[local13] = (float) Math.cos(local11 * (double) local13);
		}
		new Class134("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!pg;I)V")
	public Class147(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt3752 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BC)V")
	public void method3026(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt3752 + arg0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
	public void method3028(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt3752 + arg0, 4864);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	public void method3029() {
		OpenGL.glEndList();
	}
}
