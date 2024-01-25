import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public abstract class Class121 {

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Lclient!se;")
	protected final Class122_Sub2 aClass122_Sub2_42;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	private final int anInt6204;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
	private int anInt6203;

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "Z")
	private final boolean aBoolean421;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
	private final int anInt6205;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!se;I[BIZ)V")
	public Class121(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass122_Sub2_42 = arg0;
		this.anInt6204 = arg1;
		this.anInt6203 = arg3;
		this.aBoolean421 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl2;
		local16.glGenBuffersARB(1, Static332.anIntArray516, 0);
		this.anInt6205 = Static332.anIntArray516[0];
		this.method5254();
		local16.glBufferDataARB(arg1, this.anInt6203, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt6203), this.aBoolean421 ? 35040 : 35044);
		this.aClass122_Sub2_42.anInt5616 += this.anInt6203;
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!se;ILjava/nio/ByteBuffer;Z)V")
	public Class121(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass122_Sub2_42 = arg0;
		this.anInt6204 = arg1;
		this.anInt6203 = arg2.limit();
		this.aBoolean421 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl2;
		local17.glGenBuffersARB(1, Static332.anIntArray516, 0);
		this.anInt6205 = Static332.anIntArray516[0];
		this.method5254();
		local17.glBufferDataARB(arg1, this.anInt6203, arg2, this.aBoolean421 ? 35040 : 35044);
		this.aClass122_Sub2_42.anInt5616 += this.anInt6203;
	}

	@OriginalMember(owner = "client!vj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass122_Sub2_42.method4828(this.anInt6205, this.anInt6203);
		super.finalize();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "()I")
	public int method5253() {
		return this.anInt6205;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "()V")
	protected abstract void method5254();

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([BI)V")
	protected final void method5255(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method5254();
		if (arg1 > this.anInt6203) {
			this.aClass122_Sub2_42.anOpengl2.glBufferDataARB(this.anInt6204, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean421 ? 35040 : 35044);
			this.aClass122_Sub2_42.anInt5616 += arg1 - this.anInt6203;
			this.anInt6203 = arg1;
		} else {
			this.aClass122_Sub2_42.anOpengl2.glBufferSubDataARB(this.anInt6204, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}
}
