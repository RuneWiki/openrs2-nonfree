import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
	private int anInt2054 = -1;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
	private int anInt2059 = -1;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public final int anInt2060;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!bo;IIZ[[I)V")
	public Class65_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt2060 = arg2;
		super.aClass26_Sub1_26.method673(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static186.method2957(arg2, arg4[local30], super.anInt5260, super.aClass26_Sub1_26.anInt939, local30 + 34069, arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt5260, arg2, arg2, 0, 32993, super.aClass26_Sub1_26.anInt939, arg4[local30], 0);
			}
		}
		this.method4263(true);
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!bo;IIZ[[BI)V")
	public Class65_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt2060 = arg2;
		super.aClass26_Sub1_26.method673(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5260, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method4263(true);
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!bo;II)V")
	public Class65_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt2060 = arg2;
		super.aClass26_Sub1_26.method673(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5260, arg2, arg2, 0, Static449.method1966(super.anInt5260), 5121, null, 0);
		}
		this.method4263(true);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	@Override
	public void method4255() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2059, this.anInt2054, 3553, 0, 0);
		this.anInt2054 = -1;
		this.anInt2059 = -1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V")
	public void method1521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt5269, 0);
		this.anInt2054 = arg2;
		this.anInt2059 = arg0;
	}
}
