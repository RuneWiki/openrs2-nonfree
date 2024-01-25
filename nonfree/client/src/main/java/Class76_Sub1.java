import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
	private int anInt2303 = -1;

	@OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
	private int anInt2305 = -1;

	@OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
	public final int anInt2308;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!kw;IIZ[[I)V")
	public Class76_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt2308 = arg2;
		super.aClass5_Sub2_36.method4997(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static32.method6777(super.aClass5_Sub2_36.anInt5660, arg4[local30], super.anInt9207, arg2, arg2, local30 + 34069);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9207, arg2, arg2, 0, 32993, super.aClass5_Sub2_36.anInt5660, arg4[local30], 0);
			}
		}
		this.method7930(true);
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!kw;IIZ[[BI)V")
	public Class76_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt2308 = arg2;
		super.aClass5_Sub2_36.method4997(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9207, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method7930(true);
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!kw;II)V")
	public Class76_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt2308 = arg2;
		super.aClass5_Sub2_36.method4997(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9207, arg2, arg2, 0, Static140.method2607(super.anInt9207), 5121, null, 0);
		}
		this.method7930(true);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIBI)V")
	public void method2165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.anInt9205, 0);
		this.anInt2305 = arg2;
		this.anInt2303 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	@Override
	public void method7922() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2305, this.anInt2303, 3553, 0, 0);
		this.anInt2305 = -1;
		this.anInt2303 = -1;
	}
}
