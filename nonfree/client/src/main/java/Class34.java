import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class Class34 {

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	private final int anInt5189;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!od;")
	protected final Class128_Sub2 aClass128_Sub2_32;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Z")
	private final boolean aBoolean418;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	private int anInt5193;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
	protected final int anInt5192;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!od;I[BIZ)V")
	public Class34(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5189 = arg1;
		this.aClass128_Sub2_32 = arg0;
		this.aBoolean418 = arg4;
		this.anInt5193 = arg3;
		OpenGL.glGenBuffersARB(1, Static430.anIntArray481, 0);
		this.anInt5192 = Static430.anIntArray481[0];
		this.method4051();
		OpenGL.glBufferDataARBub(arg1, this.anInt5193, arg2, 0, this.aBoolean418 ? 35040 : 35044);
		this.aClass128_Sub2_32.anInt4612 += this.anInt5193;
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!od;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class34(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass128_Sub2_32 = arg0;
		this.aBoolean418 = arg4;
		this.anInt5189 = arg1;
		this.anInt5193 = arg3;
		OpenGL.glGenBuffersARB(1, Static430.anIntArray481, 0);
		this.anInt5192 = Static430.anIntArray481[0];
		this.method4051();
		OpenGL.glBufferDataARBa(arg1, this.anInt5193, arg2.a(), this.aBoolean418 ? 35040 : 35044);
		this.aClass128_Sub2_32.anInt4612 += this.anInt5193;
	}

	@OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass128_Sub2_32.method3619(this.anInt5192, this.anInt5193);
		super.finalize();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V")
	protected abstract void method4051();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[BB)V")
	protected final void method4053(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method4051();
		if (arg0 <= this.anInt5193) {
			OpenGL.glBufferSubDataARB(this.anInt5189, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt5189, arg0, arg1, 0, this.aBoolean418 ? 35040 : 35044);
			this.aClass128_Sub2_32.anInt4612 += arg0 - this.anInt5193;
			this.anInt5193 = arg0;
		}
	}
}
