import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public abstract class Class30 {

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "Lclient!kv;")
	protected final Class143_Sub2 aClass143_Sub2_37;

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "Z")
	private final boolean aBoolean677;

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
	private final int anInt9310;

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
	private int anInt9312;

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
	protected final int anInt9308;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!kv;I[BIZ)V")
	public Class30(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass143_Sub2_37 = arg0;
		this.aBoolean677 = arg4;
		this.anInt9310 = arg1;
		this.anInt9312 = arg3;
		OpenGL.glGenBuffersARB(1, Static676.anIntArray512, 0);
		this.anInt9308 = Static676.anIntArray512[0];
		this.method7792();
		OpenGL.glBufferDataARBub(arg1, this.anInt9312, arg2, 0, this.aBoolean677 ? 35040 : 35044);
		this.aClass143_Sub2_37.anInt5829 += this.anInt9312;
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!kv;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class30(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass143_Sub2_37 = arg0;
		this.anInt9312 = arg3;
		this.anInt9310 = arg1;
		this.aBoolean677 = arg4;
		OpenGL.glGenBuffersARB(1, Static676.anIntArray512, 0);
		this.anInt9308 = Static676.anIntArray512[0];
		this.method7792();
		OpenGL.glBufferDataARBa(arg1, this.anInt9312, arg2.getAddress(), this.aBoolean677 ? 35040 : 35044);
		this.aClass143_Sub2_37.anInt5829 += this.anInt9312;
	}

	@OriginalMember(owner = "client!ww", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass143_Sub2_37.method4929(this.anInt9308, this.anInt9312);
		super.finalize();
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I[BZ)V")
	protected final void method7791(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method7792();
		if (this.anInt9312 >= arg0) {
			OpenGL.glBufferSubDataARBub(this.anInt9310, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt9310, arg0, arg1, 0, this.aBoolean677 ? 35040 : 35044);
			this.aClass143_Sub2_37.anInt5829 += arg0 - this.anInt9312;
			this.anInt9312 = arg0;
		}
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)V")
	protected abstract void method7792();
}
