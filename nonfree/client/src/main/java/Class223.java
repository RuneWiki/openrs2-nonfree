import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class223 {

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	private int anInt6774;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Lclient!f;")
	private Class78 aClass78_20;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	private int anInt6777;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
	private int anInt6772 = -1;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Z")
	private boolean aBoolean548 = true;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	private final int anInt6780;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	private final int anInt6775;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
	private final int anInt6784;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "[Lclient!ah;")
	private final Class6[] aClass6Array2;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	private final int anInt6782;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "[Lclient!ah;")
	private final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Lclient!ah;")
	private final Class6 aClass6_1;

	static {
		new Class96("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I[Lclient!ah;IIII)V")
	public Class223(@OriginalArg(0) int arg0, @OriginalArg(1) Class6[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6780 = arg3;
		this.anInt6775 = arg0;
		this.anInt6784 = arg5;
		this.aClass6Array2 = arg1;
		this.anInt6782 = arg4;
		if (arg1 == null) {
			this.aClass6Array1 = null;
			this.aClass6_1 = null;
		} else {
			this.aClass6Array1 = new Class6[arg1.length];
			this.aClass6_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public void method5315() {
		if (this.aClass6Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass6Array2.length; local6++) {
				this.aClass6Array2[local6].method167();
			}
		}
		this.aClass78_20 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLclient!qa;I)Z")
	public boolean method5316(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6772 != arg1) {
			this.anInt6772 = arg1;
			@Pc(12) int local12 = Static30.method427(arg1);
			if (arg1 < local12) {
				local12 = Static81.method1178(arg1);
			}
			if (local12 > 512) {
				local12 = 512;
			}
			if (this.anInt6777 != local12) {
				this.anInt6777 = local12;
				this.aClass78_20 = null;
			}
			if (this.aClass6Array2 != null) {
				this.anInt6774 = 0;
				@Pc(51) int[] local51 = new int[this.aClass6Array2.length];
				for (@Pc(53) int local53 = 0; local53 < this.aClass6Array2.length; local53++) {
					@Pc(60) Class6 local60 = this.aClass6Array2[local53];
					if (local60.method172(this.anInt6780, this.anInt6782, this.anInt6784, this.anInt6772)) {
						local51[this.anInt6774] = local60.anInt209;
						this.aClass6Array1[this.anInt6774++] = local60;
					}
				}
				Static153.method3782(this.anInt6774 - 1, local51, this.aClass6Array1, 0);
			}
			this.aBoolean548 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean548) {
			this.aBoolean548 = false;
			for (@Pc(133) int local133 = this.anInt6774 - 1; local133 >= 0; local133--) {
				@Pc(144) boolean local144 = this.aClass6Array1[local133].method168(arg0, this.aClass6_1);
				this.aBoolean548 |= !local144;
				local122 |= local144;
			}
		}
		return local122;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILclient!qa;IIIBIII)V")
	public void method5318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg0 + arg4 & 0x3FFF;
		if (this.anInt6775 == -1) {
			arg2.NA(arg5, arg6, arg1, arg7, arg8, 0);
		} else {
			@Pc(21) Class132 local21 = Static264.anInterface5_14.method3920(this.anInt6775);
			if (this.aClass78_20 == null && Static264.anInterface5_14.method3922(this.anInt6775)) {
				@Pc(57) int[] local57 = local21.aBoolean277 ? Static264.anInterface5_14.method3923(this.anInt6775, false, 0.7F, this.anInt6777, this.anInt6777) : Static264.anInterface5_14.method3921(this.anInt6775, this.anInt6777, this.anInt6777, 0.7F);
				this.aClass78_20 = arg2.method4575(local57, this.anInt6777, this.anInt6777, this.anInt6777);
			}
			if (!local21.aBoolean277) {
				arg2.NA(arg5, arg6, arg1, arg7, arg8, 0);
			}
			if (this.aClass78_20 != null) {
				@Pc(90) int local90 = local21.aBoolean277 ? 0 : 1;
				@Pc(96) int local96 = arg3 * arg7 / -4096;
				@Pc(108) int local108;
				for (local108 = local7 * arg7 / 4096 + (arg1 - arg7) / 2; local108 > arg7; local108 -= arg7) {
				}
				while (local96 > arg7) {
					local96 -= arg7;
				}
				while (local108 < 0) {
					local108 += arg7;
				}
				while (local96 < 0) {
					local96 += arg7;
				}
				for (@Pc(150) int local150 = local108 - arg7; local150 < arg1; local150 += arg7) {
					for (@Pc(157) int local157 = local96 - arg7; local157 < arg7; local157 += arg7) {
						this.aClass78_20.M(local150 + arg5, local157 + arg6, arg7, arg7, 1, 0, local90);
					}
				}
			}
		}
		for (@Pc(214) int local214 = this.anInt6774 - 1; local214 >= 0; local214--) {
			this.aClass6Array1[local214].method169(arg2, arg5, arg6, arg1, arg7, arg3, local7);
		}
	}
}
