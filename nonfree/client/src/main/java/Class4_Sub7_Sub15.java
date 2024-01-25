import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class4_Sub7_Sub15 extends Class4_Sub7 {

	@OriginalMember(owner = "client!rv", name = "C", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_33;

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
	public final int anInt7936;

	@OriginalMember(owner = "client!rv", name = "D", descriptor = "J")
	private long aLong243;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!no;II)V")
	public Class4_Sub7_Sub15(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass66_Sub3_33 = arg0;
		this.anInt7936 = arg2 * arg1;
		this.aLong243 = this.aClass66_Sub3_33.anOpenGL2.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method6562();
		super.finalize();
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)J")
	public long method6560() {
		return this.aLong243;
	}

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "(I)V")
	private void method6562() {
		if (this.aLong243 > 0L) {
			this.aClass66_Sub3_33.anOpenGL2.releasePbuffer(this.aLong243);
			this.aLong243 = 0L;
		}
	}
}
