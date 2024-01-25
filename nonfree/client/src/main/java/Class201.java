import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class Class201 {

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
	private int anInt7751;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Z")
	private final boolean aBoolean534;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!kga;")
	protected final Class44_Sub3 aClass44_Sub3_32;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
	private final int anInt7747;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	protected final int anInt7748;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!kga;I[BIZ)V")
	public Class201(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7751 = arg3;
		this.aBoolean534 = arg4;
		this.aClass44_Sub3_32 = arg0;
		this.anInt7747 = arg1;
		OpenGL.glGenBuffersARB(1, Static34.anIntArray21, 0);
		this.anInt7748 = Static34.anIntArray21[0];
		this.method6465();
		OpenGL.glBufferDataARBub(arg1, this.anInt7751, arg2, 0, this.aBoolean534 ? 35040 : 35044);
		this.aClass44_Sub3_32.anInt5479 += this.anInt7751;
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!kga;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class201(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7747 = arg1;
		this.aClass44_Sub3_32 = arg0;
		this.aBoolean534 = arg4;
		this.anInt7751 = arg3;
		OpenGL.glGenBuffersARB(1, Static34.anIntArray21, 0);
		this.anInt7748 = Static34.anIntArray21[0];
		this.method6465();
		OpenGL.glBufferDataARBa(arg1, this.anInt7751, arg2.getAddress(), this.aBoolean534 ? 35040 : 35044);
		this.aClass44_Sub3_32.anInt5479 += this.anInt7751;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[BI)V")
	protected final void method6460(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method6465();
		if (this.anInt7751 >= arg1) {
			OpenGL.glBufferSubDataARBub(this.anInt7747, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt7747, arg1, arg0, 0, this.aBoolean534 ? 35040 : 35044);
			this.aClass44_Sub3_32.anInt5479 += arg1 - this.anInt7751;
			this.anInt7751 = arg1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass44_Sub3_32.method4667(this.anInt7748, this.anInt7751);
		super.finalize();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	protected abstract void method6465();
}
