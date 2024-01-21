import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub3_Sub2_Sub3 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
	public int anInt353;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
	public int anInt351;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
	public int anInt352;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
	public int anInt349;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
	public int anInt350;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(ILclient!tb;Ljava/lang/String;I)V")
	public Class1_Sub3_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(26) Class1_Sub3_Sub3 local26 = new Class1_Sub3_Sub3(arg1.method428(null, arg2 + ".dat"), (byte) 63);
		@Pc(36) Class1_Sub3_Sub3 local36 = new Class1_Sub3_Sub3(arg1.method428(null, "index.dat"), (byte) 63);
		local36.anInt394 = local26.method333();
		this.anInt353 = local36.method333();
		this.anInt354 = local36.method333();
		@Pc(57) int local57 = local36.method331();
		this.anIntArray151 = new int[local57];
		for (@Pc(63) int local63 = 0; local63 < local57 - 1; local63++) {
			this.anIntArray151[local63 + 1] = local36.method335();
		}
		for (@Pc(81) int local81 = 0; local81 < arg3; local81++) {
			local36.anInt394 += 2;
			local26.anInt394 += local36.method333() * local36.method333();
			local36.anInt394++;
		}
		this.anInt351 = local36.method331();
		this.anInt352 = local36.method331();
		this.anInt349 = local36.method333();
		this.anInt350 = local36.method333();
		@Pc(128) int local128 = local36.method331();
		@Pc(134) int local134 = this.anInt349 * this.anInt350;
		this.aByteArray3 = new byte[local134];
		@Pc(142) int local142;
		if (local128 == 0) {
			for (local142 = 0; local142 < local134; local142++) {
				this.aByteArray3[local142] = local26.method332();
			}
		} else if (local128 == 1) {
			for (local142 = 0; local142 < this.anInt349; local142++) {
				for (@Pc(164) int local164 = 0; local164 < this.anInt350; local164++) {
					this.aByteArray3[local142 + local164 * this.anInt349] = local26.method332();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public void method256() {
		this.anInt353 /= 2;
		this.anInt354 /= 2;
		@Pc(20) byte[] local20 = new byte[this.anInt353 * this.anInt354];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt350; local24++) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt349; local28++) {
				local20[(local28 + this.anInt351 >> 1) + (local24 + this.anInt352 >> 1) * this.anInt353] = this.aByteArray3[local22++];
			}
		}
		this.aByteArray3 = local20;
		this.anInt349 = this.anInt353;
		this.anInt350 = this.anInt354;
		this.anInt351 = 0;
		this.anInt352 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public void method257() {
		if (this.anInt349 == this.anInt353 && this.anInt350 == this.anInt354) {
			return;
		}
		@Pc(25) byte[] local25 = new byte[this.anInt353 * this.anInt354];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt350; local29++) {
			for (@Pc(33) int local33 = 0; local33 < this.anInt349; local33++) {
				local25[local33 + this.anInt351 + (local29 + this.anInt352) * this.anInt353] = this.aByteArray3[local27++];
			}
		}
		this.aByteArray3 = local25;
		this.anInt349 = this.anInt353;
		this.anInt350 = this.anInt354;
		this.anInt351 = 0;
		this.anInt352 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
	public void method258() {
		@Pc(8) byte[] local8 = new byte[this.anInt349 * this.anInt350];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt350; local12++) {
			for (@Pc(19) int local19 = this.anInt349 - 1; local19 >= 0; local19--) {
				local8[local10++] = this.aByteArray3[local19 + local12 * this.anInt349];
			}
		}
		this.aByteArray3 = local8;
		this.anInt351 = this.anInt353 - this.anInt349 - this.anInt351;
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
	public void method259() {
		@Pc(8) byte[] local8 = new byte[this.anInt349 * this.anInt350];
		@Pc(10) int local10 = 0;
		for (@Pc(15) int local15 = this.anInt350 - 1; local15 >= 0; local15--) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt349; local19++) {
				local8[local10++] = this.aByteArray3[local19 + local15 * this.anInt349];
			}
		}
		this.aByteArray3 = local8;
		this.anInt352 = this.anInt354 - this.anInt350 - this.anInt352;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZI)V")
	public void method260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 += this.anInt351;
		arg1 += this.anInt352;
		@Pc(20) int local20 = arg0 + arg1 * Class1_Sub3_Sub2.anInt367;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = this.anInt350;
		@Pc(28) int local28 = this.anInt349;
		@Pc(32) int local32 = Class1_Sub3_Sub2.anInt367 - local28;
		@Pc(34) int local34 = 0;
		@Pc(41) int local41;
		if (arg1 < Class1_Sub3_Sub2.anInt369) {
			local41 = Class1_Sub3_Sub2.anInt369 - arg1;
			local25 -= local41;
			arg1 = Class1_Sub3_Sub2.anInt369;
			local22 = local41 * local28;
			local20 += local41 * Class1_Sub3_Sub2.anInt367;
		}
		if (arg1 + local25 > Class1_Sub3_Sub2.anInt370) {
			local25 -= arg1 + local25 - Class1_Sub3_Sub2.anInt370;
		}
		if (arg0 < Class1_Sub3_Sub2.anInt371) {
			local41 = Class1_Sub3_Sub2.anInt371 - arg0;
			local28 -= local41;
			arg0 = Class1_Sub3_Sub2.anInt371;
			local22 += local41;
			local20 += local41;
			local34 = local41;
			local32 += local41;
		}
		if (arg0 + local28 > Class1_Sub3_Sub2.anInt372) {
			local41 = arg0 + local28 - Class1_Sub3_Sub2.anInt372;
			local28 -= local41;
			local34 += local41;
			local32 += local41;
		}
		if (local28 > 0 && local25 > 0) {
			this.method261(local25, this.aByteArray3, this.anIntArray151, local28, local20, local22, Class1_Sub3_Sub2.anIntArray153, local32, local34);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[B[IIII[IIII)V")
	private void method261(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(6) int local6 = -(arg3 >> 2);
		@Pc(11) int local11 = -(arg3 & 0x3);
		for (@Pc(14) int local14 = -arg0; local14 < 0; local14++) {
			for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
				@Pc(25) byte local25 = arg1[arg5++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[local25 & 0xFF];
				}
				local25 = arg1[arg5++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[local25 & 0xFF];
				}
				local25 = arg1[arg5++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[local25 & 0xFF];
				}
				local25 = arg1[arg5++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[local25 & 0xFF];
				}
			}
			for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
				@Pc(108) byte local108 = arg1[arg5++];
				if (local108 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[local108 & 0xFF];
				}
			}
			arg4 += arg7;
			arg5 += arg8;
		}
	}
}
