import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class169 implements Interface1 {

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
	public final int anInt5835;

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
	public final int anInt5839;

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
	public final int anInt5844;

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "Z")
	public final boolean aBoolean506;

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "Lclient!gq;")
	public final Class117 aClass117_8;

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
	public final int anInt5843;

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
	public final int anInt5842;

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
	public final int anInt5836;

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
	public final int anInt5840;

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "Lclient!kfa;")
	public final Class178 aClass178_8;

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
	public final int anInt5838;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(ILclient!gq;Lclient!kfa;IIIIIIIZ)V")
	public Class169(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt5835 = arg0;
		this.anInt5839 = arg9;
		this.anInt5844 = arg5;
		this.aBoolean506 = arg10;
		this.aClass117_8 = arg1;
		this.anInt5843 = arg4;
		this.anInt5842 = arg6;
		this.anInt5836 = arg3;
		this.anInt5840 = arg7;
		this.aClass178_8 = arg2;
		this.anInt5838 = arg8;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)Lclient!qi;")
	@Override
	public Class275 method8059() {
		return Static141.aClass275_1;
	}
}
