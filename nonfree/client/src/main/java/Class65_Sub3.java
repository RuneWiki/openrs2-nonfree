import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class65_Sub3 extends Class65 {

	@OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
	private int anInt4429 = -1;

	@OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
	private int anInt4431 = -1;

	@OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
	public final int anInt4432;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!ug;IIZ[[I)V")
	public Class65_Sub3(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt4432 = arg2;
		super.aClass135_Sub2_32.method5458(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static3.method33(arg2, super.aClass135_Sub2_32.anInt6800, super.anInt5981, arg2, local30 + 34069, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt5981, arg2, arg2, 0, 32993, super.aClass135_Sub2_32.anInt6800, arg4[local30], 0);
			}
		}
		this.method4771(true);
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!ug;IIZ[[BI)V")
	public Class65_Sub3(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt4432 = arg2;
		super.aClass135_Sub2_32.method5458(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5981, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method4771(true);
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!ug;II)V")
	public Class65_Sub3(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt4432 = arg2;
		super.aClass135_Sub2_32.method5458(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5981, arg2, arg2, 0, Static444.method5922(super.anInt5981), 5121, null, 0);
		}
		this.method4771(true);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	@Override
	public void method4759() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4429, this.anInt4431, 3553, 0, 0);
		this.anInt4429 = -1;
		this.anInt4431 = -1;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BIIII)V")
	public void method3535(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt5972, 0);
		this.anInt4431 = arg1;
		this.anInt4429 = arg2;
	}
}
