import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class3_Sub3_Sub17 extends Class3_Sub3 {

	@OriginalMember(owner = "client!vs", name = "y", descriptor = "[Lclient!dt;")
	public Class53[] aClass53Array1;

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!vs", name = "C", descriptor = "I")
	private final int anInt7444;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(I)V")
	public Class3_Sub3_Sub17(@OriginalArg(0) int arg0) {
		this.anInt7444 = arg0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)Z")
	public boolean method6063(@OriginalArg(1) int arg0) {
		return this.aClass53Array1[arg0].aBoolean94;
	}

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "(I)Z")
	public boolean method6065() {
		if (this.aClass53Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray32 == null) {
			if (!Static356.aClass250_100.method5793(this.anInt7444)) {
				return false;
			}
			@Pc(27) int[] local27 = Static356.aClass250_100.method5818(this.anInt7444);
			this.aByteArrayArray32 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray32[local34] = Static356.aClass250_100.method5806(this.anInt7444, local27[local34]);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray32.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray32[local34];
			local82 = local68[1] & 0xFF | (local68[0] & 0xFF) << 8;
			local59 &= Static269.aClass250_57.method5813(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(103) Class193 local103 = new Class193();
		local82 = Static356.aClass250_100.method5815(this.anInt7444);
		this.aClass53Array1 = new Class53[local82];
		@Pc(127) int[] local127 = Static356.aClass250_100.method5818(this.anInt7444);
		for (@Pc(129) int local129 = 0; local129 < local127.length; local129++) {
			@Pc(136) byte[] local136 = this.aByteArrayArray32[local129];
			@Pc(150) int local150 = (local136[0] & 0xFF) << 8 | local136[1] & 0xFF;
			@Pc(152) Class3_Sub24 local152 = null;
			for (@Pc(157) Class3_Sub24 local157 = (Class3_Sub24) local103.method4519(); local157 != null; local157 = (Class3_Sub24) local103.method4525()) {
				if (local150 == local157.anInt3105) {
					local152 = local157;
					break;
				}
			}
			if (local152 == null) {
				local152 = new Class3_Sub24(local150, Static269.aClass250_57.method5814(local150));
				local103.method4527(local152);
			}
			this.aClass53Array1[local127[local129]] = new Class53(local136, local152);
		}
		this.aByteArrayArray32 = null;
		return true;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)Z")
	public boolean method6066(@OriginalArg(1) int arg0) {
		return this.aClass53Array1[arg0].aBoolean93;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(II)Z")
	public boolean method6069(@OriginalArg(1) int arg0) {
		return this.aClass53Array1[arg0].aBoolean95;
	}
}
