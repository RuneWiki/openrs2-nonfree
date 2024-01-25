import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
	private int anInt6714 = -1;

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
	private int anInt6712 = -1;

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
	public final int anInt6710;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!jj;IIZ[[I)V")
	public Class4_Sub4(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt6710 = arg2;
		super.aClass62_Sub3_28.method4007(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static212.method3445(local30 + 34069, super.anInt6703, arg4[local30], arg2, arg2, super.aClass62_Sub3_28.anInt4631);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt6703, arg2, arg2, 0, 32993, super.aClass62_Sub3_28.anInt4631, arg4[local30], 0);
			}
		}
		this.method5502(true);
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!jj;II)V")
	public Class4_Sub4(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt6710 = arg2;
		super.aClass62_Sub3_28.method4007(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6703, arg2, arg2, 0, Static366.method5588(super.anInt6703), 5121, null, 0);
		}
		this.method5502(true);
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!jj;IIZ[[BI)V")
	public Class4_Sub4(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt6710 = arg2;
		super.aClass62_Sub3_28.method4007(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6703, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5502(true);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	@Override
	public void method5490() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6714, this.anInt6712, 3553, 0, 0);
		this.anInt6712 = -1;
		this.anInt6714 = -1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIBI)V")
	public void method5505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.anInt6694, 0);
		this.anInt6712 = arg2;
		this.anInt6714 = arg1;
	}
}
