import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class Class94 {

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "Z")
	private final boolean aBoolean396;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
	private int anInt5606;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
	private final int anInt5607;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "Lclient!na;")
	protected final Class75_Sub2 aClass75_Sub2_32;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
	protected final int anInt5609;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!na;I[BIZ)V")
	public Class94(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean396 = arg4;
		this.anInt5606 = arg3;
		this.anInt5607 = arg1;
		this.aClass75_Sub2_32 = arg0;
		OpenGL.glGenBuffersARB(1, Static191.anIntArray276, 0);
		this.anInt5609 = Static191.anIntArray276[0];
		this.method4454();
		OpenGL.glBufferDataARBub(arg1, this.anInt5606, arg2, 0, this.aBoolean396 ? 35040 : 35044);
		this.aClass75_Sub2_32.anInt4864 += this.anInt5606;
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!na;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class94(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5606 = arg3;
		this.aBoolean396 = arg4;
		this.aClass75_Sub2_32 = arg0;
		this.anInt5607 = arg1;
		OpenGL.glGenBuffersARB(1, Static191.anIntArray276, 0);
		this.anInt5609 = Static191.anIntArray276[0];
		this.method4454();
		OpenGL.glBufferDataARBa(arg1, this.anInt5606, arg2.b(), this.aBoolean396 ? 35040 : 35044);
		this.aClass75_Sub2_32.anInt4864 += this.anInt5606;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[BI)V")
	protected final void method4453(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4454();
		if (arg1 > this.anInt5606) {
			OpenGL.glBufferDataARBub(this.anInt5607, arg1, arg0, 0, this.aBoolean396 ? 35040 : 35044);
			this.aClass75_Sub2_32.anInt4864 += arg1 - this.anInt5606;
			this.anInt5606 = arg1;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt5607, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)V")
	protected abstract void method4454();

	@OriginalMember(owner = "client!gj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass75_Sub2_32.method3855(this.anInt5609, this.anInt5606);
		super.finalize();
	}
}
