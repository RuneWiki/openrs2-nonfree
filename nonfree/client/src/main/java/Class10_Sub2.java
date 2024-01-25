import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
	private int anInt638 = -1;

	@OriginalMember(owner = "client!bq", name = "A", descriptor = "I")
	private int anInt637 = -1;

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "I")
	public final int anInt634;

	@OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
	public final int anInt639;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!bi;IIIIZ[FI)V")
	public Class10_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt634 = arg3;
		this.anInt639 = arg4;
		super.aClass13_Sub2_39.method1096(this);
		if (arg5 && super.anInt8418 != 34037) {
			Static30.method655(arg2, arg7, arg6, arg4, arg1, arg3);
			this.method7254(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt8418, 0, super.anInt8428, this.anInt634, this.anInt639, 0, arg7, 5126, arg6, 0);
			this.method7254(false);
		}
		this.method7260(true);
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!bi;IIIII)V")
	public Class10_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt639 = arg5;
		this.anInt634 = arg4;
		@Pc(30) int local30 = super.aClass13_Sub2_39.anInt980 - arg5 - arg3;
		super.aClass13_Sub2_39.method1096(this);
		OpenGL.glCopyTexImage2D(super.anInt8418, 0, super.anInt8428, arg2, local30, arg4, arg5, 0);
		this.method7260(true);
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!bi;IIII)V")
	public Class10_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt634 = arg3;
		this.anInt639 = arg4;
		super.aClass13_Sub2_39.method1096(this);
		OpenGL.glTexImage2Dub(super.anInt8418, 0, super.anInt8428, arg3, arg4, 0, Static241.method4099(super.anInt8428), 5121, (byte[]) null, 0);
		this.method7260(true);
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!bi;IIIIZ[IIIZ)V")
	public Class10_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt634 = arg3;
		this.anInt639 = arg4;
		if (arg9) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local28 * arg3;
				@Pc(42) int local42 = (arg4 - local28 - 1) * arg3;
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass13_Sub2_39.method1096(this);
		if (super.anInt8418 != 34037 && arg5 && arg7 == 0) {
			Static32.method731(this.anInt634, this.anInt639, super.aClass13_Sub2_39.anInt1093, super.anInt8428, super.anInt8418, arg6);
			this.method7254(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt8418, 0, super.anInt8428, this.anInt634, this.anInt639, 0, 32993, super.aClass13_Sub2_39.anInt1093, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method7254(false);
		}
		this.method7260(true);
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!bi;IIIIZ[BIZ)V")
	public Class10_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt639 = arg4;
		this.anInt634 = arg3;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local28 * arg3;
				@Pc(42) int local42 = (arg4 - local28 - 1) * arg3;
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass13_Sub2_39.method1096(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt8418 != 34037) {
			Static442.method6333(arg7, arg6, arg2, arg1, arg3, arg4);
			this.method7254(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt8418, 0, super.anInt8428, this.anInt634, this.anInt639, 0, arg7, 5121, arg6, 0);
			this.method7254(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method7260(true);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZZI)V")
	public final void method720(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt8418 == 3553) {
			super.aClass13_Sub2_39.method1096(this);
			OpenGL.glTexParameteri(super.anInt8418, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt8418, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	@Override
	public final void method7251() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt637, this.anInt638, super.anInt8418, 0, 0);
		this.anInt637 = -1;
		this.anInt638 = -1;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZIIII[IIB)V")
	public final void method721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		if (arg2 == 0) {
			arg2 = arg4;
		}
		@Pc(17) int[] local17 = new int[arg1 * arg4];
		for (@Pc(19) int local19 = 0; local19 < arg1; local19++) {
			@Pc(24) int local24 = local19 * arg4;
			@Pc(36) int local36 = arg2 * (arg1 - local19 - 1);
			for (@Pc(38) int local38 = 0; local38 < arg4; local38++) {
				local17[local24++] = arg5[local36++];
			}
		}
		super.aClass13_Sub2_39.method1096(this);
		if (arg2 != arg4) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt8418, 0, arg0, this.anInt639 - arg3 - arg1, arg4, arg1, 32993, super.aClass13_Sub2_39.anInt1093, local17, 0);
		if (arg2 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIII)V")
	public final void method724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt8418, super.anInt8421, 0);
		this.anInt637 = arg1;
		this.anInt638 = arg0;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIII)V")
	public final void method725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass13_Sub2_39.anInt980 - arg1 - arg4;
		super.aClass13_Sub2_39.method1096(this);
		OpenGL.glCopyTexSubImage2D(super.anInt8418, 0, arg5, this.anInt639 - arg0 - arg1, arg3, local12, arg2, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZ[BIIIIBII)V")
	public final void method727(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(6) int arg2, @OriginalArg(8) int arg3, @OriginalArg(9) int arg4) {
		if (arg0) {
			@Pc(16) int local16 = Static257.method4273(6406);
			@Pc(20) int local20 = arg3 * local16;
			@Pc(24) int local24 = local16 * arg3;
			@Pc(29) byte[] local29 = new byte[local20 * arg2];
			for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
				@Pc(36) int local36 = local31 * local20;
				@Pc(47) int local47 = (arg2 - local31 - 1) * local24;
				for (@Pc(49) int local49 = 0; local49 < local20; local49++) {
					local29[local36++] = arg1[local47++];
				}
			}
			arg1 = local29;
		}
		super.aClass13_Sub2_39.method1096(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg3 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8418, 0, 0, 0, arg3, arg2, 6406, 5121, arg1, 0);
		if (arg3 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
