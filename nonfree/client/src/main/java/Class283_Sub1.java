import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class283_Sub1 extends Class283 {

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	private Class283_Sub1() {
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!kv;)Lclient!kv;")
	@Override
	public Class5_Sub5_Sub5 method8584(@OriginalArg(1) Class5_Sub5_Sub5 arg0) {
		return new Class5_Sub5_Sub5_Sub1(arg0.anInterface20_3, arg0.method8985(), arg0.anInt10470);
	}
}
