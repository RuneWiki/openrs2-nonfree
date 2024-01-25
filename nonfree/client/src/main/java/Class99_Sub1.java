import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class99_Sub1 extends Class99 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!mk;)Lclient!mk;")
	@Override
	public Class1_Sub2_Sub5 method4623(@OriginalArg(1) Class1_Sub2_Sub5 arg0) {
		return new Class1_Sub2_Sub5_Sub1(arg0.anInterface1_3, arg0.method5818(), arg0.anInt7103);
	}
}
