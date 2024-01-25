import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class Class68 {

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "Z")
	private final boolean aBoolean565;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	private int anInt6480;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "Lclient!ih;")
	protected final Class117_Sub1 aClass117_Sub1_39;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
	private final int anInt6478;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
	protected final int anInt6475;

	static {
		new Class142("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!ih;I[BIZ)V")
	public Class68(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean565 = arg4;
		this.anInt6480 = arg3;
		this.aClass117_Sub1_39 = arg0;
		this.anInt6478 = arg1;
		OpenGL.glGenBuffersARB(1, Static28.anIntArray64, 0);
		this.anInt6475 = Static28.anIntArray64[0];
		this.method5200();
		OpenGL.glBufferDataARBub(arg1, this.anInt6480, arg2, 0, this.aBoolean565 ? 35040 : 35044);
		this.aClass117_Sub1_39.anInt3098 += this.anInt6480;
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!ih;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class68(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean565 = arg4;
		this.aClass117_Sub1_39 = arg0;
		this.anInt6480 = arg3;
		this.anInt6478 = arg1;
		OpenGL.glGenBuffersARB(1, Static28.anIntArray64, 0);
		this.anInt6475 = Static28.anIntArray64[0];
		this.method5200();
		OpenGL.glBufferDataARBa(arg1, this.anInt6480, arg2.b(), this.aBoolean565 ? 35040 : 35044);
		this.aClass117_Sub1_39.anInt3098 += this.anInt6480;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
	protected abstract void method5200();

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([BII)V")
	protected final void method5203(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5200();
		if (this.anInt6480 < arg1) {
			OpenGL.glBufferDataARBub(this.anInt6478, arg1, arg0, 0, this.aBoolean565 ? 35040 : 35044);
			this.aClass117_Sub1_39.anInt3098 += arg1 - this.anInt6480;
			this.anInt6480 = arg1;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt6478, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass117_Sub1_39.method2483(this.anInt6475, this.anInt6480);
		super.finalize();
	}
}
