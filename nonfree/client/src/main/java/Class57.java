import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class57 {

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	private int anInt2203;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	private int anInt2204;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	private int anInt2202;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Z)V")
	public Class57(@OriginalArg(0) boolean arg0) {
		this.anInt2203 = -1;
		this.anInt2204 = 0;
		@Pc(9) GL local9 = Static277.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean154 = arg0;
		this.anInt2203 = local12[0];
		this.anInt2202 = Static94.anInt2207;
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class57() {
		this(false);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method1738(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glBindBufferARB(34963, this.anInt2203);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean154 ? 35040 : 35044);
		Static94.anInt2205 += arg0.limit() - this.anInt2204;
		this.anInt2204 = arg0.limit();
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method1739(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glBindBufferARB(34962, this.anInt2203);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean154 ? 35040 : 35044);
		Static94.anInt2205 += arg0.limit() - this.anInt2204;
		this.anInt2204 = arg0.limit();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
	public void method1740() {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glBindBufferARB(34962, this.anInt2203);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "()V")
	public void method1741() {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glBindBufferARB(34963, this.anInt2203);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method1742(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt2204) {
			@Pc(6) GL local6 = Static277.aGL1;
			local6.glBindBufferARB(34962, this.anInt2203);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method1739(arg0);
		}
	}

	@OriginalMember(owner = "client!hb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2203 != -1) {
			Static94.method1751(this.anInt2203, this.anInt2204, this.anInt2202);
			this.anInt2203 = -1;
			this.anInt2204 = 0;
		}
		super.finalize();
	}
}
