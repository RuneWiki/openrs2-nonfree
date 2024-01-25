import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class66_Sub2 extends Class66 implements Interface20 {

	@OriginalMember(owner = "client!od", name = "G", descriptor = "I")
	private final int anInt6528;

	@OriginalMember(owner = "client!od", name = "E", descriptor = "I")
	private final int anInt6526;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!pi;Lclient!dk;Lclient!ge;II)V")
	public Class66_Sub2(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class114 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt6528 = arg4;
		this.anInt6526 = arg3;
		super.aClass42_Sub1_Sub2_9.method5868(this);
		OpenGL.glTexImage2Dub(super.anInt8488, 0, this.method6976(), arg3, arg4, 0, Static37.method6278(super.aClass72_14), Static481.method7156(super.aClass114_18), null, 0);
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!pi;Lclient!dk;II[BII)V")
	public Class66_Sub2(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static155.aClass114_6, arg2 * arg3, false);
		this.anInt6526 = arg2;
		this.anInt6528 = arg3;
		super.aClass42_Sub1_Sub2_9.method5868(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt8488, 0, this.method6976(), arg2, arg3, 0, Static37.method6278(super.aClass72_14), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!pi;Lclient!dk;II[FII)V")
	public Class66_Sub2(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static155.aClass114_10, arg2 * arg3, false);
		this.anInt6528 = arg3;
		this.anInt6526 = arg2;
		super.aClass42_Sub1_Sub2_9.method5868(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt8488, 0, this.method6976(), arg2, arg3, 0, Static37.method6278(super.aClass72_14), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!pi;II[III)V")
	public Class66_Sub2(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static306.aClass72_5, Static155.aClass114_6, arg2 * arg1, false);
		this.anInt6526 = arg1;
		this.anInt6528 = arg2;
		super.aClass42_Sub1_Sub2_9.method5868(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt8488, 0, 6408, this.anInt6526, this.anInt6528, 0, 32993, super.aClass42_Sub1_Sub2_9.anInt7221, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)I")
	@Override
	public int method6985() {
		return this.anInt6526;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IF)F")
	@Override
	public float method6984(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6982() {
		return false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method6988(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IF)F")
	@Override
	public float method6987(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)I")
	@Override
	public int method6981() {
		return this.anInt6528;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([IIIBIIII)V")
	@Override
	public void method6986(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == 0) {
			arg1 = arg3;
		}
		super.aClass42_Sub1_Sub2_9.method5868(this);
		if (arg3 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt8488, 0, arg5, arg2, arg3, arg4, 32993, super.aClass42_Sub1_Sub2_9.anInt7221, arg0, 0);
		if (arg3 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([BIILclient!dk;IIIII)V")
	@Override
	public void method6983(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class72 arg3, @OriginalArg(4) int arg4) {
		super.aClass42_Sub1_Sub2_9.method5868(this);
		if (arg2 == 0) {
			arg2 = arg4;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg4) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8488, 0, 0, 0, arg4, arg1, Static37.method6278(arg3), 5121, arg0, 0);
		if (arg4 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
