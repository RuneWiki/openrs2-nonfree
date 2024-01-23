import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class4_Sub1_Sub33 extends Class4_Sub1 {

	@OriginalMember(owner = "client!sn", name = "X", descriptor = "I")
	private int anInt4938;

	@OriginalMember(owner = "client!sn", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!sn", name = "kb", descriptor = "I")
	private int anInt4949;

	@OriginalMember(owner = "client!sn", name = "lb", descriptor = "[I")
	private int[] anIntArray536;

	@OriginalMember(owner = "client!sn", name = "mb", descriptor = "I")
	private int anInt4950;

	@OriginalMember(owner = "client!sn", name = "nb", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!sn", name = "U", descriptor = "I")
	private int anInt4936 = 81;

	@OriginalMember(owner = "client!sn", name = "fb", descriptor = "I")
	private int anInt4944 = 4;

	@OriginalMember(owner = "client!sn", name = "gb", descriptor = "I")
	private int anInt4945 = 0;

	@OriginalMember(owner = "client!sn", name = "eb", descriptor = "I")
	private int anInt4943 = 1024;

	@OriginalMember(owner = "client!sn", name = "db", descriptor = "I")
	private int anInt4942 = 1024;

	@OriginalMember(owner = "client!sn", name = "hb", descriptor = "I")
	private int anInt4946 = 409;

	@OriginalMember(owner = "client!sn", name = "sb", descriptor = "I")
	private int anInt4955 = 204;

	@OriginalMember(owner = "client!sn", name = "V", descriptor = "I")
	private int anInt4937 = 8;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)V")
	private void method4094() {
		@Pc(12) Random local12 = new Random((long) this.anInt4937);
		this.anInt4938 = 4096 / this.anInt4937;
		this.anIntArray536 = new int[this.anInt4937 + 1];
		this.anIntArrayArray41 = new int[this.anInt4937][this.anInt4944 + 1];
		this.anIntArrayArray42 = new int[this.anInt4937][this.anInt4944];
		this.anIntArray536[0] = 0;
		this.anInt4950 = 4096 / this.anInt4944;
		@Pc(57) int local57 = this.anInt4950 / 2;
		this.anInt4949 = this.anInt4936 / 2;
		@Pc(68) int local68 = this.anInt4938 / 2;
		for (@Pc(74) int local74 = 0; local74 < this.anInt4937; local74++) {
			@Pc(87) int local87;
			@Pc(99) int local99;
			if (local74 > 0) {
				local87 = this.anInt4938;
				local99 = (Static44.method716(local12, 4096) - 2048) * this.anInt4955 >> 12;
				@Pc(107) int local107 = local87 + (local99 * local68 >> 12);
				this.anIntArray536[local74] = local107 + this.anIntArray536[local74 - 1];
			}
			this.anIntArrayArray41[local74][0] = 0;
			for (local87 = 0; local87 < this.anInt4944; local87++) {
				if (local87 > 0) {
					local99 = this.anInt4950;
					@Pc(153) int local153 = (Static44.method716(local12, 4096) - 2048) * this.anInt4946 >> 12;
					local99 += local57 * local153 >> 12;
					this.anIntArrayArray41[local74][local87] = this.anIntArrayArray41[local74][local87 - 1] + local99;
				}
				this.anIntArrayArray42[local74][local87] = this.anInt4942 <= 0 ? 4096 : 4096 - Static44.method716(local12, this.anInt4942);
			}
			this.anIntArrayArray41[local74][this.anInt4944] = 4096;
		}
		this.anIntArray536[this.anInt4937] = 4096;
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(B)V")
	@Override
	public void method4737() {
		this.method4094();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4944 = arg0.method4666();
		} else if (arg1 == 1) {
			this.anInt4937 = arg0.method4666();
		} else if (arg1 == 2) {
			this.anInt4946 = arg0.method4653();
		} else if (arg1 == 3) {
			this.anInt4955 = arg0.method4653();
		} else if (arg1 == 4) {
			this.anInt4943 = arg0.method4653();
		} else if (arg1 == 5) {
			this.anInt4945 = arg0.method4653();
		} else if (arg1 == 6) {
			this.anInt4936 = arg0.method4653();
		} else if (arg1 == 7) {
			this.anInt4942 = arg0.method4653();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(19) int local19 = 0;
			@Pc(26) int local26;
			for (local26 = this.anInt4945 + Static237.anIntArray478[arg0]; local26 < 0; local26 += 4096) {
			}
			while (local26 > 4096) {
				local26 -= 4096;
			}
			while (this.anInt4937 > local19 && local26 >= this.anIntArray536[local19]) {
				local19++;
			}
			@Pc(64) int local64 = local19 - 1;
			@Pc(69) int local69 = this.anIntArray536[local19];
			@Pc(80) boolean local80 = (local19 & 0x1) == 0;
			@Pc(87) int local87 = this.anIntArray536[local19 - 1];
			if (local87 + this.anInt4949 < local26 && local26 < local69 - this.anInt4949) {
				for (@Pc(107) int local107 = 0; local107 < Static73.anInt1626; local107++) {
					@Pc(123) int local123 = local80 ? this.anInt4943 : -this.anInt4943;
					@Pc(135) int local135 = Static138.anIntArray231[local107] + (local123 * this.anInt4950 >> 12);
					@Pc(137) int local137 = 0;
					while (local135 < 0) {
						local135 += 4096;
					}
					while (local135 > 4096) {
						local135 -= 4096;
					}
					while (local137 < this.anInt4944 && local135 >= this.anIntArrayArray41[local64][local137]) {
						local137++;
					}
					@Pc(175) int local175 = this.anIntArrayArray41[local64][local137];
					@Pc(179) int local179 = local137 - 1;
					@Pc(186) int local186 = this.anIntArrayArray41[local64][local179];
					if (local186 + this.anInt4949 < local135 && local175 - this.anInt4949 > local135) {
						local13[local107] = this.anIntArrayArray42[local64][local179];
					} else {
						local13[local107] = 0;
					}
				}
			} else {
				Static316.method75(local13, 0, Static73.anInt1626, 0);
			}
		}
		return local13;
	}
}
