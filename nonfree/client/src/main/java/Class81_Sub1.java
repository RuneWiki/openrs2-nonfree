import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class81_Sub1 extends Class81 {

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
	private int anInt2372;

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
	public final int anInt2373;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!cg;II)V")
	public Class81_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass37_Sub1_34.anOpengl1;
		this.anInt2373 = arg2;
		this.aClass37_Sub1_34.method767(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt5609, arg2, arg2, 0, 32993, this.aClass37_Sub1_34.anInt670, null);
		}
		this.method4737(true);
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!cg;IIZ[[BI)V")
	public Class81_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass37_Sub1_34.anOpengl1;
		this.anInt2373 = arg2;
		this.aClass37_Sub1_34.method767(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt5609, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method4737(true);
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!cg;IIZ[[I)V")
	public Class81_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass37_Sub1_34.anOpengl1;
		this.anInt2373 = arg2;
		this.aClass37_Sub1_34.method767(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static259.method4734(local14, local25 + 34069, this.anInt5609, arg2, arg2, this.aClass37_Sub1_34.anInt670, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt5609, arg2, arg2, 0, 32993, this.aClass37_Sub1_34.anInt670, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method4737(true);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
	public void method2206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass37_Sub1_34.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt5608, 0);
		this.anInt2372 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()V")
	@Override
	public void method5338() {
		this.aClass37_Sub1_34.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt2372, 3553, 0, 0);
		this.anInt2372 = -1;
	}
}
