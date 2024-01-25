import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public abstract class Class54 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Lclient!ql;")
	protected final Class92_Sub2 aClass92_Sub2_30;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
	private final int anInt5188;

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
	private int anInt5189;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Z")
	private final boolean aBoolean438;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
	private final int anInt5190;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!ql;I[BIZ)V")
	public Class54(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass92_Sub2_30 = arg0;
		this.anInt5188 = arg1;
		this.anInt5189 = arg3;
		this.aBoolean438 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl2;
		local16.glGenBuffersARB(1, Static62.anIntArray424, 0);
		this.anInt5190 = Static62.anIntArray424[0];
		this.method4300();
		local16.glBufferDataARB(arg1, this.anInt5189, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt5189), this.aBoolean438 ? 35040 : 35044);
		this.aClass92_Sub2_30.anInt5385 += this.anInt5189;
	}

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!ql;ILjava/nio/ByteBuffer;Z)V")
	public Class54(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass92_Sub2_30 = arg0;
		this.anInt5188 = arg1;
		this.anInt5189 = arg2.limit();
		this.aBoolean438 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl2;
		local17.glGenBuffersARB(1, Static62.anIntArray424, 0);
		this.anInt5190 = Static62.anIntArray424[0];
		this.method4300();
		local17.glBufferDataARB(arg1, this.anInt5189, arg2, this.aBoolean438 ? 35040 : 35044);
		this.aClass92_Sub2_30.anInt5385 += this.anInt5189;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "()I")
	public int method4362() {
		return this.anInt5190;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "()V")
	protected abstract void method4300();

	@OriginalMember(owner = "client!dq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass92_Sub2_30.method4610(this.anInt5190, this.anInt5189);
		super.finalize();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "([BI)V")
	protected final void method4301(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method4300();
		if (arg1 > this.anInt5189) {
			this.aClass92_Sub2_30.anOpengl2.glBufferDataARB(this.anInt5188, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean438 ? 35040 : 35044);
			this.aClass92_Sub2_30.anInt5385 += arg1 - this.anInt5189;
			this.anInt5189 = arg1;
		} else {
			this.aClass92_Sub2_30.anOpengl2.glBufferSubDataARB(this.anInt5188, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}
}
