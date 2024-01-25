import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class179 implements Interface12 {

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	public final int anInt4924;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
	public final int anInt4930;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
	public final int anInt4931;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "Lclient!eha;")
	public final Class97 aClass97_10;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
	public final int anInt4927;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Z")
	public final boolean aBoolean367;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
	public final int anInt4928;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
	public final int anInt4929;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "Lclient!oea;")
	public final Class252 aClass252_8;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	public final int anInt4925;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public final int anInt4923;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(ILclient!eha;Lclient!oea;IIIIIIIZ)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class252 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt4924 = arg3;
		this.anInt4930 = arg6;
		this.anInt4931 = arg0;
		this.aClass97_10 = arg1;
		this.anInt4927 = arg9;
		this.aBoolean367 = arg10;
		this.anInt4928 = arg8;
		this.anInt4929 = arg7;
		this.aClass252_8 = arg2;
		this.anInt4925 = arg5;
		this.anInt4923 = arg4;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lclient!hm;")
	@Override
	public Class151 method8831() {
		return Static502.aClass151_11;
	}
}
