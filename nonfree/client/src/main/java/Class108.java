import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public abstract class Class108 {

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "Lclient!ap;")
	protected final Class9_Sub2 aClass9_Sub2_34;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
	private int anInt8724;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
	private final int anInt8729;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "Z")
	private final boolean aBoolean649;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
	protected final int anInt8727;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!ap;I[BIZ)V")
	public Class108(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass9_Sub2_34 = arg0;
		this.anInt8724 = arg3;
		this.anInt8729 = arg1;
		this.aBoolean649 = arg4;
		OpenGL.glGenBuffersARB(1, Static462.anIntArray717, 0);
		this.anInt8727 = Static462.anIntArray717[0];
		this.method7293();
		OpenGL.glBufferDataARBub(arg1, this.anInt8724, arg2, 0, this.aBoolean649 ? 35040 : 35044);
		this.aClass9_Sub2_34.anInt815 += this.anInt8724;
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!ap;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class108(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean649 = arg4;
		this.anInt8724 = arg3;
		this.aClass9_Sub2_34 = arg0;
		this.anInt8729 = arg1;
		OpenGL.glGenBuffersARB(1, Static462.anIntArray717, 0);
		this.anInt8727 = Static462.anIntArray717[0];
		this.method7293();
		OpenGL.glBufferDataARBa(arg1, this.anInt8724, arg2.getAddress(), this.aBoolean649 ? 35040 : 35044);
		this.aClass9_Sub2_34.anInt815 += this.anInt8724;
	}

	@OriginalMember(owner = "client!rq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass9_Sub2_34.method759(this.anInt8724, this.anInt8727);
		super.finalize();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	protected abstract void method7293();

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II[B)V")
	protected final void method7294(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method7293();
		if (this.anInt8724 >= arg0) {
			OpenGL.glBufferSubDataARBub(this.anInt8729, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt8729, arg0, arg1, 0, this.aBoolean649 ? 35040 : 35044);
			this.aClass9_Sub2_34.anInt815 += arg0 - this.anInt8724;
			this.anInt8724 = arg0;
		}
	}
}
