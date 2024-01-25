import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public abstract class Class63 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Lclient!hj;")
	protected final Class2_Sub1 aClass2_Sub1_27;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
	private final int anInt4665;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
	private int anInt4664;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Z")
	private final boolean aBoolean391;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
	private final int anInt4663;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!hj;I[BIZ)V")
	public Class63(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass2_Sub1_27 = arg0;
		this.anInt4665 = arg1;
		this.anInt4664 = arg3;
		this.aBoolean391 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl1;
		local16.glGenBuffersARB(1, Static104.anIntArray600, 0);
		this.anInt4663 = Static104.anIntArray600[0];
		this.method4263();
		local16.glBufferDataARB(arg1, this.anInt4664, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt4664), this.aBoolean391 ? 35040 : 35044);
		this.aClass2_Sub1_27.anInt2415 += this.anInt4664;
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!hj;ILjava/nio/ByteBuffer;Z)V")
	public Class63(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass2_Sub1_27 = arg0;
		this.anInt4665 = arg1;
		this.anInt4664 = arg2.limit();
		this.aBoolean391 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl1;
		local17.glGenBuffersARB(1, Static104.anIntArray600, 0);
		this.anInt4663 = Static104.anIntArray600[0];
		this.method4263();
		local17.glBufferDataARB(arg1, this.anInt4664, arg2, this.aBoolean391 ? 35040 : 35044);
		this.aClass2_Sub1_27.anInt2415 += this.anInt4664;
	}

	@OriginalMember(owner = "client!gg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass2_Sub1_27.method2350(this.anInt4663, this.anInt4664);
		super.finalize();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "()I")
	public int method4262() {
		return this.anInt4663;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "()V")
	protected abstract void method4263();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([BI)V")
	protected final void method4264(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method4263();
		if (arg1 > this.anInt4664) {
			this.aClass2_Sub1_27.anOpengl1.glBufferDataARB(this.anInt4665, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean391 ? 35040 : 35044);
			this.aClass2_Sub1_27.anInt2415 += arg1 - this.anInt4664;
			this.anInt4664 = arg1;
		} else {
			this.aClass2_Sub1_27.anOpengl1.glBufferSubDataARB(this.anInt4665, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}
}
