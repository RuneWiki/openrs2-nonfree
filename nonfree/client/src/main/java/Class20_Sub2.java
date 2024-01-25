import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
	private int anInt2661;

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
	public final int anInt2660;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!h;IIZ[[I)V")
	public Class20_Sub2(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass32_Sub2_41.anOpengl2;
		this.anInt2660 = arg2;
		this.aClass32_Sub2_41.method2287(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static284.method5510(local14, local25 + 34069, this.anInt6561, arg2, arg2, this.aClass32_Sub2_41.anInt2499, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt6561, arg2, arg2, 0, 32993, this.aClass32_Sub2_41.anInt2499, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method5512(true);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!h;IIZ[[BI)V")
	public Class20_Sub2(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass32_Sub2_41.anOpengl2;
		this.anInt2660 = arg2;
		this.aClass32_Sub2_41.method2287(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6561, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method5512(true);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!h;II)V")
	public Class20_Sub2(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass32_Sub2_41.anOpengl2;
		this.anInt2660 = arg2;
		this.aClass32_Sub2_41.method2287(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6561, arg2, arg2, 0, 32993, this.aClass32_Sub2_41.anInt2499, null);
		}
		this.method5512(true);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)V")
	public void method2472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass32_Sub2_41.anOpengl2.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt6564, 0);
		this.anInt2661 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "()V")
	@Override
	public void method5499() {
		this.aClass32_Sub2_41.anOpengl2.glFramebufferTexture2DEXT(36160, this.anInt2661, 3553, 0, 0);
		this.anInt2661 = -1;
	}
}
