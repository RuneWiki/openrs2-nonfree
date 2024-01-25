import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public abstract class Class239 {

	@OriginalMember(owner = "client!via", name = "f", descriptor = "I")
	private final int anInt10051;

	@OriginalMember(owner = "client!via", name = "b", descriptor = "Lclient!dw;")
	protected final Class82_Sub1 aClass82_Sub1_43;

	@OriginalMember(owner = "client!via", name = "e", descriptor = "Z")
	private final boolean aBoolean761;

	@OriginalMember(owner = "client!via", name = "g", descriptor = "I")
	private int anInt10052;

	@OriginalMember(owner = "client!via", name = "h", descriptor = "I")
	protected final int anInt10053;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lclient!dw;I[BIZ)V")
	public Class239(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10051 = arg1;
		this.aClass82_Sub1_43 = arg0;
		this.aBoolean761 = arg4;
		this.anInt10052 = arg3;
		OpenGL.glGenBuffersARB(1, Static487.anIntArray525, 0);
		this.anInt10053 = Static487.anIntArray525[0];
		this.method8525();
		OpenGL.glBufferDataARBub(arg1, this.anInt10052, arg2, 0, this.aBoolean761 ? 35040 : 35044);
		this.aClass82_Sub1_43.anInt2471 += this.anInt10052;
	}

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lclient!dw;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class239(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10051 = arg1;
		this.anInt10052 = arg3;
		this.aClass82_Sub1_43 = arg0;
		this.aBoolean761 = arg4;
		OpenGL.glGenBuffersARB(1, Static487.anIntArray525, 0);
		this.anInt10053 = Static487.anIntArray525[0];
		this.method8525();
		OpenGL.glBufferDataARBa(arg1, this.anInt10052, arg2.getAddress(), this.aBoolean761 ? 35040 : 35044);
		this.aClass82_Sub1_43.anInt2471 += this.anInt10052;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Z)V")
	protected abstract void method8525();

	@OriginalMember(owner = "client!via", name = "a", descriptor = "([BII)V")
	protected final void method8526(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method8525();
		if (this.anInt10052 >= arg1) {
			OpenGL.glBufferSubDataARBub(this.anInt10051, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt10051, arg1, arg0, 0, this.aBoolean761 ? 35040 : 35044);
			this.aClass82_Sub1_43.anInt2471 += arg1 - this.anInt10052;
			this.anInt10052 = arg1;
		}
	}

	@OriginalMember(owner = "client!via", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass82_Sub1_43.method2097(this.anInt10053, this.anInt10052);
		super.finalize();
	}
}
