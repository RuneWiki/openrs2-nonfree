import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class Class148 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	private final int anInt7867;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	private int anInt7866;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
	private final boolean aBoolean561;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!uq;")
	protected final Class122_Sub3 aClass122_Sub3_37;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	protected final int anInt7868;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!uq;I[BIZ)V")
	public Class148(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7867 = arg1;
		this.anInt7866 = arg3;
		this.aBoolean561 = arg4;
		this.aClass122_Sub3_37 = arg0;
		OpenGL.glGenBuffersARB(1, Static78.anIntArray162, 0);
		this.anInt7868 = Static78.anIntArray162[0];
		this.method6544();
		OpenGL.glBufferDataARBub(arg1, this.anInt7866, arg2, 0, this.aBoolean561 ? 35040 : 35044);
		this.aClass122_Sub3_37.anInt8427 += this.anInt7866;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!uq;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class148(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7866 = arg3;
		this.aClass122_Sub3_37 = arg0;
		this.aBoolean561 = arg4;
		this.anInt7867 = arg1;
		OpenGL.glGenBuffersARB(1, Static78.anIntArray162, 0);
		this.anInt7868 = Static78.anIntArray162[0];
		this.method6544();
		OpenGL.glBufferDataARBa(arg1, this.anInt7866, arg2.getAddress(), this.aBoolean561 ? 35040 : 35044);
		this.aClass122_Sub3_37.anInt8427 += this.anInt7866;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z[BI)V")
	protected final void method6542(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method6544();
		if (arg1 <= this.anInt7866) {
			OpenGL.glBufferSubDataARBub(this.anInt7867, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt7867, arg1, arg0, 0, this.aBoolean561 ? 35040 : 35044);
			this.aClass122_Sub3_37.anInt8427 += arg1 - this.anInt7866;
			this.anInt7866 = arg1;
		}
	}

	@OriginalMember(owner = "client!jb", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass122_Sub3_37.method6911(this.anInt7868, this.anInt7866);
		super.finalize();
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	protected abstract void method6544();
}
