import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class Class35 implements Interface23 {

	@OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
	public final int anInt9052;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
	public final int anInt9054;

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
	public final int anInt9055;

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
	public final int anInt9053;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "Lclient!rg;")
	public final Class293 aClass293_11;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
	public final int anInt9045;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
	public final int anInt9046;

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
	public final int anInt9050;

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "Lclient!al;")
	public final Class15 aClass15_12;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!rg;Lclient!al;IIIIIII)V")
	public Class35(@OriginalArg(0) Class293 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt9052 = arg2;
		this.anInt9054 = arg3;
		this.anInt9055 = arg8;
		this.anInt9053 = arg4;
		this.aClass293_11 = arg0;
		this.anInt9045 = arg7;
		this.anInt9046 = arg5;
		this.anInt9050 = arg6;
		this.aClass15_12 = arg1;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)Lclient!ww;")
	@Override
	public Class384 method8182() {
		return null;
	}
}
