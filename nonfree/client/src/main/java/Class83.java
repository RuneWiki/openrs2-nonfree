import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class Class83 {

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	private final int anInt2525;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Z")
	private final boolean aBoolean183;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!uca;")
	protected final Class162_Sub3 aClass162_Sub3_18;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	private int anInt2528;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	protected final int anInt2526;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!uca;I[BIZ)V")
	public Class83(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2525 = arg1;
		this.aBoolean183 = arg4;
		this.aClass162_Sub3_18 = arg0;
		this.anInt2528 = arg3;
		OpenGL.glGenBuffersARB(1, Static401.anIntArray422, 0);
		this.anInt2526 = Static401.anIntArray422[0];
		this.method2171();
		OpenGL.glBufferDataARBub(arg1, this.anInt2528, arg2, 0, this.aBoolean183 ? 35040 : 35044);
		this.aClass162_Sub3_18.anInt8693 += this.anInt2528;
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!uca;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class83(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean183 = arg4;
		this.aClass162_Sub3_18 = arg0;
		this.anInt2525 = arg1;
		this.anInt2528 = arg3;
		OpenGL.glGenBuffersARB(1, Static401.anIntArray422, 0);
		this.anInt2526 = Static401.anIntArray422[0];
		this.method2171();
		OpenGL.glBufferDataARBa(arg1, this.anInt2528, arg2.getAddress(), this.aBoolean183 ? 35040 : 35044);
		this.aClass162_Sub3_18.anInt8693 += this.anInt2528;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([BII)V")
	protected final void method2170(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method2171();
		if (this.anInt2528 >= arg1) {
			OpenGL.glBufferSubDataARBub(this.anInt2525, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt2525, arg1, arg0, 0, this.aBoolean183 ? 35040 : 35044);
			this.aClass162_Sub3_18.anInt8693 += arg1 - this.anInt2528;
			this.anInt2528 = arg1;
		}
	}

	@OriginalMember(owner = "client!ea", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass162_Sub3_18.method6890(this.anInt2528, this.anInt2526);
		super.finalize();
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
	protected abstract void method2171();
}
