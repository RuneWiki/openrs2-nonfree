import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public final class Class182 implements Interface24 {

	@OriginalMember(owner = "client!lca", name = "o", descriptor = "Lclient!ega;")
	public final Class79 aClass79_15;

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
	public final int anInt5941;

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
	public final int anInt5936;

	@OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
	public final int anInt5938;

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "Lclient!og;")
	public final Class238 aClass238_10;

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
	public final int anInt5933;

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
	public final int anInt5934;

	@OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
	public final int anInt5947;

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString73;

	@OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
	public final int anInt5944;

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
	public final int anInt5937;

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
	public final int anInt5942;

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
	public final int anInt5935;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!og;Lclient!ega;IIIIIIIIII)V")
	public Class182(@OriginalArg(0) String arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aClass79_15 = arg2;
		this.anInt5941 = arg9;
		this.anInt5936 = arg11;
		this.anInt5938 = arg6;
		this.aClass238_10 = arg1;
		this.anInt5933 = arg5;
		this.anInt5934 = arg12;
		this.anInt5947 = arg7;
		this.aString73 = arg0;
		this.anInt5944 = arg3;
		this.anInt5937 = arg8;
		this.anInt5942 = arg4;
		this.anInt5935 = arg10;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)Lclient!io;")
	@Override
	public Class152 method5661() {
		return Static194.aClass152_6;
	}
}
