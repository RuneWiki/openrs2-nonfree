import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public abstract class Class259 {

	@OriginalMember(owner = "client!pba", name = "e", descriptor = "Z")
	private final boolean aBoolean600;

	@OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
	private int anInt7186;

	@OriginalMember(owner = "client!pba", name = "m", descriptor = "Lclient!rda;")
	protected final Class126_Sub3 aClass126_Sub3_28;

	@OriginalMember(owner = "client!pba", name = "h", descriptor = "I")
	private final int anInt7184;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
	protected final int anInt7178;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!rda;I[BIZ)V")
	public Class259(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean600 = arg4;
		this.anInt7186 = arg3;
		this.aClass126_Sub3_28 = arg0;
		this.anInt7184 = arg1;
		OpenGL.glGenBuffersARB(1, Static114.anIntArray156, 0);
		this.anInt7178 = Static114.anIntArray156[0];
		this.method6373();
		OpenGL.glBufferDataARBub(arg1, this.anInt7186, arg2, 0, this.aBoolean600 ? 35040 : 35044);
		this.aClass126_Sub3_28.anInt8277 += this.anInt7186;
	}

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!rda;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class259(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass126_Sub3_28 = arg0;
		this.anInt7184 = arg1;
		this.aBoolean600 = arg4;
		this.anInt7186 = arg3;
		OpenGL.glGenBuffersARB(1, Static114.anIntArray156, 0);
		this.anInt7178 = Static114.anIntArray156[0];
		this.method6373();
		OpenGL.glBufferDataARBa(arg1, this.anInt7186, arg2.getAddress(), this.aBoolean600 ? 35040 : 35044);
		this.aClass126_Sub3_28.anInt8277 += this.anInt7186;
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)V")
	protected abstract void method6373();

	@OriginalMember(owner = "client!pba", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass126_Sub3_28.method7090(this.anInt7178, this.anInt7186);
		super.finalize();
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I[BI)V")
	protected final void method6375(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method6373();
		if (this.anInt7186 >= arg0) {
			OpenGL.glBufferSubDataARBub(this.anInt7184, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt7184, arg0, arg1, 0, this.aBoolean600 ? 35040 : 35044);
			this.aClass126_Sub3_28.anInt8277 += arg0 - this.anInt7186;
			this.anInt7186 = arg0;
		}
	}
}
