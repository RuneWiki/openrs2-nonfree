import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class39 {

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
	private int anInt729;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
	private int anInt730;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Lclient!sg;")
	private Class97 aClass97_5;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
	private int anInt739 = -1;

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "Z")
	private boolean aBoolean44 = true;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
	private final int anInt738;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	private final int anInt731;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
	private final int anInt737;

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "[Lclient!db;")
	private final Class46[] aClass46Array2;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
	private final int anInt732;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "[Lclient!db;")
	private final Class46[] aClass46Array1;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "Lclient!db;")
	private final Class46 aClass46_1;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I[Lclient!db;IIII)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) Class46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt738 = arg5;
		this.anInt731 = arg4;
		this.anInt737 = arg3;
		this.aClass46Array2 = arg1;
		this.anInt732 = arg0;
		if (arg1 == null) {
			this.aClass46Array1 = null;
			this.aClass46_1 = null;
		} else {
			this.aClass46Array1 = new Class46[arg1.length];
			this.aClass46_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public void method583() {
		if (this.aClass46Array2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass46Array2.length; local10++) {
				this.aClass46Array2[local10].method724();
			}
		}
		this.aClass97_5 = null;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!uo;I)Z")
	public boolean method585(@OriginalArg(1) Class129 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt739) {
			this.anInt739 = arg1;
			@Pc(16) int local16 = Static90.method4097(arg1);
			if (local16 > arg1) {
				local16 = Static39.method577(arg1);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (this.anInt730 != local16) {
				this.anInt730 = local16;
				this.aClass97_5 = null;
			}
			if (this.aClass46Array2 != null) {
				this.anInt729 = 0;
				@Pc(55) int[] local55 = new int[this.aClass46Array2.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass46Array2.length; local57++) {
					@Pc(64) Class46 local64 = this.aClass46Array2[local57];
					if (local64.method721(this.anInt737, this.anInt731, this.anInt738, this.anInt739)) {
						local55[this.anInt729] = local64.anInt954;
						this.aClass46Array1[this.anInt729++] = local64;
					}
				}
				Static178.method2898(local55, this.aClass46Array1, 0, this.anInt729 - 1);
			}
			this.aBoolean44 = true;
		}
		@Pc(121) boolean local121 = false;
		if (this.aBoolean44) {
			this.aBoolean44 = false;
			for (@Pc(144) int local144 = this.anInt729 - 1; local144 >= 0; local144--) {
				@Pc(155) boolean local155 = this.aClass46Array1[local144].method726(arg0, this.aClass46_1);
				this.aBoolean44 |= !local155;
				local121 |= local155;
			}
		}
		return local121;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIILclient!uo;I)V")
	public void method586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class129 arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg4 + arg6 & 0x3FFF;
		if (this.anInt732 == -1) {
			arg7.method4945(arg5, arg8, arg1, arg0, arg2, 0);
		} else {
			@Pc(21) Class134 local21 = Static181.anInterface2_3.method2244(this.anInt732);
			if (this.aClass97_5 == null && Static181.anInterface2_3.method2246(this.anInt732)) {
				@Pc(57) int[] local57 = local21.aBoolean258 ? Static181.anInterface2_3.method2243(this.anInt730, 0.7F, false, this.anInt732, this.anInt730) : Static181.anInterface2_3.method2247(this.anInt730, 0.7F, this.anInt730, this.anInt732);
				this.aClass97_5 = arg7.method4958(local57, this.anInt730, this.anInt730, this.anInt730);
			}
			if (!local21.aBoolean258) {
				arg7.method4945(arg5, arg8, arg1, arg0, arg2, 0);
			}
			if (this.aClass97_5 != null) {
				@Pc(90) int local90 = local21.aBoolean258 ? 0 : 1;
				@Pc(96) int local96 = arg3 * arg0 / -4096;
				@Pc(109) int local109;
				for (local109 = arg0 * local7 / 4096 + (arg1 - arg0) / 2; local109 > arg0; local109 -= arg0) {
				}
				while (local109 < 0) {
					local109 += arg0;
				}
				while (local96 > arg0) {
					local96 -= arg0;
				}
				while (local96 < 0) {
					local96 += arg0;
				}
				for (@Pc(159) int local159 = local109 - arg0; local159 < arg1; local159 += arg0) {
					for (@Pc(166) int local166 = local96 - arg0; local166 < arg0; local166 += arg0) {
						this.aClass97_5.method5550(arg5 + local159, local166 + arg8, arg0, arg0, 0, 0, local90);
					}
				}
			}
		}
		for (@Pc(224) int local224 = this.anInt729 - 1; local224 >= 0; local224--) {
			this.aClass46Array1[local224].method728(arg7, arg5, arg8, arg1, arg0, arg3, local7);
		}
	}
}
