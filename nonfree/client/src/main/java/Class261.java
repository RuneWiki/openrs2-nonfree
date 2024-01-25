import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public final class Class261 implements Interface2 {

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
	public final int anInt7817;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(I)V")
	public Class261(@OriginalArg(0) int arg0) {
		this.anInt7817 = arg0;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)Lclient!kq;")
	@Override
	public Class184 method7073() {
		return Static462.aClass184_12;
	}
}
