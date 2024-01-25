import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class62 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!ha;")
	private Class104 aClass104_8;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	private int anInt1865;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
	private int anInt1866;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
	private int anInt1860 = -1;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Z")
	private boolean aBoolean150 = true;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
	private final int anInt1855;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "[Lclient!ea;")
	private final Class76[] aClass76Array1;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
	private final int anInt1858;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
	private final int anInt1864;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
	private final int anInt1862;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "[Lclient!ea;")
	private final Class76[] aClass76Array2;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!ea;")
	private final Class76 aClass76_1;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I[Lclient!ea;IIII)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) Class76[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1855 = arg3;
		this.aClass76Array1 = arg1;
		this.anInt1858 = arg0;
		this.anInt1864 = arg4;
		this.anInt1862 = arg5;
		if (arg1 == null) {
			this.aClass76Array2 = null;
			this.aClass76_1 = null;
		} else {
			this.aClass76Array2 = new Class76[arg1.length];
			this.aClass76_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public void method1791() {
		if (this.aClass76Array1 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.aClass76Array1.length; local13++) {
				this.aClass76Array1[local13].method2008();
			}
		}
		this.aClass104_8 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!qa;BI)Z")
	public boolean method1794(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt1860) {
			this.anInt1860 = arg1;
			@Pc(16) int local16 = Static513.method7859(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt1866 != local16) {
				this.aClass104_8 = null;
				this.anInt1866 = local16;
			}
			if (this.aClass76Array1 != null) {
				this.anInt1865 = 0;
				@Pc(52) int[] local52 = new int[this.aClass76Array1.length];
				for (@Pc(54) int local54 = 0; local54 < this.aClass76Array1.length; local54++) {
					@Pc(61) Class76 local61 = this.aClass76Array1[local54];
					if (local61.method2010(this.anInt1855, this.anInt1864, this.anInt1862, this.anInt1860)) {
						local52[this.anInt1865] = local61.anInt2089;
						this.aClass76Array2[this.anInt1865++] = local61;
					}
				}
				Static213.method3946(this.aClass76Array2, this.anInt1865 - 1, local52, 0);
			}
			this.aBoolean150 = true;
		}
		@Pc(114) boolean local114 = false;
		if (this.aBoolean150) {
			this.aBoolean150 = false;
			for (@Pc(130) int local130 = this.anInt1865 - 1; local130 >= 0; local130--) {
				@Pc(141) boolean local141 = this.aClass76Array2[local130].method2006(arg0, this.aClass76_1);
				local114 |= local141;
				this.aBoolean150 |= !local141;
			}
		}
		return local114;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIILclient!qa;IIII)V")
	public void method1795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg6 + arg2 & 0x3FFF;
		if (this.anInt1858 == -1) {
			arg4.f(arg8, arg5, arg7, arg1, arg3, 0);
		} else {
			@Pc(33) Class296 local33 = Static342.anInterface13_11.method5789(this.anInt1858);
			if (this.aClass104_8 == null && Static342.anInterface13_11.method5788(this.anInt1858)) {
				@Pc(69) int[] local69 = local33.aBoolean637 ? Static342.anInterface13_11.method5786(0.7F, this.anInt1866, this.anInt1866, this.anInt1858) : Static342.anInterface13_11.method5790(this.anInt1866, false, 0.7F, this.anInt1858, this.anInt1866);
				this.aClass104_8 = arg4.method7156(local69, this.anInt1866, this.anInt1866, this.anInt1866);
			}
			if (local33.aBoolean637) {
				arg4.f(arg8, arg5, arg7, arg1, arg3, 0);
			}
			if (this.aClass104_8 != null) {
				@Pc(102) int local102 = local33.aBoolean637 ? 1 : 0;
				@Pc(108) int local108 = arg0 * arg1 / -4096;
				@Pc(121) int local121;
				for (local121 = arg1 * local7 / 4096 + (arg7 - arg1) / 2; local121 > arg1; local121 -= arg1) {
				}
				while (local121 < 0) {
					local121 += arg1;
				}
				while (local108 > arg1) {
					local108 -= arg1;
				}
				while (local108 < 0) {
					local108 += arg1;
				}
				for (@Pc(163) int local163 = local121 - arg1; local163 < arg7; local163 += arg1) {
					for (@Pc(170) int local170 = local108 - arg1; local170 < arg1; local170 += arg1) {
						this.aClass104_8.ra(local163 + arg8, arg5 + local170, arg1, arg1, 1, 0, local102);
					}
				}
			}
		}
		for (@Pc(205) int local205 = this.anInt1865 - 1; local205 >= 0; local205--) {
			this.aClass76Array2[local205].method2007(arg4, arg8, arg5, arg7, arg1, arg0, local7);
		}
	}
}
