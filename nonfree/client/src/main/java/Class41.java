import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public abstract class Class41 {

	@OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
	private int anInt7929;

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "Z")
	private final boolean aBoolean535;

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
	private final int anInt7924;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "Lclient!te;")
	protected final Class9_Sub3 aClass9_Sub3_39;

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
	protected final int anInt7923;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!te;I[BIZ)V")
	public Class41(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7929 = arg3;
		this.aBoolean535 = arg4;
		this.anInt7924 = arg1;
		this.aClass9_Sub3_39 = arg0;
		OpenGL.glGenBuffersARB(1, Static11.anIntArray20, 0);
		this.anInt7923 = Static11.anIntArray20[0];
		this.method6735();
		OpenGL.glBufferDataARBub(arg1, this.anInt7929, arg2, 0, this.aBoolean535 ? 35040 : 35044);
		this.aClass9_Sub3_39.anInt7882 += this.anInt7929;
	}

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!te;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class41(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7924 = arg1;
		this.aClass9_Sub3_39 = arg0;
		this.anInt7929 = arg3;
		this.aBoolean535 = arg4;
		OpenGL.glGenBuffersARB(1, Static11.anIntArray20, 0);
		this.anInt7923 = Static11.anIntArray20[0];
		this.method6735();
		OpenGL.glBufferDataARBa(arg1, this.anInt7929, arg2.getAddress(), this.aBoolean535 ? 35040 : 35044);
		this.aClass9_Sub3_39.anInt7882 += this.anInt7929;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V")
	protected abstract void method6735();

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "([BZI)V")
	protected final void method6736(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method6735();
		if (arg1 <= this.anInt7929) {
			OpenGL.glBufferSubDataARBub(this.anInt7924, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt7924, arg1, arg0, 0, this.aBoolean535 ? 35040 : 35044);
			this.aClass9_Sub3_39.anInt7882 += arg1 - this.anInt7929;
			this.anInt7929 = arg1;
		}
	}

	@OriginalMember(owner = "client!cba", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass9_Sub3_39.method6686(this.anInt7929, this.anInt7923);
		super.finalize();
	}
}
