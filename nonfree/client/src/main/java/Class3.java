import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public abstract class Class3 {

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "Z")
	private final boolean aBoolean364;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
	private final int anInt4382;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
	private int anInt4383;

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "Lclient!oea;")
	protected final Class87_Sub2 aClass87_Sub2_10;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
	protected final int anInt4376;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!oea;I[BIZ)V")
	public Class3(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean364 = arg4;
		this.anInt4382 = arg1;
		this.anInt4383 = arg3;
		this.aClass87_Sub2_10 = arg0;
		OpenGL.glGenBuffersARB(1, Static103.anIntArray187, 0);
		this.anInt4376 = Static103.anIntArray187[0];
		this.method3633();
		OpenGL.glBufferDataARBub(arg1, this.anInt4383, arg2, 0, this.aBoolean364 ? 35040 : 35044);
		this.aClass87_Sub2_10.anInt7374 += this.anInt4383;
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!oea;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class3(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4383 = arg3;
		this.aBoolean364 = arg4;
		this.anInt4382 = arg1;
		this.aClass87_Sub2_10 = arg0;
		OpenGL.glGenBuffersARB(1, Static103.anIntArray187, 0);
		this.anInt4376 = Static103.anIntArray187[0];
		this.method3633();
		OpenGL.glBufferDataARBa(arg1, this.anInt4383, arg2.getAddress(), this.aBoolean364 ? 35040 : 35044);
		this.aClass87_Sub2_10.anInt7374 += this.anInt4383;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(B)V")
	protected abstract void method3633();

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([BII)V")
	protected final void method3634(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method3633();
		if (this.anInt4383 >= arg1) {
			OpenGL.glBufferSubDataARBub(this.anInt4382, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt4382, arg1, arg0, 0, this.aBoolean364 ? 35040 : 35044);
			this.aClass87_Sub2_10.anInt7374 += arg1 - this.anInt4383;
			this.anInt4383 = arg1;
		}
	}

	@OriginalMember(owner = "client!lr", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass87_Sub2_10.method6158(this.anInt4376, this.anInt4383);
		super.finalize();
	}
}
