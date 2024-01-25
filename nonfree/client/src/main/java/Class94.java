import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class94 {

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!ic;")
	protected final Class48_Sub2 aClass48_Sub2_30;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	private final int anInt5821;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	private int anInt5822;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Z")
	private final boolean aBoolean426;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	private final int anInt5820;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!ic;I[BIZ)V")
	public Class94(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass48_Sub2_30 = arg0;
		this.anInt5821 = arg1;
		this.anInt5822 = arg3;
		this.aBoolean426 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl2;
		local16.glGenBuffersARB(1, Static239.anIntArray508, 0);
		this.anInt5820 = Static239.anIntArray508[0];
		this.method5134();
		local16.glBufferDataARB(arg1, this.anInt5822, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt5822), this.aBoolean426 ? 35040 : 35044);
		this.aClass48_Sub2_30.anInt3049 += this.anInt5822;
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!ic;ILjava/nio/ByteBuffer;Z)V")
	public Class94(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass48_Sub2_30 = arg0;
		this.anInt5821 = arg1;
		this.anInt5822 = arg2.limit();
		this.aBoolean426 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl2;
		local17.glGenBuffersARB(1, Static239.anIntArray508, 0);
		this.anInt5820 = Static239.anIntArray508[0];
		this.method5134();
		local17.glBufferDataARB(arg1, this.anInt5822, arg2, this.aBoolean426 ? 35040 : 35044);
		this.aClass48_Sub2_30.anInt3049 += this.anInt5822;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([BI)V")
	protected final void method5133(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method5134();
		if (arg1 > this.anInt5822) {
			this.aClass48_Sub2_30.anOpengl2.glBufferDataARB(this.anInt5821, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean426 ? 35040 : 35044);
			this.aClass48_Sub2_30.anInt3049 += arg1 - this.anInt5822;
			this.anInt5822 = arg1;
		} else {
			this.aClass48_Sub2_30.anOpengl2.glBufferSubDataARB(this.anInt5821, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
	protected abstract void method5134();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()I")
	public int method5135() {
		return this.anInt5820;
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass48_Sub2_30.method2561(this.anInt5820, this.anInt5822);
		super.finalize();
	}
}
