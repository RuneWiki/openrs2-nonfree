import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class113 {

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	private final int anInt6271;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!hk;")
	protected final Class16_Sub2 aClass16_Sub2_32;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	private int anInt6267;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Z")
	private final boolean aBoolean481;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	protected final int anInt6272;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!hk;I[BIZ)V")
	public Class113(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6271 = arg1;
		this.aClass16_Sub2_32 = arg0;
		this.anInt6267 = arg3;
		this.aBoolean481 = arg4;
		OpenGL.glGenBuffersARB(1, Static595.anIntArray609, 0);
		this.anInt6272 = Static595.anIntArray609[0];
		this.method5250();
		OpenGL.glBufferDataARBub(arg1, this.anInt6267, arg2, 0, this.aBoolean481 ? 35040 : 35044);
		this.aClass16_Sub2_32.anInt4370 += this.anInt6267;
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!hk;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class113(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean481 = arg4;
		this.anInt6271 = arg1;
		this.anInt6267 = arg3;
		this.aClass16_Sub2_32 = arg0;
		OpenGL.glGenBuffersARB(1, Static595.anIntArray609, 0);
		this.anInt6272 = Static595.anIntArray609[0];
		this.method5250();
		OpenGL.glBufferDataARBa(arg1, this.anInt6267, arg2.getAddress(), this.aBoolean481 ? 35040 : 35044);
		this.aClass16_Sub2_32.anInt4370 += this.anInt6267;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	protected abstract void method5250();

	@OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass16_Sub2_32.method3673(this.anInt6267, this.anInt6272);
		super.finalize();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BI)V")
	protected final void method5253(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method5250();
		if (arg0 <= this.anInt6267) {
			OpenGL.glBufferSubDataARBub(this.anInt6271, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt6271, arg0, arg1, 0, this.aBoolean481 ? 35040 : 35044);
			this.aClass16_Sub2_32.anInt4370 += arg0 - this.anInt6267;
			this.anInt6267 = arg0;
		}
	}
}
