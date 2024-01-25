import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public abstract class Class170 {

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Lclient!gk;")
	protected final Class75_Sub2 aClass75_Sub2_42;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	private final int anInt7035;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
	private int anInt7037;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "Z")
	private final boolean aBoolean492;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
	protected final int anInt7039;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!gk;I[BIZ)V")
	public Class170(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass75_Sub2_42 = arg0;
		this.anInt7035 = arg1;
		this.anInt7037 = arg3;
		this.aBoolean492 = arg4;
		OpenGL.glGenBuffersARB(1, Static445.anIntArray575, 0);
		this.anInt7039 = Static445.anIntArray575[0];
		this.method5466();
		OpenGL.glBufferDataARBub(arg1, this.anInt7037, arg2, 0, this.aBoolean492 ? 35040 : 35044);
		this.aClass75_Sub2_42.anInt3084 += this.anInt7037;
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!gk;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class170(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass75_Sub2_42 = arg0;
		this.anInt7037 = arg3;
		this.anInt7035 = arg1;
		this.aBoolean492 = arg4;
		OpenGL.glGenBuffersARB(1, Static445.anIntArray575, 0);
		this.anInt7039 = Static445.anIntArray575[0];
		this.method5466();
		OpenGL.glBufferDataARBa(arg1, this.anInt7037, arg2.a(), this.aBoolean492 ? 35040 : 35044);
		this.aClass75_Sub2_42.anInt3084 += this.anInt7037;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V")
	protected abstract void method5466();

	@OriginalMember(owner = "client!pm", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass75_Sub2_42.method2416(this.anInt7037, this.anInt7039);
		super.finalize();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([BIB)V")
	protected final void method5468(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method5466();
		if (arg1 > this.anInt7037) {
			OpenGL.glBufferDataARBub(this.anInt7035, arg1, arg0, 0, this.aBoolean492 ? 35040 : 35044);
			this.aClass75_Sub2_42.anInt3084 += arg1 - this.anInt7037;
			this.anInt7037 = arg1;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt7035, 0, arg1, arg0, 0);
		}
	}
}
