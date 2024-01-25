import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class Class11 {

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
	private final int anInt683;

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "Z")
	private final boolean aBoolean39;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Lclient!ef;")
	protected final Class49_Sub2 aClass49_Sub2_4;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
	private int anInt686;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	protected final int anInt685;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!ef;I[BIZ)V")
	public Class11(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt683 = arg1;
		this.aBoolean39 = arg4;
		this.aClass49_Sub2_4 = arg0;
		this.anInt686 = arg3;
		OpenGL.glGenBuffersARB(1, Static133.anIntArray258, 0);
		this.anInt685 = Static133.anIntArray258[0];
		this.method581();
		OpenGL.glBufferDataARBub(arg1, this.anInt686, arg2, 0, this.aBoolean39 ? 35040 : 35044);
		this.aClass49_Sub2_4.anInt2009 += this.anInt686;
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!ef;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class11(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt686 = arg3;
		this.anInt683 = arg1;
		this.aBoolean39 = arg4;
		this.aClass49_Sub2_4 = arg0;
		OpenGL.glGenBuffersARB(1, Static133.anIntArray258, 0);
		this.anInt685 = Static133.anIntArray258[0];
		this.method581();
		OpenGL.glBufferDataARBa(arg1, this.anInt686, arg2.c(), this.aBoolean39 ? 35040 : 35044);
		this.aClass49_Sub2_4.anInt2009 += this.anInt686;
	}

	@OriginalMember(owner = "client!ng", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass49_Sub2_4.method1629(this.anInt686, this.anInt685);
		super.finalize();
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
	protected abstract void method581();

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[BZ)V")
	protected final void method585(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method581();
		if (arg0 > this.anInt686) {
			OpenGL.glBufferDataARBub(this.anInt683, arg0, arg1, 0, this.aBoolean39 ? 35040 : 35044);
			this.aClass49_Sub2_4.anInt2009 += arg0 - this.anInt686;
			this.anInt686 = arg0;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt683, 0, arg0, arg1, 0);
		}
	}
}
