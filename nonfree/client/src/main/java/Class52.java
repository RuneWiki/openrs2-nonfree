import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class52 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	private int anInt1441;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Z")
	private boolean aBoolean110;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	private int anInt1442;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	private int anInt1443;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class52() {
		this(false);
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Z)V")
	public Class52(@OriginalArg(0) boolean arg0) {
		this.anInt1441 = -1;
		this.anInt1442 = 0;
		@Pc(9) GL local9 = Static240.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean110 = arg0;
		this.anInt1441 = local12[0];
		this.anInt1443 = Static154.anInt2852;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	public void method1193() {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glBindBufferARB(34963, this.anInt1441);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method1194(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glBindBufferARB(34963, this.anInt1441);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean110 ? 35040 : 35044);
		Static154.anInt2853 += arg0.limit() - this.anInt1442;
		this.anInt1442 = arg0.limit();
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method1195(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glBindBufferARB(34962, this.anInt1441);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean110 ? 35040 : 35044);
		Static154.anInt2853 += arg0.limit() - this.anInt1442;
		this.anInt1442 = arg0.limit();
	}

	@OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt1441 != -1) {
			Static154.method2376(this.anInt1441, this.anInt1442, this.anInt1443);
			this.anInt1441 = -1;
			this.anInt1442 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method1196(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt1442) {
			@Pc(6) GL local6 = Static240.aGL1;
			local6.glBindBufferARB(34962, this.anInt1441);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method1195(arg0);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "()V")
	public void method1197() {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glBindBufferARB(34962, this.anInt1441);
	}
}
