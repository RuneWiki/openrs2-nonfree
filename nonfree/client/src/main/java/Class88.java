import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class88 implements Interface3 {

	@OriginalMember(owner = "client!du", name = "b", descriptor = "Lclient!tda;")
	public final Class346 aClass346_1;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "Z")
	public final boolean aBoolean136;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "I")
	public final int anInt1741;

	@OriginalMember(owner = "client!du", name = "i", descriptor = "I")
	public final int anInt1745;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "I")
	public final int anInt1751;

	@OriginalMember(owner = "client!du", name = "q", descriptor = "I")
	public final int anInt1746;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "I")
	public final int anInt1749;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "I")
	public final int anInt1748;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "I")
	public final int anInt1739;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	public final int anInt1747;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "Lclient!jk;")
	public final Class189 aClass189_2;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(ILclient!jk;Lclient!tda;IIIIIIIZ)V")
	public Class88(@OriginalArg(0) int arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aClass346_1 = arg2;
		this.aBoolean136 = arg10;
		this.anInt1741 = arg9;
		this.anInt1745 = arg6;
		this.anInt1751 = arg5;
		this.anInt1746 = arg8;
		this.anInt1749 = arg7;
		this.anInt1748 = arg0;
		this.anInt1739 = arg4;
		this.anInt1747 = arg3;
		this.aClass189_2 = arg1;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)Lclient!wh;")
	@Override
	public Class392 method8802() {
		return Static183.aClass392_2;
	}
}
