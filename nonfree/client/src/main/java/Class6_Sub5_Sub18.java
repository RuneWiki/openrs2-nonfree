import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class6_Sub5_Sub18 extends Class6_Sub5 {

	@OriginalMember(owner = "client!jea", name = "x", descriptor = "[Lclient!ag;")
	public Class13[] aClass13Array1;

	@OriginalMember(owner = "client!jea", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!jea", name = "B", descriptor = "I")
	private final int anInt5628;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(I)V")
	public Class6_Sub5_Sub18(@OriginalArg(0) int arg0) {
		this.anInt5628 = arg0;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)Z")
	public boolean method4645() {
		if (this.aClass13Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray12 == null) {
			@Pc(15) Class223 local15 = Static322.aClass223_67;
			synchronized (Static322.aClass223_67) {
				if (!Static322.aClass223_67.method5965(this.anInt5628)) {
					return false;
				}
				local35 = Static322.aClass223_67.method5952(this.anInt5628);
				this.aByteArrayArray12 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray12[local42] = Static322.aClass223_67.method5954(local35[local42], this.anInt5628);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray12.length; local71++) {
			@Pc(78) byte[] local78 = this.aByteArrayArray12[local71];
			@Pc(83) Class6_Sub8 local83 = new Class6_Sub8(local78);
			local83.anInt10061 = 1;
			local42 = local83.method8220();
			@Pc(92) Class223 local92 = Static25.aClass223_9;
			synchronized (Static25.aClass223_9) {
				local69 &= Static25.aClass223_9.method5951(local42);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(125) Class163 local125 = new Class163();
		@Pc(127) Class223 local127 = Static322.aClass223_67;
		synchronized (Static322.aClass223_67) {
			@Pc(135) int local135 = Static322.aClass223_67.method5970(this.anInt5628);
			this.aClass13Array1 = new Class13[local135];
			local35 = Static322.aClass223_67.method5952(this.anInt5628);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(160) byte[] local160 = this.aByteArrayArray12[local42];
			@Pc(165) Class6_Sub8 local165 = new Class6_Sub8(local160);
			local165.anInt10061 = 1;
			@Pc(172) int local172 = local165.method8220();
			@Pc(174) Class6_Sub2 local174 = null;
			for (@Pc(179) Class6_Sub2 local179 = (Class6_Sub2) local125.method4966(); local179 != null; local179 = (Class6_Sub2) local125.method4965()) {
				if (local172 == local179.anInt555) {
					local174 = local179;
					break;
				}
			}
			if (local174 == null) {
				@Pc(199) Class223 local199 = Static25.aClass223_9;
				synchronized (Static25.aClass223_9) {
					local174 = new Class6_Sub2(local172, Static25.aClass223_9.method5942(local172));
				}
				local125.method4967(local174);
			}
			this.aClass13Array1[local35[local42]] = new Class13(local160, local174);
		}
		this.aByteArrayArray12 = null;
		return true;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ)Z")
	public boolean method4646(@OriginalArg(0) int arg0) {
		return this.aClass13Array1[arg0].aBoolean56;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ZI)Z")
	public boolean method4648(@OriginalArg(1) int arg0) {
		return this.aClass13Array1[arg0].aBoolean57;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)Z")
	public boolean method4650(@OriginalArg(0) int arg0) {
		return this.aClass13Array1[arg0].aBoolean58;
	}
}
