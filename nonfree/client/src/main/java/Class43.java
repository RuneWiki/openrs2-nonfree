import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public abstract class Class43 {

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
	private int anInt6526;

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "Z")
	private final boolean aBoolean512;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
	private final int anInt6520;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "Lclient!qj;")
	protected final Class100_Sub3 aClass100_Sub3_32;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
	protected final int anInt6522;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!qj;I[BIZ)V")
	public Class43(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6526 = arg3;
		this.aBoolean512 = arg4;
		this.anInt6520 = arg1;
		this.aClass100_Sub3_32 = arg0;
		OpenGL.glGenBuffersARB(1, Static93.anIntArray102, 0);
		this.anInt6522 = Static93.anIntArray102[0];
		this.method5469();
		OpenGL.glBufferDataARBub(arg1, this.anInt6526, arg2, 0, this.aBoolean512 ? 35040 : 35044);
		this.aClass100_Sub3_32.anInt7671 += this.anInt6526;
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!qj;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class43(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean512 = arg4;
		this.anInt6526 = arg3;
		this.anInt6520 = arg1;
		this.aClass100_Sub3_32 = arg0;
		OpenGL.glGenBuffersARB(1, Static93.anIntArray102, 0);
		this.anInt6522 = Static93.anIntArray102[0];
		this.method5469();
		OpenGL.glBufferDataARBa(arg1, this.anInt6526, arg2.getAddress(), this.aBoolean512 ? 35040 : 35044);
		this.aClass100_Sub3_32.anInt7671 += this.anInt6526;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B[BI)V")
	protected final void method5468(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5469();
		if (this.anInt6526 >= arg1) {
			OpenGL.glBufferSubDataARBub(this.anInt6520, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt6520, arg1, arg0, 0, this.aBoolean512 ? 35040 : 35044);
			this.aClass100_Sub3_32.anInt7671 += arg1 - this.anInt6526;
			this.anInt6526 = arg1;
		}
	}

	@OriginalMember(owner = "client!pv", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass100_Sub3_32.method6307(this.anInt6522, this.anInt6526);
		super.finalize();
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V")
	protected abstract void method5469();
}
