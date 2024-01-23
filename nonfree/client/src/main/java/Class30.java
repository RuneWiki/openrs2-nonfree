import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class30 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	private int anInt563;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	private int anInt564;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	private int anInt565;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Z")
	private boolean aBoolean41;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class30() {
		this(false);
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Z)V")
	public Class30(@OriginalArg(0) boolean arg0) {
		this.anInt565 = -1;
		this.anInt563 = 0;
		@Pc(9) GL local9 = Static291.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean41 = arg0;
		this.anInt565 = local12[0];
		this.anInt564 = Static74.anInt1419;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method540(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glBindBufferARB(34963, this.anInt565);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean41 ? 35040 : 35044);
		Static74.anInt1416 += arg0.limit() - this.anInt563;
		this.anInt563 = arg0.limit();
	}

	@OriginalMember(owner = "client!ch", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt565 != -1) {
			Static74.method1195(this.anInt565, this.anInt563, this.anInt564);
			this.anInt565 = -1;
			this.anInt563 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "()V")
	public void method541() {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glBindBufferARB(34962, this.anInt565);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method542(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt563) {
			@Pc(6) GL local6 = Static291.aGL1;
			local6.glBindBufferARB(34962, this.anInt565);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method544(arg0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "()V")
	public void method543() {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glBindBufferARB(34963, this.anInt565);
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method544(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glBindBufferARB(34962, this.anInt565);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean41 ? 35040 : 35044);
		Static74.anInt1416 += arg0.limit() - this.anInt563;
		this.anInt563 = arg0.limit();
	}
}
