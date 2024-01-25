import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class126 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "[I")
	public int[] anIntArray464;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "[I")
	public int[] anIntArray465;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "[Lclient!pk;")
	public Class157[] aClass157Array1;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!pk;")
	public Class157 aClass157_1;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "[I")
	public int[] anIntArray466;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	public int anInt3922;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "[I")
	public int[] anIntArray467;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "[I")
	public int[] anIntArray468;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	public int anInt3927;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	public int anInt3928;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "[I")
	public int[] anIntArray469;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "I")
	public final int anInt3925;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "([BI)V")
	public Class126(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3925 = Static63.method1325(arg0, arg0.length);
		if (arg1 != this.anInt3925) {
			throw new RuntimeException();
		}
		this.method3651(arg0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([BI)V")
	private void method3651(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class1_Sub7 local12 = new Class1_Sub7(Static222.method4058(arg0));
		@Pc(16) int local16 = local12.method3141();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt3928 = local12.method3125();
		} else {
			this.anInt3928 = 0;
		}
		@Pc(49) int local49 = local12.method3141();
		this.anInt3927 = local12.method3115();
		@Pc(56) int local56 = 0;
		this.anIntArray465 = new int[this.anInt3927];
		@Pc(63) int local63 = -1;
		for (@Pc(65) int local65 = 0; local65 < this.anInt3927; local65++) {
			this.anIntArray465[local65] = local56 += local12.method3115();
			if (local63 < this.anIntArray465[local65]) {
				local63 = this.anIntArray465[local65];
			}
		}
		this.anInt3922 = local63 + 1;
		this.anIntArray466 = new int[this.anInt3922];
		this.anIntArray468 = new int[this.anInt3922];
		this.anIntArray467 = new int[this.anInt3922];
		this.anIntArrayArray40 = new int[this.anInt3922][];
		this.anIntArray464 = new int[this.anInt3922];
		@Pc(144) int local144;
		@Pc(158) int local158;
		if (local49 != 0) {
			this.anIntArray469 = new int[this.anInt3922];
			for (local144 = 0; local144 < this.anInt3922; local144++) {
				this.anIntArray469[local144] = -1;
			}
			for (local158 = 0; local158 < this.anInt3927; local158++) {
				this.anIntArray469[this.anIntArray465[local158]] = local12.method3125();
			}
			this.aClass157_1 = new Class157(this.anIntArray469);
		}
		for (local144 = 0; local144 < this.anInt3927; local144++) {
			this.anIntArray466[this.anIntArray465[local144]] = local12.method3125();
		}
		for (local158 = 0; local158 < this.anInt3927; local158++) {
			this.anIntArray467[this.anIntArray465[local158]] = local12.method3125();
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt3927; local226++) {
			this.anIntArray464[this.anIntArray465[local226]] = local12.method3115();
		}
		@Pc(252) int local252;
		@Pc(257) int local257;
		@Pc(261) int local261;
		@Pc(269) int local269;
		@Pc(286) int local286;
		for (@Pc(245) int local245 = 0; local245 < this.anInt3927; local245++) {
			local252 = this.anIntArray465[local245];
			local257 = this.anIntArray464[local252];
			local56 = 0;
			local261 = -1;
			this.anIntArrayArray40[local252] = new int[local257];
			for (local269 = 0; local269 < local257; local269++) {
				local286 = this.anIntArrayArray40[local252][local269] = local56 += local12.method3115();
				if (local286 > local261) {
					local261 = local286;
				}
			}
			this.anIntArray468[local252] = local261 + 1;
			if (local261 + 1 == local257) {
				this.anIntArrayArray40[local252] = null;
			}
		}
		if (local49 == 0) {
			return;
		}
		this.anIntArrayArray41 = new int[local63 + 1][];
		this.aClass157Array1 = new Class157[local63 + 1];
		for (local252 = 0; local252 < this.anInt3927; local252++) {
			local257 = this.anIntArray465[local252];
			local261 = this.anIntArray464[local257];
			this.anIntArrayArray41[local257] = new int[this.anIntArray468[local257]];
			for (local269 = 0; local269 < this.anIntArray468[local257]; local269++) {
				this.anIntArrayArray41[local257][local269] = -1;
			}
			for (local286 = 0; local286 < local261; local286++) {
				@Pc(395) int local395;
				if (this.anIntArrayArray40[local257] == null) {
					local395 = local286;
				} else {
					local395 = this.anIntArrayArray40[local257][local286];
				}
				this.anIntArrayArray41[local257][local395] = local12.method3125();
			}
			this.aClass157Array1[local257] = new Class157(this.anIntArrayArray41[local257]);
		}
	}
}
