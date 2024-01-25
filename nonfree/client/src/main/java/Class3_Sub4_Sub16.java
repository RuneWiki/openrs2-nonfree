import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class3_Sub4_Sub16 extends Class3_Sub4 {

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "[Lclient!tr;")
	public Class238[] aClass238Array1;

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
	private final int anInt7528;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub16(@OriginalArg(0) int arg0) {
		this.anInt7528 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)Z")
	public boolean method5868(@OriginalArg(0) int arg0) {
		return this.aClass238Array1[arg0].aBoolean568;
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)Z")
	public boolean method5869() {
		if (this.aClass238Array1 != null) {
			return true;
		}
		@Pc(32) int local32;
		if (this.aByteArrayArray24 == null) {
			if (!Static237.aClass32_55.method795(this.anInt7528)) {
				return false;
			}
			@Pc(25) int[] local25 = Static237.aClass32_55.method802(this.anInt7528);
			this.aByteArrayArray24 = new byte[local25.length][];
			for (local32 = 0; local32 < local25.length; local32++) {
				this.aByteArrayArray24[local32] = Static237.aClass32_55.method785(local25[local32], this.anInt7528);
			}
		}
		@Pc(52) boolean local52 = true;
		@Pc(74) int local74;
		for (local32 = 0; local32 < this.aByteArrayArray24.length; local32++) {
			@Pc(60) byte[] local60 = this.aByteArrayArray24[local32];
			local74 = local60[1] & 0xFF | (local60[0] & 0xFF) << 8;
			local52 &= Static288.aClass32_66.method800(local74);
		}
		if (!local52) {
			return false;
		}
		@Pc(95) Class243 local95 = new Class243();
		local74 = Static237.aClass32_55.method790(this.anInt7528);
		this.aClass238Array1 = new Class238[local74];
		@Pc(111) int[] local111 = Static237.aClass32_55.method802(this.anInt7528);
		for (@Pc(113) int local113 = 0; local113 < local111.length; local113++) {
			@Pc(119) byte[] local119 = this.aByteArrayArray24[local113];
			@Pc(133) int local133 = local119[1] & 0xFF | (local119[0] & 0xFF) << 8;
			@Pc(135) Class3_Sub28 local135 = null;
			for (@Pc(140) Class3_Sub28 local140 = (Class3_Sub28) local95.method5208(); local140 != null; local140 = (Class3_Sub28) local95.method5203()) {
				if (local133 == local140.anInt4003) {
					local135 = local140;
					break;
				}
			}
			if (local135 == null) {
				local135 = new Class3_Sub28(local133, Static288.aClass32_66.method811(local133));
				local95.method5198(local135);
			}
			this.aClass238Array1[local111[local113]] = new Class238(local119, local135);
		}
		this.aByteArrayArray24 = null;
		return true;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Z")
	public boolean method5870(@OriginalArg(1) int arg0) {
		return this.aClass238Array1[arg0].aBoolean566;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)Z")
	public boolean method5872(@OriginalArg(0) int arg0) {
		return this.aClass238Array1[arg0].aBoolean567;
	}
}
