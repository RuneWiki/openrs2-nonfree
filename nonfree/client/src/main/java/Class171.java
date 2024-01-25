import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class171 {

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
	private int anInt4661;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
	private int anInt4664;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Lclient!l;")
	private Class143 aClass143_28;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
	private int anInt4667 = -1;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "Z")
	private boolean aBoolean312 = true;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	private final int anInt4668;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "[Lclient!mc;")
	private final Class157[] aClass157Array2;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
	private final int anInt4662;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
	private final int anInt4665;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
	private final int anInt4671;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "[Lclient!mc;")
	private final Class157[] aClass157Array1;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "Lclient!mc;")
	private final Class157 aClass157_1;

	static {
		new Class7("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I[Lclient!mc;IIII)V")
	public Class171(@OriginalArg(0) int arg0, @OriginalArg(1) Class157[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4668 = arg0;
		this.aClass157Array2 = arg1;
		this.anInt4662 = arg4;
		this.anInt4665 = arg5;
		this.anInt4671 = arg3;
		if (arg1 == null) {
			this.aClass157_1 = null;
			this.aClass157Array1 = null;
		} else {
			this.aClass157Array1 = new Class157[arg1.length];
			this.aClass157_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIILclient!ya;BIIII)V")
	public void method3878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class39 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg1 + arg3 & 0x3FFF;
		if (this.anInt4668 == -1) {
			arg4.O(arg7, arg2, arg6, arg0, arg8, 0);
		} else {
			@Pc(32) Class183 local32 = Static301.anInterface4_11.method2450(this.anInt4668);
			if (this.aClass143_28 == null && Static301.anInterface4_11.method2454(this.anInt4668)) {
				@Pc(68) int[] local68 = local32.aBoolean337 ? Static301.anInterface4_11.method2451(this.anInt4664, this.anInt4664, this.anInt4668, 0.7F, false) : Static301.anInterface4_11.method2452(this.anInt4668, this.anInt4664, this.anInt4664, 0.7F);
				this.aClass143_28 = arg4.method4554(local68, this.anInt4664, this.anInt4664, this.anInt4664);
			}
			if (!local32.aBoolean337) {
				arg4.O(arg7, arg2, arg6, arg0, arg8, 0);
			}
			if (this.aClass143_28 != null) {
				@Pc(101) int local101 = local32.aBoolean337 ? 0 : 1;
				@Pc(107) int local107 = arg0 * arg5 / -4096;
				@Pc(119) int local119;
				for (local119 = (arg6 - arg0) / 2 + local7 * arg0 / 4096; local119 > arg0; local119 -= arg0) {
				}
				while (local107 > arg0) {
					local107 -= arg0;
				}
				while (local119 < 0) {
					local119 += arg0;
				}
				while (local107 < 0) {
					local107 += arg0;
				}
				for (@Pc(167) int local167 = local119 - arg0; local167 < arg6; local167 += arg0) {
					for (@Pc(174) int local174 = local107 - arg0; local174 < arg0; local174 += arg0) {
						this.aClass143_28.s(local167 + arg7, local174 - -arg2, arg0, arg0, 1, 0, local101);
					}
				}
			}
		}
		for (@Pc(214) int local214 = this.anInt4661 - 1; local214 >= 0; local214--) {
			this.aClass157Array1[local214].method3607(arg4, arg7, arg2, arg6, arg0, arg5, local7);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLclient!ya;I)Z")
	public boolean method3879(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt4667) {
			this.anInt4667 = arg1;
			@Pc(12) int local12 = Static406.method5434(arg1);
			if (arg1 < local12) {
				local12 = Static434.method5757(arg1);
			}
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 != this.anInt4664) {
				this.aClass143_28 = null;
				this.anInt4664 = local12;
			}
			if (this.aClass157Array2 != null) {
				this.anInt4661 = 0;
				@Pc(49) int[] local49 = new int[this.aClass157Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass157Array2.length; local51++) {
					@Pc(58) Class157 local58 = this.aClass157Array2[local51];
					if (local58.method3604(this.anInt4671, this.anInt4662, this.anInt4665, this.anInt4667)) {
						local49[this.anInt4661] = local58.anInt4373;
						this.aClass157Array1[this.anInt4661++] = local58;
					}
				}
				Static401.method5347(this.anInt4661 - 1, 0, this.aClass157Array1, local49);
			}
			this.aBoolean312 = true;
		}
		@Pc(116) boolean local116 = false;
		if (this.aBoolean312) {
			this.aBoolean312 = false;
			for (@Pc(127) int local127 = this.anInt4661 - 1; local127 >= 0; local127--) {
				@Pc(138) boolean local138 = this.aClass157Array1[local127].method3611(arg0, this.aClass157_1);
				local116 |= local138;
				this.aBoolean312 |= !local138;
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
	public void method3884() {
		if (this.aClass157Array2 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass157Array2.length; local4++) {
				this.aClass157Array2[local4].method3605();
			}
		}
		this.aClass143_28 = null;
	}
}
