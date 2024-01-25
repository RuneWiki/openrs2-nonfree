import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public abstract class Class45 {

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!ge;")
	protected final Class81_Sub1 aClass81_Sub1_35;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "I")
	private final int anInt5508;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	private int anInt5507;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Z")
	private final boolean aBoolean380;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	private final int anInt5509;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!ge;I[BIZ)V")
	public Class45(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass81_Sub1_35 = arg0;
		this.anInt5508 = arg1;
		this.anInt5507 = arg3;
		this.aBoolean380 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl1;
		local16.glGenBuffersARB(1, Static55.anIntArray619, 0);
		this.anInt5509 = Static55.anIntArray619[0];
		this.method4997();
		local16.glBufferDataARB(arg1, this.anInt5507, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt5507), this.aBoolean380 ? 35040 : 35044);
		this.aClass81_Sub1_35.anInt1809 += this.anInt5507;
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!ge;ILjava/nio/ByteBuffer;Z)V")
	public Class45(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass81_Sub1_35 = arg0;
		this.anInt5508 = arg1;
		this.anInt5507 = arg2.limit();
		this.aBoolean380 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl1;
		local17.glGenBuffersARB(1, Static55.anIntArray619, 0);
		this.anInt5509 = Static55.anIntArray619[0];
		this.method4997();
		local17.glBufferDataARB(arg1, this.anInt5507, arg2, this.aBoolean380 ? 35040 : 35044);
		this.aClass81_Sub1_35.anInt1809 += this.anInt5507;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()V")
	protected abstract void method4997();

	@OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass81_Sub1_35.method1954(this.anInt5509, this.anInt5507);
		super.finalize();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([BI)V")
	protected final void method4998(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method4997();
		if (arg1 > this.anInt5507) {
			this.aClass81_Sub1_35.anOpengl1.glBufferDataARB(this.anInt5508, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean380 ? 35040 : 35044);
			this.aClass81_Sub1_35.anInt1809 += arg1 - this.anInt5507;
			this.anInt5507 = arg1;
		} else {
			this.aClass81_Sub1_35.anOpengl1.glBufferSubDataARB(this.anInt5508, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()I")
	public int method5116() {
		return this.anInt5509;
	}
}
