import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class25_Sub3 extends Class25 implements Interface15 {

	@OriginalMember(owner = "client!vca", name = "F", descriptor = "I")
	private final int anInt10032;

	@OriginalMember(owner = "client!vca", name = "K", descriptor = "I")
	private final int anInt10037;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!hl;Lclient!kt;II[BII)V")
	public Class25_Sub3(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static302.aClass176_8, arg3 * arg2, false);
		this.anInt10032 = arg2;
		this.anInt10037 = arg3;
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt10584, 0, this.method8616(), arg2, arg3, 0, Static360.method5822(super.aClass178_15), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!hl;II[III)V")
	public Class25_Sub3(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static120.aClass178_4, Static302.aClass176_8, arg1 * arg2, false);
		this.anInt10037 = arg2;
		this.anInt10032 = arg1;
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt10584, 0, 6408, this.anInt10032, this.anInt10037, 0, 32993, super.aClass5_Sub2_Sub2_12.anInt4984, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!hl;Lclient!kt;II[FII)V")
	public Class25_Sub3(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static302.aClass176_12, arg3 * arg2, false);
		this.anInt10037 = arg3;
		this.anInt10032 = arg2;
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt10584, 0, this.method8616(), arg2, arg3, 0, Static360.method5822(super.aClass178_15), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!hl;Lclient!kt;Lclient!kq;II)V")
	public Class25_Sub3(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt10037 = arg4;
		this.anInt10032 = arg3;
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glTexImage2Dub(super.anInt10584, 0, this.method8616(), arg3, arg4, 0, Static360.method5822(super.aClass178_15), Static157.method3088(super.aClass176_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IF)F")
	@Override
	public float method8451(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)I")
	@Override
	public int method8453() {
		return this.anInt10032;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIIII[BLclient!kt;I)V")
	@Override
	public void method8447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) Class178 arg4) {
		if (arg0 == 0) {
			arg0 = arg1;
		}
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10584, 0, 0, 0, arg1, arg2, Static360.method5822(arg4), 5121, arg3, 0);
		if (arg0 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BF)F")
	@Override
	public float method8448(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)I")
	@Override
	public int method8449() {
		return this.anInt10037;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8452(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIBII[II)V")
	@Override
	public void method8450(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int[] arg2) {
		@Pc(20) int[] local20 = new int[this.anInt10032 * this.anInt10037];
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glGetTexImagei(super.anInt10584, 0, 32993, 5121, local20, 0);
		for (@Pc(35) int local35 = 0; local35 < arg1; local35++) {
			Static653.method6534(local20, (arg1 - local35 - 1) * this.anInt10032, arg2, arg0 * local35, arg0);
		}
	}

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8454() {
		return false;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method8455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass5_Sub2_Sub2_12.method4008(this);
		if (arg4 == 0) {
			arg4 = arg5;
		}
		if (arg4 != arg5) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Di(super.anInt10584, 0, arg3, arg0, arg5, arg1, 32993, super.aClass5_Sub2_Sub2_12.anInt4984, arg2, 0);
		if (arg5 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
