import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class137 {

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "[Lclient!sl;")
	public Class312[] aClass312Array1;

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Lclient!sl;")
	public Class312 aClass312_1;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
	public int anInt4969;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
	public int anInt4971;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
	public int anInt4973;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "[[B")
	public byte[][] aByteArrayArray79;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "[I")
	public int[] anIntArray268;

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "[I")
	public int[] anIntArray270;

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
	public final int anInt4972;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "([BI[B)V")
	public Class137(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt4972 = Static292.method4863(arg0, arg0.length);
		if (arg1 != this.anInt4972) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray31 = Static212.method4042(0, arg0.length, arg0);
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				if (this.aByteArray31[local42] != arg2[local42]) {
					throw new RuntimeException();
				}
			}
		}
		this.method4049(arg0);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I[B)V")
	private void method4049(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class8_Sub8 local12 = new Class8_Sub8(Static215.method4067(arg0));
		@Pc(16) int local16 = local12.method8525();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt4969 = 0;
		} else {
			this.anInt4969 = local12.method8540();
		}
		@Pc(49) int local49 = local12.method8525();
		@Pc(57) boolean local57 = (local49 & 0x1) != 0;
		this.anInt4971 = local12.method8578();
		@Pc(70) boolean local70 = (local49 & 0x2) != 0;
		@Pc(72) int local72 = 0;
		this.anIntArray270 = new int[this.anInt4971];
		@Pc(79) int local79 = -1;
		for (@Pc(81) int local81 = 0; local81 < this.anInt4971; local81++) {
			this.anIntArray270[local81] = local72 += local12.method8578();
			if (this.anIntArray270[local81] > local79) {
				local79 = this.anIntArray270[local81];
			}
		}
		this.anInt4973 = local79 + 1;
		if (local70) {
			this.aByteArrayArray79 = new byte[this.anInt4973][];
		}
		this.anIntArrayArray27 = new int[this.anInt4973][];
		this.anIntArray271 = new int[this.anInt4973];
		this.anIntArray266 = new int[this.anInt4973];
		this.anIntArray268 = new int[this.anInt4973];
		this.anIntArray267 = new int[this.anInt4973];
		@Pc(160) int local160;
		@Pc(174) int local174;
		if (local57) {
			this.anIntArray269 = new int[this.anInt4973];
			for (local160 = 0; local160 < this.anInt4973; local160++) {
				this.anIntArray269[local160] = -1;
			}
			for (local174 = 0; local174 < this.anInt4971; local174++) {
				this.anIntArray269[this.anIntArray270[local174]] = local12.method8540();
			}
			this.aClass312_1 = new Class312(this.anIntArray269);
		}
		for (local160 = 0; local160 < this.anInt4971; local160++) {
			this.anIntArray268[this.anIntArray270[local160]] = local12.method8540();
		}
		if (local70) {
			for (local174 = 0; local174 < this.anInt4971; local174++) {
				@Pc(226) byte[] local226 = new byte[64];
				local12.method8563(0, local226, 64);
				this.aByteArrayArray79[this.anIntArray270[local174]] = local226;
			}
		}
		for (local174 = 0; local174 < this.anInt4971; local174++) {
			this.anIntArray267[this.anIntArray270[local174]] = local12.method8540();
		}
		for (@Pc(270) int local270 = 0; local270 < this.anInt4971; local270++) {
			this.anIntArray266[this.anIntArray270[local270]] = local12.method8578();
		}
		@Pc(306) int local306;
		@Pc(313) int local313;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(340) int local340;
		for (@Pc(293) int local293 = 0; local293 < this.anInt4971; local293++) {
			local306 = this.anIntArray270[local293];
			local72 = 0;
			local313 = this.anIntArray266[local306];
			this.anIntArrayArray27[local306] = new int[local313];
			local321 = -1;
			for (local323 = 0; local323 < local313; local323++) {
				local340 = this.anIntArrayArray27[local306][local323] = local72 += local12.method8578();
				if (local321 < local340) {
					local321 = local340;
				}
			}
			this.anIntArray271[local306] = local321 + 1;
			if (local321 + 1 == local313) {
				this.anIntArrayArray27[local306] = null;
			}
		}
		if (!local57) {
			return;
		}
		this.anIntArrayArray26 = new int[local79 + 1][];
		this.aClass312Array1 = new Class312[local79 + 1];
		for (local306 = 0; local306 < this.anInt4971; local306++) {
			local313 = this.anIntArray270[local306];
			local321 = this.anIntArray266[local313];
			this.anIntArrayArray26[local313] = new int[this.anIntArray271[local313]];
			for (local323 = 0; local323 < this.anIntArray271[local313]; local323++) {
				this.anIntArrayArray26[local313][local323] = -1;
			}
			for (local340 = 0; local340 < local321; local340++) {
				@Pc(445) int local445;
				if (this.anIntArrayArray27[local313] == null) {
					local445 = local340;
				} else {
					local445 = this.anIntArrayArray27[local313][local340];
				}
				this.anIntArrayArray26[local313][local445] = local12.method8540();
			}
			this.aClass312Array1[local313] = new Class312(this.anIntArrayArray26[local313]);
		}
	}
}
