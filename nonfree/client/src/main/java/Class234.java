import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class Class234 {

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
	private final int anInt7666;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
	private int anInt7667;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "Z")
	private final boolean aBoolean501;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "Lclient!ih;")
	protected final Class106_Sub2 aClass106_Sub2_41;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
	protected final int anInt7670;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!ih;I[BIZ)V")
	public Class234(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7666 = arg1;
		this.anInt7667 = arg3;
		this.aBoolean501 = arg4;
		this.aClass106_Sub2_41 = arg0;
		OpenGL.glGenBuffersARB(1, Static309.anIntArray739, 0);
		this.anInt7670 = Static309.anIntArray739[0];
		this.method5854();
		OpenGL.glBufferDataARBub(arg1, this.anInt7667, arg2, 0, this.aBoolean501 ? 35040 : 35044);
		this.aClass106_Sub2_41.anInt3739 += this.anInt7667;
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!ih;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class234(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7666 = arg1;
		this.aBoolean501 = arg4;
		this.aClass106_Sub2_41 = arg0;
		this.anInt7667 = arg3;
		OpenGL.glGenBuffersARB(1, Static309.anIntArray739, 0);
		this.anInt7670 = Static309.anIntArray739[0];
		this.method5854();
		OpenGL.glBufferDataARBa(arg1, this.anInt7667, arg2.b(), this.aBoolean501 ? 35040 : 35044);
		this.aClass106_Sub2_41.anInt3739 += this.anInt7667;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB[B)V")
	protected final void method5850(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method5854();
		if (this.anInt7667 >= arg0) {
			OpenGL.glBufferSubDataARB(this.anInt7666, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt7666, arg0, arg1, 0, this.aBoolean501 ? 35040 : 35044);
			this.aClass106_Sub2_41.anInt3739 += arg0 - this.anInt7667;
			this.anInt7667 = arg0;
		}
	}

	@OriginalMember(owner = "client!wf", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass106_Sub2_41.method2869(this.anInt7670, this.anInt7667);
		super.finalize();
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)V")
	protected abstract void method5854();
}
