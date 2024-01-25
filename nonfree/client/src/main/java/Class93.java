import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class Class93 {

	@OriginalMember(owner = "client!md", name = "o", descriptor = "I")
	private final int anInt5495;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Z")
	private final boolean aBoolean405;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "I")
	private int anInt5490;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!bi;")
	protected final Class13_Sub2 aClass13_Sub2_25;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	protected final int anInt5487;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!bi;I[BIZ)V")
	public Class93(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5495 = arg1;
		this.aBoolean405 = arg4;
		this.anInt5490 = arg3;
		this.aClass13_Sub2_25 = arg0;
		OpenGL.glGenBuffersARB(1, Static260.anIntArray298, 0);
		this.anInt5487 = Static260.anIntArray298[0];
		this.method4789();
		OpenGL.glBufferDataARBub(arg1, this.anInt5490, arg2, 0, this.aBoolean405 ? 35040 : 35044);
		this.aClass13_Sub2_25.anInt1080 += this.anInt5490;
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!bi;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class93(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean405 = arg4;
		this.anInt5495 = arg1;
		this.anInt5490 = arg3;
		this.aClass13_Sub2_25 = arg0;
		OpenGL.glGenBuffersARB(1, Static260.anIntArray298, 0);
		this.anInt5487 = Static260.anIntArray298[0];
		this.method4789();
		OpenGL.glBufferDataARBa(arg1, this.anInt5490, arg2.getAddress(), this.aBoolean405 ? 35040 : 35044);
		this.aClass13_Sub2_25.anInt1080 += this.anInt5490;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
	protected abstract void method4789();

	@OriginalMember(owner = "client!md", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass13_Sub2_25.method1078(this.anInt5487, this.anInt5490);
		super.finalize();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([BII)V")
	protected final void method4790(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method4789();
		if (arg1 > this.anInt5490) {
			OpenGL.glBufferDataARBub(this.anInt5495, arg1, arg0, 0, this.aBoolean405 ? 35040 : 35044);
			this.aClass13_Sub2_25.anInt1080 += arg1 - this.anInt5490;
			this.anInt5490 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt5495, 0, arg1, arg0, 0);
		}
	}
}
