import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class Class199 {

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	private final int anInt7571;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Lclient!lea;")
	protected final Class101_Sub2 aClass101_Sub2_23;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Z")
	private final boolean aBoolean563;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
	private int anInt7574;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
	protected final int anInt7577;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!lea;I[BIZ)V")
	public Class199(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7571 = arg1;
		this.aClass101_Sub2_23 = arg0;
		this.aBoolean563 = arg4;
		this.anInt7574 = arg3;
		OpenGL.glGenBuffersARB(1, Static655.anIntArray590, 0);
		this.anInt7577 = Static655.anIntArray590[0];
		this.method6703();
		OpenGL.glBufferDataARBub(arg1, this.anInt7574, arg2, 0, this.aBoolean563 ? 35040 : 35044);
		this.aClass101_Sub2_23.anInt6322 += this.anInt7574;
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!lea;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class199(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean563 = arg4;
		this.aClass101_Sub2_23 = arg0;
		this.anInt7574 = arg3;
		this.anInt7571 = arg1;
		OpenGL.glGenBuffersARB(1, Static655.anIntArray590, 0);
		this.anInt7577 = Static655.anIntArray590[0];
		this.method6703();
		OpenGL.glBufferDataARBa(arg1, this.anInt7574, arg2.getAddress(), this.aBoolean563 ? 35040 : 35044);
		this.aClass101_Sub2_23.anInt6322 += this.anInt7574;
	}

	@OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass101_Sub2_23.method5679(this.anInt7574, this.anInt7577);
		super.finalize();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[BB)V")
	protected final void method6702(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method6703();
		if (arg0 > this.anInt7574) {
			OpenGL.glBufferDataARBub(this.anInt7571, arg0, arg1, 0, this.aBoolean563 ? 35040 : 35044);
			this.aClass101_Sub2_23.anInt6322 += arg0 - this.anInt7574;
			this.anInt7574 = arg0;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt7571, 0, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	protected abstract void method6703();
}
