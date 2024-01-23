import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class12 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Z")
	private boolean aBoolean7;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public Class12() {
		this(false);
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Z)V")
	public Class12(@OriginalArg(0) boolean arg0) {
		this.anInt222 = -1;
		this.anInt223 = 0;
		@Pc(9) GL local9 = Static156.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean7 = arg0;
		this.anInt222 = local12[0];
		this.anInt224 = Static10.anInt142;
	}

	@OriginalMember(owner = "client!an", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt222 != -1) {
			Static10.method127(this.anInt222, this.anInt223, this.anInt224);
			this.anInt222 = -1;
			this.anInt223 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method178(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glBindBufferARB(34962, this.anInt222);
		local1.glBufferDataARB(34962, arg0.limit(), arg0, this.aBoolean7 ? 35040 : 35044);
		Static10.anInt144 += arg0.limit() - this.anInt223;
		this.anInt223 = arg0.limit();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "()V")
	public void method179() {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glBindBufferARB(34962, this.anInt222);
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method180(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt223) {
			@Pc(6) GL local6 = Static156.aGL1;
			local6.glBindBufferARB(34962, this.anInt222);
			local6.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
		} else {
			this.method178(arg0);
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "()V")
	public void method181() {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glBindBufferARB(34963, this.anInt222);
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public void method182(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glBindBufferARB(34963, this.anInt222);
		local1.glBufferDataARB(34963, arg0.limit(), arg0, this.aBoolean7 ? 35040 : 35044);
		Static10.anInt144 += arg0.limit() - this.anInt223;
		this.anInt223 = arg0.limit();
	}
}
