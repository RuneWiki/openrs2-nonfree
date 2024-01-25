import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public abstract class Class80 {

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "Lclient!nf;")
	protected final Class105_Sub1 aClass105_Sub1_22;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
	private final int anInt3537;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
	private int anInt3538;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "Z")
	private final boolean aBoolean271;

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
	private final int anInt3536;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!nf;I[BIZ)V")
	public Class80(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass105_Sub1_22 = arg0;
		this.anInt3537 = arg1;
		this.anInt3538 = arg3;
		this.aBoolean271 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl1;
		local16.glGenBuffersARB(1, Static133.anIntArray342, 0);
		this.anInt3536 = Static133.anIntArray342[0];
		this.method2979();
		local16.glBufferDataARB(arg1, this.anInt3538, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt3538), this.aBoolean271 ? 35040 : 35044);
		this.aClass105_Sub1_22.anInt4174 += this.anInt3538;
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!nf;ILjava/nio/ByteBuffer;Z)V")
	public Class80(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass105_Sub1_22 = arg0;
		this.anInt3537 = arg1;
		this.anInt3538 = arg2.limit();
		this.aBoolean271 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl1;
		local17.glGenBuffersARB(1, Static133.anIntArray342, 0);
		this.anInt3536 = Static133.anIntArray342[0];
		this.method2979();
		local17.glBufferDataARB(arg1, this.anInt3538, arg2, this.aBoolean271 ? 35040 : 35044);
		this.aClass105_Sub1_22.anInt4174 += this.anInt3538;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "([BI)V")
	protected final void method2977(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method2979();
		if (arg1 > this.anInt3538) {
			this.aClass105_Sub1_22.anOpengl1.glBufferDataARB(this.anInt3537, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean271 ? 35040 : 35044);
			this.aClass105_Sub1_22.anInt4174 += arg1 - this.anInt3538;
			this.anInt3538 = arg1;
		} else {
			this.aClass105_Sub1_22.anOpengl1.glBufferSubDataARB(this.anInt3537, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "()I")
	public int method4193() {
		return this.anInt3536;
	}

	@OriginalMember(owner = "client!iq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass105_Sub1_22.method3566(this.anInt3536, this.anInt3538);
		super.finalize();
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "()V")
	protected abstract void method2979();
}
