import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class44_Sub4 extends Class44 {

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	private int anInt6478;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
	public final int anInt6479;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!nf;II)V")
	public Class44_Sub4(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass105_Sub1_41.anOpengl1;
		this.anInt6479 = arg2;
		this.aClass105_Sub1_41.method3591(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6475, arg2, arg2, 0, 32993, this.aClass105_Sub1_41.anInt4204, null);
		}
		this.method5572(true);
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!nf;IIZ[[BI)V")
	public Class44_Sub4(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass105_Sub1_41.anOpengl1;
		this.anInt6479 = arg2;
		this.aClass105_Sub1_41.method3591(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6475, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method5572(true);
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!nf;IIZ[[I)V")
	public Class44_Sub4(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass105_Sub1_41.anOpengl1;
		this.anInt6479 = arg2;
		this.aClass105_Sub1_41.method3591(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static181.method5574(local14, local25 + 34069, this.anInt6475, arg2, arg2, this.aClass105_Sub1_41.anInt4204, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt6475, arg2, arg2, 0, 32993, this.aClass105_Sub1_41.anInt4204, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method5572(true);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "()V")
	@Override
	public void method5567() {
		this.aClass105_Sub1_41.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt6478, 3553, 0, 0);
		this.anInt6478 = -1;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)V")
	public void method5581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass105_Sub1_41.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt6474, 0);
		this.anInt6478 = arg0;
	}
}
