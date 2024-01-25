import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public abstract class Class278 {

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "Z")
	private final boolean aBoolean757;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
	private final int anInt10549;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!rs;")
	protected final Class133_Sub3 aClass133_Sub3_43;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
	private int anInt10550;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
	protected final int anInt10552;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!rs;I[BIZ)V")
	public Class278(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean757 = arg4;
		this.anInt10549 = arg1;
		this.aClass133_Sub3_43 = arg0;
		this.anInt10550 = arg3;
		OpenGL.glGenBuffersARB(1, Static154.anIntArray157, 0);
		this.anInt10552 = Static154.anIntArray157[0];
		this.method8970();
		OpenGL.glBufferDataARBub(arg1, this.anInt10550, arg2, 0, this.aBoolean757 ? 35040 : 35044);
		this.aClass133_Sub3_43.anInt8537 += this.anInt10550;
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!rs;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class278(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean757 = arg4;
		this.anInt10549 = arg1;
		this.anInt10550 = arg3;
		this.aClass133_Sub3_43 = arg0;
		OpenGL.glGenBuffersARB(1, Static154.anIntArray157, 0);
		this.anInt10552 = Static154.anIntArray157[0];
		this.method8970();
		OpenGL.glBufferDataARBa(arg1, this.anInt10550, arg2.getAddress(), this.aBoolean757 ? 35040 : 35044);
		this.aClass133_Sub3_43.anInt8537 += this.anInt10550;
	}

	@OriginalMember(owner = "client!pt", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass133_Sub3_43.method7362(this.anInt10552, this.anInt10550);
		super.finalize();
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([BII)V")
	protected final void method8969(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method8970();
		if (arg1 > this.anInt10550) {
			OpenGL.glBufferDataARBub(this.anInt10549, arg1, arg0, 0, this.aBoolean757 ? 35040 : 35044);
			this.aClass133_Sub3_43.anInt8537 += arg1 - this.anInt10550;
			this.anInt10550 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt10549, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V")
	protected abstract void method8970();
}
