import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class350 {

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "Lclient!ufa;")
	private Class4 aClass4_32;

	@OriginalMember(owner = "client!vaa", name = "i", descriptor = "I")
	private int anInt9954;

	@OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
	private int anInt9959;

	@OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
	private int anInt9953 = -1;

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "Z")
	private boolean aBoolean785 = true;

	@OriginalMember(owner = "client!vaa", name = "s", descriptor = "I")
	private final int anInt9960;

	@OriginalMember(owner = "client!vaa", name = "q", descriptor = "[Lclient!ls;")
	private final Class189[] aClass189Array2;

	@OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
	private final int anInt9957;

	@OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
	private final int anInt9955;

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
	private final int anInt9951;

	@OriginalMember(owner = "client!vaa", name = "k", descriptor = "[Lclient!ls;")
	private final Class189[] aClass189Array1;

	@OriginalMember(owner = "client!vaa", name = "m", descriptor = "Lclient!ls;")
	private final Class189 aClass189_1;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(I[Lclient!ls;IIII)V")
	public Class350(@OriginalArg(0) int arg0, @OriginalArg(1) Class189[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9960 = arg5;
		this.aClass189Array2 = arg1;
		this.anInt9957 = arg0;
		this.anInt9955 = arg3;
		this.anInt9951 = arg4;
		if (arg1 == null) {
			this.aClass189Array1 = null;
			this.aClass189_1 = null;
		} else {
			this.aClass189Array1 = new Class189[arg1.length];
			this.aClass189_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V")
	public void method8116() {
		if (this.aClass189Array2 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass189Array2.length; local14++) {
				this.aClass189Array2[local14].method5527();
			}
		}
		this.aClass4_32 = null;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IILclient!ha;)Z")
	public boolean method8117(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		if (arg0 != this.anInt9953) {
			this.anInt9953 = arg0;
			@Pc(16) int local16 = Static48.method1561(arg0);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt9954 != local16) {
				this.anInt9954 = local16;
				this.aClass4_32 = null;
			}
			if (this.aClass189Array2 != null) {
				this.anInt9959 = 0;
				@Pc(53) int[] local53 = new int[this.aClass189Array2.length];
				for (@Pc(55) int local55 = 0; local55 < this.aClass189Array2.length; local55++) {
					@Pc(62) Class189 local62 = this.aClass189Array2[local55];
					if (local62.method5532(this.anInt9955, this.anInt9951, this.anInt9960, this.anInt9953)) {
						local53[this.anInt9959] = local62.anInt6613;
						this.aClass189Array1[this.anInt9959++] = local62;
					}
				}
				Static68.method2013(local53, this.aClass189Array1, this.anInt9959 - 1, 0);
			}
			this.aBoolean785 = true;
		}
		@Pc(124) boolean local124 = false;
		if (this.aBoolean785) {
			this.aBoolean785 = false;
			for (@Pc(135) int local135 = this.anInt9959 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass189Array1[local135].method5534(arg1, this.aClass189_1);
				local124 |= local146;
				this.aBoolean785 |= !local146;
			}
		}
		return local124;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIIIILclient!ha;III)V")
	public void method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg0 + arg2 & 0x3FFF;
		if (this.anInt9957 == -1 || this.anInt9954 == 0) {
			arg5.aa(arg4, arg3, arg7, arg6, arg8, 0);
		} else {
			@Pc(27) Class254 local27 = Static132.anInterface7_6.method6931(this.anInt9957);
			if (this.aClass4_32 == null && Static132.anInterface7_6.method6928(this.anInt9957)) {
				@Pc(66) int[] local66 = local27.anInt7796 == 2 ? Static132.anInterface7_6.method6933(this.anInt9954, this.anInt9957, 0.7F, this.anInt9954) : Static132.anInterface7_6.method6929(this.anInt9957, this.anInt9954, 0.7F, false, this.anInt9954);
				this.aClass4_32 = arg5.method6111(this.anInt9954, this.anInt9954, local66, this.anInt9954);
			}
			if (local27.anInt7796 == 2) {
				arg5.aa(arg4, arg3, arg7, arg6, arg8, 0);
			}
			if (this.aClass4_32 != null) {
				@Pc(106) int local106 = local27.anInt7796 == 2 ? 1 : 0;
				@Pc(112) int local112 = arg1 * arg6 / -4096;
				@Pc(124) int local124;
				for (local124 = arg6 * local11 / 4096 + (arg7 - arg6) / 2; local124 > arg6; local124 -= arg6) {
				}
				while (local124 < 0) {
					local124 += arg6;
				}
				while (arg6 < local112) {
					local112 -= arg6;
				}
				while (local112 < 0) {
					local112 += arg6;
				}
				for (@Pc(170) int local170 = local124 - arg6; local170 < arg7; local170 += arg6) {
					for (@Pc(176) int local176 = local112 - arg6; local176 < arg6; local176 += arg6) {
						this.aClass4_32.method7690(local170 + arg4, local176 - -arg3, arg6, arg6, 1, 0, local106);
					}
				}
			}
		}
		for (@Pc(242) int local242 = this.anInt9959 - 1; local242 >= 0; local242--) {
			this.aClass189Array1[local242].method5530(arg5, arg4, arg3, arg7, arg6, arg1, local11);
		}
	}
}
