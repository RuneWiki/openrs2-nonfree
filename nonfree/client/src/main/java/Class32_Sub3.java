import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class32_Sub3 extends Class32 {

	@OriginalMember(owner = "client!od", name = "z", descriptor = "I")
	private int anInt7192 = -1;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "I")
	private int anInt7190 = -1;

	@OriginalMember(owner = "client!od", name = "B", descriptor = "I")
	public final int anInt7191;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!ffa;IIZ[[BI)V")
	public Class32_Sub3(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt7191 = arg2;
		super.aClass57_Sub2_36.method2362(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9805, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method8430(true);
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!ffa;IIZ[[I)V")
	public Class32_Sub3(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt7191 = arg2;
		super.aClass57_Sub2_36.method2362(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static341.method5175(super.anInt9805, arg2, super.aClass57_Sub2_36.anInt2760, arg2, local30 + 34069, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9805, arg2, arg2, 0, 32993, super.aClass57_Sub2_36.anInt2760, arg4[local30], 0);
			}
		}
		this.method8430(true);
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!ffa;II)V")
	public Class32_Sub3(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt7191 = arg2;
		super.aClass57_Sub2_36.method2362(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9805, arg2, arg2, 0, Static640.method8945(super.anInt9805), 5121, (byte[]) null, 0);
		}
		this.method8430(true);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	@Override
	public void method8965() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7190, this.anInt7192, 3553, 0, 0);
		this.anInt7190 = -1;
		this.anInt7192 = -1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIBI)V")
	public void method6221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.anInt9804, 0);
		this.anInt7192 = arg2;
		this.anInt7190 = arg1;
	}
}
