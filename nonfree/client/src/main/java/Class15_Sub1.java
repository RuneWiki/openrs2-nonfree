import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	public final int anInt820;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!nm;IIZ[[I)V")
	public Class15_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass164_Sub1_42.anOpengl1;
		this.anInt820 = arg2;
		this.aClass164_Sub1_42.method3603(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static15.method5552(local14, local25 + 34069, this.anInt6389, arg2, arg2, this.aClass164_Sub1_42.anInt4085, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt6389, arg2, arg2, 0, 32993, this.aClass164_Sub1_42.anInt4085, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method5556(true);
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!nm;II)V")
	public Class15_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass164_Sub1_42.anOpengl1;
		this.anInt820 = arg2;
		this.aClass164_Sub1_42.method3603(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6389, arg2, arg2, 0, 32993, this.aClass164_Sub1_42.anInt4085, null);
		}
		this.method5556(true);
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!nm;IIZ[[BI)V")
	public Class15_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass164_Sub1_42.anOpengl1;
		this.anInt820 = arg2;
		this.aClass164_Sub1_42.method3603(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt6389, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method5556(true);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
	public void method650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass164_Sub1_42.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt6387, 0);
		this.anInt819 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
	@Override
	public void method5548() {
		this.aClass164_Sub1_42.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt819, 3553, 0, 0);
		this.anInt819 = -1;
	}
}
