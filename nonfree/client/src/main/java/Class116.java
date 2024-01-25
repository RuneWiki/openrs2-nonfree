import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class Class116 {

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	private final int anInt10670;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	private int anInt10671;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "Lclient!aq;")
	protected final Class22_Sub1 aClass22_Sub1_40;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Z")
	private final boolean aBoolean722;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "I")
	protected final int anInt10667;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!aq;I[BIZ)V")
	public Class116(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10670 = arg1;
		this.anInt10671 = arg3;
		this.aClass22_Sub1_40 = arg0;
		this.aBoolean722 = arg4;
		OpenGL.glGenBuffersARB(1, Static93.anIntArray118, 0);
		this.anInt10667 = Static93.anIntArray118[0];
		this.method9066();
		OpenGL.glBufferDataARBub(arg1, this.anInt10671, arg2, 0, this.aBoolean722 ? 35040 : 35044);
		this.aClass22_Sub1_40.anInt1000 += this.anInt10671;
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!aq;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class116(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass22_Sub1_40 = arg0;
		this.anInt10671 = arg3;
		this.aBoolean722 = arg4;
		this.anInt10670 = arg1;
		OpenGL.glGenBuffersARB(1, Static93.anIntArray118, 0);
		this.anInt10667 = Static93.anIntArray118[0];
		this.method9066();
		OpenGL.glBufferDataARBa(arg1, this.anInt10671, arg2.getAddress(), this.aBoolean722 ? 35040 : 35044);
		this.aClass22_Sub1_40.anInt1000 += this.anInt10671;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II[B)V")
	protected final void method9065(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method9066();
		if (arg0 > this.anInt10671) {
			OpenGL.glBufferDataARBub(this.anInt10670, arg0, arg1, 0, this.aBoolean722 ? 35040 : 35044);
			this.aClass22_Sub1_40.anInt1000 += arg0 - this.anInt10671;
			this.anInt10671 = arg0;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt10670, 0, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass22_Sub1_40.method928(this.anInt10667, this.anInt10671);
		super.finalize();
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	protected abstract void method9066();
}
