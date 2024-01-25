import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	private Class74_Sub1() {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!qia;)Lclient!qia;")
	@Override
	public Class5_Sub1_Sub6 method1388(@OriginalArg(1) Class5_Sub1_Sub6 arg0) {
		return new Class5_Sub1_Sub6_Sub2(arg0.anInterface21_3, arg0.method7257(), arg0.anInt8436);
	}
}
