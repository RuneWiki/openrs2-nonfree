import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class24_Sub3 extends Class24 {

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
	private int anInt4265 = -1;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
	private int anInt4264 = -1;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	public final int anInt4260;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!rda;IIZ[[BI)V")
	public Class24_Sub3(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt4260 = arg2;
		super.aClass126_Sub3_30.method7113(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7714, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method6783(true);
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!rda;IIZ[[I)V")
	public Class24_Sub3(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt4260 = arg2;
		super.aClass126_Sub3_30.method7113(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static232.method3615(arg2, local30 + 34069, arg2, super.anInt7714, arg4[local30], super.aClass126_Sub3_30.anInt8314);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt7714, arg2, arg2, 0, 32993, super.aClass126_Sub3_30.anInt8314, arg4[local30], 0);
			}
		}
		this.method6783(true);
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!rda;II)V")
	public Class24_Sub3(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt4260 = arg2;
		super.aClass126_Sub3_30.method7113(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7714, arg2, arg2, 0, Static274.method8783(super.anInt7714), 5121, (byte[]) null, 0);
		}
		this.method6783(true);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	@Override
	public void method6776() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4264, this.anInt4265, 3553, 0, 0);
		this.anInt4264 = -1;
		this.anInt4265 = -1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZ)V")
	public void method3908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt7710, 0);
		this.anInt4264 = arg0;
		this.anInt4265 = arg2;
	}
}
