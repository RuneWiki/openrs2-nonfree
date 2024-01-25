import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!qf;)Lclient!qf;")
	@Override
	public Class4_Sub2_Sub16 method140(@OriginalArg(1) Class4_Sub2_Sub16 arg0) {
		return new Class4_Sub2_Sub16_Sub2(arg0.anInterface6_3, arg0.method4973(), arg0.anInt6175);
	}
}
