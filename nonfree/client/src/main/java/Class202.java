import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class Class202 {

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	private int anInt8163;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Lclient!us;")
	protected final Class43_Sub3 aClass43_Sub3_39;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "I")
	private final int anInt8159;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "Z")
	private final boolean aBoolean634;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	protected final int anInt8161;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!us;I[BIZ)V")
	public Class202(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8163 = arg3;
		this.aClass43_Sub3_39 = arg0;
		this.anInt8159 = arg1;
		this.aBoolean634 = arg4;
		OpenGL.glGenBuffersARB(1, Static221.anIntArray449, 0);
		this.anInt8161 = Static221.anIntArray449[0];
		this.method6868();
		OpenGL.glBufferDataARBub(arg1, this.anInt8163, arg2, 0, this.aBoolean634 ? 35040 : 35044);
		this.aClass43_Sub3_39.anInt8742 += this.anInt8163;
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!us;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class202(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8163 = arg3;
		this.anInt8159 = arg1;
		this.aClass43_Sub3_39 = arg0;
		this.aBoolean634 = arg4;
		OpenGL.glGenBuffersARB(1, Static221.anIntArray449, 0);
		this.anInt8161 = Static221.anIntArray449[0];
		this.method6868();
		OpenGL.glBufferDataARBa(arg1, this.anInt8163, arg2.getAddress(), this.aBoolean634 ? 35040 : 35044);
		this.aClass43_Sub3_39.anInt8742 += this.anInt8163;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[BB)V")
	protected final void method6867(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method6868();
		if (this.anInt8163 < arg0) {
			OpenGL.glBufferDataARBub(this.anInt8159, arg0, arg1, 0, this.aBoolean634 ? 35040 : 35044);
			this.aClass43_Sub3_39.anInt8742 += arg0 - this.anInt8163;
			this.anInt8163 = arg0;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt8159, 0, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	protected abstract void method6868();

	@OriginalMember(owner = "client!li", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass43_Sub3_39.method7251(this.anInt8161, this.anInt8163);
		super.finalize();
	}
}
