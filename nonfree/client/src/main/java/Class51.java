import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class Class51 {

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Z")
	private final boolean aBoolean637;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	private int anInt8640;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	private final int anInt8639;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "Lclient!ad;")
	protected final Class5_Sub1 aClass5_Sub1_38;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
	protected final int anInt8642;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ad;I[BIZ)V")
	public Class51(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean637 = arg4;
		this.anInt8640 = arg3;
		this.anInt8639 = arg1;
		this.aClass5_Sub1_38 = arg0;
		OpenGL.glGenBuffersARB(1, Static208.anIntArray418, 0);
		this.anInt8642 = Static208.anIntArray418[0];
		this.method7110();
		OpenGL.glBufferDataARBub(arg1, this.anInt8640, arg2, 0, this.aBoolean637 ? 35040 : 35044);
		this.aClass5_Sub1_38.anInt381 += this.anInt8640;
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ad;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class51(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8640 = arg3;
		this.anInt8639 = arg1;
		this.aBoolean637 = arg4;
		this.aClass5_Sub1_38 = arg0;
		OpenGL.glGenBuffersARB(1, Static208.anIntArray418, 0);
		this.anInt8642 = Static208.anIntArray418[0];
		this.method7110();
		OpenGL.glBufferDataARBa(arg1, this.anInt8640, arg2.getAddress(), this.aBoolean637 ? 35040 : 35044);
		this.aClass5_Sub1_38.anInt381 += this.anInt8640;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([BII)V")
	protected final void method7108(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method7110();
		if (arg1 <= this.anInt8640) {
			OpenGL.glBufferSubDataARBub(this.anInt8639, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt8639, arg1, arg0, 0, this.aBoolean637 ? 35040 : 35044);
			this.aClass5_Sub1_38.anInt381 += arg1 - this.anInt8640;
			this.anInt8640 = arg1;
		}
	}

	@OriginalMember(owner = "client!cl", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass5_Sub1_38.method442(this.anInt8640, this.anInt8642);
		super.finalize();
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
	protected abstract void method7110();
}
