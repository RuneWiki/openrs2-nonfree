import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public abstract class Class54 {

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "Lclient!sq;")
	protected final Class46_Sub2 aClass46_Sub2_16;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
	private final int anInt2780;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	private int anInt2781;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "Z")
	private final boolean aBoolean187;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	private final int anInt2779;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!sq;I[BIZ)V")
	public Class54(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass46_Sub2_16 = arg0;
		this.anInt2780 = arg1;
		this.anInt2781 = arg3;
		this.aBoolean187 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl1;
		local16.glGenBuffersARB(1, Static306.anIntArray246, 0);
		this.anInt2779 = Static306.anIntArray246[0];
		this.method2649();
		local16.glBufferDataARB(arg1, this.anInt2781, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt2781), this.aBoolean187 ? 35040 : 35044);
		this.aClass46_Sub2_16.anInt5741 += this.anInt2781;
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!sq;ILjava/nio/ByteBuffer;Z)V")
	public Class54(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass46_Sub2_16 = arg0;
		this.anInt2780 = arg1;
		this.anInt2781 = arg2.limit();
		this.aBoolean187 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl1;
		local17.glGenBuffersARB(1, Static306.anIntArray246, 0);
		this.anInt2779 = Static306.anIntArray246[0];
		this.method2649();
		local17.glBufferDataARB(arg1, this.anInt2781, arg2, this.aBoolean187 ? 35040 : 35044);
		this.aClass46_Sub2_16.anInt5741 += this.anInt2781;
	}

	@OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass46_Sub2_16.method5237(this.anInt2779, this.anInt2781);
		super.finalize();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "()I")
	public int method5385() {
		return this.anInt2779;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "()V")
	protected abstract void method2649();

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([BI)V")
	protected final void method2650(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method2649();
		if (arg1 > this.anInt2781) {
			this.aClass46_Sub2_16.anOpengl1.glBufferDataARB(this.anInt2780, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean187 ? 35040 : 35044);
			this.aClass46_Sub2_16.anInt5741 += arg1 - this.anInt2781;
			this.anInt2781 = arg1;
		} else {
			this.aClass46_Sub2_16.anOpengl1.glBufferSubDataARB(this.anInt2780, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}
}
