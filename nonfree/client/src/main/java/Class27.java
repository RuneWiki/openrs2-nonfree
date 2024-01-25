import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public abstract class Class27 {

	@OriginalMember(owner = "client!b", name = "i", descriptor = "I")
	private final int anInt8569;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "I")
	private int anInt8570;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Z")
	private final boolean aBoolean733;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Lclient!uja;")
	protected final Class145_Sub3 aClass145_Sub3_37;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	protected final int anInt8574;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!uja;I[BIZ)V")
	public Class27(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8569 = arg1;
		this.anInt8570 = arg3;
		this.aBoolean733 = arg4;
		this.aClass145_Sub3_37 = arg0;
		OpenGL.glGenBuffersARB(1, Static231.anIntArray286, 0);
		this.anInt8574 = Static231.anIntArray286[0];
		this.method7591();
		OpenGL.glBufferDataARBub(arg1, this.anInt8570, arg2, 0, this.aBoolean733 ? 35040 : 35044);
		this.aClass145_Sub3_37.anInt10148 += this.anInt8570;
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!uja;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class27(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8570 = arg3;
		this.aClass145_Sub3_37 = arg0;
		this.aBoolean733 = arg4;
		this.anInt8569 = arg1;
		OpenGL.glGenBuffersARB(1, Static231.anIntArray286, 0);
		this.anInt8574 = Static231.anIntArray286[0];
		this.method7591();
		OpenGL.glBufferDataARBa(arg1, this.anInt8570, arg2.getAddress(), this.aBoolean733 ? 35040 : 35044);
		this.aClass145_Sub3_37.anInt10148 += this.anInt8570;
	}

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass145_Sub3_37.method8875(this.anInt8574, this.anInt8570);
		super.finalize();
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
	protected abstract void method7591();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II[B)V")
	protected final void method7592(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method7591();
		if (this.anInt8570 < arg0) {
			OpenGL.glBufferDataARBub(this.anInt8569, arg0, arg1, 0, this.aBoolean733 ? 35040 : 35044);
			this.aClass145_Sub3_37.anInt10148 += arg0 - this.anInt8570;
			this.anInt8570 = arg0;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt8569, 0, arg0, arg1, 0);
		}
	}
}
