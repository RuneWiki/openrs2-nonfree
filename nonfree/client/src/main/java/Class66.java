import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public abstract class Class66 {

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
	private int anInt8170;

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "Z")
	private final boolean aBoolean584;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
	private final int anInt8175;

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "Lclient!kfa;")
	protected final Class7_Sub2 aClass7_Sub2_35;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
	protected final int anInt8171;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!kfa;I[BIZ)V")
	public Class66(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8170 = arg3;
		this.aBoolean584 = arg4;
		this.anInt8175 = arg1;
		this.aClass7_Sub2_35 = arg0;
		OpenGL.glGenBuffersARB(1, Static126.anIntArray131, 0);
		this.anInt8171 = Static126.anIntArray131[0];
		this.method6360();
		OpenGL.glBufferDataARBub(arg1, this.anInt8170, arg2, 0, this.aBoolean584 ? 35040 : 35044);
		this.aClass7_Sub2_35.anInt5603 += this.anInt8170;
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!kfa;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class66(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8175 = arg1;
		this.aBoolean584 = arg4;
		this.anInt8170 = arg3;
		this.aClass7_Sub2_35 = arg0;
		OpenGL.glGenBuffersARB(1, Static126.anIntArray131, 0);
		this.anInt8171 = Static126.anIntArray131[0];
		this.method6360();
		OpenGL.glBufferDataARBa(arg1, this.anInt8170, arg2.getAddress(), this.aBoolean584 ? 35040 : 35044);
		this.aClass7_Sub2_35.anInt5603 += this.anInt8170;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
	protected abstract void method6360();

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "([BII)V")
	protected final void method6362(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method6360();
		if (arg1 > this.anInt8170) {
			OpenGL.glBufferDataARBub(this.anInt8175, arg1, arg0, 0, this.aBoolean584 ? 35040 : 35044);
			this.aClass7_Sub2_35.anInt5603 += arg1 - this.anInt8170;
			this.anInt8170 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt8175, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!pp", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass7_Sub2_35.method4292(this.anInt8171, this.anInt8170);
		super.finalize();
	}
}
