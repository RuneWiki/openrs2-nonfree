import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public abstract class Class64 {

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "[Lclient!se;")
	private static final Class306[] aClass306Array3 = new Class306[32];

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	private final int anInt6631;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!nv;")
	protected final Class16_Sub3 aClass16_Sub3_27;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	private int anInt6630;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Z")
	private final boolean aBoolean459;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
	protected final int anInt6632;

	static {
		@Pc(89) Class306[] local89 = Static6.method66();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass306Array3[local89[local91].anInt8954] = local89[local91];
		}
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!nv;I[BIZ)V")
	public Class64(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6631 = arg1;
		this.aClass16_Sub3_27 = arg0;
		this.anInt6630 = arg3;
		this.aBoolean459 = arg4;
		OpenGL.glGenBuffersARB(1, Static212.anIntArray265, 0);
		this.anInt6632 = Static212.anIntArray265[0];
		this.method5433();
		OpenGL.glBufferDataARBub(arg1, this.anInt6630, arg2, 0, this.aBoolean459 ? 35040 : 35044);
		this.aClass16_Sub3_27.anInt7344 += this.anInt6630;
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!nv;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class64(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6631 = arg1;
		this.aClass16_Sub3_27 = arg0;
		this.anInt6630 = arg3;
		this.aBoolean459 = arg4;
		OpenGL.glGenBuffersARB(1, Static212.anIntArray265, 0);
		this.anInt6632 = Static212.anIntArray265[0];
		this.method5433();
		OpenGL.glBufferDataARBa(arg1, this.anInt6630, arg2.getAddress(), this.aBoolean459 ? 35040 : 35044);
		this.aClass16_Sub3_27.anInt7344 += this.anInt6630;
	}

	@OriginalMember(owner = "client!eh", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass16_Sub3_27.method5982(this.anInt6630, this.anInt6632);
		super.finalize();
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
	protected abstract void method5433();

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[BI)V")
	protected final void method5435(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5433();
		if (arg1 > this.anInt6630) {
			OpenGL.glBufferDataARBub(this.anInt6631, arg1, arg0, 0, this.aBoolean459 ? 35040 : 35044);
			this.aClass16_Sub3_27.anInt7344 += arg1 - this.anInt6630;
			this.anInt6630 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt6631, 0, arg1, arg0, 0);
		}
	}
}
