import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class6_Sub1_Sub5 extends Class6_Sub1 {

	@OriginalMember(owner = "client!cq", name = "x", descriptor = "[Lclient!ua;")
	public Class241[] aClass241Array1;

	@OriginalMember(owner = "client!cq", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
	private final int anInt1217;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(I)V")
	public Class6_Sub1_Sub5(@OriginalArg(0) int arg0) {
		this.anInt1217 = arg0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZI)Z")
	public boolean method1090(@OriginalArg(1) int arg0) {
		return this.aClass241Array1[arg0].aBoolean444;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Z")
	public boolean method1092(@OriginalArg(1) int arg0) {
		return this.aClass241Array1[arg0].aBoolean443;
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(II)Z")
	public boolean method1094(@OriginalArg(0) int arg0) {
		return this.aClass241Array1[arg0].aBoolean445;
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(B)Z")
	public boolean method1095() {
		if (this.aClass241Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray12 == null) {
			if (!Static362.aClass158_80.method3694(this.anInt1217)) {
				return false;
			}
			@Pc(27) int[] local27 = Static362.aClass158_80.method3687(this.anInt1217);
			this.aByteArrayArray12 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray12[local34] = Static362.aClass158_80.method3672(local27[local34], this.anInt1217);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray12.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray12[local34];
			local82 = local68[1] & 0xFF | (local68[0] & 0xFF) << 8;
			local59 &= Static397.aClass158_84.method3686(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(103) Class88 local103 = new Class88();
		local82 = Static362.aClass158_80.method3683(this.anInt1217);
		this.aClass241Array1 = new Class241[local82];
		@Pc(119) int[] local119 = Static362.aClass158_80.method3687(this.anInt1217);
		for (@Pc(121) int local121 = 0; local121 < local119.length; local121++) {
			@Pc(128) byte[] local128 = this.aByteArrayArray12[local121];
			@Pc(142) int local142 = local128[1] & 0xFF | (local128[0] & 0xFF) << 8;
			@Pc(144) Class6_Sub9 local144 = null;
			for (@Pc(149) Class6_Sub9 local149 = (Class6_Sub9) local103.method1882(); local149 != null; local149 = (Class6_Sub9) local103.method1891()) {
				if (local149.anInt1600 == local142) {
					local144 = local149;
					break;
				}
			}
			if (local144 == null) {
				local144 = new Class6_Sub9(local142, Static397.aClass158_84.method3691(local142));
				local103.method1878(local144);
			}
			this.aClass241Array1[local119[local121]] = new Class241(local128, local144);
		}
		this.aByteArrayArray12 = null;
		return true;
	}
}
