import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public abstract class Class149 {

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
	private final int anInt7202;

	@OriginalMember(owner = "client!rq", name = "o", descriptor = "I")
	private int anInt7208;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "Lclient!ac;")
	protected final Class5_Sub1 aClass5_Sub1_27;

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "Z")
	private final boolean aBoolean571;

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
	protected final int anInt7207;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!ac;I[BIZ)V")
	public Class149(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7202 = arg1;
		this.anInt7208 = arg3;
		this.aClass5_Sub1_27 = arg0;
		this.aBoolean571 = arg4;
		OpenGL.glGenBuffersARB(1, Static48.anIntArray47, 0);
		this.anInt7207 = Static48.anIntArray47[0];
		this.method6025();
		OpenGL.glBufferDataARBub(arg1, this.anInt7208, arg2, 0, this.aBoolean571 ? 35040 : 35044);
		this.aClass5_Sub1_27.anInt366 += this.anInt7208;
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!ac;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class149(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass5_Sub1_27 = arg0;
		this.anInt7202 = arg1;
		this.aBoolean571 = arg4;
		this.anInt7208 = arg3;
		OpenGL.glGenBuffersARB(1, Static48.anIntArray47, 0);
		this.anInt7207 = Static48.anIntArray47[0];
		this.method6025();
		OpenGL.glBufferDataARBa(arg1, this.anInt7208, arg2.getAddress(), this.aBoolean571 ? 35040 : 35044);
		this.aClass5_Sub1_27.anInt366 += this.anInt7208;
	}

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V")
	protected abstract void method6025();

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II[B)V")
	protected final void method6030(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method6025();
		if (arg0 > this.anInt7208) {
			OpenGL.glBufferDataARBub(this.anInt7202, arg0, arg1, 0, this.aBoolean571 ? 35040 : 35044);
			this.aClass5_Sub1_27.anInt366 += arg0 - this.anInt7208;
			this.anInt7208 = arg0;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt7202, 0, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!rq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass5_Sub1_27.method368(this.anInt7208, this.anInt7207);
		super.finalize();
	}
}
