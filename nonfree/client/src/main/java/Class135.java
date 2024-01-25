import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class135 implements Interface10 {

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
	public final int anInt3341;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(I)V")
	public Class135(@OriginalArg(0) int arg0) {
		this.anInt3341 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)Lclient!jv;")
	@Override
	public Class165 method7847() {
		return Static471.aClass165_16;
	}
}
