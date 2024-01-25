import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public class Class245_Sub2 extends Class245 {

	@OriginalMember(owner = "client!nw", name = "H", descriptor = "I")
	private int anInt10083 = -1;

	@OriginalMember(owner = "client!nw", name = "C", descriptor = "I")
	private int anInt10087 = -1;

	@OriginalMember(owner = "client!nw", name = "G", descriptor = "I")
	public final int anInt10091;

	@OriginalMember(owner = "client!nw", name = "z", descriptor = "I")
	public final int anInt10092;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!gia;IIIIZ[FI)V")
	public Class245_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt10091 = arg3;
		this.anInt10092 = arg4;
		super.aClass67_Sub2_40.method3234(this);
		if (arg5 && super.anInt10362 != 34037) {
			Static327.method4884(arg3, arg4, arg2, arg1, arg6, arg7);
			this.method8681(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt10362, 0, super.anInt10366, this.anInt10091, this.anInt10092, 0, arg7, 5126, arg6, 0);
			this.method8681(false);
		}
		this.method8672(true);
	}

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!gia;IIII)V")
	public Class245_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt10092 = arg4;
		this.anInt10091 = arg3;
		super.aClass67_Sub2_40.method3234(this);
		OpenGL.glTexImage2Dub(super.anInt10362, 0, super.anInt10366, arg3, arg4, 0, Static668.method2973(super.anInt10366), 5121, (byte[]) null, 0);
		this.method8672(true);
	}

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!gia;IIIII)V")
	public Class245_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt10091 = arg4;
		this.anInt10092 = arg5;
		@Pc(30) int local30 = super.aClass67_Sub2_40.anInt3828 - arg5 - arg3;
		super.aClass67_Sub2_40.method3234(this);
		OpenGL.glCopyTexImage2D(super.anInt10362, 0, super.anInt10366, arg2, local30, arg4, arg5, 0);
		this.method8672(true);
	}

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!gia;IIIIZ[IIIZ)V")
	public Class245_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt10092 = arg4;
		this.anInt10091 = arg3;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(44) int local44 = (arg4 - local30 - 1) * arg3;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass67_Sub2_40.method3234(this);
		if (super.anInt10362 != 34037 && arg5 && arg7 == 0 && arg8 == 0) {
			Static25.method374(arg6, super.anInt10362, super.anInt10366, this.anInt10092, super.aClass67_Sub2_40.anInt3899, this.anInt10091);
			this.method8681(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt10362, 0, super.anInt10366, this.anInt10091, this.anInt10092, 0, 32993, super.aClass67_Sub2_40.anInt3899, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method8681(false);
		}
		this.method8672(true);
	}

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!gia;IIIIZ[BIZ)V")
	public Class245_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt10092 = arg4;
		this.anInt10091 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass67_Sub2_40.method3234(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt10362 != 34037) {
			Static699.method9148(arg2, arg4, arg7, arg1, arg3, arg6);
			this.method8681(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt10362, 0, super.anInt10366, this.anInt10091, this.anInt10092, 0, arg7, 5121, arg6, 0);
			this.method8681(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method8672(true);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V")
	@Override
	public final void method8671() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt10087, this.anInt10083, super.anInt10362, 0, 0);
		this.anInt10087 = -1;
		this.anInt10083 = -1;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIII)V")
	public final void method8467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt10362, super.anInt10370, 0);
		this.anInt10087 = arg1;
		this.anInt10083 = arg0;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZIIZI[BIIII)V")
	public final void method8468(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(8) int arg4) {
		if (arg0) {
			@Pc(22) int local22 = Static291.method4409(6406);
			@Pc(26) int local26 = local22 * arg4;
			@Pc(30) int local30 = arg4 * local22;
			@Pc(35) byte[] local35 = new byte[arg2 * local26];
			for (@Pc(37) int local37 = 0; local37 < arg2; local37++) {
				@Pc(43) int local43 = local37 * local26;
				@Pc(54) int local54 = (arg2 - local37 - 1) * local30;
				for (@Pc(56) int local56 = 0; local56 < local26; local56++) {
					local35[local43++] = arg3[local54++];
				}
			}
			arg3 = local35;
		}
		super.aClass67_Sub2_40.method3234(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10362, 0, 0, 0, arg4, arg2, 6406, 5121, arg3, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(III[IIIZIB)V")
	public final void method8469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == 0) {
			arg3 = arg5;
		}
		@Pc(16) int[] local16 = new int[arg4 * arg5];
		for (@Pc(18) int local18 = 0; local18 < arg4; local18++) {
			@Pc(24) int local24 = local18 * arg5;
			@Pc(35) int local35 = arg3 * (arg4 - local18 - 1);
			for (@Pc(37) int local37 = 0; local37 < arg5; local37++) {
				local16[local24++] = arg2[local35++];
			}
		}
		super.aClass67_Sub2_40.method3234(this);
		if (arg3 != arg5) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt10362, 0, arg1, this.anInt10092 - arg0 - arg4, arg5, arg4, 32993, super.aClass67_Sub2_40.anInt3899, local16, 0);
		if (arg5 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIBIIII)V")
	public final void method8470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = super.aClass67_Sub2_40.anInt3828 - arg0 - arg1;
		super.aClass67_Sub2_40.method3234(this);
		OpenGL.glCopyTexSubImage2D(super.anInt10362, 0, arg4, this.anInt10092 - arg1 - arg2, arg5, local17, arg3, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZBZ)V")
	public final void method8473(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt10362 == 3553) {
			super.aClass67_Sub2_40.method3234(this);
			OpenGL.glTexParameteri(super.anInt10362, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt10362, 10243, arg0 ? 10497 : 33071);
		}
	}
}
