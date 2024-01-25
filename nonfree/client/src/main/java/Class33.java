import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public abstract class Class33 {

	@OriginalMember(owner = "client!br", name = "d", descriptor = "Lclient!hd;")
	protected final Class89_Sub1 aClass89_Sub1_34;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "I")
	private final int anInt5389;

	@OriginalMember(owner = "client!br", name = "b", descriptor = "I")
	private int anInt5390;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Z")
	private final boolean aBoolean401;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "I")
	private final int anInt5391;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!hd;I[BIZ)V")
	public Class33(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass89_Sub1_34 = arg0;
		this.anInt5389 = arg1;
		this.anInt5390 = arg3;
		this.aBoolean401 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl2;
		local16.glGenBuffersARB(1, Static31.anIntArray691, 0);
		this.anInt5391 = Static31.anIntArray691[0];
		this.method4544();
		local16.glBufferDataARB(arg1, this.anInt5390, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt5390), this.aBoolean401 ? 35040 : 35044);
		this.aClass89_Sub1_34.anInt2606 += this.anInt5390;
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!hd;ILjava/nio/ByteBuffer;Z)V")
	public Class33(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass89_Sub1_34 = arg0;
		this.anInt5389 = arg1;
		this.anInt5390 = arg2.limit();
		this.aBoolean401 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl2;
		local17.glGenBuffersARB(1, Static31.anIntArray691, 0);
		this.anInt5391 = Static31.anIntArray691[0];
		this.method4544();
		local17.glBufferDataARB(arg1, this.anInt5390, arg2, this.aBoolean401 ? 35040 : 35044);
		this.aClass89_Sub1_34.anInt2606 += this.anInt5390;
	}

	@OriginalMember(owner = "client!br", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass89_Sub1_34.method2415(this.anInt5391, this.anInt5390);
		super.finalize();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "([BI)V")
	protected final void method4542(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method4544();
		if (arg1 > this.anInt5390) {
			this.aClass89_Sub1_34.anOpengl2.glBufferDataARB(this.anInt5389, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean401 ? 35040 : 35044);
			this.aClass89_Sub1_34.anInt2606 += arg1 - this.anInt5390;
			this.anInt5390 = arg1;
		} else {
			this.aClass89_Sub1_34.anOpengl2.glBufferSubDataARB(this.anInt5389, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "()I")
	public int method5710() {
		return this.anInt5391;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "()V")
	protected abstract void method4544();
}
