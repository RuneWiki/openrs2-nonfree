import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class Class238 {

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
	private final int anInt9874;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "Lclient!pc;")
	protected final Class33_Sub3 aClass33_Sub3_40;

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
	private int anInt9873;

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "Z")
	private final boolean aBoolean767;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
	protected final int anInt9872;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!pc;I[BIZ)V")
	public Class238(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9874 = arg1;
		this.aClass33_Sub3_40 = arg0;
		this.anInt9873 = arg3;
		this.aBoolean767 = arg4;
		OpenGL.glGenBuffersARB(1, Static182.anIntArray232, 0);
		this.anInt9872 = Static182.anIntArray232[0];
		this.method8456();
		OpenGL.glBufferDataARBub(arg1, this.anInt9873, arg2, 0, this.aBoolean767 ? 35040 : 35044);
		this.aClass33_Sub3_40.anInt7269 += this.anInt9873;
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!pc;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class238(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9873 = arg3;
		this.anInt9874 = arg1;
		this.aBoolean767 = arg4;
		this.aClass33_Sub3_40 = arg0;
		OpenGL.glGenBuffersARB(1, Static182.anIntArray232, 0);
		this.anInt9872 = Static182.anIntArray232[0];
		this.method8456();
		OpenGL.glBufferDataARBa(arg1, this.anInt9873, arg2.getAddress(), this.aBoolean767 ? 35040 : 35044);
		this.aClass33_Sub3_40.anInt7269 += this.anInt9873;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "([BII)V")
	protected final void method8452(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method8456();
		if (this.anInt9873 < arg1) {
			OpenGL.glBufferDataARBub(this.anInt9874, arg1, arg0, 0, this.aBoolean767 ? 35040 : 35044);
			this.aClass33_Sub3_40.anInt7269 += arg1 - this.anInt9873;
			this.anInt9873 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt9874, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)V")
	protected abstract void method8456();

	@OriginalMember(owner = "client!mp", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass33_Sub3_40.method6342(this.anInt9872, this.anInt9873);
		super.finalize();
	}
}
