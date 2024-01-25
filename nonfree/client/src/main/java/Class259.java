import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class259 implements Interface20 {

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Z")
	private boolean aBoolean558;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString153;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class259(@OriginalArg(0) String arg0) {
		this.aString153 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Lclient!sba;")
	@Override
	public Class300 method6812() {
		return Static472.aClass300_5;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Z")
	public boolean method6012() {
		return this.aBoolean558;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
	@Override
	public int method6811() {
		@Pc(16) int local16 = Static590.method8243(this.aString153);
		if (local16 >= 0 && local16 <= 100) {
			return local16;
		} else {
			this.aBoolean558 = true;
			return 100;
		}
	}
}
