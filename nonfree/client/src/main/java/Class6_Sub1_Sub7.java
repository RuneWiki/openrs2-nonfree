import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class6_Sub1_Sub7 extends Class6_Sub1 {

	@OriginalMember(owner = "client!fv", name = "x", descriptor = "[Lclient!we;")
	public Class342[] aClass342Array1;

	@OriginalMember(owner = "client!fv", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!fv", name = "G", descriptor = "I")
	private final int anInt2701;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(I)V")
	public Class6_Sub1_Sub7(@OriginalArg(0) int arg0) {
		this.anInt2701 = arg0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)Z")
	public boolean method2234(@OriginalArg(1) int arg0) {
		return this.aClass342Array1[arg0].aBoolean656;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)Z")
	public boolean method2235(@OriginalArg(1) int arg0) {
		return this.aClass342Array1[arg0].aBoolean658;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IB)Z")
	public boolean method2239(@OriginalArg(0) int arg0) {
		return this.aClass342Array1[arg0].aBoolean657;
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(B)Z")
	public boolean method2240() {
		if (this.aClass342Array1 != null) {
			return true;
		}
		@Pc(40) int local40;
		if (this.aByteArrayArray9 == null) {
			if (!Static348.aClass251_144.method5842(this.anInt2701)) {
				return false;
			}
			@Pc(33) int[] local33 = Static348.aClass251_144.method5857(this.anInt2701);
			this.aByteArrayArray9 = new byte[local33.length][];
			for (local40 = 0; local40 < local33.length; local40++) {
				this.aByteArrayArray9[local40] = Static348.aClass251_144.method5860(this.anInt2701, local33[local40]);
			}
		}
		@Pc(61) boolean local61 = true;
		for (local40 = 0; local40 < this.aByteArrayArray9.length; local40++) {
			@Pc(70) byte[] local70 = this.aByteArrayArray9[local40];
			@Pc(75) Class6_Sub14 local75 = new Class6_Sub14(local70);
			local75.anInt7244 = 1;
			@Pc(82) int local82 = local75.method6006();
			local61 &= Static42.aClass251_152.method5859(local82);
		}
		if (!local61) {
			return false;
		}
		@Pc(103) Class275 local103 = new Class275();
		@Pc(109) int local109 = Static348.aClass251_144.method5849(this.anInt2701);
		this.aClass342Array1 = new Class342[local109];
		@Pc(119) int[] local119 = Static348.aClass251_144.method5857(this.anInt2701);
		for (@Pc(121) int local121 = 0; local121 < local119.length; local121++) {
			@Pc(128) byte[] local128 = this.aByteArrayArray9[local121];
			@Pc(133) Class6_Sub14 local133 = new Class6_Sub14(local128);
			local133.anInt7244 = 1;
			@Pc(140) int local140 = local133.method6006();
			@Pc(142) Class6_Sub35 local142 = null;
			for (@Pc(147) Class6_Sub35 local147 = (Class6_Sub35) local103.method6366(); local147 != null; local147 = (Class6_Sub35) local103.method6364()) {
				if (local140 == local147.anInt5525) {
					local142 = local147;
					break;
				}
			}
			if (local142 == null) {
				local142 = new Class6_Sub35(local140, Static42.aClass251_152.method5855(local140));
				local103.method6370(local142);
			}
			this.aClass342Array1[local119[local121]] = new Class342(local128, local142);
		}
		this.aByteArrayArray9 = null;
		return true;
	}
}
