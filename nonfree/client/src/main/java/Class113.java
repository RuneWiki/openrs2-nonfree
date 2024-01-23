import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class113 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	private int anInt3190;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Z")
	private boolean aBoolean225;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	private int anInt3191;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	private int anInt3192;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
	public Class113() {
		this(false);
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Z)V")
	public Class113(@OriginalArg(0) boolean arg0) {
		this.anInt3191 = 0;
		this.anInt3192 = -1;
		@Pc(9) GL local9 = Static94.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean225 = arg0;
		this.anInt3192 = local12[0];
		this.anInt3190 = Static173.anInt3332;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method2613(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt3191) {
			@Pc(6) GL local6 = Static94.aGL1;
			local6.glBindBufferARB(34962, this.anInt3192);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method2615(arg0);
		}
	}

	@OriginalMember(owner = "client!lk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3192 != -1) {
			Static173.method2734(this.anInt3192, this.anInt3191, this.anInt3190);
			this.anInt3192 = -1;
			this.anInt3191 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method2614(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glBindBufferARB(34963, this.anInt3192);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean225 ? 35040 : 35044);
		Static173.anInt3331 += arg0.limit() - this.anInt3191;
		this.anInt3191 = arg0.limit();
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method2615(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glBindBufferARB(34962, this.anInt3192);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean225 ? 35040 : 35044);
		Static173.anInt3331 += arg0.limit() - this.anInt3191;
		this.anInt3191 = arg0.limit();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "()V")
	public void method2616() {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glBindBufferARB(34963, this.anInt3192);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "()V")
	public void method2617() {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glBindBufferARB(34962, this.anInt3192);
	}
}
