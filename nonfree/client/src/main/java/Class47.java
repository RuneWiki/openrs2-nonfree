import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class47 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "[Lclient!tm;")
	public Class173[] aClass173Array1;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "[I")
	public int[] anIntArray125;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "[I")
	public int[] anIntArray126;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!tm;")
	public Class173 aClass173_1;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	public int anInt1559;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
	public int anInt1561;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
	public int anInt1564;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public int anInt1558;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([BI)V")
	public Class47(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1558 = Static168.method2849(arg0, arg0.length);
		if (this.anInt1558 != arg1) {
			throw new RuntimeException();
		}
		this.method1478(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B[B)V")
	private void method1478(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class1_Sub14 local16 = new Class1_Sub14(Static263.method4149(arg0));
		@Pc(20) int local20 = local16.method1378();
		if (local20 != 5 && local20 != 6) {
			throw new RuntimeException();
		}
		if (local20 >= 6) {
			this.anInt1559 = local16.method1392();
		} else {
			this.anInt1559 = 0;
		}
		@Pc(51) int local51 = -1;
		@Pc(53) int local53 = 0;
		@Pc(57) int local57 = local16.method1378();
		this.anInt1561 = local16.method1386();
		this.anIntArray129 = new int[this.anInt1561];
		@Pc(69) int local69;
		for (local69 = 0; local69 < this.anInt1561; local69++) {
			this.anIntArray129[local69] = local53 += local16.method1386();
			if (this.anIntArray129[local69] > local51) {
				local51 = this.anIntArray129[local69];
			}
		}
		this.anInt1564 = local51 + 1;
		this.anIntArrayArray15 = new int[this.anInt1564][];
		this.anIntArray127 = new int[this.anInt1564];
		this.anIntArray124 = new int[this.anInt1564];
		this.anIntArray125 = new int[this.anInt1564];
		this.anIntArray126 = new int[this.anInt1564];
		if (local57 != 0) {
			this.anIntArray128 = new int[this.anInt1564];
			for (local69 = 0; local69 < this.anInt1564; local69++) {
				this.anIntArray128[local69] = -1;
			}
			for (local69 = 0; local69 < this.anInt1561; local69++) {
				this.anIntArray128[this.anIntArray129[local69]] = local16.method1392();
			}
			this.aClass173_1 = new Class173(this.anIntArray128);
		}
		for (local69 = 0; local69 < this.anInt1561; local69++) {
			this.anIntArray127[this.anIntArray129[local69]] = local16.method1392();
		}
		for (local69 = 0; local69 < this.anInt1561; local69++) {
			this.anIntArray124[this.anIntArray129[local69]] = local16.method1392();
		}
		for (local69 = 0; local69 < this.anInt1561; local69++) {
			this.anIntArray126[this.anIntArray129[local69]] = local16.method1386();
		}
		@Pc(262) int local262;
		@Pc(267) int local267;
		@Pc(275) int local275;
		@Pc(277) int local277;
		for (local69 = 0; local69 < this.anInt1561; local69++) {
			local53 = 0;
			local262 = this.anIntArray129[local69];
			local267 = this.anIntArray126[local262];
			this.anIntArrayArray15[local262] = new int[local267];
			local275 = -1;
			for (local277 = 0; local277 < local267; local277++) {
				@Pc(301) int local301 = this.anIntArrayArray15[local262][local277] = local53 += local16.method1386();
				if (local301 > local275) {
					local275 = local301;
				}
			}
			this.anIntArray125[local262] = local275 + 1;
			if (local267 == local275 + 1) {
				this.anIntArrayArray15[local262] = null;
			}
		}
		if (local57 == 0) {
			return;
		}
		this.anIntArrayArray14 = new int[local51 + 1][];
		this.aClass173Array1 = new Class173[local51 + 1];
		for (local69 = 0; local69 < this.anInt1561; local69++) {
			local262 = this.anIntArray129[local69];
			local267 = this.anIntArray126[local262];
			this.anIntArrayArray14[local262] = new int[this.anIntArray125[local262]];
			for (local275 = 0; local275 < this.anIntArray125[local262]; local275++) {
				this.anIntArrayArray14[local262][local275] = -1;
			}
			for (local275 = 0; local275 < local267; local275++) {
				if (this.anIntArrayArray15[local262] == null) {
					local277 = local275;
				} else {
					local277 = this.anIntArrayArray15[local262][local275];
				}
				this.anIntArrayArray14[local262][local277] = local16.method1392();
			}
			this.aClass173Array1[local262] = new Class173(this.anIntArrayArray14[local262]);
		}
	}
}
