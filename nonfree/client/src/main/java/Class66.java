import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public abstract class Class66 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!ks;")
	protected final Class63_Sub1 aClass63_Sub1_39;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
	private final int anInt5979;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	private int anInt5980;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Z")
	private final boolean aBoolean442;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	private final int anInt5981;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ks;I[BIZ)V")
	public Class66(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass63_Sub1_39 = arg0;
		this.anInt5979 = arg1;
		this.anInt5980 = arg3;
		this.aBoolean442 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl1;
		local16.glGenBuffersARB(1, Static178.anIntArray463, 0);
		this.anInt5981 = Static178.anIntArray463[0];
		this.method5380();
		local16.glBufferDataARB(arg1, this.anInt5980, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt5980), this.aBoolean442 ? 35040 : 35044);
		this.aClass63_Sub1_39.anInt3597 += this.anInt5980;
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ks;ILjava/nio/ByteBuffer;Z)V")
	public Class66(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass63_Sub1_39 = arg0;
		this.anInt5979 = arg1;
		this.anInt5980 = arg2.limit();
		this.aBoolean442 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl1;
		local17.glGenBuffersARB(1, Static178.anIntArray463, 0);
		this.anInt5981 = Static178.anIntArray463[0];
		this.method5380();
		local17.glBufferDataARB(arg1, this.anInt5980, arg2, this.aBoolean442 ? 35040 : 35044);
		this.aClass63_Sub1_39.anInt3597 += this.anInt5980;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([BI)V")
	protected final void method5378(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method5380();
		if (arg1 > this.anInt5980) {
			this.aClass63_Sub1_39.anOpengl1.glBufferDataARB(this.anInt5979, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean442 ? 35040 : 35044);
			this.aClass63_Sub1_39.anInt3597 += arg1 - this.anInt5980;
			this.anInt5980 = arg1;
		} else {
			this.aClass63_Sub1_39.anOpengl1.glBufferSubDataARB(this.anInt5979, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "()I")
	public int method5379() {
		return this.anInt5981;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "()V")
	protected abstract void method5380();

	@OriginalMember(owner = "client!ld", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass63_Sub1_39.method3392(this.anInt5981, this.anInt5980);
		super.finalize();
	}
}
