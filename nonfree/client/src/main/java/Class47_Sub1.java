import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!qia;)Lclient!qia;")
	@Override
	public Class2_Sub6_Sub5 method8951(@OriginalArg(1) Class2_Sub6_Sub5 arg0) {
		return new Class2_Sub6_Sub5_Sub1(arg0.method6810(), arg0.anInt7977);
	}
}
