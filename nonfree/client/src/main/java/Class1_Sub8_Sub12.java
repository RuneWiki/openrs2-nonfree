import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class1_Sub8_Sub12 extends Class1_Sub8 {

	@OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
	public final int anInt7487;

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_35;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "J")
	private long aLong185;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!lj;II)V")
	public Class1_Sub8_Sub12(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7487 = arg2 * arg1;
		this.aClass78_Sub3_35 = arg0;
		this.aLong185 = this.aClass78_Sub3_35.anOpenGL1.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)J")
	public long method6013() {
		return this.aLong185;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(Z)V")
	private void method6014() {
		if (this.aLong185 > 0L) {
			this.aClass78_Sub3_35.anOpenGL1.releasePbuffer(this.aLong185);
			this.aLong185 = 0L;
		}
	}

	@OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method6014();
		super.finalize();
	}
}
