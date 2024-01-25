import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class Class141 {

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "Lclient!ht;")
	protected final Class109_Sub1 aClass109_Sub1_36;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Z")
	private final boolean aBoolean341;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	private final int anInt5286;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	private int anInt5288;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	protected final int anInt5289;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!ht;I[BIZ)V")
	public Class141(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass109_Sub1_36 = arg0;
		this.aBoolean341 = arg4;
		this.anInt5286 = arg1;
		this.anInt5288 = arg3;
		OpenGL.glGenBuffersARB(1, Static79.anIntArray145, 0);
		this.anInt5289 = Static79.anIntArray145[0];
		this.method4267();
		OpenGL.glBufferDataARBub(arg1, this.anInt5288, arg2, 0, this.aBoolean341 ? 35040 : 35044);
		this.aClass109_Sub1_36.anInt2981 += this.anInt5288;
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!ht;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class141(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5288 = arg3;
		this.aClass109_Sub1_36 = arg0;
		this.anInt5286 = arg1;
		this.aBoolean341 = arg4;
		OpenGL.glGenBuffersARB(1, Static79.anIntArray145, 0);
		this.anInt5289 = Static79.anIntArray145[0];
		this.method4267();
		OpenGL.glBufferDataARBa(arg1, this.anInt5288, arg2.c(), this.aBoolean341 ? 35040 : 35044);
		this.aClass109_Sub1_36.anInt2981 += this.anInt5288;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[BI)V")
	protected final void method4265(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4267();
		if (this.anInt5288 >= arg1) {
			OpenGL.glBufferSubDataARB(this.anInt5286, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt5286, arg1, arg0, 0, this.aBoolean341 ? 35040 : 35044);
			this.aClass109_Sub1_36.anInt2981 += arg1 - this.anInt5288;
			this.anInt5288 = arg1;
		}
	}

	@OriginalMember(owner = "client!tc", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass109_Sub1_36.method2550(this.anInt5289, this.anInt5288);
		super.finalize();
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
	protected abstract void method4267();
}
