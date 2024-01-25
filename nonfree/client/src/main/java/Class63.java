import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class Class63 {

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
	private final int anInt5497;

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
	private int anInt5492;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "Z")
	private final boolean aBoolean413;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "Lclient!ml;")
	protected final Class75_Sub3 aClass75_Sub3_23;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
	protected final int anInt5499;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!ml;I[BIZ)V")
	public Class63(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5497 = arg1;
		this.anInt5492 = arg3;
		this.aBoolean413 = arg4;
		this.aClass75_Sub3_23 = arg0;
		OpenGL.glGenBuffersARB(1, Static686.anIntArray699, 0);
		this.anInt5499 = Static686.anIntArray699[0];
		this.method5014();
		OpenGL.glBufferDataARBub(arg1, this.anInt5492, arg2, 0, this.aBoolean413 ? 35040 : 35044);
		this.aClass75_Sub3_23.anInt6537 += this.anInt5492;
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!ml;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class63(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean413 = arg4;
		this.anInt5497 = arg1;
		this.aClass75_Sub3_23 = arg0;
		this.anInt5492 = arg3;
		OpenGL.glGenBuffersARB(1, Static686.anIntArray699, 0);
		this.anInt5499 = Static686.anIntArray699[0];
		this.method5014();
		OpenGL.glBufferDataARBa(arg1, this.anInt5492, arg2.getAddress(), this.aBoolean413 ? 35040 : 35044);
		this.aClass75_Sub3_23.anInt6537 += this.anInt5492;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ[B)V")
	protected final void method5011(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method5014();
		if (this.anInt5492 >= arg0) {
			OpenGL.glBufferSubDataARBub(this.anInt5497, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt5497, arg0, arg1, 0, this.aBoolean413 ? 35040 : 35044);
			this.aClass75_Sub3_23.anInt6537 += arg0 - this.anInt5492;
			this.anInt5492 = arg0;
		}
	}

	@OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass75_Sub3_23.method5837(this.anInt5499, this.anInt5492);
		super.finalize();
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
	protected abstract void method5014();
}
