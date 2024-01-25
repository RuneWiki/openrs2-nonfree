import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uia")
public final class Class345 {

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "[I")
	public int[] anIntArray586;

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
	public int anInt9658;

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "[I")
	public int[] anIntArray587;

	@OriginalMember(owner = "client!uia", name = "e", descriptor = "[I")
	public int[] anIntArray589;

	@OriginalMember(owner = "client!uia", name = "h", descriptor = "[I")
	public int[] anIntArray591;

	@OriginalMember(owner = "client!uia", name = "i", descriptor = "I")
	public int anInt9659;

	@OriginalMember(owner = "client!uia", name = "k", descriptor = "Lclient!go;")
	public Class119 aClass119_1;

	@OriginalMember(owner = "client!uia", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
	public int anInt9661;

	@OriginalMember(owner = "client!uia", name = "n", descriptor = "[I")
	public int[] anIntArray592;

	@OriginalMember(owner = "client!uia", name = "o", descriptor = "[[B")
	public byte[][] aByteArrayArray158;

	@OriginalMember(owner = "client!uia", name = "q", descriptor = "[I")
	public int[] anIntArray593;

	@OriginalMember(owner = "client!uia", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!uia", name = "t", descriptor = "[Lclient!go;")
	public Class119[] aClass119Array1;

	@OriginalMember(owner = "client!uia", name = "u", descriptor = "I")
	public final int anInt9664;

	@OriginalMember(owner = "client!uia", name = "g", descriptor = "[B")
	private byte[] aByteArray109;

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "([BI[B)V")
	public Class345(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt9664 = Static240.method4159(arg0, arg0.length);
		if (arg1 != this.anInt9664) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray109 = Static231.method3959(0, arg0, arg0.length);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (arg2[local40] != this.aByteArray109[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method8184(arg0);
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(B[B)V")
	private void method8184(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class6_Sub40 local12 = new Class6_Sub40(Static130.method2126(arg0));
		@Pc(16) int local16 = local12.method8604();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt9661 = 0;
		} else {
			this.anInt9661 = local12.method8579();
		}
		@Pc(47) int local47 = local12.method8604();
		@Pc(58) boolean local58 = (local47 & 0x1) != 0;
		this.anInt9658 = local12.method8571();
		@Pc(71) boolean local71 = (local47 & 0x2) != 0;
		@Pc(73) int local73 = 0;
		@Pc(75) int local75 = -1;
		this.anIntArray586 = new int[this.anInt9658];
		for (@Pc(82) int local82 = 0; local82 < this.anInt9658; local82++) {
			this.anIntArray586[local82] = local73 += local12.method8571();
			if (this.anIntArray586[local82] > local75) {
				local75 = this.anIntArray586[local82];
			}
		}
		this.anInt9659 = local75 + 1;
		this.anIntArray592 = new int[this.anInt9659];
		this.anIntArrayArray53 = new int[this.anInt9659][];
		this.anIntArray587 = new int[this.anInt9659];
		this.anIntArray591 = new int[this.anInt9659];
		this.anIntArray589 = new int[this.anInt9659];
		if (local71) {
			this.aByteArrayArray158 = new byte[this.anInt9659][];
		}
		@Pc(161) int local161;
		@Pc(175) int local175;
		if (local58) {
			this.anIntArray593 = new int[this.anInt9659];
			for (local161 = 0; local161 < this.anInt9659; local161++) {
				this.anIntArray593[local161] = -1;
			}
			for (local175 = 0; local175 < this.anInt9658; local175++) {
				this.anIntArray593[this.anIntArray586[local175]] = local12.method8579();
			}
			this.aClass119_1 = new Class119(this.anIntArray593);
		}
		for (local161 = 0; local161 < this.anInt9658; local161++) {
			this.anIntArray592[this.anIntArray586[local161]] = local12.method8579();
		}
		if (local71) {
			for (local175 = 0; local175 < this.anInt9658; local175++) {
				@Pc(231) byte[] local231 = new byte[64];
				local12.method8595(local231, 64, 0);
				this.aByteArrayArray158[this.anIntArray586[local175]] = local231;
			}
		}
		for (local175 = 0; local175 < this.anInt9658; local175++) {
			this.anIntArray587[this.anIntArray586[local175]] = local12.method8579();
		}
		for (@Pc(277) int local277 = 0; local277 < this.anInt9658; local277++) {
			this.anIntArray589[this.anIntArray586[local277]] = local12.method8571();
		}
		@Pc(309) int local309;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(326) int local326;
		@Pc(343) int local343;
		for (@Pc(302) int local302 = 0; local302 < this.anInt9658; local302++) {
			local309 = this.anIntArray586[local302];
			local314 = this.anIntArray589[local309];
			local73 = 0;
			this.anIntArrayArray53[local309] = new int[local314];
			local324 = -1;
			for (local326 = 0; local326 < local314; local326++) {
				local343 = this.anIntArrayArray53[local309][local326] = local73 += local12.method8571();
				if (local343 > local324) {
					local324 = local343;
				}
			}
			this.anIntArray591[local309] = local324 + 1;
			if (local324 + 1 == local314) {
				this.anIntArrayArray53[local309] = null;
			}
		}
		if (!local58) {
			return;
		}
		this.aClass119Array1 = new Class119[local75 + 1];
		this.anIntArrayArray54 = new int[local75 + 1][];
		for (local309 = 0; local309 < this.anInt9658; local309++) {
			local314 = this.anIntArray586[local309];
			local324 = this.anIntArray589[local314];
			this.anIntArrayArray54[local314] = new int[this.anIntArray591[local314]];
			for (local326 = 0; local326 < this.anIntArray591[local314]; local326++) {
				this.anIntArrayArray54[local314][local326] = -1;
			}
			for (local343 = 0; local343 < local324; local343++) {
				@Pc(440) int local440;
				if (this.anIntArrayArray53[local314] == null) {
					local440 = local343;
				} else {
					local440 = this.anIntArrayArray53[local314][local343];
				}
				this.anIntArrayArray54[local314][local440] = local12.method8579();
			}
			this.aClass119Array1[local314] = new Class119(this.anIntArrayArray54[local314]);
		}
	}
}
