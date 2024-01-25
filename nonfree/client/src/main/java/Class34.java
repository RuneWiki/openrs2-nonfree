import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class Class34 {

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Z")
	private final boolean aBoolean446;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "Lclient!qo;")
	protected final Class20_Sub3 aClass20_Sub3_22;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
	private final int anInt5916;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	private int anInt5910;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
	protected final int anInt5915;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!qo;I[BIZ)V")
	public Class34(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean446 = arg4;
		this.aClass20_Sub3_22 = arg0;
		this.anInt5916 = arg1;
		this.anInt5910 = arg3;
		OpenGL.glGenBuffersARB(1, Static144.anIntArray177, 0);
		this.anInt5915 = Static144.anIntArray177[0];
		this.method5098();
		OpenGL.glBufferDataARBub(arg1, this.anInt5910, arg2, 0, this.aBoolean446 ? 35040 : 35044);
		this.aClass20_Sub3_22.anInt8777 += this.anInt5910;
	}

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!qo;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class34(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5916 = arg1;
		this.anInt5910 = arg3;
		this.aClass20_Sub3_22 = arg0;
		this.aBoolean446 = arg4;
		OpenGL.glGenBuffersARB(1, Static144.anIntArray177, 0);
		this.anInt5915 = Static144.anIntArray177[0];
		this.method5098();
		OpenGL.glBufferDataARBa(arg1, this.anInt5910, arg2.getAddress(), this.aBoolean446 ? 35040 : 35044);
		this.aClass20_Sub3_22.anInt8777 += this.anInt5910;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([BII)V")
	protected final void method5096(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5098();
		if (this.anInt5910 >= arg1) {
			OpenGL.glBufferSubDataARBub(this.anInt5916, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt5916, arg1, arg0, 0, this.aBoolean446 ? 35040 : 35044);
			this.aClass20_Sub3_22.anInt8777 += arg1 - this.anInt5910;
			this.anInt5910 = arg1;
		}
	}

	@OriginalMember(owner = "client!bi", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass20_Sub3_22.method7367(this.anInt5910, this.anInt5915);
		super.finalize();
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
	protected abstract void method5098();
}
