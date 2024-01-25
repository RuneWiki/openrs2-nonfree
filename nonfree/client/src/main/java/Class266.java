import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public abstract class Class266 {

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "I")
	private int anInt7685;

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "Lclient!dia;")
	protected final Class13_Sub2 aClass13_Sub2_32;

	@OriginalMember(owner = "client!qw", name = "j", descriptor = "I")
	private final int anInt7688;

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "Z")
	private final boolean aBoolean571;

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
	protected final int anInt7687;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!dia;I[BIZ)V")
	public Class266(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7685 = arg3;
		this.aClass13_Sub2_32 = arg0;
		this.anInt7688 = arg1;
		this.aBoolean571 = arg4;
		OpenGL.glGenBuffersARB(1, Static670.anIntArray813, 0);
		this.anInt7687 = Static670.anIntArray813[0];
		this.method6785();
		OpenGL.glBufferDataARBub(arg1, this.anInt7685, arg2, 0, this.aBoolean571 ? 35040 : 35044);
		this.aClass13_Sub2_32.anInt2162 += this.anInt7685;
	}

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!dia;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class266(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7685 = arg3;
		this.aBoolean571 = arg4;
		this.anInt7688 = arg1;
		this.aClass13_Sub2_32 = arg0;
		OpenGL.glGenBuffersARB(1, Static670.anIntArray813, 0);
		this.anInt7687 = Static670.anIntArray813[0];
		this.method6785();
		OpenGL.glBufferDataARBa(arg1, this.anInt7685, arg2.getAddress(), this.aBoolean571 ? 35040 : 35044);
		this.aClass13_Sub2_32.anInt2162 += this.anInt7685;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "([BII)V")
	protected final void method6782(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method6785();
		if (this.anInt7685 >= arg1) {
			OpenGL.glBufferSubDataARBub(this.anInt7688, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt7688, arg1, arg0, 0, this.aBoolean571 ? 35040 : 35044);
			this.aClass13_Sub2_32.anInt2162 += arg1 - this.anInt7685;
			this.anInt7685 = arg1;
		}
	}

	@OriginalMember(owner = "client!qw", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass13_Sub2_32.method2017(this.anInt7687, this.anInt7685);
		super.finalize();
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)V")
	protected abstract void method6785();
}
