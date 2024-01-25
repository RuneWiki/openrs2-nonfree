import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public abstract class Class112 {

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Lclient!ao;")
	protected final Class4_Sub1 aClass4_Sub1_33;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
	private final int anInt5584;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
	private int anInt5585;

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "Z")
	private final boolean aBoolean501;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
	private final int anInt5583;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ao;I[BIZ)V")
	public Class112(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass4_Sub1_33 = arg0;
		this.anInt5584 = arg1;
		this.anInt5585 = arg3;
		this.aBoolean501 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl1;
		local16.glGenBuffersARB(1, Static174.anIntArray411, 0);
		this.anInt5583 = Static174.anIntArray411[0];
		this.method4971();
		local16.glBufferDataARB(arg1, this.anInt5585, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt5585), this.aBoolean501 ? 35040 : 35044);
		this.aClass4_Sub1_33.anInt314 += this.anInt5585;
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ao;ILjava/nio/ByteBuffer;Z)V")
	public Class112(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass4_Sub1_33 = arg0;
		this.anInt5584 = arg1;
		this.anInt5585 = arg2.limit();
		this.aBoolean501 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl1;
		local17.glGenBuffersARB(1, Static174.anIntArray411, 0);
		this.anInt5583 = Static174.anIntArray411[0];
		this.method4971();
		local17.glBufferDataARB(arg1, this.anInt5585, arg2, this.aBoolean501 ? 35040 : 35044);
		this.aClass4_Sub1_33.anInt314 += this.anInt5585;
	}

	@OriginalMember(owner = "client!kq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass4_Sub1_33.method564(this.anInt5583, this.anInt5585);
		super.finalize();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "([BI)V")
	protected final void method4969(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method4971();
		if (arg1 > this.anInt5585) {
			this.aClass4_Sub1_33.anOpengl1.glBufferDataARB(this.anInt5584, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean501 ? 35040 : 35044);
			this.aClass4_Sub1_33.anInt314 += arg1 - this.anInt5585;
			this.anInt5585 = arg1;
		} else {
			this.aClass4_Sub1_33.anOpengl1.glBufferSubDataARB(this.anInt5584, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "()I")
	public int method4970() {
		return this.anInt5583;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "()V")
	protected abstract void method4971();
}
