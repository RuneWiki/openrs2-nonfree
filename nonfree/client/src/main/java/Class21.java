import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class21 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
	private int anInt549;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "Z")
	private boolean aBoolean30;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
	private int anInt550;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
	private int anInt551;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class21() {
		this(false);
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Z)V")
	public Class21(@OriginalArg(0) boolean arg0) {
		this.anInt550 = -1;
		this.anInt551 = 0;
		@Pc(9) GL local9 = Static294.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean30 = arg0;
		this.anInt550 = local12[0];
		this.anInt549 = Static113.anInt2464;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method434(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static294.aGL1;
		local1.glBindBufferARB(34963, this.anInt550);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean30 ? 35040 : 35044);
		Static113.anInt2463 += arg0.limit() - this.anInt551;
		this.anInt551 = arg0.limit();
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method435(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt551) {
			@Pc(6) GL local6 = Static294.aGL1;
			local6.glBindBufferARB(34962, this.anInt550);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method436(arg0);
		}
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method436(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static294.aGL1;
		local1.glBindBufferARB(34962, this.anInt550);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean30 ? 35040 : 35044);
		Static113.anInt2463 += arg0.limit() - this.anInt551;
		this.anInt551 = arg0.limit();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "()V")
	public void method437() {
		@Pc(1) GL local1 = Static294.aGL1;
		local1.glBindBufferARB(34962, this.anInt550);
	}

	@OriginalMember(owner = "client!bk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt550 != -1) {
			Static113.method1832(this.anInt550, this.anInt551, this.anInt549);
			this.anInt550 = -1;
			this.anInt551 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "()V")
	public void method438() {
		@Pc(1) GL local1 = Static294.aGL1;
		local1.glBindBufferARB(34963, this.anInt550);
	}
}
