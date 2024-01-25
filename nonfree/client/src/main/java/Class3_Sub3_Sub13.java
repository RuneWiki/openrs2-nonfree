import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public final class Class3_Sub3_Sub13 extends Class3_Sub3 {

	@OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
	public final int anInt4445;

	@OriginalMember(owner = "client!iv", name = "s", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_17;

	@OriginalMember(owner = "client!iv", name = "y", descriptor = "J")
	private long aLong131;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!us;II)V")
	public Class3_Sub3_Sub13(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4445 = arg1 * arg2;
		this.aClass43_Sub3_17 = arg0;
		this.aLong131 = this.aClass43_Sub3_17.anOpenGL2.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)J")
	public long method3941() {
		return this.aLong131;
	}

	@OriginalMember(owner = "client!iv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3943();
		super.finalize();
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)V")
	private void method3943() {
		if (this.aLong131 > 0L) {
			this.aClass43_Sub3_17.anOpenGL2.releasePbuffer(this.aLong131);
			this.aLong131 = 0L;
		}
	}
}
