import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public abstract class Class84 {

	@OriginalMember(owner = "client!fca", name = "m", descriptor = "Z")
	private final boolean aBoolean570;

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "Lclient!os;")
	protected final Class39_Sub3 aClass39_Sub3_31;

	@OriginalMember(owner = "client!fca", name = "k", descriptor = "I")
	private final int anInt7694;

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "I")
	private int anInt7693;

	@OriginalMember(owner = "client!fca", name = "l", descriptor = "I")
	protected final int anInt7695;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!os;I[BIZ)V")
	public Class84(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean570 = arg4;
		this.aClass39_Sub3_31 = arg0;
		this.anInt7694 = arg1;
		this.anInt7693 = arg3;
		OpenGL.glGenBuffersARB(1, Static422.anIntArray600, 0);
		this.anInt7695 = Static422.anIntArray600[0];
		this.method6454();
		OpenGL.glBufferDataARBub(arg1, this.anInt7693, arg2, 0, this.aBoolean570 ? 35040 : 35044);
		this.aClass39_Sub3_31.anInt6722 += this.anInt7693;
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!os;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class84(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass39_Sub3_31 = arg0;
		this.anInt7693 = arg3;
		this.anInt7694 = arg1;
		this.aBoolean570 = arg4;
		OpenGL.glGenBuffersARB(1, Static422.anIntArray600, 0);
		this.anInt7695 = Static422.anIntArray600[0];
		this.method6454();
		OpenGL.glBufferDataARBa(arg1, this.anInt7693, arg2.getAddress(), this.aBoolean570 ? 35040 : 35044);
		this.aClass39_Sub3_31.anInt6722 += this.anInt7693;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(II[B)V")
	protected final void method6452(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method6454();
		if (this.anInt7693 < arg0) {
			OpenGL.glBufferDataARBub(this.anInt7694, arg0, arg1, 0, this.aBoolean570 ? 35040 : 35044);
			this.aClass39_Sub3_31.anInt6722 += arg0 - this.anInt7693;
			this.anInt7693 = arg0;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt7694, 0, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)V")
	protected abstract void method6454();

	@OriginalMember(owner = "client!fca", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass39_Sub3_31.method5729(this.anInt7695, this.anInt7693);
		super.finalize();
	}
}
