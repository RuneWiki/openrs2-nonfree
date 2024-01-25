import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class Class112 {

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	private int anInt7508;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Z")
	private final boolean aBoolean473;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Lclient!rl;")
	protected final Class66_Sub2 aClass66_Sub2_42;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
	private final int anInt7511;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
	protected final int anInt7507;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!rl;I[BIZ)V")
	public Class112(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7508 = arg3;
		this.aBoolean473 = arg4;
		this.aClass66_Sub2_42 = arg0;
		this.anInt7511 = arg1;
		OpenGL.glGenBuffersARB(1, Static77.anIntArray112, 0);
		this.anInt7507 = Static77.anIntArray112[0];
		this.method6161();
		OpenGL.glBufferDataARBub(arg1, this.anInt7508, arg2, 0, this.aBoolean473 ? 35040 : 35044);
		this.aClass66_Sub2_42.anInt6147 += this.anInt7508;
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!rl;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class112(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7511 = arg1;
		this.anInt7508 = arg3;
		this.aBoolean473 = arg4;
		this.aClass66_Sub2_42 = arg0;
		OpenGL.glGenBuffersARB(1, Static77.anIntArray112, 0);
		this.anInt7507 = Static77.anIntArray112[0];
		this.method6161();
		OpenGL.glBufferDataARBa(arg1, this.anInt7508, arg2.b(), this.aBoolean473 ? 35040 : 35044);
		this.aClass66_Sub2_42.anInt6147 += this.anInt7508;
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V")
	protected abstract void method6161();

	@OriginalMember(owner = "client!mk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass66_Sub2_42.method5077(this.anInt7508, this.anInt7507);
		super.finalize();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([BII)V")
	protected final void method6164(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method6161();
		if (this.anInt7508 >= arg1) {
			OpenGL.glBufferSubDataARB(this.anInt7511, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt7511, arg1, arg0, 0, this.aBoolean473 ? 35040 : 35044);
			this.aClass66_Sub2_42.anInt6147 += arg1 - this.anInt7508;
			this.anInt7508 = arg1;
		}
	}
}
