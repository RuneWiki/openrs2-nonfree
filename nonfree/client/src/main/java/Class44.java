import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class Class44 {

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
	private final int anInt5452;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Z")
	private final boolean aBoolean369;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "Lclient!wh;")
	protected final Class100_Sub3 aClass100_Sub3_30;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	private int anInt5448;

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
	protected final int anInt5455;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!wh;I[BIZ)V")
	public Class44(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5452 = arg1;
		this.aBoolean369 = arg4;
		this.aClass100_Sub3_30 = arg0;
		this.anInt5448 = arg3;
		OpenGL.glGenBuffersARB(1, Static72.anIntArray109, 0);
		this.anInt5455 = Static72.anIntArray109[0];
		this.method4862();
		OpenGL.glBufferDataARBub(arg1, this.anInt5448, arg2, 0, this.aBoolean369 ? 35040 : 35044);
		this.aClass100_Sub3_30.anInt10593 += this.anInt5448;
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!wh;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class44(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass100_Sub3_30 = arg0;
		this.anInt5452 = arg1;
		this.aBoolean369 = arg4;
		this.anInt5448 = arg3;
		OpenGL.glGenBuffersARB(1, Static72.anIntArray109, 0);
		this.anInt5455 = Static72.anIntArray109[0];
		this.method4862();
		OpenGL.glBufferDataARBa(arg1, this.anInt5448, arg2.getAddress(), this.aBoolean369 ? 35040 : 35044);
		this.aClass100_Sub3_30.anInt10593 += this.anInt5448;
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	protected abstract void method4862();

	@OriginalMember(owner = "client!gn", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass100_Sub3_30.method8934(this.anInt5455, this.anInt5448);
		super.finalize();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZ[B)V")
	protected final void method4865(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method4862();
		if (arg0 > this.anInt5448) {
			OpenGL.glBufferDataARBub(this.anInt5452, arg0, arg1, 0, this.aBoolean369 ? 35040 : 35044);
			this.aClass100_Sub3_30.anInt10593 += arg0 - this.anInt5448;
			this.anInt5448 = arg0;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt5452, 0, arg0, arg1, 0);
		}
	}
}
