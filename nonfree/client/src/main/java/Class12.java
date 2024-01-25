import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public final class Class12 implements Interface1 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public final int anInt84;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(I)V")
	public Class12(@OriginalArg(0) int arg0) {
		this.anInt84 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)Lclient!qi;")
	@Override
	public Class275 method8059() {
		return Static612.aClass275_9;
	}
}
