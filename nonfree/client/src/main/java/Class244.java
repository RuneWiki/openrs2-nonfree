import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class244 implements Interface23 {

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
	public final int anInt7116;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(I)V")
	public Class244(@OriginalArg(0) int arg0) {
		this.anInt7116 = arg0;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z)Lclient!ww;")
	@Override
	public Class384 method8182() {
		return Static583.aClass384_72;
	}
}
