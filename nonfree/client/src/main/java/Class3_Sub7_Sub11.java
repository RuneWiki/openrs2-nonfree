import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public final class Class3_Sub7_Sub11 extends Class3_Sub7 {

	@OriginalMember(owner = "client!kda", name = "M", descriptor = "I")
	public final int anInt5227;

	@OriginalMember(owner = "client!kda", name = "O", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_22;

	@OriginalMember(owner = "client!kda", name = "I", descriptor = "J")
	private long aLong132;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!er;II)V")
	public Class3_Sub7_Sub11(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5227 = arg1 * arg2;
		this.aClass31_Sub2_22 = arg0;
		this.aLong132 = this.aClass31_Sub2_22.anOpenGL2.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
	private void method4181() {
		if (this.aLong132 > 0L) {
			this.aClass31_Sub2_22.anOpenGL2.releasePbuffer(this.aLong132);
			this.aLong132 = 0L;
		}
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)J")
	public long method4182() {
		return this.aLong132;
	}

	@OriginalMember(owner = "client!kda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4181();
		super.finalize();
	}
}
