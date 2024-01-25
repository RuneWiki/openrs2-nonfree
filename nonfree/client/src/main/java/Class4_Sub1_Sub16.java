import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class4_Sub1_Sub16 extends Class4_Sub1 {

	@OriginalMember(owner = "client!om", name = "D", descriptor = "[Lclient!db;")
	public Class43[] aClass43Array1;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "I")
	private final int anInt4803;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I)V")
	public Class4_Sub1_Sub16(@OriginalArg(0) int arg0) {
		this.anInt4803 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Z")
	public boolean method3937(@OriginalArg(0) int arg0) {
		return this.aClass43Array1[arg0].aBoolean90;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)Z")
	public boolean method3938(@OriginalArg(0) int arg0) {
		return this.aClass43Array1[arg0].aBoolean91;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Z")
	public boolean method3939() {
		if (this.aClass43Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray16 == null) {
			if (!Static282.aClass11_124.method272(this.anInt4803)) {
				return false;
			}
			@Pc(27) int[] local27 = Static282.aClass11_124.method286(this.anInt4803);
			this.aByteArrayArray16 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray16[local34] = Static282.aClass11_124.method288(local27[local34], this.anInt4803);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray16.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray16[local34];
			local78 = local64[1] & 0xFF | (local64[0] & 0xFF) << 8;
			local55 &= Static326.aClass11_145.method274(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(103) Class130 local103 = new Class130();
		local78 = Static282.aClass11_124.method292(this.anInt4803);
		this.aClass43Array1 = new Class43[local78];
		@Pc(119) int[] local119 = Static282.aClass11_124.method286(this.anInt4803);
		for (@Pc(121) int local121 = 0; local121 < local119.length; local121++) {
			@Pc(128) byte[] local128 = this.aByteArrayArray16[local121];
			@Pc(142) int local142 = (local128[0] & 0xFF) << 8 | local128[1] & 0xFF;
			@Pc(144) Class4_Sub10 local144 = null;
			for (@Pc(149) Class4_Sub10 local149 = (Class4_Sub10) local103.method3499(); local149 != null; local149 = (Class4_Sub10) local103.method3512()) {
				if (local149.anInt1945 == local142) {
					local144 = local149;
					break;
				}
			}
			if (local144 == null) {
				local144 = new Class4_Sub10(local142, Static326.aClass11_145.method300(local142));
				local103.method3510(local144);
			}
			this.aClass43Array1[local119[local121]] = new Class43(local128, local144);
		}
		this.aByteArrayArray16 = null;
		return true;
	}
}
