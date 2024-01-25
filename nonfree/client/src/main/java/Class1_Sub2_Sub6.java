import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!d", name = "C", descriptor = "[Lclient!vb;")
	public Class247[] aClass247Array1;

	@OriginalMember(owner = "client!d", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!d", name = "z", descriptor = "I")
	private final int anInt1338;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub6(@OriginalArg(0) int arg0) {
		this.anInt1338 = arg0;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(BI)Z")
	public boolean method1120(@OriginalArg(1) int arg0) {
		return this.aClass247Array1[arg0].aBoolean468;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	public boolean method1121(@OriginalArg(0) int arg0) {
		return this.aClass247Array1[arg0].aBoolean466;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)Z")
	public boolean method1122() {
		if (this.aClass247Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray28 == null) {
			if (!Static49.aClass250_67.method5649(this.anInt1338)) {
				return false;
			}
			@Pc(27) int[] local27 = Static49.aClass250_67.method5671(this.anInt1338);
			this.aByteArrayArray28 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray28[local34] = Static49.aClass250_67.method5667(local27[local34], this.anInt1338);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray28.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray28[local34];
			local78 = (local64[0] & 0xFF) << 8 | local64[1] & 0xFF;
			local55 &= Static347.aClass250_71.method5668(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(103) Class266 local103 = new Class266();
		local78 = Static49.aClass250_67.method5653(this.anInt1338);
		this.aClass247Array1 = new Class247[local78];
		@Pc(119) int[] local119 = Static49.aClass250_67.method5671(this.anInt1338);
		for (@Pc(121) int local121 = 0; local121 < local119.length; local121++) {
			@Pc(128) byte[] local128 = this.aByteArrayArray28[local121];
			@Pc(142) int local142 = (local128[0] & 0xFF) << 8 | local128[1] & 0xFF;
			@Pc(144) Class1_Sub16 local144 = null;
			for (@Pc(149) Class1_Sub16 local149 = (Class1_Sub16) local103.method6000(); local149 != null; local149 = (Class1_Sub16) local103.method5994()) {
				if (local149.anInt2342 == local142) {
					local144 = local149;
					break;
				}
			}
			if (local144 == null) {
				local144 = new Class1_Sub16(local142, Static347.aClass250_71.method5644(local142));
				local103.method5998(local144);
			}
			this.aClass247Array1[local119[local121]] = new Class247(local128, local144);
		}
		this.aByteArrayArray28 = null;
		return true;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(BI)Z")
	public boolean method1125(@OriginalArg(1) int arg0) {
		return this.aClass247Array1[arg0].aBoolean467;
	}
}
