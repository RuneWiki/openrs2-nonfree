import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public abstract class Class184 {

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "Lclient!ji;")
	protected final Class15_Sub3 aClass15_Sub3_30;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
	private final int anInt8568;

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
	private int anInt8570;

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "Z")
	private final boolean aBoolean703;

	@OriginalMember(owner = "client!tba", name = "j", descriptor = "I")
	protected final int anInt8573;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!ji;I[BIZ)V")
	public Class184(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass15_Sub3_30 = arg0;
		this.anInt8568 = arg1;
		this.anInt8570 = arg3;
		this.aBoolean703 = arg4;
		OpenGL.glGenBuffersARB(1, Static270.anIntArray283, 0);
		this.anInt8573 = Static270.anIntArray283[0];
		this.method7024();
		OpenGL.glBufferDataARBub(arg1, this.anInt8570, arg2, 0, this.aBoolean703 ? 35040 : 35044);
		this.aClass15_Sub3_30.anInt5332 += this.anInt8570;
	}

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!ji;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class184(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean703 = arg4;
		this.anInt8570 = arg3;
		this.aClass15_Sub3_30 = arg0;
		this.anInt8568 = arg1;
		OpenGL.glGenBuffersARB(1, Static270.anIntArray283, 0);
		this.anInt8573 = Static270.anIntArray283[0];
		this.method7024();
		OpenGL.glBufferDataARBa(arg1, this.anInt8570, arg2.getAddress(), this.aBoolean703 ? 35040 : 35044);
		this.aClass15_Sub3_30.anInt5332 += this.anInt8570;
	}

	@OriginalMember(owner = "client!tba", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass15_Sub3_30.method4457(this.anInt8570, this.anInt8573);
		super.finalize();
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IB[B)V")
	protected final void method7022(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method7024();
		if (arg0 <= this.anInt8570) {
			OpenGL.glBufferSubDataARBub(this.anInt8568, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt8568, arg0, arg1, 0, this.aBoolean703 ? 35040 : 35044);
			this.aClass15_Sub3_30.anInt5332 += arg0 - this.anInt8570;
			this.anInt8570 = arg0;
		}
	}

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "(I)V")
	protected abstract void method7024();
}
