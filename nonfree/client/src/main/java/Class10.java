import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public abstract class Class10 {

	@OriginalMember(owner = "client!er", name = "c", descriptor = "[I")
	private static final int[] anIntArray146 = new int[1];

	@OriginalMember(owner = "client!er", name = "a", descriptor = "Lclient!bf;")
	protected final Class19_Sub1 aClass19_Sub1_11;

	@OriginalMember(owner = "client!er", name = "d", descriptor = "I")
	private final int anInt2292;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "I")
	private int anInt2293;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Z")
	private final boolean aBoolean174;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "I")
	private final int anInt2294;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!bf;I[BIZ)V", line = 40)
	public Class10(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass19_Sub1_11 = arg0;
		this.anInt2292 = arg1;
		this.anInt2293 = arg3;
		this.aBoolean174 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl1;
		local16.glGenBuffersARB(1, anIntArray146, 0);
		this.anInt2294 = anIntArray146[0];
		this.method2317();
		local16.glBufferDataARB(arg1, this.anInt2293, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt2293), this.aBoolean174 ? 35040 : 35044);
		this.aClass19_Sub1_11.anInt581 += this.anInt2293;
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!bf;ILjava/nio/ByteBuffer;Z)V", line = 57)
	public Class10(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass19_Sub1_11 = arg0;
		this.anInt2292 = arg1;
		this.anInt2293 = arg2.limit();
		this.aBoolean174 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl1;
		local17.glGenBuffersARB(1, anIntArray146, 0);
		this.anInt2294 = anIntArray146[0];
		this.method2317();
		local17.glBufferDataARB(arg1, this.anInt2293, arg2, this.aBoolean174 ? 35040 : 35044);
		this.aClass19_Sub1_11.anInt581 += this.anInt2293;
	}

	@OriginalMember(owner = "client!er", name = "finalize", descriptor = "()V", line = 9)
	@Override
	public final void finalize() throws Throwable {
		this.aClass19_Sub1_11.method841(this.anInt2294, this.anInt2293);
		super.finalize();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "()I", line = 14)
	public int method6067() {
		return this.anInt2294;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([BI)V", line = 21)
	protected final void method2316(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method2317();
		if (arg1 > this.anInt2293) {
			this.aClass19_Sub1_11.anOpengl1.glBufferDataARB(this.anInt2292, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean174 ? 35040 : 35044);
			this.aClass19_Sub1_11.anInt581 += arg1 - this.anInt2293;
			this.anInt2293 = arg1;
		} else {
			this.aClass19_Sub1_11.anOpengl1.glBufferSubDataARB(this.anInt2292, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "()V")
	protected abstract void method2317();
}
