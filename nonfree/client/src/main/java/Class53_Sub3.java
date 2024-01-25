import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jka")
public final class Class53_Sub3 extends Class53 {

	@OriginalMember(owner = "client!jka", name = "x", descriptor = "I")
	private int anInt4821 = -1;

	@OriginalMember(owner = "client!jka", name = "A", descriptor = "I")
	private int anInt4824 = -1;

	@OriginalMember(owner = "client!jka", name = "y", descriptor = "I")
	public final int anInt4822;

	@OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(Lclient!pq;IIZ[[I)V")
	public Class53_Sub3(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt4822 = arg2;
		super.aClass132_Sub3_40.method6759(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static424.method6296(arg2, arg4[local30], super.anInt9821, arg2, local30 + 34069, super.aClass132_Sub3_40.anInt7918);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9821, arg2, arg2, 0, 32993, super.aClass132_Sub3_40.anInt7918, arg4[local30], 0);
			}
		}
		this.method8287(true);
	}

	@OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(Lclient!pq;II)V")
	public Class53_Sub3(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt4822 = arg2;
		super.aClass132_Sub3_40.method6759(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9821, arg2, arg2, 0, Static628.method8638(super.anInt9821), 5121, (byte[]) null, 0);
		}
		this.method8287(true);
	}

	@OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(Lclient!pq;IIZ[[BI)V")
	public Class53_Sub3(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt4822 = arg2;
		super.aClass132_Sub3_40.method6759(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9821, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method8287(true);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(I)V")
	@Override
	public void method8284() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4821, this.anInt4824, 3553, 0, 0);
		this.anInt4821 = -1;
		this.anInt4824 = -1;
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIBII)V")
	public void method4107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.anInt9819, 0);
		this.anInt4824 = arg2;
		this.anInt4821 = arg1;
	}
}
