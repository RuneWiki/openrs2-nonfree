import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class Class70 {

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "Lclient!ffa;")
	protected final Class57_Sub2 aClass57_Sub2_35;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "Z")
	private final boolean aBoolean733;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
	private int anInt9550;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	private final int anInt9553;

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
	protected final int anInt9554;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ffa;I[BIZ)V")
	public Class70(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass57_Sub2_35 = arg0;
		this.aBoolean733 = arg4;
		this.anInt9550 = arg3;
		this.anInt9553 = arg1;
		OpenGL.glGenBuffersARB(1, Static56.anIntArray399, 0);
		this.anInt9554 = Static56.anIntArray399[0];
		this.method8193();
		OpenGL.glBufferDataARBub(arg1, this.anInt9550, arg2, 0, this.aBoolean733 ? 35040 : 35044);
		this.aClass57_Sub2_35.anInt2756 += this.anInt9550;
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!ffa;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class70(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9553 = arg1;
		this.aBoolean733 = arg4;
		this.anInt9550 = arg3;
		this.aClass57_Sub2_35 = arg0;
		OpenGL.glGenBuffersARB(1, Static56.anIntArray399, 0);
		this.anInt9554 = Static56.anIntArray399[0];
		this.method8193();
		OpenGL.glBufferDataARBa(arg1, this.anInt9550, arg2.getAddress(), this.aBoolean733 ? 35040 : 35044);
		this.aClass57_Sub2_35.anInt2756 += this.anInt9550;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
	protected abstract void method8193();

	@OriginalMember(owner = "client!ck", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass57_Sub2_35.method2388(this.anInt9554, this.anInt9550);
		super.finalize();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B[BI)V")
	protected final void method8196(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method8193();
		if (arg1 > this.anInt9550) {
			OpenGL.glBufferDataARBub(this.anInt9553, arg1, arg0, 0, this.aBoolean733 ? 35040 : 35044);
			this.aClass57_Sub2_35.anInt2756 += arg1 - this.anInt9550;
			this.anInt9550 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt9553, 0, arg1, arg0, 0);
		}
	}
}
