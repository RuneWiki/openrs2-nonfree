import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class Class42 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!pg;")
	protected final Class163_Sub2 aClass163_Sub2_40;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
	private int anInt6667;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	private final int anInt6665;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Z")
	private final boolean aBoolean470;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	protected final int anInt6666;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!pg;I[BIZ)V")
	public Class42(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass163_Sub2_40 = arg0;
		this.anInt6667 = arg3;
		this.anInt6665 = arg1;
		this.aBoolean470 = arg4;
		OpenGL.glGenBuffersARB(1, Static288.anIntArray412, 0);
		this.anInt6666 = Static288.anIntArray412[0];
		this.method5171();
		OpenGL.glBufferDataARBub(arg1, this.anInt6667, arg2, 0, this.aBoolean470 ? 35040 : 35044);
		this.aClass163_Sub2_40.anInt5226 += this.anInt6667;
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!pg;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class42(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6667 = arg3;
		this.aBoolean470 = arg4;
		this.anInt6665 = arg1;
		this.aClass163_Sub2_40 = arg0;
		OpenGL.glGenBuffersARB(1, Static288.anIntArray412, 0);
		this.anInt6666 = Static288.anIntArray412[0];
		this.method5171();
		OpenGL.glBufferDataARBa(arg1, this.anInt6667, arg2.a(), this.aBoolean470 ? 35040 : 35044);
		this.aClass163_Sub2_40.anInt5226 += this.anInt6667;
	}

	@OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass163_Sub2_40.method4146(this.anInt6666, this.anInt6667);
		super.finalize();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[BB)V")
	protected final void method5168(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method5171();
		if (this.anInt6667 < arg0) {
			OpenGL.glBufferDataARBub(this.anInt6665, arg0, arg1, 0, this.aBoolean470 ? 35040 : 35044);
			this.aClass163_Sub2_40.anInt5226 += arg0 - this.anInt6667;
			this.anInt6667 = arg0;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt6665, 0, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
	protected abstract void method5171();
}
