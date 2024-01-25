import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class Class118 {

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
	private final int anInt7450;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
	private int anInt7449;

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "Lclient!vd;")
	protected final Class51_Sub2 aClass51_Sub2_41;

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "Z")
	private final boolean aBoolean503;

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
	protected final int anInt7447;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!vd;I[BIZ)V")
	public Class118(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7450 = arg1;
		this.anInt7449 = arg3;
		this.aClass51_Sub2_41 = arg0;
		this.aBoolean503 = arg4;
		OpenGL.glGenBuffersARB(1, Static187.anIntArray305, 0);
		this.anInt7447 = Static187.anIntArray305[0];
		this.method5742();
		OpenGL.glBufferDataARBub(arg1, this.anInt7449, arg2, 0, this.aBoolean503 ? 35040 : 35044);
		this.aClass51_Sub2_41.anInt6916 += this.anInt7449;
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!vd;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class118(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7449 = arg3;
		this.anInt7450 = arg1;
		this.aBoolean503 = arg4;
		this.aClass51_Sub2_41 = arg0;
		OpenGL.glGenBuffersARB(1, Static187.anIntArray305, 0);
		this.anInt7447 = Static187.anIntArray305[0];
		this.method5742();
		OpenGL.glBufferDataARBa(arg1, this.anInt7449, arg2.a(), this.aBoolean503 ? 35040 : 35044);
		this.aClass51_Sub2_41.anInt6916 += this.anInt7449;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "([BII)V")
	protected final void method5740(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5742();
		if (this.anInt7449 >= arg1) {
			OpenGL.glBufferSubDataARB(this.anInt7450, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt7450, arg1, arg0, 0, this.aBoolean503 ? 35040 : 35044);
			this.aClass51_Sub2_41.anInt6916 += arg1 - this.anInt7449;
			this.anInt7449 = arg1;
		}
	}

	@OriginalMember(owner = "client!iq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass51_Sub2_41.method5395(this.anInt7447, this.anInt7449);
		super.finalize();
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V")
	protected abstract void method5742();
}
