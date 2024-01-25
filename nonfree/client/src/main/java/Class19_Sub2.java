import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	private int anInt1572;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	public final int anInt1573;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!ks;IIZ[[BI)V")
	public Class19_Sub2(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass63_Sub1_32.anOpengl1;
		this.anInt1573 = arg2;
		this.aClass63_Sub1_32.method3355(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt4601, arg2, arg2, 0, arg5, 5121, ByteBuffer.wrap(arg4[local23]));
		}
		this.method4238(true);
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!ks;IIZ[[I)V")
	public Class19_Sub2(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		@Pc(14) opengl local14 = this.aClass63_Sub1_32.anOpengl1;
		this.anInt1573 = arg2;
		this.aClass63_Sub1_32.method3355(this);
		@Pc(25) int local25;
		if (arg3) {
			for (local25 = 0; local25 < 6; local25++) {
				Static347.method4236(local14, local25 + 34069, this.anInt4601, arg2, arg2, this.aClass63_Sub1_32.anInt3635, arg4[local25]);
			}
		} else {
			for (local25 = 0; local25 < 6; local25++) {
				local14.glTexImage2D(local25 + 34069, 0, this.anInt4601, arg2, arg2, 0, 32993, this.aClass63_Sub1_32.anInt3635, IntBuffer.wrap(arg4[local25]));
			}
		}
		this.method4238(true);
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!ks;II)V")
	public Class19_Sub2(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		@Pc(14) opengl local14 = this.aClass63_Sub1_32.anOpengl1;
		this.anInt1573 = arg2;
		this.aClass63_Sub1_32.method3355(this);
		for (@Pc(23) int local23 = 0; local23 < 6; local23++) {
			local14.glTexImage2D(local23 + 34069, 0, this.anInt4601, arg2, arg2, 0, 32993, this.aClass63_Sub1_32.anInt3635, null);
		}
		this.method4238(true);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	public void method1537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass63_Sub1_32.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, arg1, this.anInt4602, 0);
		this.anInt1572 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
	@Override
	public void method4708() {
		this.aClass63_Sub1_32.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt1572, 3553, 0, 0);
		this.anInt1572 = -1;
	}
}
