import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public abstract class Class8 {

	@OriginalMember(owner = "client!is", name = "k", descriptor = "Z")
	private final boolean aBoolean372;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "Lclient!nq;")
	protected final Class167_Sub1 aClass167_Sub1_28;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "I")
	private final int anInt5108;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "I")
	private int anInt5103;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "I")
	protected final int anInt5109;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!nq;I[BIZ)V")
	public Class8(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean372 = arg4;
		this.aClass167_Sub1_28 = arg0;
		this.anInt5108 = arg1;
		this.anInt5103 = arg3;
		OpenGL.glGenBuffersARB(1, Static60.anIntArray57, 0);
		this.anInt5109 = Static60.anIntArray57[0];
		this.method4213();
		OpenGL.glBufferDataARBub(arg1, this.anInt5103, arg2, 0, this.aBoolean372 ? 35040 : 35044);
		this.aClass167_Sub1_28.anInt4894 += this.anInt5103;
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!nq;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class8(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass167_Sub1_28 = arg0;
		this.aBoolean372 = arg4;
		this.anInt5108 = arg1;
		this.anInt5103 = arg3;
		OpenGL.glGenBuffersARB(1, Static60.anIntArray57, 0);
		this.anInt5109 = Static60.anIntArray57[0];
		this.method4213();
		OpenGL.glBufferDataARBa(arg1, this.anInt5103, arg2.b(), this.aBoolean372 ? 35040 : 35044);
		this.aClass167_Sub1_28.anInt4894 += this.anInt5103;
	}

	@OriginalMember(owner = "client!is", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass167_Sub1_28.method3985(this.anInt5103, this.anInt5109);
		super.finalize();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([BII)V")
	protected final void method4211(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method4213();
		if (arg1 > this.anInt5103) {
			OpenGL.glBufferDataARBub(this.anInt5108, arg1, arg0, 0, this.aBoolean372 ? 35040 : 35044);
			this.aClass167_Sub1_28.anInt4894 += arg1 - this.anInt5103;
			this.anInt5103 = arg1;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt5108, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!is", name = "e", descriptor = "(I)V")
	protected abstract void method4213();
}
