import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class1_Sub3_Sub19 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wi", name = "L", descriptor = "[Lclient!vu;")
	public static final Class349[] aClass349Array1 = new Class349[5];

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
	public final int anInt9449;

	@OriginalMember(owner = "client!wi", name = "C", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_43;

	@OriginalMember(owner = "client!wi", name = "J", descriptor = "J")
	private long aLong421;

	static {
		for (@Pc(12) int local12 = 0; local12 < aClass349Array1.length; local12++) {
			aClass349Array1[local12] = new Class349();
		}
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!ag;II)V")
	public Class1_Sub3_Sub19(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9449 = arg2 * arg1;
		this.aClass12_Sub1_43 = arg0;
		this.aLong421 = this.aClass12_Sub1_43.anOpenGL1.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!wi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method7816();
		super.finalize();
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)J")
	public long method7815() {
		return this.aLong421;
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V")
	private void method7816() {
		if (this.aLong421 > 0L) {
			this.aClass12_Sub1_43.anOpenGL1.releasePbuffer(this.aLong421);
			this.aLong421 = 0L;
		}
	}
}
