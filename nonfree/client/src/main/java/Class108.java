import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class Class108 {

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
	private int anInt6866;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "Lclient!gi;")
	protected final Class42_Sub3 aClass42_Sub3_27;

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "Z")
	private final boolean aBoolean496;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
	private final int anInt6858;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
	protected final int anInt6864;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!gi;I[BIZ)V")
	public Class108(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6866 = arg3;
		this.aClass42_Sub3_27 = arg0;
		this.aBoolean496 = arg4;
		this.anInt6858 = arg1;
		OpenGL.glGenBuffersARB(1, Static84.anIntArray188, 0);
		this.anInt6864 = Static84.anIntArray188[0];
		this.method5740();
		OpenGL.glBufferDataARBub(arg1, this.anInt6866, arg2, 0, this.aBoolean496 ? 35040 : 35044);
		this.aClass42_Sub3_27.anInt3679 += this.anInt6866;
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!gi;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class108(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6866 = arg3;
		this.aClass42_Sub3_27 = arg0;
		this.anInt6858 = arg1;
		this.aBoolean496 = arg4;
		OpenGL.glGenBuffersARB(1, Static84.anIntArray188, 0);
		this.anInt6864 = Static84.anIntArray188[0];
		this.method5740();
		OpenGL.glBufferDataARBa(arg1, this.anInt6866, arg2.getAddress(), this.aBoolean496 ? 35040 : 35044);
		this.aClass42_Sub3_27.anInt3679 += this.anInt6866;
	}

	@OriginalMember(owner = "client!fv", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass42_Sub3_27.method3225(this.anInt6864, this.anInt6866);
		super.finalize();
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V")
	protected abstract void method5740();

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([BII)V")
	protected final void method5743(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method5740();
		if (arg1 > this.anInt6866) {
			OpenGL.glBufferDataARBub(this.anInt6858, arg1, arg0, 0, this.aBoolean496 ? 35040 : 35044);
			this.aClass42_Sub3_27.anInt3679 += arg1 - this.anInt6866;
			this.anInt6866 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt6858, 0, arg1, arg0, 0);
		}
	}
}
