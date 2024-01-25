import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class Class82 {

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "Lclient!bl;")
	protected final Class28_Sub1 aClass28_Sub1_31;

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
	private final int anInt5626;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "Z")
	private final boolean aBoolean381;

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
	private int anInt5628;

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
	protected final int anInt5625;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!bl;I[BIZ)V")
	public Class82(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass28_Sub1_31 = arg0;
		this.anInt5626 = arg1;
		this.aBoolean381 = arg4;
		this.anInt5628 = arg3;
		OpenGL.glGenBuffersARB(1, Static434.anIntArray618, 0);
		this.anInt5625 = Static434.anIntArray618[0];
		this.method4743();
		OpenGL.glBufferDataARBub(arg1, this.anInt5628, arg2, 0, this.aBoolean381 ? 35040 : 35044);
		this.aClass28_Sub1_31.anInt743 += this.anInt5628;
	}

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!bl;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class82(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5628 = arg3;
		this.aClass28_Sub1_31 = arg0;
		this.anInt5626 = arg1;
		this.aBoolean381 = arg4;
		OpenGL.glGenBuffersARB(1, Static434.anIntArray618, 0);
		this.anInt5625 = Static434.anIntArray618[0];
		this.method4743();
		OpenGL.glBufferDataARBa(arg1, this.anInt5628, arg2.b(), this.aBoolean381 ? 35040 : 35044);
		this.aClass28_Sub1_31.anInt743 += this.anInt5628;
	}

	@OriginalMember(owner = "client!tu", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass28_Sub1_31.method685(this.anInt5625, this.anInt5628);
		super.finalize();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB[B)V")
	protected final void method4741(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method4743();
		if (this.anInt5628 < arg0) {
			OpenGL.glBufferDataARBub(this.anInt5626, arg0, arg1, 0, this.aBoolean381 ? 35040 : 35044);
			this.aClass28_Sub1_31.anInt743 += arg0 - this.anInt5628;
			this.anInt5628 = arg0;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt5626, 0, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
	protected abstract void method4743();
}
