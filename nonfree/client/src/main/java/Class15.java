import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public abstract class Class15 {

	@OriginalMember(owner = "client!am", name = "i", descriptor = "I")
	private final int anInt8427;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Z")
	private final boolean aBoolean577;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "I")
	private int anInt8429;

	@OriginalMember(owner = "client!am", name = "h", descriptor = "Lclient!pea;")
	protected final Class121_Sub3 aClass121_Sub3_39;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "I")
	protected final int anInt8425;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!pea;I[BIZ)V")
	public Class15(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8427 = arg1;
		this.aBoolean577 = arg4;
		this.anInt8429 = arg3;
		this.aClass121_Sub3_39 = arg0;
		OpenGL.glGenBuffersARB(1, Static541.anIntArray690, 0);
		this.anInt8425 = Static541.anIntArray690[0];
		this.method6948();
		OpenGL.glBufferDataARBub(arg1, this.anInt8429, arg2, 0, this.aBoolean577 ? 35040 : 35044);
		this.aClass121_Sub3_39.anInt6804 += this.anInt8429;
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!pea;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class15(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8429 = arg3;
		this.aBoolean577 = arg4;
		this.anInt8427 = arg1;
		this.aClass121_Sub3_39 = arg0;
		OpenGL.glGenBuffersARB(1, Static541.anIntArray690, 0);
		this.anInt8425 = Static541.anIntArray690[0];
		this.method6948();
		OpenGL.glBufferDataARBa(arg1, this.anInt8429, arg2.getAddress(), this.aBoolean577 ? 35040 : 35044);
		this.aClass121_Sub3_39.anInt6804 += this.anInt8429;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	protected abstract void method6948();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ[B)V")
	protected final void method6949(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method6948();
		if (arg0 <= this.anInt8429) {
			OpenGL.glBufferSubDataARBub(this.anInt8427, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt8427, arg0, arg1, 0, this.aBoolean577 ? 35040 : 35044);
			this.aClass121_Sub3_39.anInt6804 += arg0 - this.anInt8429;
			this.anInt8429 = arg0;
		}
	}

	@OriginalMember(owner = "client!am", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass121_Sub3_39.method5703(this.anInt8429, this.anInt8425);
		super.finalize();
	}
}
