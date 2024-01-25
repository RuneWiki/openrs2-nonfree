import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class291 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[16384];

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[F")
	public static final float[] aFloatArray71 = new float[16384];

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	private final int anInt8658;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray71[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray70[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!ad;I)V")
	public Class291(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt8658 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V")
	public void method7121(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt8658, 4864);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(CB)V")
	public void method7122(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt8658);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public void method7124() {
		OpenGL.glEndList();
	}
}
