import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class Class75 {

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
	private int anInt10607;

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "Lclient!lf;")
	protected final Class95_Sub3 aClass95_Sub3_41;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
	private final int anInt10604;

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "Z")
	private final boolean aBoolean734;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
	protected final int anInt10605;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!lf;I[BIZ)V")
	public Class75(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10607 = arg3;
		this.aClass95_Sub3_41 = arg0;
		this.anInt10604 = arg1;
		this.aBoolean734 = arg4;
		OpenGL.glGenBuffersARB(1, Static1.anIntArray580, 0);
		this.anInt10605 = Static1.anIntArray580[0];
		this.method8692();
		OpenGL.glBufferDataARBub(arg1, this.anInt10607, arg2, 0, this.aBoolean734 ? 35040 : 35044);
		this.aClass95_Sub3_41.anInt5755 += this.anInt10607;
	}

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!lf;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class75(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean734 = arg4;
		this.anInt10607 = arg3;
		this.anInt10604 = arg1;
		this.aClass95_Sub3_41 = arg0;
		OpenGL.glGenBuffersARB(1, Static1.anIntArray580, 0);
		this.anInt10605 = Static1.anIntArray580[0];
		this.method8692();
		OpenGL.glBufferDataARBa(arg1, this.anInt10607, arg2.getAddress(), this.aBoolean734 ? 35040 : 35044);
		this.aClass95_Sub3_41.anInt5755 += this.anInt10607;
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
	protected abstract void method8692();

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[BI)V")
	protected final void method8693(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method8692();
		if (this.anInt10607 >= arg1) {
			OpenGL.glBufferSubDataARBub(this.anInt10604, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt10604, arg1, arg0, 0, this.aBoolean734 ? 35040 : 35044);
			this.aClass95_Sub3_41.anInt5755 += arg1 - this.anInt10607;
			this.anInt10607 = arg1;
		}
	}

	@OriginalMember(owner = "client!pk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass95_Sub3_41.method4830(this.anInt10607, this.anInt10605);
		super.finalize();
	}
}
