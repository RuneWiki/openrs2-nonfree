import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class132 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray99;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	public int anInt3613;

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
	public int anInt3614;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	public int anInt3615;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "[I")
	public int[] anIntArray296;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray100;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "Lclient!qt;")
	public Class194 aClass194_1;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "[I")
	public int[] anIntArray298;

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "[I")
	public int[] anIntArray299;

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "[Lclient!qt;")
	public Class194[] aClass194Array1;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
	public final int anInt3618;

	static {
		new Class84(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "([BI)V")
	public Class132(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3618 = Static246.method3618(arg0.length, arg0);
		if (this.anInt3618 != arg1) {
			throw new RuntimeException();
		}
		this.method3013(arg0);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z[B)V")
	private void method3013(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class1_Sub1 local16 = new Class1_Sub1(Static220.method3316(arg0));
		@Pc(20) int local20 = local16.method4130();
		if (local20 != 5 && local20 != 6) {
			throw new RuntimeException();
		}
		if (local20 < 6) {
			this.anInt3615 = 0;
		} else {
			this.anInt3615 = local16.method4087();
		}
		@Pc(53) int local53 = local16.method4130();
		this.anInt3613 = local16.method4093();
		@Pc(60) int local60 = 0;
		this.anIntArray295 = new int[this.anInt3613];
		@Pc(67) int local67 = -1;
		for (@Pc(69) int local69 = 0; local69 < this.anInt3613; local69++) {
			this.anIntArray295[local69] = local60 += local16.method4093();
			if (this.anIntArray295[local69] > local67) {
				local67 = this.anIntArray295[local69];
			}
		}
		this.anInt3614 = local67 + 1;
		this.anIntArrayArray100 = new int[this.anInt3614][];
		this.anIntArray296 = new int[this.anInt3614];
		this.anIntArray294 = new int[this.anInt3614];
		this.anIntArray297 = new int[this.anInt3614];
		this.anIntArray298 = new int[this.anInt3614];
		@Pc(144) int local144;
		@Pc(162) int local162;
		if (local53 != 0) {
			this.anIntArray299 = new int[this.anInt3614];
			for (local144 = 0; local144 < this.anInt3614; local144++) {
				this.anIntArray299[local144] = -1;
			}
			for (local162 = 0; local162 < this.anInt3613; local162++) {
				this.anIntArray299[this.anIntArray295[local162]] = local16.method4087();
			}
			this.aClass194_1 = new Class194(this.anIntArray299);
		}
		for (local144 = 0; local144 < this.anInt3613; local144++) {
			this.anIntArray294[this.anIntArray295[local144]] = local16.method4087();
		}
		for (local162 = 0; local162 < this.anInt3613; local162++) {
			this.anIntArray298[this.anIntArray295[local162]] = local16.method4087();
		}
		for (@Pc(238) int local238 = 0; local238 < this.anInt3613; local238++) {
			this.anIntArray296[this.anIntArray295[local238]] = local16.method4093();
		}
		@Pc(264) int local264;
		@Pc(269) int local269;
		@Pc(273) int local273;
		@Pc(281) int local281;
		@Pc(298) int local298;
		for (@Pc(257) int local257 = 0; local257 < this.anInt3613; local257++) {
			local264 = this.anIntArray295[local257];
			local269 = this.anIntArray296[local264];
			local60 = 0;
			local273 = -1;
			this.anIntArrayArray100[local264] = new int[local269];
			for (local281 = 0; local281 < local269; local281++) {
				local298 = this.anIntArrayArray100[local264][local281] = local60 += local16.method4093();
				if (local273 < local298) {
					local273 = local298;
				}
			}
			this.anIntArray297[local264] = local273 + 1;
			if (local273 + 1 == local269) {
				this.anIntArrayArray100[local264] = null;
			}
		}
		if (local53 == 0) {
			return;
		}
		this.aClass194Array1 = new Class194[local67 + 1];
		this.anIntArrayArray99 = new int[local67 + 1][];
		for (local264 = 0; local264 < this.anInt3613; local264++) {
			local269 = this.anIntArray295[local264];
			local273 = this.anIntArray296[local269];
			this.anIntArrayArray99[local269] = new int[this.anIntArray297[local269]];
			for (local281 = 0; local281 < this.anIntArray297[local269]; local281++) {
				this.anIntArrayArray99[local269][local281] = -1;
			}
			for (local298 = 0; local298 < local273; local298++) {
				@Pc(423) int local423;
				if (this.anIntArrayArray100[local269] == null) {
					local423 = local298;
				} else {
					local423 = this.anIntArrayArray100[local269][local298];
				}
				this.anIntArrayArray99[local269][local423] = local16.method4087();
			}
			this.aClass194Array1[local269] = new Class194(this.anIntArrayArray99[local269]);
		}
	}
}
