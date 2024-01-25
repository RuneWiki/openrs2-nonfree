import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public abstract class Class138 {

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "[I")
	public static final int[] anIntArray442 = new int[4096];

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
	private int anInt5397;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
	private final int anInt5396;

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "Lclient!bt;")
	protected final Class30_Sub1 aClass30_Sub1_34;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "Z")
	private final boolean aBoolean388;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
	protected final int anInt5393;

	static {
		for (@Pc(11) int local11 = 0; local11 < 4096; local11++) {
			anIntArray442[local11] = Static95.method1836(local11);
		}
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!bt;I[BIZ)V")
	public Class138(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5397 = arg3;
		this.anInt5396 = arg1;
		this.aClass30_Sub1_34 = arg0;
		this.aBoolean388 = arg4;
		OpenGL.glGenBuffersARB(1, Static173.anIntArray279, 0);
		this.anInt5393 = Static173.anIntArray279[0];
		this.method4492();
		OpenGL.glBufferDataARBub(arg1, this.anInt5397, arg2, 0, this.aBoolean388 ? 35040 : 35044);
		this.aClass30_Sub1_34.anInt846 += this.anInt5397;
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!bt;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class138(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5397 = arg3;
		this.aClass30_Sub1_34 = arg0;
		this.anInt5396 = arg1;
		this.aBoolean388 = arg4;
		OpenGL.glGenBuffersARB(1, Static173.anIntArray279, 0);
		this.anInt5393 = Static173.anIntArray279[0];
		this.method4492();
		OpenGL.glBufferDataARBa(arg1, this.anInt5397, arg2.a(), this.aBoolean388 ? 35040 : 35044);
		this.aClass30_Sub1_34.anInt846 += this.anInt5397;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "([BBI)V")
	protected final void method4490(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4492();
		if (this.anInt5397 < arg1) {
			OpenGL.glBufferDataARBub(this.anInt5396, arg1, arg0, 0, this.aBoolean388 ? 35040 : 35044);
			this.aClass30_Sub1_34.anInt846 += arg1 - this.anInt5397;
			this.anInt5397 = arg1;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt5396, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V")
	protected abstract void method4492();

	@OriginalMember(owner = "client!pv", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass30_Sub1_34.method729(this.anInt5393, this.anInt5397);
		super.finalize();
	}
}
