import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class112 implements Interface4 {

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
	public final int anInt3121;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(I)V")
	public Class112(@OriginalArg(0) int arg0) {
		this.anInt3121 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Lclient!hr;")
	@Override
	public Class146 method8713() {
		return Static612.aClass146_10;
	}
}
