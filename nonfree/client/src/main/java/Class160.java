import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class160 {

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "I")
	private int anInt4007;

	@OriginalMember(owner = "client!iw", name = "q", descriptor = "I")
	private int anInt4019;

	@OriginalMember(owner = "client!iw", name = "s", descriptor = "Lclient!cw;")
	private Class61 aClass61_16;

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "Z")
	private boolean aBoolean284 = true;

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
	private int anInt4008 = -1;

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "[Lclient!tm;")
	private final Class340[] aClass340Array1;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
	private final int anInt4010;

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
	private final int anInt4012;

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
	private final int anInt4009;

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
	private final int anInt4013;

	@OriginalMember(owner = "client!iw", name = "w", descriptor = "[Lclient!tm;")
	private final Class340[] aClass340Array2;

	@OriginalMember(owner = "client!iw", name = "r", descriptor = "Lclient!tm;")
	private final Class340 aClass340_1;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(I[Lclient!tm;IIII)V")
	public Class160(@OriginalArg(0) int arg0, @OriginalArg(1) Class340[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass340Array1 = arg1;
		this.anInt4010 = arg0;
		this.anInt4012 = arg4;
		this.anInt4009 = arg5;
		this.anInt4013 = arg3;
		if (arg1 == null) {
			this.aClass340_1 = null;
			this.aClass340Array2 = null;
		} else {
			this.aClass340Array2 = new Class340[arg1.length];
			this.aClass340_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
	public void method3436() {
		if (this.aClass340Array1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass340Array1.length; local6++) {
				this.aClass340Array1[local6].method7590();
			}
		}
		this.aClass61_16 = null;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!ha;IZ)Z")
	public boolean method3438(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anInt4008) {
			this.anInt4008 = arg1;
			@Pc(16) int local16 = Static285.method3974(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt4007 != local16) {
				this.aClass61_16 = null;
				this.anInt4007 = local16;
			}
			if (this.aClass340Array1 != null) {
				this.anInt4019 = 0;
				@Pc(50) int[] local50 = new int[this.aClass340Array1.length];
				for (@Pc(52) int local52 = 0; local52 < this.aClass340Array1.length; local52++) {
					@Pc(59) Class340 local59 = this.aClass340Array1[local52];
					if (local59.method7587(this.anInt4013, this.anInt4012, this.anInt4009, this.anInt4008)) {
						local50[this.anInt4019] = local59.anInt9032;
						this.aClass340Array2[this.anInt4019++] = local59;
					}
				}
				Static45.method738(this.anInt4019 - 1, 0, local50, this.aClass340Array2);
			}
			this.aBoolean284 = true;
		}
		@Pc(112) boolean local112 = false;
		if (this.aBoolean284) {
			this.aBoolean284 = false;
			for (@Pc(123) int local123 = this.anInt4019 - 1; local123 >= 0; local123--) {
				@Pc(134) boolean local134 = this.aClass340Array2[local123].method7584(arg0, this.aClass340_1);
				this.aBoolean284 |= !local134;
				local112 |= local134;
			}
		}
		return local112;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!ha;IIIIIIIII)V")
	public void method3443(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) int local8 = arg7 + arg1 & 0x3FFF;
		if (this.anInt4010 == -1 || this.anInt4007 == 0) {
			arg0.aa(arg5, arg6, arg4, arg8, arg3, 0);
		} else {
			@Pc(35) Class175 local35 = Static234.anInterface6_31.method1492(this.anInt4010);
			if (this.aClass61_16 == null && Static234.anInterface6_31.method1493(this.anInt4010)) {
				@Pc(74) int[] local74 = local35.anInt4384 == 2 ? Static234.anInterface6_31.method1488(0.7F, this.anInt4007, this.anInt4010, this.anInt4007) : Static234.anInterface6_31.method1489(false, this.anInt4007, 0.7F, this.anInt4007, this.anInt4010);
				this.aClass61_16 = arg0.method6953(local74, this.anInt4007, this.anInt4007, this.anInt4007);
			}
			if (local35.anInt4384 == 2) {
				arg0.aa(arg5, arg6, arg4, arg8, arg3, 0);
			}
			if (this.aClass61_16 != null) {
				@Pc(112) int local112 = local35.anInt4384 == 2 ? 1 : 0;
				@Pc(118) int local118 = arg2 * arg8 / -4096;
				@Pc(131) int local131;
				for (local131 = arg8 * local8 / 4096 + (arg4 - arg8) / 2; local131 > arg8; local131 -= arg8) {
				}
				while (local131 < 0) {
					local131 += arg8;
				}
				while (arg8 < local118) {
					local118 -= arg8;
				}
				while (local118 < 0) {
					local118 += arg8;
				}
				for (@Pc(169) int local169 = local131 - arg8; local169 < arg4; local169 += arg8) {
					for (@Pc(175) int local175 = local118 - arg8; local175 < arg8; local175 += arg8) {
						this.aClass61_16.method6440(local169 + arg5, local175 + arg6, arg8, arg8, 1, 0, local112);
					}
				}
			}
		}
		for (@Pc(225) int local225 = this.anInt4019 - 1; local225 >= 0; local225--) {
			this.aClass340Array2[local225].method7593(arg0, arg5, arg6, arg4, arg8, arg2, local8);
		}
	}
}
