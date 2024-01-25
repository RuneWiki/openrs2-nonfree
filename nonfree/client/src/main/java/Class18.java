import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class Class18 implements Interface16 {

	@OriginalMember(owner = "client!au", name = "i", descriptor = "Lclient!pd;")
	public final Class247 aClass247_12;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "I")
	public final int anInt6639;

	@OriginalMember(owner = "client!au", name = "d", descriptor = "I")
	public final int anInt6642;

	@OriginalMember(owner = "client!au", name = "j", descriptor = "I")
	public final int anInt6646;

	@OriginalMember(owner = "client!au", name = "g", descriptor = "I")
	public final int anInt6645;

	@OriginalMember(owner = "client!au", name = "k", descriptor = "Lclient!tl;")
	public final Class319 aClass319_12;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "I")
	public final int anInt6641;

	@OriginalMember(owner = "client!au", name = "e", descriptor = "I")
	public final int anInt6643;

	@OriginalMember(owner = "client!au", name = "b", descriptor = "I")
	public final int anInt6640;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!tl;Lclient!pd;IIIIIII)V")
	public Class18(@OriginalArg(0) Class319 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aClass247_12 = arg1;
		this.anInt6639 = arg6;
		this.anInt6642 = arg2;
		this.anInt6646 = arg3;
		this.anInt6645 = arg4;
		this.aClass319_12 = arg0;
		this.anInt6641 = arg7;
		this.anInt6643 = arg5;
		this.anInt6640 = arg8;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Lclient!jd;")
	@Override
	public Class153 method6332() {
		return null;
	}
}
