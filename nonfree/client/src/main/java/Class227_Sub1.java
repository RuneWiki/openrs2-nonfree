import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class227_Sub1 extends Class227 {

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!lm;)Lclient!lm;")
	@Override
	public Class8_Sub5_Sub1 method5825(@OriginalArg(1) Class8_Sub5_Sub1 arg0) {
		return new Class8_Sub5_Sub1_Sub1(arg0.method7578(), arg0.anInt9287);
	}
}
