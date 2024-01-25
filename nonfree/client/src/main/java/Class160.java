import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class160 implements Interface12 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public final int anInt4261;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
	public Class160(@OriginalArg(0) int arg0) {
		this.anInt4261 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lclient!hm;")
	@Override
	public Class151 method8831() {
		return Static307.aClass151_8;
	}
}
