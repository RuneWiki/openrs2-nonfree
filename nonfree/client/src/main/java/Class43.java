import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class43 {

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString13 = "";

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	public static int anInt1452 = 0;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_13 = new Class135();

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	public static final int anInt1460 = 1401;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!jd;")
	private Class13 aClass13_4;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
	private int anInt1449;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
	private int anInt1459;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Z")
	private boolean aBoolean122 = true;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
	private int anInt1457 = -1;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
	private final int anInt1446;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
	private final int anInt1455;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
	private final int anInt1454;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
	private final int anInt1450;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "[Lclient!ja;")
	private final Class112[] aClass112Array1;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Lclient!ja;")
	private final Class112 aClass112_1;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "[Lclient!ja;")
	private final Class112[] aClass112Array2;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I[Lclient!ja;IIII)V", line = 424)
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) Class112[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1446 = arg4;
		this.anInt1455 = arg0;
		this.anInt1454 = arg3;
		this.anInt1450 = arg5;
		this.aClass112Array1 = arg1;
		if (arg1 == null) {
			this.aClass112_1 = null;
			this.aClass112Array2 = null;
		} else {
			this.aClass112Array2 = new Class112[arg1.length];
			this.aClass112_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!wm;IIIIIII)V", line = 43)
	public void method1614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) int local8 = arg0 + arg1 & 0x3FFF;
		if (this.anInt1455 == -1) {
			arg2.method2903(arg6, arg8, arg7, arg3, arg5, 0);
		} else {
			@Pc(37) Class229 local37 = Static252.anInterface2_7.method2660(this.anInt1455);
			if (this.aClass13_4 == null && Static252.anInterface2_7.method2659(this.anInt1455)) {
				@Pc(75) int[] local75 = local37.aBoolean442 ? Static252.anInterface2_7.method2661(this.anInt1455, false, this.anInt1459, 0.7F, this.anInt1459) : Static252.anInterface2_7.method2658(0.7F, this.anInt1459, this.anInt1459, this.anInt1455);
				this.aClass13_4 = arg2.method2886(local75, this.anInt1459, this.anInt1459, this.anInt1459);
			}
			if (!local37.aBoolean442) {
				arg2.method2903(arg6, arg8, arg7, arg3, arg5, 0);
			}
			if (this.aClass13_4 != null) {
				@Pc(108) int local108 = local37.aBoolean442 ? 0 : 1;
				@Pc(114) int local114 = arg3 * arg4 / -4096;
				@Pc(127) int local127;
				for (local127 = local8 * arg3 / 4096 + (arg7 - arg3) / 2; local127 > arg3; local127 -= arg3) {
				}
				while (arg3 < local114) {
					local114 -= arg3;
				}
				while (local127 < 0) {
					local127 += arg3;
				}
				while (local114 < 0) {
					local114 += arg3;
				}
				for (@Pc(166) int local166 = local127 - arg3; local166 < arg7; local166 += arg3) {
					for (@Pc(173) int local173 = local114 - arg3; local173 < arg3; local173 += arg3) {
						this.aClass13_4.method6396(arg6 + local166, arg8 + local173, arg3, arg3, 0, 0, local108);
					}
				}
			}
		}
		for (@Pc(208) int local208 = this.anInt1449 - 1; local208 >= 0; local208--) {
			this.aClass112Array2[local208].method2918(arg2, arg6, arg8, arg7, arg3, arg4, local8);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BILclient!wm;)Z", line = 323)
	public boolean method1619(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1) {
		if (arg0 != this.anInt1457) {
			this.anInt1457 = arg0;
			@Pc(20) int local20 = Static152.method2978(arg0);
			if (arg0 < local20) {
				local20 = Static326.method5856(arg0);
			}
			if (local20 > 512) {
				local20 = 512;
			}
			if (local20 != this.anInt1459) {
				this.aClass13_4 = null;
				this.anInt1459 = local20;
			}
			if (this.aClass112Array1 != null) {
				this.anInt1449 = 0;
				@Pc(57) int[] local57 = new int[this.aClass112Array1.length];
				for (@Pc(59) int local59 = 0; local59 < this.aClass112Array1.length; local59++) {
					@Pc(66) Class112 local66 = this.aClass112Array1[local59];
					if (local66.method2928(this.anInt1454, this.anInt1446, this.anInt1450, this.anInt1457)) {
						local57[this.anInt1449] = local66.anInt2877;
						this.aClass112Array2[this.anInt1449++] = local66;
					}
				}
				Static17.method4212(this.aClass112Array2, local57, 0, this.anInt1449 - 1);
			}
			this.aBoolean122 = true;
		}
		@Pc(115) boolean local115 = false;
		if (this.aBoolean122) {
			this.aBoolean122 = false;
			for (@Pc(126) int local126 = this.anInt1449 - 1; local126 >= 0; local126--) {
				@Pc(137) boolean local137 = this.aClass112Array2[local126].method2926(arg1, this.aClass112_1);
				local115 |= local137;
				this.aBoolean122 |= !local137;
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V", line = 400)
	public void method1620() {
		if (this.aClass112Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass112Array1.length; local10++) {
				this.aClass112Array1[local10].method2923();
			}
		}
		this.aClass13_4 = null;
	}
}
