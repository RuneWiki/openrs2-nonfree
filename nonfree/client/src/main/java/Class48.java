import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public abstract class Class48 {

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Lclient!mm;")
	protected final Class55_Sub1 aClass55_Sub1_39;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
	private final int anInt6340;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	private int anInt6341;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Z")
	private final boolean aBoolean531;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	private final int anInt6339;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!mm;I[BIZ)V")
	public Class48(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass55_Sub1_39 = arg0;
		this.anInt6340 = arg1;
		this.anInt6341 = arg3;
		this.aBoolean531 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl1;
		local16.glGenBuffersARB(1, Static58.anIntArray597, 0);
		this.anInt6339 = Static58.anIntArray597[0];
		this.method5664();
		local16.glBufferDataARB(arg1, this.anInt6341, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt6341), this.aBoolean531 ? 35040 : 35044);
		this.aClass55_Sub1_39.anInt3992 += this.anInt6341;
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!mm;ILjava/nio/ByteBuffer;Z)V")
	public Class48(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass55_Sub1_39 = arg0;
		this.anInt6340 = arg1;
		this.anInt6341 = arg2.limit();
		this.aBoolean531 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl1;
		local17.glGenBuffersARB(1, Static58.anIntArray597, 0);
		this.anInt6339 = Static58.anIntArray597[0];
		this.method5664();
		local17.glBufferDataARB(arg1, this.anInt6341, arg2, this.aBoolean531 ? 35040 : 35044);
		this.aClass55_Sub1_39.anInt3992 += this.anInt6341;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([BI)V")
	protected final void method5662(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method5664();
		if (arg1 > this.anInt6341) {
			this.aClass55_Sub1_39.anOpengl1.glBufferDataARB(this.anInt6340, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean531 ? 35040 : 35044);
			this.aClass55_Sub1_39.anInt3992 += arg1 - this.anInt6341;
			this.anInt6341 = arg1;
		} else {
			this.aClass55_Sub1_39.anOpengl1.glBufferSubDataARB(this.anInt6340, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "()I")
	public int method5663() {
		return this.anInt6339;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "()V")
	protected abstract void method5664();

	@OriginalMember(owner = "client!dj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass55_Sub1_39.method3652(this.anInt6339, this.anInt6341);
		super.finalize();
	}
}
