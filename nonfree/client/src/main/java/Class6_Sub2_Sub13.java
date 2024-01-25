import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public final class Class6_Sub2_Sub13 extends Class6_Sub2 {

	@OriginalMember(owner = "client!mfa", name = "s", descriptor = "I")
	public final int anInt5683;

	@OriginalMember(owner = "client!mfa", name = "x", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_26;

	@OriginalMember(owner = "client!mfa", name = "z", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lclient!jaa;II)V")
	public Class6_Sub2_Sub13(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5683 = arg1 * arg2;
		this.aClass14_Sub3_26 = arg0;
		this.aLong159 = this.aClass14_Sub3_26.anOpenGL2.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(Z)J")
	public long method4887() {
		return this.aLong159;
	}

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "(I)V")
	private void method4888() {
		if (this.aLong159 > 0L) {
			this.aClass14_Sub3_26.anOpenGL2.releasePbuffer(this.aLong159);
			this.aLong159 = 0L;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4888();
		super.finalize();
	}
}
