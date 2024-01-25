import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public abstract class Class126 {

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
	private int anInt8810;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "Z")
	private final boolean aBoolean662;

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "Lclient!lj;")
	protected final Class78_Sub3 aClass78_Sub3_38;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	private final int anInt8814;

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
	protected final int anInt8815;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!lj;I[BIZ)V")
	public Class126(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8810 = arg3;
		this.aBoolean662 = arg4;
		this.aClass78_Sub3_38 = arg0;
		this.anInt8814 = arg1;
		OpenGL.glGenBuffersARB(1, Static536.anIntArray564, 0);
		this.anInt8815 = Static536.anIntArray564[0];
		this.method7118();
		OpenGL.glBufferDataARBub(arg1, this.anInt8810, arg2, 0, this.aBoolean662 ? 35040 : 35044);
		this.aClass78_Sub3_38.anInt5563 += this.anInt8810;
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!lj;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class126(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean662 = arg4;
		this.anInt8814 = arg1;
		this.anInt8810 = arg3;
		this.aClass78_Sub3_38 = arg0;
		OpenGL.glGenBuffersARB(1, Static536.anIntArray564, 0);
		this.anInt8815 = Static536.anIntArray564[0];
		this.method7118();
		OpenGL.glBufferDataARBa(arg1, this.anInt8810, arg2.getAddress(), this.aBoolean662 ? 35040 : 35044);
		this.aClass78_Sub3_38.anInt5563 += this.anInt8810;
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V")
	protected abstract void method7118();

	@OriginalMember(owner = "client!gu", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass78_Sub3_38.method4513(this.anInt8810, this.anInt8815);
		super.finalize();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I[BI)V")
	protected final void method7119(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method7118();
		if (arg1 <= this.anInt8810) {
			OpenGL.glBufferSubDataARBub(this.anInt8814, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt8814, arg1, arg0, 0, this.aBoolean662 ? 35040 : 35044);
			this.aClass78_Sub3_38.anInt5563 += arg1 - this.anInt8810;
			this.anInt8810 = arg1;
		}
	}
}
