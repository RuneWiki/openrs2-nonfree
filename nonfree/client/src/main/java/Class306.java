import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class306 {

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "[I")
	public int[] anIntArray656;

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "[I")
	public int[] anIntArray657;

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "[I")
	public int[] anIntArray658;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "[I")
	public int[] anIntArray659;

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "[Lclient!na;")
	public Class236[] aClass236Array1;

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "[I")
	public int[] anIntArray660;

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
	public int anInt8585;

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
	public int anInt8586;

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "[I")
	public int[] anIntArray661;

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
	public int anInt8587;

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "Lclient!na;")
	public Class236 aClass236_1;

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "[[B")
	public byte[][] aByteArrayArray37;

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray72;

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
	public final int anInt8583;

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "[B")
	private byte[] aByteArray108;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "([BI[B)V")
	public Class306(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt8583 = Static529.method7394(arg0.length, arg0);
		if (arg1 != this.anInt8583) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray108 = Static188.method3457(0, arg0.length, arg0);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (this.aByteArray108[local40] != arg2[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method7055(arg0);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[B)V")
	private void method7055(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class4_Sub9 local12 = new Class4_Sub9(Static308.method4761(arg0));
		@Pc(16) int local16 = local12.method6015();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt8586 = local12.method6026();
		} else {
			this.anInt8586 = 0;
		}
		@Pc(45) int local45 = local12.method6015();
		@Pc(56) boolean local56 = (local45 & 0x1) != 0;
		@Pc(64) boolean local64 = (local45 & 0x2) != 0;
		this.anInt8585 = local12.method5982();
		@Pc(71) int local71 = 0;
		this.anIntArray658 = new int[this.anInt8585];
		@Pc(78) int local78 = -1;
		for (@Pc(80) int local80 = 0; local80 < this.anInt8585; local80++) {
			this.anIntArray658[local80] = local71 += local12.method5982();
			if (this.anIntArray658[local80] > local78) {
				local78 = this.anIntArray658[local80];
			}
		}
		this.anInt8587 = local78 + 1;
		this.anIntArrayArray72 = new int[this.anInt8587][];
		this.anIntArray656 = new int[this.anInt8587];
		this.anIntArray657 = new int[this.anInt8587];
		if (local64) {
			this.aByteArrayArray37 = new byte[this.anInt8587][];
		}
		this.anIntArray659 = new int[this.anInt8587];
		this.anIntArray660 = new int[this.anInt8587];
		@Pc(163) int local163;
		@Pc(177) int local177;
		if (local56) {
			this.anIntArray661 = new int[this.anInt8587];
			for (local163 = 0; local163 < this.anInt8587; local163++) {
				this.anIntArray661[local163] = -1;
			}
			for (local177 = 0; local177 < this.anInt8585; local177++) {
				this.anIntArray661[this.anIntArray658[local177]] = local12.method6026();
			}
			this.aClass236_1 = new Class236(this.anIntArray661);
		}
		for (local163 = 0; local163 < this.anInt8585; local163++) {
			this.anIntArray656[this.anIntArray658[local163]] = local12.method6026();
		}
		if (local64) {
			for (local177 = 0; local177 < this.anInt8585; local177++) {
				@Pc(233) byte[] local233 = new byte[64];
				local12.method5966(64, local233);
				this.aByteArrayArray37[this.anIntArray658[local177]] = local233;
			}
		}
		for (local177 = 0; local177 < this.anInt8585; local177++) {
			this.anIntArray660[this.anIntArray658[local177]] = local12.method6026();
		}
		for (@Pc(281) int local281 = 0; local281 < this.anInt8585; local281++) {
			this.anIntArray659[this.anIntArray658[local281]] = local12.method5982();
		}
		@Pc(313) int local313;
		@Pc(318) int local318;
		@Pc(322) int local322;
		@Pc(330) int local330;
		@Pc(347) int local347;
		for (@Pc(306) int local306 = 0; local306 < this.anInt8585; local306++) {
			local313 = this.anIntArray658[local306];
			local318 = this.anIntArray659[local313];
			local71 = 0;
			local322 = -1;
			this.anIntArrayArray72[local313] = new int[local318];
			for (local330 = 0; local330 < local318; local330++) {
				local347 = this.anIntArrayArray72[local313][local330] = local71 += local12.method5982();
				if (local322 < local347) {
					local322 = local347;
				}
			}
			this.anIntArray657[local313] = local322 + 1;
			if (local318 == local322 + 1) {
				this.anIntArrayArray72[local313] = null;
			}
		}
		if (!local56) {
			return;
		}
		this.aClass236Array1 = new Class236[local78 + 1];
		this.anIntArrayArray71 = new int[local78 + 1][];
		for (local313 = 0; local313 < this.anInt8585; local313++) {
			local318 = this.anIntArray658[local313];
			local322 = this.anIntArray659[local318];
			this.anIntArrayArray71[local318] = new int[this.anIntArray657[local318]];
			for (local330 = 0; local330 < this.anIntArray657[local318]; local330++) {
				this.anIntArrayArray71[local318][local330] = -1;
			}
			for (local347 = 0; local347 < local322; local347++) {
				@Pc(456) int local456;
				if (this.anIntArrayArray72[local318] == null) {
					local456 = local347;
				} else {
					local456 = this.anIntArrayArray72[local318][local347];
				}
				this.anIntArrayArray71[local318][local456] = local12.method6026();
			}
			this.aClass236Array1[local318] = new Class236(this.anIntArrayArray71[local318]);
		}
	}
}
