import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public abstract class Class80 {

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "Lclient!tb;")
	protected final Class129_Sub2 aClass129_Sub2_34;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
	private final int anInt5157;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
	private int anInt5159;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "Z")
	private final boolean aBoolean336;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	private final int anInt5158;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!tb;I[BIZ)V")
	public Class80(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass129_Sub2_34 = arg0;
		this.anInt5157 = arg1;
		this.anInt5159 = arg3;
		this.aBoolean336 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl2;
		local16.glGenBuffersARB(1, Static116.anIntArray396, 0);
		this.anInt5158 = Static116.anIntArray396[0];
		this.method4429();
		local16.glBufferDataARB(arg1, this.anInt5159, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt5159), this.aBoolean336 ? 35040 : 35044);
		this.aClass129_Sub2_34.anInt5880 += this.anInt5159;
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!tb;ILjava/nio/ByteBuffer;Z)V")
	public Class80(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass129_Sub2_34 = arg0;
		this.anInt5157 = arg1;
		this.anInt5159 = arg2.limit();
		this.aBoolean336 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl2;
		local17.glGenBuffersARB(1, Static116.anIntArray396, 0);
		this.anInt5158 = Static116.anIntArray396[0];
		this.method4429();
		local17.glBufferDataARB(arg1, this.anInt5159, arg2, this.aBoolean336 ? 35040 : 35044);
		this.aClass129_Sub2_34.anInt5880 += this.anInt5159;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([BI)V")
	protected final void method4428(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method4429();
		if (arg1 > this.anInt5159) {
			this.aClass129_Sub2_34.anOpengl2.glBufferDataARB(this.anInt5157, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean336 ? 35040 : 35044);
			this.aClass129_Sub2_34.anInt5880 += arg1 - this.anInt5159;
			this.anInt5159 = arg1;
		} else {
			this.aClass129_Sub2_34.anOpengl2.glBufferSubDataARB(this.anInt5157, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!hj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass129_Sub2_34.method5064(this.anInt5158, this.anInt5159);
		super.finalize();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "()V")
	protected abstract void method4429();

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "()I")
	public int method4888() {
		return this.anInt5158;
	}
}
