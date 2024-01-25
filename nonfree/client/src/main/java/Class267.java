import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class267 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "[I")
	public int[] anIntArray440;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
	public int anInt7966;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "[I")
	public int[] anIntArray441;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "[I")
	public int[] anIntArray442;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "[I")
	public int[] anIntArray443;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
	public int anInt7967;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "[[B")
	public byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
	public int anInt7969;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "[I")
	public int[] anIntArray445;

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "[Lclient!wg;")
	public Class359[] aClass359Array1;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "[I")
	public int[] anIntArray446;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "Lclient!wg;")
	public Class359 aClass359_1;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
	public final int anInt7965;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "[B")
	private byte[] aByteArray73;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "([BI[B)V")
	public Class267(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt7965 = Static89.method1821(arg0.length, arg0);
		if (this.anInt7965 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray73 = Static236.method3843(arg0.length, arg0, 0);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (arg2[local42] != this.aByteArray73[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method6230(arg0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([BI)V")
	private void method6230(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class4_Sub13 local12 = new Class4_Sub13(Static100.method1930(arg0));
		@Pc(18) int local18 = local12.method7004();
		if (local18 < 5 || local18 > 6) {
			throw new RuntimeException();
		}
		if (local18 >= 6) {
			this.anInt7967 = local12.method6990();
		} else {
			this.anInt7967 = 0;
		}
		@Pc(55) int local55 = local12.method7004();
		@Pc(63) boolean local63 = (local55 & 0x1) != 0;
		this.anInt7969 = local12.method7054();
		@Pc(76) boolean local76 = (local55 & 0x2) != 0;
		@Pc(78) int local78 = 0;
		this.anIntArray442 = new int[this.anInt7969];
		@Pc(85) int local85 = -1;
		for (@Pc(87) int local87 = 0; local87 < this.anInt7969; local87++) {
			this.anIntArray442[local87] = local78 += local12.method7054();
			if (local85 < this.anIntArray442[local87]) {
				local85 = this.anIntArray442[local87];
			}
		}
		this.anInt7966 = local85 + 1;
		this.anIntArray443 = new int[this.anInt7966];
		this.anIntArray440 = new int[this.anInt7966];
		this.anIntArray445 = new int[this.anInt7966];
		if (local76) {
			this.aByteArrayArray24 = new byte[this.anInt7966][];
		}
		this.anIntArrayArray39 = new int[this.anInt7966][];
		this.anIntArray446 = new int[this.anInt7966];
		@Pc(166) int local166;
		@Pc(180) int local180;
		if (local63) {
			this.anIntArray441 = new int[this.anInt7966];
			for (local166 = 0; local166 < this.anInt7966; local166++) {
				this.anIntArray441[local166] = -1;
			}
			for (local180 = 0; local180 < this.anInt7969; local180++) {
				this.anIntArray441[this.anIntArray442[local180]] = local12.method6990();
			}
			this.aClass359_1 = new Class359(this.anIntArray441);
		}
		for (local166 = 0; local166 < this.anInt7969; local166++) {
			this.anIntArray443[this.anIntArray442[local166]] = local12.method6990();
		}
		if (local76) {
			for (local180 = 0; local180 < this.anInt7969; local180++) {
				@Pc(232) byte[] local232 = new byte[64];
				local12.method7049(local232, 64);
				this.aByteArrayArray24[this.anIntArray442[local180]] = local232;
			}
		}
		for (local180 = 0; local180 < this.anInt7969; local180++) {
			this.anIntArray446[this.anIntArray442[local180]] = local12.method6990();
		}
		for (@Pc(278) int local278 = 0; local278 < this.anInt7969; local278++) {
			this.anIntArray445[this.anIntArray442[local278]] = local12.method7054();
		}
		@Pc(304) int local304;
		@Pc(311) int local311;
		@Pc(319) int local319;
		@Pc(321) int local321;
		@Pc(338) int local338;
		for (@Pc(297) int local297 = 0; local297 < this.anInt7969; local297++) {
			local304 = this.anIntArray442[local297];
			local78 = 0;
			local311 = this.anIntArray445[local304];
			this.anIntArrayArray39[local304] = new int[local311];
			local319 = -1;
			for (local321 = 0; local321 < local311; local321++) {
				local338 = this.anIntArrayArray39[local304][local321] = local78 += local12.method7054();
				if (local338 > local319) {
					local319 = local338;
				}
			}
			this.anIntArray440[local304] = local319 + 1;
			if (local319 + 1 == local311) {
				this.anIntArrayArray39[local304] = null;
			}
		}
		if (!local63) {
			return;
		}
		this.anIntArrayArray40 = new int[local85 + 1][];
		this.aClass359Array1 = new Class359[local85 + 1];
		for (local304 = 0; local304 < this.anInt7969; local304++) {
			local311 = this.anIntArray442[local304];
			local319 = this.anIntArray445[local311];
			this.anIntArrayArray40[local311] = new int[this.anIntArray440[local311]];
			for (local321 = 0; local321 < this.anIntArray440[local311]; local321++) {
				this.anIntArrayArray40[local311][local321] = -1;
			}
			for (local338 = 0; local338 < local319; local338++) {
				@Pc(443) int local443;
				if (this.anIntArrayArray39[local311] == null) {
					local443 = local338;
				} else {
					local443 = this.anIntArrayArray39[local311][local338];
				}
				this.anIntArrayArray40[local311][local443] = local12.method6990();
			}
			this.aClass359Array1[local311] = new Class359(this.anIntArrayArray40[local311]);
		}
	}
}
