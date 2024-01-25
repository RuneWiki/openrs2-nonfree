import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class312 {

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "[[B")
	public byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
	public int anInt8892;

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
	public int anInt8893;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
	public int anInt8895;

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray81;

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "Lclient!vm;")
	public Class361 aClass361_1;

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "[Lclient!vm;")
	public Class361[] aClass361Array1;

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "[I")
	public int[] anIntArray615;

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "[I")
	public int[] anIntArray616;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "[I")
	public int[] anIntArray617;

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "[I")
	public int[] anIntArray618;

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "[I")
	public int[] anIntArray619;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray82;

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "[I")
	public int[] anIntArray620;

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
	public final int anInt8898;

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "[B")
	private byte[] aByteArray91;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "([BI[B)V")
	public Class312(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt8898 = Static342.method5240(arg0.length, arg0);
		if (arg1 != this.anInt8898) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray91 = Static575.method7996(arg0.length, arg0, 0);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (arg2[local42] != this.aByteArray91[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method7447(arg0);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([BI)V")
	private void method7447(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub34 local10 = new Class2_Sub34(Static77.method1460(arg0));
		@Pc(14) int local14 = local10.method6904();
		if (local14 < 5 || local14 > 6) {
			throw new RuntimeException();
		}
		if (local14 >= 6) {
			this.anInt8893 = local10.method6865();
		} else {
			this.anInt8893 = 0;
		}
		@Pc(42) int local42 = local10.method6904();
		@Pc(53) boolean local53 = (local42 & 0x1) != 0;
		@Pc(64) boolean local64 = (local42 & 0x2) != 0;
		this.anInt8895 = local10.method6884();
		@Pc(73) int local73 = 0;
		this.anIntArray615 = new int[this.anInt8895];
		@Pc(80) int local80 = -1;
		for (@Pc(82) int local82 = 0; local82 < this.anInt8895; local82++) {
			this.anIntArray615[local82] = local73 += local10.method6884();
			if (this.anIntArray615[local82] > local80) {
				local80 = this.anIntArray615[local82];
			}
		}
		this.anInt8892 = local80 + 1;
		if (local64) {
			this.aByteArrayArray22 = new byte[this.anInt8892][];
		}
		this.anIntArray619 = new int[this.anInt8892];
		this.anIntArray618 = new int[this.anInt8892];
		this.anIntArray620 = new int[this.anInt8892];
		this.anIntArray617 = new int[this.anInt8892];
		this.anIntArrayArray81 = new int[this.anInt8892][];
		@Pc(166) int local166;
		@Pc(179) int local179;
		if (local53) {
			this.anIntArray616 = new int[this.anInt8892];
			for (local166 = 0; local166 < this.anInt8892; local166++) {
				this.anIntArray616[local166] = -1;
			}
			for (local179 = 0; local179 < this.anInt8895; local179++) {
				this.anIntArray616[this.anIntArray615[local179]] = local10.method6865();
			}
			this.aClass361_1 = new Class361(this.anIntArray616);
		}
		for (local166 = 0; local166 < this.anInt8895; local166++) {
			this.anIntArray619[this.anIntArray615[local166]] = local10.method6865();
		}
		if (local64) {
			for (local179 = 0; local179 < this.anInt8895; local179++) {
				@Pc(236) byte[] local236 = new byte[64];
				local10.method6891(local236, 64, 0);
				this.aByteArrayArray22[this.anIntArray615[local179]] = local236;
			}
		}
		for (local179 = 0; local179 < this.anInt8895; local179++) {
			this.anIntArray618[this.anIntArray615[local179]] = local10.method6865();
		}
		for (@Pc(279) int local279 = 0; local279 < this.anInt8895; local279++) {
			this.anIntArray620[this.anIntArray615[local279]] = local10.method6884();
		}
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(324) int local324;
		@Pc(340) int local340;
		for (@Pc(301) int local301 = 0; local301 < this.anInt8895; local301++) {
			local307 = this.anIntArray615[local301];
			local73 = 0;
			local314 = this.anIntArray620[local307];
			local316 = -1;
			this.anIntArrayArray81[local307] = new int[local314];
			for (local324 = 0; local324 < local314; local324++) {
				local340 = this.anIntArrayArray81[local307][local324] = local73 += local10.method6884();
				if (local316 < local340) {
					local316 = local340;
				}
			}
			this.anIntArray617[local307] = local316 + 1;
			if (local314 == local316 + 1) {
				this.anIntArrayArray81[local307] = null;
			}
		}
		if (!local53) {
			return;
		}
		this.aClass361Array1 = new Class361[local80 + 1];
		this.anIntArrayArray82 = new int[local80 + 1][];
		for (local307 = 0; local307 < this.anInt8895; local307++) {
			local314 = this.anIntArray615[local307];
			local316 = this.anIntArray620[local314];
			this.anIntArrayArray82[local314] = new int[this.anIntArray617[local314]];
			for (local324 = 0; local324 < this.anIntArray617[local314]; local324++) {
				this.anIntArrayArray82[local314][local324] = -1;
			}
			for (local340 = 0; local340 < local316; local340++) {
				@Pc(451) int local451;
				if (this.anIntArrayArray81[local314] == null) {
					local451 = local340;
				} else {
					local451 = this.anIntArrayArray81[local314][local340];
				}
				this.anIntArrayArray82[local314][local451] = local10.method6865();
			}
			this.aClass361Array1[local314] = new Class361(this.anIntArrayArray82[local314]);
		}
	}
}
