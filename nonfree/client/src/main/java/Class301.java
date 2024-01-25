import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class301 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "[I")
	public int[] anIntArray684;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
	public int anInt8966;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "Lclient!ab;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
	public int anInt8967;

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "[I")
	public int[] anIntArray685;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "[[B")
	public byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "[I")
	public int[] anIntArray686;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "[I")
	public int[] anIntArray687;

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "[I")
	public int[] anIntArray688;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray81;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
	public int anInt8969;

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "[I")
	public int[] anIntArray689;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray82;

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "[Lclient!ab;")
	public Class3[] aClass3Array1;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	public final int anInt8968;

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "[B")
	private byte[] aByteArray117;

	static {
		new Class202("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "([BI[B)V")
	public Class301(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt8968 = Static433.method5294(arg0.length, arg0);
		if (this.anInt8968 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray117 = Static266.method4288(0, arg0.length, arg0);
			for (@Pc(38) int local38 = 0; local38 < 64; local38++) {
				if (this.aByteArray117[local38] != arg2[local38]) {
					throw new RuntimeException();
				}
			}
		}
		this.method7504(arg0);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B[B)V")
	private void method7504(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class2_Sub29 local12 = new Class2_Sub29(Static356.method2690(arg0));
		@Pc(16) int local16 = local12.method5170();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt8966 = local12.method5198();
		} else {
			this.anInt8966 = 0;
		}
		@Pc(45) int local45 = local12.method5170();
		@Pc(56) boolean local56 = (local45 & 0x1) != 0;
		@Pc(64) boolean local64 = (local45 & 0x2) != 0;
		this.anInt8969 = local12.method5229();
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = -1;
		this.anIntArray688 = new int[this.anInt8969];
		for (@Pc(80) int local80 = 0; local80 < this.anInt8969; local80++) {
			this.anIntArray688[local80] = local71 += local12.method5229();
			if (local73 < this.anIntArray688[local80]) {
				local73 = this.anIntArray688[local80];
			}
		}
		this.anInt8967 = local73 + 1;
		this.anIntArray687 = new int[this.anInt8967];
		this.anIntArray685 = new int[this.anInt8967];
		this.anIntArrayArray82 = new int[this.anInt8967][];
		this.anIntArray689 = new int[this.anInt8967];
		if (local64) {
			this.aByteArrayArray27 = new byte[this.anInt8967][];
		}
		this.anIntArray686 = new int[this.anInt8967];
		@Pc(170) int local170;
		@Pc(188) int local188;
		if (local56) {
			this.anIntArray684 = new int[this.anInt8967];
			for (local170 = 0; local170 < this.anInt8967; local170++) {
				this.anIntArray684[local170] = -1;
			}
			for (local188 = 0; local188 < this.anInt8969; local188++) {
				this.anIntArray684[this.anIntArray688[local188]] = local12.method5198();
			}
			this.aClass3_1 = new Class3(this.anIntArray684);
		}
		for (local170 = 0; local170 < this.anInt8969; local170++) {
			this.anIntArray685[this.anIntArray688[local170]] = local12.method5198();
		}
		if (local64) {
			for (local188 = 0; local188 < this.anInt8969; local188++) {
				@Pc(248) byte[] local248 = new byte[64];
				local12.method5184(64, local248);
				this.aByteArrayArray27[this.anIntArray688[local188]] = local248;
			}
		}
		for (local188 = 0; local188 < this.anInt8969; local188++) {
			this.anIntArray689[this.anIntArray688[local188]] = local12.method5198();
		}
		for (@Pc(292) int local292 = 0; local292 < this.anInt8969; local292++) {
			this.anIntArray686[this.anIntArray688[local292]] = local12.method5229();
		}
		@Pc(322) int local322;
		@Pc(327) int local327;
		@Pc(331) int local331;
		@Pc(339) int local339;
		@Pc(356) int local356;
		for (@Pc(315) int local315 = 0; local315 < this.anInt8969; local315++) {
			local322 = this.anIntArray688[local315];
			local327 = this.anIntArray686[local322];
			local71 = 0;
			local331 = -1;
			this.anIntArrayArray82[local322] = new int[local327];
			for (local339 = 0; local339 < local327; local339++) {
				local356 = this.anIntArrayArray82[local322][local339] = local71 += local12.method5229();
				if (local356 > local331) {
					local331 = local356;
				}
			}
			this.anIntArray687[local322] = local331 + 1;
			if (local327 == local331 + 1) {
				this.anIntArrayArray82[local322] = null;
			}
		}
		if (!local56) {
			return;
		}
		this.anIntArrayArray81 = new int[local73 + 1][];
		this.aClass3Array1 = new Class3[local73 + 1];
		for (local322 = 0; local322 < this.anInt8969; local322++) {
			local327 = this.anIntArray688[local322];
			local331 = this.anIntArray686[local327];
			this.anIntArrayArray81[local327] = new int[this.anIntArray687[local327]];
			for (local339 = 0; local339 < this.anIntArray687[local327]; local339++) {
				this.anIntArrayArray81[local327][local339] = -1;
			}
			for (local356 = 0; local356 < local331; local356++) {
				@Pc(466) int local466;
				if (this.anIntArrayArray82[local327] == null) {
					local466 = local356;
				} else {
					local466 = this.anIntArrayArray82[local327][local356];
				}
				this.anIntArrayArray81[local327][local466] = local12.method5198();
			}
			this.aClass3Array1[local327] = new Class3(this.anIntArrayArray81[local327]);
		}
	}
}
