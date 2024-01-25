import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class25_Sub1 extends Class25 implements Interface15 {

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
	private final int anInt1397;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
	private final int anInt1390;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!hl;Lclient!kt;Lclient!kq;II)V")
	public Class25_Sub1(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt1397 = arg4;
		this.anInt1390 = arg3;
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glTexImage2Dub(super.anInt10584, 0, this.method8616(), arg3, arg4, 0, Static360.method5822(super.aClass178_15), Static157.method3088(super.aClass176_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!hl;Lclient!kt;IIZ[FII)V")
	public Class25_Sub1(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static302.aClass176_12, arg2 * arg3, arg4);
		this.anInt1397 = arg3;
		this.anInt1390 = arg2;
		super.aClass5_Sub2_Sub2_12.method4008(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt10584, 0, this.method8616(), arg2, arg3, 0, Static360.method5822(super.aClass178_15), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method8612(arg2, arg5, arg3, super.anInt10584);
		}
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!hl;Lclient!kt;IIZ[BII)V")
	public Class25_Sub1(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static302.aClass176_8, arg2 * arg3, arg4);
		this.anInt1397 = arg3;
		this.anInt1390 = arg2;
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method8615(arg5, arg3, arg2, super.anInt10584);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt10584, 0, this.method8616(), arg2, arg3, 0, Static360.method5822(super.aClass178_15), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!hl;IIZ[III)V")
	public Class25_Sub1(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static120.aClass178_4, Static302.aClass176_8, arg2 * arg1, arg3);
		this.anInt1397 = arg2;
		this.anInt1390 = arg1;
		super.aClass5_Sub2_Sub2_12.method4008(this);
		if (arg3 && arg6 == 0) {
			this.method8620(arg1, arg4, arg2, super.anInt10584);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt10584, 0, 6408, this.anInt1390, this.anInt1397, 0, 32993, super.aClass5_Sub2_Sub2_12.anInt4984, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8452(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glTexParameteri(super.anInt10584, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt10584, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)I")
	@Override
	public int method8453() {
		return this.anInt1390;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([FLclient!kt;IIBIIII)V")
	public void method1327(@OriginalArg(0) float[] arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt10584, 0, 0, 0, arg3, arg2, Static360.method5822(arg1), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
	@Override
	public int method8449() {
		return this.anInt1397;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII[BLclient!kt;I)V")
	@Override
	public void method8447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) Class178 arg4) {
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt10584, 0, 0, 0, arg1, arg2, Static360.method5822(arg4), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IF)F")
	@Override
	public float method8451(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1397;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method8455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glPixelStorei(3314, arg4);
		OpenGL.glTexSubImage2Di(super.anInt10584, 0, arg3, arg0, arg5, arg1, 32993, super.aClass5_Sub2_Sub2_12.anInt4984, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8454() {
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BF)F")
	@Override
	public float method8448(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1390;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBII[II)V")
	@Override
	public void method8450(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int[] arg2) {
		@Pc(12) int[] local12 = new int[this.anInt1397 * this.anInt1390];
		super.aClass5_Sub2_Sub2_12.method4008(this);
		OpenGL.glGetTexImagei(super.anInt10584, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg1; local27++) {
			Static653.method6534(local12, (arg1 - local27 - 1) * this.anInt1390, arg2, arg0 * local27, arg0);
		}
	}
}
