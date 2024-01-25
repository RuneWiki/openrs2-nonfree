import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public abstract class Class62 {

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
	private int anInt9387;

	@OriginalMember(owner = "client!saa", name = "h", descriptor = "I")
	private final int anInt9389;

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "Lclient!ag;")
	protected final Class12_Sub1 aClass12_Sub1_41;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "Z")
	private final boolean aBoolean687;

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
	protected final int anInt9388;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!ag;I[BIZ)V")
	public Class62(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9387 = arg3;
		this.anInt9389 = arg1;
		this.aClass12_Sub1_41 = arg0;
		this.aBoolean687 = arg4;
		OpenGL.glGenBuffersARB(1, Static398.anIntArray471, 0);
		this.anInt9388 = Static398.anIntArray471[0];
		this.method7761();
		OpenGL.glBufferDataARBub(arg1, this.anInt9387, arg2, 0, this.aBoolean687 ? 35040 : 35044);
		this.aClass12_Sub1_41.anInt468 += this.anInt9387;
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!ag;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class62(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean687 = arg4;
		this.anInt9387 = arg3;
		this.anInt9389 = arg1;
		this.aClass12_Sub1_41 = arg0;
		OpenGL.glGenBuffersARB(1, Static398.anIntArray471, 0);
		this.anInt9388 = Static398.anIntArray471[0];
		this.method7761();
		OpenGL.glBufferDataARBa(arg1, this.anInt9387, arg2.getAddress(), this.aBoolean687 ? 35040 : 35044);
		this.aClass12_Sub1_41.anInt468 += this.anInt9387;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "([BII)V")
	protected final void method7760(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method7761();
		if (this.anInt9387 >= arg1) {
			OpenGL.glBufferSubDataARBub(this.anInt9389, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt9389, arg1, arg0, 0, this.aBoolean687 ? 35040 : 35044);
			this.aClass12_Sub1_41.anInt468 += arg1 - this.anInt9387;
			this.anInt9387 = arg1;
		}
	}

	@OriginalMember(owner = "client!saa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass12_Sub1_41.method382(this.anInt9388, this.anInt9387);
		super.finalize();
	}

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "(B)V")
	protected abstract void method7761();
}
