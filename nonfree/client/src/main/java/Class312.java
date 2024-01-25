import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class312 implements Interface5 {

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Z")
	private boolean aBoolean634;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString88;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class312(@OriginalArg(0) String arg0) {
		this.aString88 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
	@Override
	public int method7372() {
		@Pc(13) int local13 = Static299.method5143(this.aString88);
		if (local13 >= 0 && local13 <= 100) {
			return local13;
		} else {
			this.aBoolean634 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Lclient!uv;")
	@Override
	public Class334 method7373() {
		return Static546.aClass334_5;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)Z")
	public boolean method7376() {
		return this.aBoolean634;
	}
}
