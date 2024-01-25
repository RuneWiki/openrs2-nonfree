import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class319 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
	public int[] anIntArray489;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
	public int[] anIntArray490;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	public int anInt9369;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!ica;")
	public Class138 aClass138_1;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "[I")
	public int[] anIntArray491;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "I")
	public int anInt9371;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "[I")
	public int[] anIntArray492;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "[I")
	public int[] anIntArray493;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "[Lclient!ica;")
	public Class138[] aClass138Array1;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "[I")
	public int[] anIntArray494;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "[[B")
	public byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!te", name = "s", descriptor = "I")
	public int anInt9374;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "I")
	public final int anInt9375;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "[B")
	private byte[] aByteArray91;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "([BI[B)V")
	public Class319(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt9375 = Static64.method8774(arg0.length, arg0);
		if (arg1 != this.anInt9375) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray91 = Static221.method4083(0, arg0, arg0.length);
			for (@Pc(38) int local38 = 0; local38 < 64; local38++) {
				if (this.aByteArray91[local38] != arg2[local38]) {
					throw new RuntimeException();
				}
			}
		}
		this.method7644(arg0);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([BI)V")
	private void method7644(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class6_Sub8 local12 = new Class6_Sub8(Static184.method3442(arg0));
		@Pc(16) int local16 = local12.method8246();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt9374 = 0;
		} else {
			this.anInt9374 = local12.method8236();
		}
		@Pc(45) int local45 = local12.method8246();
		@Pc(53) boolean local53 = (local45 & 0x1) != 0;
		this.anInt9369 = local12.method8220();
		@Pc(69) boolean local69 = (local45 & 0x2) != 0;
		@Pc(71) int local71 = 0;
		this.anIntArray490 = new int[this.anInt9369];
		@Pc(78) int local78 = -1;
		for (@Pc(80) int local80 = 0; local80 < this.anInt9369; local80++) {
			this.anIntArray490[local80] = local71 += local12.method8220();
			if (this.anIntArray490[local80] > local78) {
				local78 = this.anIntArray490[local80];
			}
		}
		this.anInt9371 = local78 + 1;
		if (local69) {
			this.aByteArrayArray30 = new byte[this.anInt9371][];
		}
		this.anIntArray492 = new int[this.anInt9371];
		this.anIntArrayArray52 = new int[this.anInt9371][];
		this.anIntArray493 = new int[this.anInt9371];
		this.anIntArray491 = new int[this.anInt9371];
		this.anIntArray494 = new int[this.anInt9371];
		@Pc(155) int local155;
		@Pc(173) int local173;
		if (local53) {
			this.anIntArray489 = new int[this.anInt9371];
			for (local155 = 0; local155 < this.anInt9371; local155++) {
				this.anIntArray489[local155] = -1;
			}
			for (local173 = 0; local173 < this.anInt9369; local173++) {
				this.anIntArray489[this.anIntArray490[local173]] = local12.method8236();
			}
			this.aClass138_1 = new Class138(this.anIntArray489);
		}
		for (local155 = 0; local155 < this.anInt9369; local155++) {
			this.anIntArray494[this.anIntArray490[local155]] = local12.method8236();
		}
		if (local69) {
			for (local173 = 0; local173 < this.anInt9369; local173++) {
				@Pc(225) byte[] local225 = new byte[64];
				local12.method8207(local225, 64, 0);
				this.aByteArrayArray30[this.anIntArray490[local173]] = local225;
			}
		}
		for (local173 = 0; local173 < this.anInt9369; local173++) {
			this.anIntArray491[this.anIntArray490[local173]] = local12.method8236();
		}
		for (@Pc(273) int local273 = 0; local273 < this.anInt9369; local273++) {
			this.anIntArray492[this.anIntArray490[local273]] = local12.method8220();
		}
		@Pc(299) int local299;
		@Pc(304) int local304;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(333) int local333;
		for (@Pc(292) int local292 = 0; local292 < this.anInt9369; local292++) {
			local299 = this.anIntArray490[local292];
			local304 = this.anIntArray492[local299];
			local71 = 0;
			this.anIntArrayArray52[local299] = new int[local304];
			local314 = -1;
			for (local316 = 0; local316 < local304; local316++) {
				local333 = this.anIntArrayArray52[local299][local316] = local71 += local12.method8220();
				if (local333 > local314) {
					local314 = local333;
				}
			}
			this.anIntArray493[local299] = local314 + 1;
			if (local304 == local314 + 1) {
				this.anIntArrayArray52[local299] = null;
			}
		}
		if (!local53) {
			return;
		}
		this.aClass138Array1 = new Class138[local78 + 1];
		this.anIntArrayArray53 = new int[local78 + 1][];
		for (local299 = 0; local299 < this.anInt9369; local299++) {
			local304 = this.anIntArray490[local299];
			local314 = this.anIntArray492[local304];
			this.anIntArrayArray53[local304] = new int[this.anIntArray493[local304]];
			for (local316 = 0; local316 < this.anIntArray493[local304]; local316++) {
				this.anIntArrayArray53[local304][local316] = -1;
			}
			for (local333 = 0; local333 < local314; local333++) {
				@Pc(455) int local455;
				if (this.anIntArrayArray52[local304] == null) {
					local455 = local333;
				} else {
					local455 = this.anIntArrayArray52[local304][local333];
				}
				this.anIntArrayArray53[local304][local455] = local12.method8236();
			}
			this.aClass138Array1[local304] = new Class138(this.anIntArrayArray53[local304]);
		}
	}
}
