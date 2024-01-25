import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public abstract class Class40 {

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Lclient!po;")
	protected final Class59_Sub1 aClass59_Sub1_39;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
	private final int anInt6456;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	private int anInt6454;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Z")
	private final boolean aBoolean477;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
	private final int anInt6455;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!po;I[BIZ)V")
	public Class40(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass59_Sub1_39 = arg0;
		this.anInt6456 = arg1;
		this.anInt6454 = arg3;
		this.aBoolean477 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl2;
		local16.glGenBuffersARB(1, Static97.anIntArray556, 0);
		this.anInt6455 = Static97.anIntArray556[0];
		this.method5700();
		local16.glBufferDataARB(arg1, this.anInt6454, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt6454), this.aBoolean477 ? 35040 : 35044);
		this.aClass59_Sub1_39.anInt4763 += this.anInt6454;
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!po;ILjava/nio/ByteBuffer;Z)V")
	public Class40(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass59_Sub1_39 = arg0;
		this.anInt6456 = arg1;
		this.anInt6454 = arg2.limit();
		this.aBoolean477 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl2;
		local17.glGenBuffersARB(1, Static97.anIntArray556, 0);
		this.anInt6455 = Static97.anIntArray556[0];
		this.method5700();
		local17.glBufferDataARB(arg1, this.anInt6454, arg2, this.aBoolean477 ? 35040 : 35044);
		this.aClass59_Sub1_39.anInt4763 += this.anInt6454;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()I")
	public int method5698() {
		return this.anInt6455;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([BI)V")
	protected final void method5699(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method5700();
		if (arg1 > this.anInt6454) {
			this.aClass59_Sub1_39.anOpengl2.glBufferDataARB(this.anInt6456, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean477 ? 35040 : 35044);
			this.aClass59_Sub1_39.anInt4763 += arg1 - this.anInt6454;
			this.anInt6454 = arg1;
		} else {
			this.aClass59_Sub1_39.anOpengl2.glBufferSubDataARB(this.anInt6456, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "()V")
	protected abstract void method5700();

	@OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass59_Sub1_39.method4292(this.anInt6455, this.anInt6454);
		super.finalize();
	}
}
