import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
	private int anInt2707;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public final int anInt2706;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!hj;IIZ[[I)V")
	public Class18_Sub2(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass2_Sub1_34.anOpengl1;
		this.anInt2706 = arg2;
		this.aClass2_Sub1_34.method2376(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static208.method4850(local14, local25 + 34069, this.anInt5454, arg2, arg2, this.aClass2_Sub1_34.anInt2422, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt5454, arg2, arg2, 0, 32993, this.aClass2_Sub1_34.anInt2422, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method4852(true);
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!hj;II)V")
	public Class18_Sub2(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass2_Sub1_34.anOpengl1;
		this.anInt2706 = arg2;
		this.aClass2_Sub1_34.method2376(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt5454, arg2, arg2, 0, 32993, this.aClass2_Sub1_34.anInt2422, null);
		}
		this.method4852(true);
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!hj;IIZ[[BI)V")
	public Class18_Sub2(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass2_Sub1_34.anOpengl1;
		this.anInt2706 = arg2;
		this.aClass2_Sub1_34.method2376(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt5454, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method4852(true);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
	public void method2629(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass2_Sub1_34.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt5453, 0);
		this.anInt2707 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "()V")
	@Override
	public void method5354() {
		this.aClass2_Sub1_34.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt2707, 3553, 0, 0);
		this.anInt2707 = -1;
	}
}
