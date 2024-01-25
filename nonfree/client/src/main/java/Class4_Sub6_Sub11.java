import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class4_Sub6_Sub11 extends Class4_Sub6 {

	@OriginalMember(owner = "client!kea", name = "M", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_24;

	@OriginalMember(owner = "client!kea", name = "E", descriptor = "I")
	public final int anInt5355;

	@OriginalMember(owner = "client!kea", name = "C", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!kfa;II)V")
	public Class4_Sub6_Sub11(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass7_Sub2_24 = arg0;
		this.anInt5355 = arg1 * arg2;
		this.aLong136 = this.aClass7_Sub2_24.anOpenGL2.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!kea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4177();
		super.finalize();
	}

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "(B)V")
	private void method4177() {
		if (this.aLong136 > 0L) {
			this.aClass7_Sub2_24.anOpenGL2.releasePbuffer(this.aLong136);
			this.aLong136 = 0L;
		}
	}

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "(B)J")
	public long method4179() {
		return this.aLong136;
	}
}
