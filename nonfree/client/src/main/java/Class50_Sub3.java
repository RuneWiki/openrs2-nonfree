import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class50_Sub3 extends Class50 {

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
	private int anInt7874 = -1;

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
	private int anInt7872 = -1;

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
	public final int anInt7870;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!lea;IIZ[[BI)V")
	public Class50_Sub3(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt7870 = arg2;
		super.aClass101_Sub2_41.method5690(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt10669, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method9134(true);
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!lea;IIZ[[I)V")
	public Class50_Sub3(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt7870 = arg2;
		super.aClass101_Sub2_41.method5690(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static608.method9153(local30 + 34069, arg2, arg2, super.aClass101_Sub2_41.anInt6346, super.anInt10669, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt10669, arg2, arg2, 0, 32993, super.aClass101_Sub2_41.anInt6346, arg4[local30], 0);
			}
		}
		this.method9134(true);
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!lea;II)V")
	public Class50_Sub3(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt7870 = arg2;
		super.aClass101_Sub2_41.method5690(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt10669, arg2, arg2, 0, Static402.method7538(super.anInt10669), 5121, (byte[]) null, 0);
		}
		this.method9134(true);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	@Override
	public void method9133() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7874, this.anInt7872, 3553, 0, 0);
		this.anInt7872 = -1;
		this.anInt7874 = -1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V")
	public void method7036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.anInt10666, 0);
		this.anInt7874 = arg2;
		this.anInt7872 = arg0;
	}
}
