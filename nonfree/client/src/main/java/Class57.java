import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class57 implements Interface4 {

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "[I")
	public static final int[] anIntArray149 = new int[120];

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	public final int anInt1560;

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
	public final int anInt1559;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
	public final int anInt1558;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
	public final int anInt1561;

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "Lclient!jg;")
	public final Class174 aClass174_4;

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
	public final int anInt1564;

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
	public final int anInt1563;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
	public final int anInt1569;

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
	public final int anInt1566;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
	public final int anInt1565;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString18;

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	public final int anInt1570;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!jha;")
	public final Class176 aClass176_4;

	static {
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 120; local20++) {
			@Pc(25) int local25 = local20 + 1;
			@Pc(38) int local38 = (int) (Math.pow(2.0D, (double) local25 / 7.0D) * 300.0D + (double) local25);
			local18 += local38;
			anIntArray149[local20] = local18 / 4;
		}
	}

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!jg;Lclient!jha;IIIIIIIIII)V")
	public Class57(@OriginalArg(0) String arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt1560 = arg6;
		this.anInt1559 = arg10;
		this.anInt1558 = arg11;
		this.anInt1561 = arg8;
		this.aClass174_4 = arg1;
		this.anInt1564 = arg7;
		this.anInt1563 = arg3;
		this.anInt1569 = arg12;
		this.anInt1566 = arg5;
		this.anInt1565 = arg9;
		this.aString18 = arg0;
		this.anInt1570 = arg4;
		this.aClass176_4 = arg2;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)Lclient!jw;")
	@Override
	public Class184 method7078() {
		return Static445.aClass184_10;
	}
}
