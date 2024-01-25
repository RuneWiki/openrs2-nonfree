import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class160 {

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "[Lclient!jo;")
	public Class122[] aClass122Array1;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "Lclient!jo;")
	public Class122 aClass122_1;

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
	public int anInt3842;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	public int anInt3843;

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
	public int anInt3844;

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "[I")
	public int[] anIntArray486;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "[I")
	public int[] anIntArray487;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "[I")
	public int[] anIntArray488;

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "[I")
	public int[] anIntArray489;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "[I")
	public int[] anIntArray490;

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "[I")
	public int[] anIntArray491;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
	public final int anInt3845;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "([BI)V")
	public Class160(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3845 = Static167.method2462(arg0.length, arg0);
		if (arg1 != this.anInt3845) {
			throw new RuntimeException();
		}
		this.method3174(arg0);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B[B)V")
	private void method3174(@OriginalArg(1) byte[] arg0) {
		@Pc(20) Class1_Sub33 local20 = new Class1_Sub33(Static348.method5108(arg0));
		@Pc(24) int local24 = local20.method5174();
		if (local24 != 5 && local24 != 6) {
			throw new RuntimeException();
		}
		if (local24 >= 6) {
			this.anInt3844 = local20.method5150();
		} else {
			this.anInt3844 = 0;
		}
		@Pc(53) int local53 = local20.method5174();
		this.anInt3842 = local20.method5177();
		@Pc(60) int local60 = 0;
		this.anIntArray491 = new int[this.anInt3842];
		@Pc(67) int local67 = -1;
		for (@Pc(69) int local69 = 0; local69 < this.anInt3842; local69++) {
			this.anIntArray491[local69] = local60 += local20.method5177();
			if (this.anIntArray491[local69] > local67) {
				local67 = this.anIntArray491[local69];
			}
		}
		this.anInt3843 = local67 + 1;
		this.anIntArrayArray48 = new int[this.anInt3843][];
		this.anIntArray490 = new int[this.anInt3843];
		this.anIntArray489 = new int[this.anInt3843];
		this.anIntArray486 = new int[this.anInt3843];
		this.anIntArray487 = new int[this.anInt3843];
		@Pc(137) int local137;
		@Pc(151) int local151;
		if (local53 != 0) {
			this.anIntArray488 = new int[this.anInt3843];
			for (local137 = 0; local137 < this.anInt3843; local137++) {
				this.anIntArray488[local137] = -1;
			}
			for (local151 = 0; local151 < this.anInt3842; local151++) {
				this.anIntArray488[this.anIntArray491[local151]] = local20.method5150();
			}
			this.aClass122_1 = new Class122(this.anIntArray488);
		}
		for (local137 = 0; local137 < this.anInt3842; local137++) {
			this.anIntArray487[this.anIntArray491[local137]] = local20.method5150();
		}
		for (local151 = 0; local151 < this.anInt3842; local151++) {
			this.anIntArray486[this.anIntArray491[local151]] = local20.method5150();
		}
		for (@Pc(227) int local227 = 0; local227 < this.anInt3842; local227++) {
			this.anIntArray489[this.anIntArray491[local227]] = local20.method5177();
		}
		@Pc(253) int local253;
		@Pc(258) int local258;
		@Pc(262) int local262;
		@Pc(270) int local270;
		@Pc(287) int local287;
		for (@Pc(246) int local246 = 0; local246 < this.anInt3842; local246++) {
			local253 = this.anIntArray491[local246];
			local258 = this.anIntArray489[local253];
			local60 = 0;
			local262 = -1;
			this.anIntArrayArray48[local253] = new int[local258];
			for (local270 = 0; local270 < local258; local270++) {
				local287 = this.anIntArrayArray48[local253][local270] = local60 += local20.method5177();
				if (local287 > local262) {
					local262 = local287;
				}
			}
			this.anIntArray490[local253] = local262 + 1;
			if (local262 + 1 == local258) {
				this.anIntArrayArray48[local253] = null;
			}
		}
		if (local53 == 0) {
			return;
		}
		this.aClass122Array1 = new Class122[local67 + 1];
		this.anIntArrayArray47 = new int[local67 + 1][];
		for (local253 = 0; local253 < this.anInt3842; local253++) {
			local258 = this.anIntArray491[local253];
			local262 = this.anIntArray489[local258];
			this.anIntArrayArray47[local258] = new int[this.anIntArray490[local258]];
			for (local270 = 0; local270 < this.anIntArray490[local258]; local270++) {
				this.anIntArrayArray47[local258][local270] = -1;
			}
			for (local287 = 0; local287 < local262; local287++) {
				@Pc(391) int local391;
				if (this.anIntArrayArray48[local258] == null) {
					local391 = local287;
				} else {
					local391 = this.anIntArrayArray48[local258][local287];
				}
				this.anIntArrayArray47[local258][local391] = local20.method5150();
			}
			this.aClass122Array1[local258] = new Class122(this.anIntArrayArray47[local258]);
		}
	}
}
