import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!wu;)Lclient!wu;")
	@Override
	public Class6_Sub1_Sub14 method4408(@OriginalArg(1) Class6_Sub1_Sub14 arg0) {
		return new Class6_Sub1_Sub14_Sub2(arg0.method5221(), arg0.anInt6250);
	}
}
