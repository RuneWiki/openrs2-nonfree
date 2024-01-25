import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class Class50 {

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
	private final int anInt6747;

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "Lclient!jaa;")
	protected final Class14_Sub3 aClass14_Sub3_33;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
	private int anInt6746;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "Z")
	private final boolean aBoolean464;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
	protected final int anInt6745;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!jaa;I[BIZ)V")
	public Class50(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6747 = arg1;
		this.aClass14_Sub3_33 = arg0;
		this.anInt6746 = arg3;
		this.aBoolean464 = arg4;
		OpenGL.glGenBuffersARB(1, Static337.anIntArray447, 0);
		this.anInt6745 = Static337.anIntArray447[0];
		this.method5678();
		OpenGL.glBufferDataARBub(arg1, this.anInt6746, arg2, 0, this.aBoolean464 ? 35040 : 35044);
		this.aClass14_Sub3_33.anInt4563 += this.anInt6746;
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!jaa;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class50(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean464 = arg4;
		this.aClass14_Sub3_33 = arg0;
		this.anInt6746 = arg3;
		this.anInt6747 = arg1;
		OpenGL.glGenBuffersARB(1, Static337.anIntArray447, 0);
		this.anInt6745 = Static337.anIntArray447[0];
		this.method5678();
		OpenGL.glBufferDataARBa(arg1, this.anInt6746, arg2.getAddress(), this.aBoolean464 ? 35040 : 35044);
		this.aClass14_Sub3_33.anInt4563 += this.anInt6746;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	protected abstract void method5678();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[BI)V")
	protected final void method5679(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5678();
		if (arg1 <= this.anInt6746) {
			OpenGL.glBufferSubDataARBub(this.anInt6747, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt6747, arg1, arg0, 0, this.aBoolean464 ? 35040 : 35044);
			this.aClass14_Sub3_33.anInt4563 += arg1 - this.anInt6746;
			this.anInt6746 = arg1;
		}
	}

	@OriginalMember(owner = "client!gn", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass14_Sub3_33.method3968(this.anInt6745, this.anInt6746);
		super.finalize();
	}
}
