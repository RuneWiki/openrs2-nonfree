import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class81_Sub3 extends Class81 {

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	private int anInt4460;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public final int anInt4461;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!ic;IIZ[[I)V")
	public Class81_Sub3(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass48_Sub2_26.anOpengl2;
		this.anInt4461 = arg2;
		this.aClass48_Sub2_26.method2573(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static363.method4348(local14, local25 + 34069, this.anInt4829, arg2, arg2, this.aClass48_Sub2_26.anInt3078, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt4829, arg2, arg2, 0, 32993, this.aClass48_Sub2_26.anInt3078, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method4350(true);
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!ic;II)V")
	public Class81_Sub3(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass48_Sub2_26.anOpengl2;
		this.anInt4461 = arg2;
		this.aClass48_Sub2_26.method2573(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt4829, arg2, arg2, 0, 32993, this.aClass48_Sub2_26.anInt3078, null);
		}
		this.method4350(true);
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!ic;IIZ[[BI)V")
	public Class81_Sub3(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass48_Sub2_26.anOpengl2;
		this.anInt4461 = arg2;
		this.aClass48_Sub2_26.method2573(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt4829, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method4350(true);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	public void method3944(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass48_Sub2_26.anOpengl2.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt4832, 0);
		this.anInt4460 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
	@Override
	public void method5235() {
		this.aClass48_Sub2_26.anOpengl2.glFramebufferTexture2DEXT(36160, this.anInt4460, 3553, 0, 0);
		this.anInt4460 = -1;
	}
}
