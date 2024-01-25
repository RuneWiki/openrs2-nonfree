import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
	private int anInt780 = -1;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
	private final int anInt779;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	private final int anInt781;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
	private final int anInt778;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!ks;IIII[BI)V")
	public Class19_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt779 = arg2;
		this.anInt781 = arg3;
		this.anInt778 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl1;
		this.aClass63_Sub1_32.method3355(this);
		local25.glTexImage3D(this.anInt4603, 0, this.anInt4601, this.anInt779, this.anInt781, this.anInt778, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method4238(true);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "()V")
	@Override
	public void method4708() {
		this.aClass63_Sub1_32.anOpengl1.glFramebufferTexture3DEXT(36160, this.anInt780, this.anInt4603, 0, 0, 0);
		this.anInt780 = -1;
	}
}
