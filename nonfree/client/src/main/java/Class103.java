import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class103 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!bo;")
	protected final Class26_Sub1 aClass26_Sub1_22;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Z")
	private final boolean aBoolean371;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	private final int anInt4425;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	private int anInt4424;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	protected final int anInt4426;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!bo;I[BIZ)V")
	public Class103(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass26_Sub1_22 = arg0;
		this.aBoolean371 = arg4;
		this.anInt4425 = arg1;
		this.anInt4424 = arg3;
		OpenGL.glGenBuffersARB(1, Static59.anIntArray78, 0);
		this.anInt4426 = Static59.anIntArray78[0];
		this.method3579();
		OpenGL.glBufferDataARBub(arg1, this.anInt4424, arg2, 0, this.aBoolean371 ? 35040 : 35044);
		this.aClass26_Sub1_22.anInt931 += this.anInt4424;
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!bo;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class103(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean371 = arg4;
		this.aClass26_Sub1_22 = arg0;
		this.anInt4424 = arg3;
		this.anInt4425 = arg1;
		OpenGL.glGenBuffersARB(1, Static59.anIntArray78, 0);
		this.anInt4426 = Static59.anIntArray78[0];
		this.method3579();
		OpenGL.glBufferDataARBa(arg1, this.anInt4424, arg2.a(), this.aBoolean371 ? 35040 : 35044);
		this.aClass26_Sub1_22.anInt931 += this.anInt4424;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	protected abstract void method3579();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BI)V")
	protected final void method3580(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method3579();
		if (this.anInt4424 >= arg1) {
			OpenGL.glBufferSubDataARB(this.anInt4425, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt4425, arg1, arg0, 0, this.aBoolean371 ? 35040 : 35044);
			this.aClass26_Sub1_22.anInt931 += arg1 - this.anInt4424;
			this.anInt4424 = arg1;
		}
	}

	@OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass26_Sub1_22.method637(this.anInt4426, this.anInt4424);
		super.finalize();
	}
}
