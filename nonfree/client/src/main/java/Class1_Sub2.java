import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
	private int anInt4342 = -1;

	@OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
	private int anInt4345 = -1;

	@OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
	public final int anInt4346;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!bv;II)V")
	public Class1_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt4346 = arg2;
		super.aClass30_Sub1_36.method916(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5551, arg2, arg2, 0, Static4.method121(super.anInt5551), 5121, null, 0);
		}
		this.method4273(true);
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!bv;IIZ[[I)V")
	public Class1_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt4346 = arg2;
		super.aClass30_Sub1_36.method916(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static453.method5620(super.anInt5551, local30 + 34069, super.aClass30_Sub1_36.bf, arg2, arg4[local30], arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt5551, arg2, arg2, 0, 32993, super.aClass30_Sub1_36.bf, arg4[local30], 0);
			}
		}
		this.method4273(true);
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!bv;IIZ[[BI)V")
	public Class1_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt4346 = arg2;
		super.aClass30_Sub1_36.method916(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5551, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method4273(true);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
	@Override
	public void method4264() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4342, this.anInt4345, 3553, 0, 0);
		this.anInt4345 = -1;
		this.anInt4342 = -1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIII)V")
	public void method3285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt5557, 0);
		this.anInt4342 = arg2;
		this.anInt4345 = arg1;
	}
}
