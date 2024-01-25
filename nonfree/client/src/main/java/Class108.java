import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class Class108 implements Interface23 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	public final int anInt10007;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
	public final int anInt10011;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
	public final int anInt10008;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
	public final int anInt10013;

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
	public final int anInt10014;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	public final int anInt10015;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
	public final int anInt10009;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "Lclient!op;")
	public final Class250 aClass250_13;

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "Lclient!pe;")
	public final Class258 aClass258_13;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!pe;Lclient!op;IIIIIII)V")
	public Class108(@OriginalArg(0) Class258 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt10007 = arg5;
		this.anInt10011 = arg3;
		this.anInt10008 = arg6;
		this.anInt10013 = arg7;
		this.anInt10014 = arg8;
		this.anInt10015 = arg4;
		this.anInt10009 = arg2;
		this.aClass250_13 = arg1;
		this.aClass258_13 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)Lclient!sq;")
	@Override
	public Class307 method8175() {
		return null;
	}
}
