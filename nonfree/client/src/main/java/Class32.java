import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class32 {

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "Lclient!lf;")
	private Class90 aClass90_6;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
	private int anInt1000 = -1;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "Z")
	private boolean aBoolean91 = true;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
	private final int anInt1002;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	private final int anInt1003;

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "[Lclient!bf;")
	private final Class19[] aClass19Array1;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	private final int anInt1001;

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
	private final int anInt995;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "[Lclient!bf;")
	private final Class19[] aClass19Array2;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "Lclient!bf;")
	private final Class19 aClass19_1;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I[Lclient!bf;IIII)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) Class19[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1002 = arg0;
		this.anInt1003 = arg3;
		this.aClass19Array1 = arg1;
		this.anInt1001 = arg5;
		this.anInt995 = arg4;
		if (arg1 == null) {
			this.aClass19Array2 = null;
			this.aClass19_1 = null;
		} else {
			this.aClass19Array2 = new Class19[arg1.length];
			this.aClass19_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
	public void method1033() {
		if (this.aClass19Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass19Array1.length; local10++) {
				this.aClass19Array1[local10].method581();
			}
		}
		this.aClass90_6 = null;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!aa;IIIIIIIII)V")
	public void method1035(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) int local8 = arg8 + arg4 & 0x3FFF;
		if (this.anInt1002 == -1) {
			arg0.method3300(arg1, arg6, arg2, arg5, arg7, 0);
		} else {
			@Pc(34) Class215 local34 = Static172.anInterface7_8.method2788(this.anInt1002);
			if (this.aClass90_6 == null && Static172.anInterface7_8.method2789(this.anInt1002)) {
				@Pc(70) int[] local70 = local34.aBoolean565 ? Static172.anInterface7_8.method2786(0.7F, this.anInt1002, this.anInt997, false, this.anInt997) : Static172.anInterface7_8.method2790(this.anInt1002, 0.7F, this.anInt997, this.anInt997);
				this.aClass90_6 = arg0.method3288(local70, this.anInt997, this.anInt997, this.anInt997);
			}
			if (!local34.aBoolean565) {
				arg0.method3300(arg1, arg6, arg2, arg5, arg7, 0);
			}
			if (this.aClass90_6 != null) {
				@Pc(103) int local103 = local34.aBoolean565 ? 0 : 1;
				@Pc(109) int local109 = arg3 * arg5 / -4096;
				@Pc(122) int local122;
				for (local122 = local8 * arg5 / 4096 + (arg2 - arg5) / 2; local122 > arg5; local122 -= arg5) {
				}
				while (local122 < 0) {
					local122 += arg5;
				}
				while (arg5 < local109) {
					local109 -= arg5;
				}
				while (local109 < 0) {
					local109 += arg5;
				}
				for (@Pc(168) int local168 = local122 - arg5; local168 < arg2; local168 += arg5) {
					for (@Pc(175) int local175 = local109 - arg5; local175 < arg5; local175 += arg5) {
						this.aClass90_6.method5458(local168 + arg1, local175 - -arg6, arg5, arg5, 0, 0, local103);
					}
				}
			}
		}
		for (@Pc(220) int local220 = this.anInt998 - 1; local220 >= 0; local220--) {
			this.aClass19Array2[local220].method584(arg0, arg1, arg6, arg2, arg5, arg3, local8);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!aa;B)Z")
	public boolean method1036(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1) {
		if (arg0 != this.anInt1000) {
			this.anInt1000 = arg0;
			@Pc(20) int local20 = Static339.method5608(arg0);
			if (local20 > arg0) {
				local20 = Static244.method4321(arg0);
			}
			if (local20 > 512) {
				local20 = 512;
			}
			if (local20 != this.anInt997) {
				this.aClass90_6 = null;
				this.anInt997 = local20;
			}
			if (this.aClass19Array1 != null) {
				this.anInt998 = 0;
				@Pc(55) int[] local55 = new int[this.aClass19Array1.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass19Array1.length; local57++) {
					@Pc(64) Class19 local64 = this.aClass19Array1[local57];
					if (local64.method578(this.anInt1003, this.anInt995, this.anInt1001, this.anInt1000)) {
						local55[this.anInt998] = local64.anInt520;
						this.aClass19Array2[this.anInt998++] = local64;
					}
				}
				Static120.method2167(0, this.anInt998 - 1, local55, this.aClass19Array2);
			}
			this.aBoolean91 = true;
		}
		@Pc(113) boolean local113 = false;
		if (this.aBoolean91) {
			this.aBoolean91 = false;
			for (@Pc(130) int local130 = this.anInt998 - 1; local130 >= 0; local130--) {
				@Pc(141) boolean local141 = this.aClass19Array2[local130].method579(arg1, this.aClass19_1);
				this.aBoolean91 |= !local141;
				local113 |= local141;
			}
		}
		return local113;
	}
}
