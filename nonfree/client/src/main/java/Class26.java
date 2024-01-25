import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public abstract class Class26 {

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "Lclient!er;")
	protected final Class31_Sub2 aClass31_Sub2_34;

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "Z")
	private final boolean aBoolean526;

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
	private final int anInt7509;

	@OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
	private int anInt7511;

	@OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
	protected final int anInt7513;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!er;I[BIZ)V")
	public Class26(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass31_Sub2_34 = arg0;
		this.aBoolean526 = arg4;
		this.anInt7509 = arg1;
		this.anInt7511 = arg3;
		OpenGL.glGenBuffersARB(1, Static260.anIntArray237, 0);
		this.anInt7513 = Static260.anIntArray237[0];
		this.method5866();
		OpenGL.glBufferDataARBub(arg1, this.anInt7511, arg2, 0, this.aBoolean526 ? 35040 : 35044);
		this.aClass31_Sub2_34.anInt3139 += this.anInt7511;
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!er;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class26(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7509 = arg1;
		this.aBoolean526 = arg4;
		this.anInt7511 = arg3;
		this.aClass31_Sub2_34 = arg0;
		OpenGL.glGenBuffersARB(1, Static260.anIntArray237, 0);
		this.anInt7513 = Static260.anIntArray237[0];
		this.method5866();
		OpenGL.glBufferDataARBa(arg1, this.anInt7511, arg2.getAddress(), this.aBoolean526 ? 35040 : 35044);
		this.aClass31_Sub2_34.anInt3139 += this.anInt7511;
	}

	@OriginalMember(owner = "client!baa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass31_Sub2_34.method2502(this.anInt7513, this.anInt7511);
		super.finalize();
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "([BIB)V")
	protected final void method5865(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method5866();
		if (this.anInt7511 >= arg1) {
			OpenGL.glBufferSubDataARBub(this.anInt7509, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt7509, arg1, arg0, 0, this.aBoolean526 ? 35040 : 35044);
			this.aClass31_Sub2_34.anInt3139 += arg1 - this.anInt7511;
			this.anInt7511 = arg1;
		}
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(B)V")
	protected abstract void method5866();
}
