import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class197 {

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "Lclient!f;")
	private Class22 aClass22_27;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
	private int anInt4920;

	@OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
	private int anInt4926;

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "Z")
	private boolean aBoolean403 = true;

	@OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
	private int anInt4927 = -1;

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
	private final int anInt4928;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
	private final int anInt4918;

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
	private final int anInt4919;

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "[Lclient!he;")
	private final Class133[] aClass133Array1;

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
	private final int anInt4922;

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "[Lclient!he;")
	private final Class133[] aClass133Array2;

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "Lclient!he;")
	private final Class133 aClass133_1;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(I[Lclient!he;IIII)V")
	public Class197(@OriginalArg(0) int arg0, @OriginalArg(1) Class133[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4928 = arg0;
		this.anInt4918 = arg3;
		this.anInt4919 = arg4;
		this.aClass133Array1 = arg1;
		this.anInt4922 = arg5;
		if (arg1 == null) {
			this.aClass133Array2 = null;
			this.aClass133_1 = null;
		} else {
			this.aClass133Array2 = new Class133[arg1.length];
			this.aClass133_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZILclient!r;)Z")
	public boolean method3942(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1) {
		if (this.anInt4927 != arg0) {
			this.anInt4927 = arg0;
			@Pc(28) int local28 = Static558.method7589(arg0);
			if (local28 > 512) {
				local28 = 512;
			}
			if (local28 <= 0) {
				local28 = 1;
			}
			if (local28 != this.anInt4920) {
				this.anInt4920 = local28;
				this.aClass22_27 = null;
			}
			if (this.aClass133Array1 != null) {
				this.anInt4926 = 0;
				@Pc(64) int[] local64 = new int[this.aClass133Array1.length];
				for (@Pc(66) int local66 = 0; local66 < this.aClass133Array1.length; local66++) {
					@Pc(73) Class133 local73 = this.aClass133Array1[local66];
					if (local73.method2609(this.anInt4918, this.anInt4919, this.anInt4922, this.anInt4927)) {
						local64[this.anInt4926] = local73.anInt3284;
						this.aClass133Array2[this.anInt4926++] = local73;
					}
				}
				Static250.method3703(this.anInt4926 - 1, 0, this.aClass133Array2, local64);
			}
			this.aBoolean403 = true;
		}
		@Pc(126) boolean local126 = false;
		if (this.aBoolean403) {
			this.aBoolean403 = false;
			for (@Pc(137) int local137 = this.anInt4926 - 1; local137 >= 0; local137--) {
				@Pc(148) boolean local148 = this.aClass133Array2[local137].method2603(arg1, this.aClass133_1);
				this.aBoolean403 |= !local148;
				local126 |= local148;
			}
		}
		return local126;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIBIIIILclient!r;II)V")
	public void method3944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class134 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg5 + arg1 & 0x3FFF;
		if (this.anInt4928 == -1) {
			arg6.J(arg8, arg7, arg2, arg0, arg4, 0);
		} else {
			@Pc(27) Class3 local27 = Static71.anInterface7_2.method3874(this.anInt4928);
			if (this.aClass22_27 == null && Static71.anInterface7_2.method3871(this.anInt4928)) {
				@Pc(63) int[] local63 = local27.aBoolean10 ? Static71.anInterface7_2.method3872(this.anInt4920, this.anInt4920, this.anInt4928, 0.7F) : Static71.anInterface7_2.method3869(this.anInt4920, this.anInt4928, 0.7F, this.anInt4920, false);
				this.aClass22_27 = arg6.method6970(local63, this.anInt4920, this.anInt4920, this.anInt4920);
			}
			if (local27.aBoolean10) {
				arg6.J(arg8, arg7, arg2, arg0, arg4, 0);
			}
			if (this.aClass22_27 != null) {
				@Pc(96) int local96 = local27.aBoolean10 ? 1 : 0;
				@Pc(102) int local102 = arg0 * arg3 / -4096;
				@Pc(115) int local115;
				for (local115 = arg0 * local7 / 4096 + (arg2 - arg0) / 2; local115 > arg0; local115 -= arg0) {
				}
				while (local115 < 0) {
					local115 += arg0;
				}
				while (local102 > arg0) {
					local102 -= arg0;
				}
				while (local102 < 0) {
					local102 += arg0;
				}
				for (@Pc(158) int local158 = local115 - arg0; local158 < arg2; local158 += arg0) {
					for (@Pc(165) int local165 = local102 - arg0; local165 < arg0; local165 += arg0) {
						this.aClass22_27.method7654(local158 + arg8, arg7 + local165, arg0, arg0, 1, 0, local96);
					}
				}
			}
		}
		for (@Pc(215) int local215 = this.anInt4926 - 1; local215 >= 0; local215--) {
			this.aClass133Array2[local215].method2604(arg6, arg8, arg7, arg2, arg0, arg3, local7);
		}
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V")
	public void method3945() {
		if (this.aClass133Array1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass133Array1.length; local16++) {
				this.aClass133Array1[local16].method2610();
			}
		}
		this.aClass22_27 = null;
	}
}
