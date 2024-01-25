import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class178_Sub1 extends Class178 {

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
	public final int anInt4801;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(ILclient!ct;Lclient!rc;III)V")
	public Class178_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class279 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4801 = arg5;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Lclient!wea;")
	@Override
	public Class357 method7127() {
		return Static375.aClass357_10;
	}
}
