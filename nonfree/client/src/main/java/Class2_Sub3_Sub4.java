import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_19;

	@OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
	public final int anInt2988;

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!qj;II)V")
	public Class2_Sub3_Sub4(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass100_Sub3_19 = arg0;
		this.anInt2988 = arg1 * arg2;
		this.aLong84 = this.aClass100_Sub3_19.anOpenGL2.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)J")
	public long method2424() {
		return this.aLong84;
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)V")
	private void method2425() {
		if (this.aLong84 > 0L) {
			this.aClass100_Sub3_19.anOpenGL2.releasePbuffer(this.aLong84);
			this.aLong84 = 0L;
		}
	}

	@OriginalMember(owner = "client!fj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2425();
		super.finalize();
	}
}
