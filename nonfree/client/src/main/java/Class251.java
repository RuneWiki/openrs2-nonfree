import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class Class251 {

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	private final int anInt9050;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	private int anInt9049;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Lclient!ep;")
	protected final Class95_Sub1 aClass95_Sub1_40;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Z")
	private final boolean aBoolean673;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	protected final int anInt9048;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!ep;I[BIZ)V")
	public Class251(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9050 = arg1;
		this.anInt9049 = arg3;
		this.aClass95_Sub1_40 = arg0;
		this.aBoolean673 = arg4;
		OpenGL.glGenBuffersARB(1, Static403.anIntArray469, 0);
		this.anInt9048 = Static403.anIntArray469[0];
		this.method7596();
		OpenGL.glBufferDataARBub(arg1, this.anInt9049, arg2, 0, this.aBoolean673 ? 35040 : 35044);
		this.aClass95_Sub1_40.anInt2520 += this.anInt9049;
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!ep;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class251(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9049 = arg3;
		this.anInt9050 = arg1;
		this.aClass95_Sub1_40 = arg0;
		this.aBoolean673 = arg4;
		OpenGL.glGenBuffersARB(1, Static403.anIntArray469, 0);
		this.anInt9048 = Static403.anIntArray469[0];
		this.method7596();
		OpenGL.glBufferDataARBa(arg1, this.anInt9049, arg2.getAddress(), this.aBoolean673 ? 35040 : 35044);
		this.aClass95_Sub1_40.anInt2520 += this.anInt9049;
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
	protected abstract void method7596();

	@OriginalMember(owner = "client!ok", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass95_Sub1_40.method2064(this.anInt9048, this.anInt9049);
		super.finalize();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[B)V")
	protected final void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method7596();
		if (this.anInt9049 >= arg0) {
			OpenGL.glBufferSubDataARBub(this.anInt9050, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt9050, arg0, arg1, 0, this.aBoolean673 ? 35040 : 35044);
			this.aClass95_Sub1_40.anInt2520 += arg0 - this.anInt9049;
			this.anInt9049 = arg0;
		}
	}
}
