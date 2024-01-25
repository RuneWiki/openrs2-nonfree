import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class Class270_Sub1 extends Class270 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!le;Z)Lclient!le;")
	@Override
	public Class4_Sub5_Sub5 method6562(@OriginalArg(0) Class4_Sub5_Sub5 arg0) {
		return new Class4_Sub5_Sub5_Sub2(arg0.method8998(), arg0.anInt10631);
	}
}
