import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public abstract class Class69 {

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Lclient!h;")
	protected final Class32_Sub2 aClass32_Sub2_17;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
	private final int anInt2559;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	private int anInt2557;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "Z")
	private final boolean aBoolean252;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	private final int anInt2558;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!h;I[BIZ)V")
	public Class69(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass32_Sub2_17 = arg0;
		this.anInt2559 = arg1;
		this.anInt2557 = arg3;
		this.aBoolean252 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl2;
		local16.glGenBuffersARB(1, Static116.anIntArray235, 0);
		this.anInt2558 = Static116.anIntArray235[0];
		this.method2339();
		local16.glBufferDataARB(arg1, this.anInt2557, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt2557), this.aBoolean252 ? 35040 : 35044);
		this.aClass32_Sub2_17.anInt2488 += this.anInt2557;
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!h;ILjava/nio/ByteBuffer;Z)V")
	public Class69(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass32_Sub2_17 = arg0;
		this.anInt2559 = arg1;
		this.anInt2557 = arg2.limit();
		this.aBoolean252 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl2;
		local17.glGenBuffersARB(1, Static116.anIntArray235, 0);
		this.anInt2558 = Static116.anIntArray235[0];
		this.method2339();
		local17.glBufferDataARB(arg1, this.anInt2557, arg2, this.aBoolean252 ? 35040 : 35044);
		this.aClass32_Sub2_17.anInt2488 += this.anInt2557;
	}

	@OriginalMember(owner = "client!ho", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass32_Sub2_17.method2249(this.anInt2558, this.anInt2557);
		super.finalize();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([BI)V")
	protected final void method2337(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method2339();
		if (arg1 > this.anInt2557) {
			this.aClass32_Sub2_17.anOpengl2.glBufferDataARB(this.anInt2559, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean252 ? 35040 : 35044);
			this.aClass32_Sub2_17.anInt2488 += arg1 - this.anInt2557;
			this.anInt2557 = arg1;
		} else {
			this.aClass32_Sub2_17.anOpengl2.glBufferSubDataARB(this.anInt2559, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "()I")
	public int method2573() {
		return this.anInt2558;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "()V")
	protected abstract void method2339();
}
