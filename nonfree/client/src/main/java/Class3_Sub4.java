import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!gfa", name = "u", descriptor = "I")
	private int anInt3455 = -1;

	@OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
	private int anInt3456 = -1;

	@OriginalMember(owner = "client!gfa", name = "z", descriptor = "I")
	public final int anInt3459;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!kfa;IIZ[[I)V")
	public Class3_Sub4(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt3459 = arg2;
		super.aClass7_Sub2_19.method4313(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static172.method2864(arg2, super.anInt3443, arg4[local30], local30 + 34069, arg2, super.aClass7_Sub2_19.anInt5615);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt3443, arg2, arg2, 0, 32993, super.aClass7_Sub2_19.anInt5615, arg4[local30], 0);
			}
		}
		this.method2739(true);
	}

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!kfa;IIZ[[BI)V")
	public Class3_Sub4(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt3459 = arg2;
		super.aClass7_Sub2_19.method4313(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt3443, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method2739(true);
	}

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!kfa;II)V")
	public Class3_Sub4(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt3459 = arg2;
		super.aClass7_Sub2_19.method4313(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt3443, arg2, arg2, 0, Static246.method3937(super.anInt3443), 5121, null, 0);
		}
		this.method2739(true);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIBI)V")
	public void method2750(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt3444, 0);
		this.anInt3456 = arg0;
		this.anInt3455 = arg1;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
	@Override
	public void method4191() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3456, this.anInt3455, 3553, 0, 0);
		this.anInt3455 = -1;
		this.anInt3456 = -1;
	}
}
