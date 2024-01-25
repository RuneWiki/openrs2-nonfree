import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class101 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
	public int anInt2769;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!km;")
	public Class138 aClass138_1;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
	public int anInt2770;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
	public int anInt2773;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "[I")
	public int[] anIntArray216;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "[I")
	public int[] anIntArray217;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "[I")
	public int[] anIntArray219;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "[Lclient!km;")
	public Class138[] aClass138Array1;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
	public int[] anIntArray220;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
	public final int anInt2771;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([BI)V")
	public Class101(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2771 = Static101.method1834(arg0, arg0.length);
		if (arg1 != this.anInt2771) {
			throw new RuntimeException();
		}
		this.method2393(arg0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[B)V")
	private void method2393(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class1_Sub5 local12 = new Class1_Sub5(Static107.method1963(arg0));
		@Pc(16) int local16 = local12.method5366();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt2773 = local12.method5407();
		} else {
			this.anInt2773 = 0;
		}
		@Pc(47) int local47 = local12.method5366();
		this.anInt2770 = local12.method5362();
		@Pc(54) int local54 = 0;
		this.anIntArray216 = new int[this.anInt2770];
		@Pc(61) int local61 = -1;
		for (@Pc(63) int local63 = 0; local63 < this.anInt2770; local63++) {
			this.anIntArray216[local63] = local54 += local12.method5362();
			if (this.anIntArray216[local63] > local61) {
				local61 = this.anIntArray216[local63];
			}
		}
		this.anInt2769 = local61 + 1;
		this.anIntArray217 = new int[this.anInt2769];
		this.anIntArray220 = new int[this.anInt2769];
		this.anIntArrayArray26 = new int[this.anInt2769][];
		this.anIntArray219 = new int[this.anInt2769];
		this.anIntArray218 = new int[this.anInt2769];
		@Pc(137) int local137;
		@Pc(151) int local151;
		if (local47 != 0) {
			this.anIntArray215 = new int[this.anInt2769];
			for (local137 = 0; local137 < this.anInt2769; local137++) {
				this.anIntArray215[local137] = -1;
			}
			for (local151 = 0; local151 < this.anInt2770; local151++) {
				this.anIntArray215[this.anIntArray216[local151]] = local12.method5407();
			}
			this.aClass138_1 = new Class138(this.anIntArray215);
		}
		for (local137 = 0; local137 < this.anInt2770; local137++) {
			this.anIntArray217[this.anIntArray216[local137]] = local12.method5407();
		}
		for (local151 = 0; local151 < this.anInt2770; local151++) {
			this.anIntArray220[this.anIntArray216[local151]] = local12.method5407();
		}
		for (@Pc(221) int local221 = 0; local221 < this.anInt2770; local221++) {
			this.anIntArray219[this.anIntArray216[local221]] = local12.method5362();
		}
		@Pc(253) int local253;
		@Pc(258) int local258;
		@Pc(268) int local268;
		@Pc(270) int local270;
		@Pc(287) int local287;
		for (@Pc(246) int local246 = 0; local246 < this.anInt2770; local246++) {
			local253 = this.anIntArray216[local246];
			local258 = this.anIntArray219[local253];
			local54 = 0;
			this.anIntArrayArray26[local253] = new int[local258];
			local268 = -1;
			for (local270 = 0; local270 < local258; local270++) {
				local287 = this.anIntArrayArray26[local253][local270] = local54 += local12.method5362();
				if (local287 > local268) {
					local268 = local287;
				}
			}
			this.anIntArray218[local253] = local268 + 1;
			if (local268 + 1 == local258) {
				this.anIntArrayArray26[local253] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.anIntArrayArray27 = new int[local61 + 1][];
		this.aClass138Array1 = new Class138[local61 + 1];
		for (local253 = 0; local253 < this.anInt2770; local253++) {
			local258 = this.anIntArray216[local253];
			local268 = this.anIntArray219[local258];
			this.anIntArrayArray27[local258] = new int[this.anIntArray218[local258]];
			for (local270 = 0; local270 < this.anIntArray218[local258]; local270++) {
				this.anIntArrayArray27[local258][local270] = -1;
			}
			for (local287 = 0; local287 < local268; local287++) {
				@Pc(403) int local403;
				if (this.anIntArrayArray26[local258] == null) {
					local403 = local287;
				} else {
					local403 = this.anIntArrayArray26[local258][local287];
				}
				this.anIntArrayArray27[local258][local403] = local12.method5407();
			}
			this.aClass138Array1[local258] = new Class138(this.anIntArrayArray27[local258]);
		}
	}
}
