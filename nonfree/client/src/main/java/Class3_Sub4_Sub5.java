import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public final class Class3_Sub4_Sub5 extends Class3_Sub4 {

	@OriginalMember(owner = "client!cea", name = "C", descriptor = "I")
	public final int anInt1531;

	@OriginalMember(owner = "client!cea", name = "x", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_3;

	@OriginalMember(owner = "client!cea", name = "y", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!ji;II)V")
	public Class3_Sub4_Sub5(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1531 = arg2 * arg1;
		this.aClass15_Sub3_3 = arg0;
		this.aLong59 = this.aClass15_Sub3_3.anOpenGL2.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "(I)J")
	public long method1514() {
		return this.aLong59;
	}

	@OriginalMember(owner = "client!cea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method1515();
		super.finalize();
	}

	@OriginalMember(owner = "client!cea", name = "i", descriptor = "(I)V")
	private void method1515() {
		if (this.aLong59 > 0L) {
			this.aClass15_Sub3_3.anOpenGL2.releasePbuffer(this.aLong59);
			this.aLong59 = 0L;
		}
	}
}
