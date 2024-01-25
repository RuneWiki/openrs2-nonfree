import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class64 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "[I")
	public int[] anIntArray141;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!js;")
	public Class135 aClass135_1;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
	public int[] anIntArray142;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "[Lclient!js;")
	public Class135[] aClass135Array1;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	public int anInt1828;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
	public int anInt1829;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "[I")
	public int[] anIntArray144;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
	public int anInt1832;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
	public final int anInt1827;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([BI)V")
	public Class64(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1827 = Static375.method4993(arg0.length, arg0);
		if (arg1 != this.anInt1827) {
			throw new RuntimeException();
		}
		this.method1629(arg0);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B[B)V")
	private void method1629(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class10_Sub8 local12 = new Class10_Sub8(Static140.method2398(arg0));
		@Pc(16) int local16 = local12.method2502();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt1832 = local12.method2459();
		} else {
			this.anInt1832 = 0;
		}
		@Pc(47) int local47 = local12.method2502();
		this.anInt1828 = local12.method2485();
		@Pc(54) int local54 = 0;
		this.anIntArray146 = new int[this.anInt1828];
		@Pc(61) int local61 = -1;
		for (@Pc(63) int local63 = 0; local63 < this.anInt1828; local63++) {
			this.anIntArray146[local63] = local54 += local12.method2485();
			if (this.anIntArray146[local63] > local61) {
				local61 = this.anIntArray146[local63];
			}
		}
		this.anInt1829 = local61 + 1;
		this.anIntArray141 = new int[this.anInt1829];
		this.anIntArray145 = new int[this.anInt1829];
		this.anIntArrayArray14 = new int[this.anInt1829][];
		this.anIntArray143 = new int[this.anInt1829];
		this.anIntArray144 = new int[this.anInt1829];
		@Pc(146) int local146;
		@Pc(160) int local160;
		if (local47 != 0) {
			this.anIntArray142 = new int[this.anInt1829];
			for (local146 = 0; local146 < this.anInt1829; local146++) {
				this.anIntArray142[local146] = -1;
			}
			for (local160 = 0; local160 < this.anInt1828; local160++) {
				this.anIntArray142[this.anIntArray146[local160]] = local12.method2459();
			}
			this.aClass135_1 = new Class135(this.anIntArray142);
		}
		for (local146 = 0; local146 < this.anInt1828; local146++) {
			this.anIntArray145[this.anIntArray146[local146]] = local12.method2459();
		}
		for (local160 = 0; local160 < this.anInt1828; local160++) {
			this.anIntArray143[this.anIntArray146[local160]] = local12.method2459();
		}
		for (@Pc(228) int local228 = 0; local228 < this.anInt1828; local228++) {
			this.anIntArray141[this.anIntArray146[local228]] = local12.method2485();
		}
		@Pc(258) int local258;
		@Pc(265) int local265;
		@Pc(273) int local273;
		@Pc(275) int local275;
		@Pc(292) int local292;
		for (@Pc(251) int local251 = 0; local251 < this.anInt1828; local251++) {
			local258 = this.anIntArray146[local251];
			local54 = 0;
			local265 = this.anIntArray141[local258];
			this.anIntArrayArray14[local258] = new int[local265];
			local273 = -1;
			for (local275 = 0; local275 < local265; local275++) {
				local292 = this.anIntArrayArray14[local258][local275] = local54 += local12.method2485();
				if (local292 > local273) {
					local273 = local292;
				}
			}
			this.anIntArray144[local258] = local273 + 1;
			if (local265 == local273 + 1) {
				this.anIntArrayArray14[local258] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.anIntArrayArray13 = new int[local61 + 1][];
		this.aClass135Array1 = new Class135[local61 + 1];
		for (local258 = 0; local258 < this.anInt1828; local258++) {
			local265 = this.anIntArray146[local258];
			local273 = this.anIntArray141[local265];
			this.anIntArrayArray13[local265] = new int[this.anIntArray144[local265]];
			for (local275 = 0; local275 < this.anIntArray144[local265]; local275++) {
				this.anIntArrayArray13[local265][local275] = -1;
			}
			for (local292 = 0; local292 < local273; local292++) {
				@Pc(410) int local410;
				if (this.anIntArrayArray14[local265] == null) {
					local410 = local292;
				} else {
					local410 = this.anIntArrayArray14[local265][local292];
				}
				this.anIntArrayArray13[local265][local410] = local12.method2459();
			}
			this.aClass135Array1[local265] = new Class135(this.anIntArrayArray13[local265]);
		}
	}
}
