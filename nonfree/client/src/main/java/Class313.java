import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class313 implements Interface22 {

	@OriginalMember(owner = "client!so", name = "h", descriptor = "Z")
	private boolean aBoolean764;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString101;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class313(@OriginalArg(0) String arg0) {
		this.aString101 = arg0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Lclient!am;")
	@Override
	public Class19 method8553() {
		return Static19.aClass19_4;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(B)I")
	@Override
	public int method8554() {
		@Pc(13) int local13 = Static494.method7246(this.aString101);
		if (local13 >= 0 && local13 <= 100) {
			return local13;
		} else {
			this.aBoolean764 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(B)Z")
	public boolean method7476() {
		return this.aBoolean764;
	}
}
