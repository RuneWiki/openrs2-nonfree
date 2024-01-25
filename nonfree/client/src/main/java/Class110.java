import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public abstract class Class110 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "Lclient!cg;")
	protected final Class37_Sub1 aClass37_Sub1_41;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	private final int anInt6667;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	private int anInt6669;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "Z")
	private final boolean aBoolean595;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
	private final int anInt6668;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!cg;I[BIZ)V")
	public Class110(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass37_Sub1_41 = arg0;
		this.anInt6667 = arg1;
		this.anInt6669 = arg3;
		this.aBoolean595 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl1;
		local16.glGenBuffersARB(1, Static154.anIntArray509, 0);
		this.anInt6668 = Static154.anIntArray509[0];
		this.method5583();
		local16.glBufferDataARB(arg1, this.anInt6669, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt6669), this.aBoolean595 ? 35040 : 35044);
		this.aClass37_Sub1_41.anInt633 += this.anInt6669;
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!cg;ILjava/nio/ByteBuffer;Z)V")
	public Class110(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass37_Sub1_41 = arg0;
		this.anInt6667 = arg1;
		this.anInt6669 = arg2.limit();
		this.aBoolean595 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl1;
		local17.glGenBuffersARB(1, Static154.anIntArray509, 0);
		this.anInt6668 = Static154.anIntArray509[0];
		this.method5583();
		local17.glBufferDataARB(arg1, this.anInt6669, arg2, this.aBoolean595 ? 35040 : 35044);
		this.aClass37_Sub1_41.anInt633 += this.anInt6669;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "()I")
	public int method5582() {
		return this.anInt6668;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "()V")
	protected abstract void method5583();

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "([BI)V")
	protected final void method5584(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method5583();
		if (arg1 > this.anInt6669) {
			this.aClass37_Sub1_41.anOpengl1.glBufferDataARB(this.anInt6667, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean595 ? 35040 : 35044);
			this.aClass37_Sub1_41.anInt633 += arg1 - this.anInt6669;
			this.anInt6669 = arg1;
		} else {
			this.aClass37_Sub1_41.anOpengl1.glBufferSubDataARB(this.anInt6667, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!jl", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass37_Sub1_41.method733(this.anInt6668, this.anInt6669);
		super.finalize();
	}
}
