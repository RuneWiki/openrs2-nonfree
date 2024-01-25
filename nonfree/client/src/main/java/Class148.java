import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class Class148 {

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Lclient!pq;")
	protected final Class132_Sub3 aClass132_Sub3_25;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "Z")
	private final boolean aBoolean281;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
	private int anInt4520;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
	private final int anInt4522;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
	protected final int anInt4519;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!pq;I[BIZ)V")
	public Class148(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass132_Sub3_25 = arg0;
		this.aBoolean281 = arg4;
		this.anInt4520 = arg3;
		this.anInt4522 = arg1;
		OpenGL.glGenBuffersARB(1, Static549.anIntArray623, 0);
		this.anInt4519 = Static549.anIntArray623[0];
		this.method3788();
		OpenGL.glBufferDataARBub(arg1, this.anInt4520, arg2, 0, this.aBoolean281 ? 35040 : 35044);
		this.aClass132_Sub3_25.anInt7886 += this.anInt4520;
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!pq;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class148(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4522 = arg1;
		this.aClass132_Sub3_25 = arg0;
		this.anInt4520 = arg3;
		this.aBoolean281 = arg4;
		OpenGL.glGenBuffersARB(1, Static549.anIntArray623, 0);
		this.anInt4519 = Static549.anIntArray623[0];
		this.method3788();
		OpenGL.glBufferDataARBa(arg1, this.anInt4520, arg2.getAddress(), this.aBoolean281 ? 35040 : 35044);
		this.aClass132_Sub3_25.anInt7886 += this.anInt4520;
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
	protected abstract void method3788();

	@OriginalMember(owner = "client!uj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass132_Sub3_25.method6804(this.anInt4519, this.anInt4520);
		super.finalize();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([BBI)V")
	protected final void method3790(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method3788();
		if (this.anInt4520 < arg1) {
			OpenGL.glBufferDataARBub(this.anInt4522, arg1, arg0, 0, this.aBoolean281 ? 35040 : 35044);
			this.aClass132_Sub3_25.anInt7886 += arg1 - this.anInt4520;
			this.anInt4520 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt4522, 0, arg1, arg0, 0);
		}
	}
}
