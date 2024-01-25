import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class Class130 {

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "Z")
	private final boolean aBoolean704;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "Lclient!ok;")
	protected final Class134_Sub2 aClass134_Sub2_41;

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
	private final int anInt9132;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
	private int anInt9131;

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
	protected final int anInt9128;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!ok;I[BIZ)V")
	public Class130(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean704 = arg4;
		this.aClass134_Sub2_41 = arg0;
		this.anInt9132 = arg1;
		this.anInt9131 = arg3;
		OpenGL.glGenBuffersARB(1, Static205.anIntArray693, 0);
		this.anInt9128 = Static205.anIntArray693[0];
		this.method7483();
		OpenGL.glBufferDataARBub(arg1, this.anInt9131, arg2, 0, this.aBoolean704 ? 35040 : 35044);
		this.aClass134_Sub2_41.anInt6557 += this.anInt9131;
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!ok;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class130(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9131 = arg3;
		this.aClass134_Sub2_41 = arg0;
		this.anInt9132 = arg1;
		this.aBoolean704 = arg4;
		OpenGL.glGenBuffersARB(1, Static205.anIntArray693, 0);
		this.anInt9128 = Static205.anIntArray693[0];
		this.method7483();
		OpenGL.glBufferDataARBa(arg1, this.anInt9131, arg2.getAddress(), this.aBoolean704 ? 35040 : 35044);
		this.aClass134_Sub2_41.anInt6557 += this.anInt9131;
	}

	@OriginalMember(owner = "client!gs", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass134_Sub2_41.method5246(this.anInt9131, this.anInt9128);
		super.finalize();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB[B)V")
	protected final void method7481(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method7483();
		if (arg0 <= this.anInt9131) {
			OpenGL.glBufferSubDataARBub(this.anInt9132, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt9132, arg0, arg1, 0, this.aBoolean704 ? 35040 : 35044);
			this.aClass134_Sub2_41.anInt6557 += arg0 - this.anInt9131;
			this.anInt9131 = arg0;
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
	protected abstract void method7483();
}
