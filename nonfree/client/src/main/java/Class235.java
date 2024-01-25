import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class Class235 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	private final int anInt7001;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt7000;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!pi;")
	protected final Class144_Sub3 aClass144_Sub3_28;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Z")
	private final boolean aBoolean495;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	protected final int anInt6998;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!pi;I[BIZ)V")
	public Class235(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7001 = arg1;
		this.anInt7000 = arg3;
		this.aClass144_Sub3_28 = arg0;
		this.aBoolean495 = arg4;
		OpenGL.glGenBuffersARB(1, Static405.anIntArray357, 0);
		this.anInt6998 = Static405.anIntArray357[0];
		this.method6110();
		OpenGL.glBufferDataARBub(arg1, this.anInt7000, arg2, 0, this.aBoolean495 ? 35040 : 35044);
		this.aClass144_Sub3_28.anInt8059 += this.anInt7000;
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!pi;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class235(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7000 = arg3;
		this.aBoolean495 = arg4;
		this.aClass144_Sub3_28 = arg0;
		this.anInt7001 = arg1;
		OpenGL.glGenBuffersARB(1, Static405.anIntArray357, 0);
		this.anInt6998 = Static405.anIntArray357[0];
		this.method6110();
		OpenGL.glBufferDataARBa(arg1, this.anInt7000, arg2.getAddress(), this.aBoolean495 ? 35040 : 35044);
		this.aClass144_Sub3_28.anInt8059 += this.anInt7000;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[B)V")
	protected final void method6108(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method6110();
		if (this.anInt7000 < arg0) {
			OpenGL.glBufferDataARBub(this.anInt7001, arg0, arg1, 0, this.aBoolean495 ? 35040 : 35044);
			this.aClass144_Sub3_28.anInt8059 += arg0 - this.anInt7000;
			this.anInt7000 = arg0;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt7001, 0, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!ub", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass144_Sub3_28.method7018(this.anInt7000, this.anInt6998);
		super.finalize();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	protected abstract void method6110();
}
