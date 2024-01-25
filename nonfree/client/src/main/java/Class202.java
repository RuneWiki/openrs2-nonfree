import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class Class202 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	private int anInt6154;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
	private final int anInt6156;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Lclient!qfa;")
	protected final Class137_Sub3 aClass137_Sub3_20;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Z")
	private final boolean aBoolean428;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	protected final int anInt6160;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!qfa;I[BIZ)V")
	public Class202(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6154 = arg3;
		this.anInt6156 = arg1;
		this.aClass137_Sub3_20 = arg0;
		this.aBoolean428 = arg4;
		OpenGL.glGenBuffersARB(1, Static542.anIntArray678, 0);
		this.anInt6160 = Static542.anIntArray678[0];
		this.method5110();
		OpenGL.glBufferDataARBub(arg1, this.anInt6154, arg2, 0, this.aBoolean428 ? 35040 : 35044);
		this.aClass137_Sub3_20.anInt8552 += this.anInt6154;
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!qfa;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class202(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6154 = arg3;
		this.anInt6156 = arg1;
		this.aClass137_Sub3_20 = arg0;
		this.aBoolean428 = arg4;
		OpenGL.glGenBuffersARB(1, Static542.anIntArray678, 0);
		this.anInt6160 = Static542.anIntArray678[0];
		this.method5110();
		OpenGL.glBufferDataARBa(arg1, this.anInt6154, arg2.getAddress(), this.aBoolean428 ? 35040 : 35044);
		this.aClass137_Sub3_20.anInt8552 += this.anInt6154;
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
	protected abstract void method5110();

	@OriginalMember(owner = "client!uf", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass137_Sub3_20.method7024(this.anInt6160, this.anInt6154);
		super.finalize();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BB)V")
	protected final void method5112(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method5110();
		if (arg0 > this.anInt6154) {
			OpenGL.glBufferDataARBub(this.anInt6156, arg0, arg1, 0, this.aBoolean428 ? 35040 : 35044);
			this.aClass137_Sub3_20.anInt8552 += arg0 - this.anInt6154;
			this.anInt6154 = arg0;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt6156, 0, arg0, arg1, 0);
		}
	}
}
