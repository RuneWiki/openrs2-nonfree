import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class130_Sub1 extends Class130 {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!ok;)Lclient!ok;")
	@Override
	public Class4_Sub4_Sub12 method3857(@OriginalArg(1) Class4_Sub4_Sub12 arg0) {
		return new Class4_Sub4_Sub12_Sub2(arg0.anInterface1_3, arg0.method5307());
	}
}
