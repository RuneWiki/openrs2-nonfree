import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public abstract class Class188 {

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
	private int anInt7947;

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "Lclient!no;")
	protected final Class66_Sub3 aClass66_Sub3_34;

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
	private final int anInt7945;

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "Z")
	private final boolean aBoolean551;

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
	protected final int anInt7946;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!no;I[BIZ)V")
	public Class188(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7947 = arg3;
		this.aClass66_Sub3_34 = arg0;
		this.anInt7945 = arg1;
		this.aBoolean551 = arg4;
		OpenGL.glGenBuffersARB(1, Static429.anIntArray607, 0);
		this.anInt7946 = Static429.anIntArray607[0];
		this.method6567();
		OpenGL.glBufferDataARBub(arg1, this.anInt7947, arg2, 0, this.aBoolean551 ? 35040 : 35044);
		this.aClass66_Sub3_34.anInt6448 += this.anInt7947;
	}

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!no;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class188(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7945 = arg1;
		this.aBoolean551 = arg4;
		this.aClass66_Sub3_34 = arg0;
		this.anInt7947 = arg3;
		OpenGL.glGenBuffersARB(1, Static429.anIntArray607, 0);
		this.anInt7946 = Static429.anIntArray607[0];
		this.method6567();
		OpenGL.glBufferDataARBa(arg1, this.anInt7947, arg2.getAddress(), this.aBoolean551 ? 35040 : 35044);
		this.aClass66_Sub3_34.anInt6448 += this.anInt7947;
	}

	@OriginalMember(owner = "client!kba", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass66_Sub3_34.method5354(this.anInt7947, this.anInt7946);
		super.finalize();
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I[BI)V")
	protected final void method6565(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method6567();
		if (arg0 <= this.anInt7947) {
			OpenGL.glBufferSubDataARBub(this.anInt7945, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt7945, arg0, arg1, 0, this.aBoolean551 ? 35040 : 35044);
			this.aClass66_Sub3_34.anInt6448 += arg0 - this.anInt7947;
			this.anInt7947 = arg0;
		}
	}

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)V")
	protected abstract void method6567();
}
