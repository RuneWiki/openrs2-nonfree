import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class Class310 {

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
	private final int anInt9191;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Z")
	private final boolean aBoolean717;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	private int anInt9190;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "Lclient!vj;")
	protected final Class45_Sub3 aClass45_Sub3_43;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	protected final int anInt9188;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!vj;I[BIZ)V")
	public Class310(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9191 = arg1;
		this.aBoolean717 = arg4;
		this.anInt9190 = arg3;
		this.aClass45_Sub3_43 = arg0;
		OpenGL.glGenBuffersARB(1, Static437.anIntArray450, 0);
		this.anInt9188 = Static437.anIntArray450[0];
		this.method7591();
		OpenGL.glBufferDataARBub(arg1, this.anInt9190, arg2, 0, this.aBoolean717 ? 35040 : 35044);
		this.aClass45_Sub3_43.anInt9051 += this.anInt9190;
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!vj;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class310(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9190 = arg3;
		this.anInt9191 = arg1;
		this.aClass45_Sub3_43 = arg0;
		this.aBoolean717 = arg4;
		OpenGL.glGenBuffersARB(1, Static437.anIntArray450, 0);
		this.anInt9188 = Static437.anIntArray450[0];
		this.method7591();
		OpenGL.glBufferDataARBa(arg1, this.anInt9190, arg2.getAddress(), this.aBoolean717 ? 35040 : 35044);
		this.aClass45_Sub3_43.anInt9051 += this.anInt9190;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II[B)V")
	protected final void method7590(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method7591();
		if (this.anInt9190 >= arg0) {
			OpenGL.glBufferSubDataARBub(this.anInt9191, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt9191, arg0, arg1, 0, this.aBoolean717 ? 35040 : 35044);
			this.aClass45_Sub3_43.anInt9051 += arg0 - this.anInt9190;
			this.anInt9190 = arg0;
		}
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
	protected abstract void method7591();

	@OriginalMember(owner = "client!sh", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass45_Sub3_43.method7478(this.anInt9190, this.anInt9188);
		super.finalize();
	}
}
