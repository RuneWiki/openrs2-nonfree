import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_19;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
	public final int anInt2644;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!uca;II)V")
	public Class2_Sub2_Sub7(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass162_Sub3_19 = arg0;
		this.anInt2644 = arg1 * arg2;
		this.aLong76 = this.aClass162_Sub3_19.anOpenGL2.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!gj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2278();
		super.finalize();
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)J")
	public long method2276() {
		return this.aLong76;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
	private void method2278() {
		if (this.aLong76 > 0L) {
			this.aClass162_Sub3_19.anOpenGL2.releasePbuffer(this.aLong76);
			this.aLong76 = 0L;
		}
	}
}
