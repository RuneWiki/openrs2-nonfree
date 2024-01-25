import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class Class106 implements Interface18 {

	@OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
	public final int anInt5841;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "Lclient!cf;")
	public final Class56 aClass56_11;

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "I")
	public final int anInt5836;

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "Lclient!ur;")
	public final Class356 aClass356_8;

	@OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
	public final int anInt5838;

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
	public final int anInt5837;

	@OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
	public final int anInt5840;

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "I")
	public final int anInt5834;

	@OriginalMember(owner = "client!paa", name = "i", descriptor = "I")
	public final int anInt5839;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!ur;Lclient!cf;IIIIIII)V")
	public Class106(@OriginalArg(0) Class356 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5841 = arg7;
		this.aClass56_11 = arg1;
		this.anInt5836 = arg3;
		this.aClass356_8 = arg0;
		this.anInt5838 = arg2;
		this.anInt5837 = arg6;
		this.anInt5840 = arg4;
		this.anInt5834 = arg5;
		this.anInt5839 = arg8;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)Lclient!hv;")
	@Override
	public Class146 method5444() {
		return null;
	}
}
