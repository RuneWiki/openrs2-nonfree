import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class Class158 {

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
	private int anInt5956;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
	private final int anInt5954;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Z")
	private final boolean aBoolean411;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!jj;")
	protected final Class62_Sub3 aClass62_Sub3_20;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
	protected final int anInt5955;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!jj;I[BIZ)V")
	public Class158(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5956 = arg3;
		this.anInt5954 = arg1;
		this.aBoolean411 = arg4;
		this.aClass62_Sub3_20 = arg0;
		OpenGL.glGenBuffersARB(1, Static436.anIntArray578, 0);
		this.anInt5955 = Static436.anIntArray578[0];
		this.method4962();
		OpenGL.glBufferDataARBub(arg1, this.anInt5956, arg2, 0, this.aBoolean411 ? 35040 : 35044);
		this.aClass62_Sub3_20.anInt4628 += this.anInt5956;
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!jj;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class158(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean411 = arg4;
		this.aClass62_Sub3_20 = arg0;
		this.anInt5956 = arg3;
		this.anInt5954 = arg1;
		OpenGL.glGenBuffersARB(1, Static436.anIntArray578, 0);
		this.anInt5955 = Static436.anIntArray578[0];
		this.method4962();
		OpenGL.glBufferDataARBa(arg1, this.anInt5956, arg2.getAddress(), this.aBoolean411 ? 35040 : 35044);
		this.aClass62_Sub3_20.anInt4628 += this.anInt5956;
	}

	@OriginalMember(owner = "client!mf", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass62_Sub3_20.method3937(this.anInt5955, this.anInt5956);
		super.finalize();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[BI)V")
	protected final void method4960(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4962();
		if (this.anInt5956 < arg1) {
			OpenGL.glBufferDataARBub(this.anInt5954, arg1, arg0, 0, this.aBoolean411 ? 35040 : 35044);
			this.aClass62_Sub3_20.anInt4628 += arg1 - this.anInt5956;
			this.anInt5956 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt5954, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
	protected abstract void method4962();
}
