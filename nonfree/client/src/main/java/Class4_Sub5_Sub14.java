import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public final class Class4_Sub5_Sub14 extends Class4_Sub5 {

	@OriginalMember(owner = "client!pda", name = "t", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_30;

	@OriginalMember(owner = "client!pda", name = "A", descriptor = "I")
	public final int anInt7603;

	@OriginalMember(owner = "client!pda", name = "w", descriptor = "J")
	private long aLong195;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lclient!kga;II)V")
	public Class4_Sub5_Sub14(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass44_Sub3_30 = arg0;
		this.anInt7603 = arg1 * arg2;
		this.aLong195 = this.aClass44_Sub3_30.anOpenGL2.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!pda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method6275();
		super.finalize();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)J")
	public long method6274() {
		return this.aLong195;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z)V")
	private void method6275() {
		if (this.aLong195 > 0L) {
			this.aClass44_Sub3_30.anOpenGL2.releasePbuffer(this.aLong195);
			this.aLong195 = 0L;
		}
	}
}
