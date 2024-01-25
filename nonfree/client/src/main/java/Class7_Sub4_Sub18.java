import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class7_Sub4_Sub18 extends Class7_Sub4 {

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "[Lclient!gh;")
	public Class91[] aClass91Array1;

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
	private final int anInt7367;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I)V")
	public Class7_Sub4_Sub18(@OriginalArg(0) int arg0) {
		this.anInt7367 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Z")
	public boolean method5663(@OriginalArg(0) int arg0) {
		return this.aClass91Array1[arg0].aBoolean144;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)Z")
	public boolean method5665(@OriginalArg(1) int arg0) {
		return this.aClass91Array1[arg0].aBoolean145;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)Z")
	public boolean method5666(@OriginalArg(1) int arg0) {
		return this.aClass91Array1[arg0].aBoolean146;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z")
	public boolean method5669() {
		if (this.aClass91Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray24 == null) {
			if (!Static220.aClass178_61.method3843(this.anInt7367)) {
				return false;
			}
			@Pc(27) int[] local27 = Static220.aClass178_61.method3819(this.anInt7367);
			this.aByteArrayArray24 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray24[local34] = Static220.aClass178_61.method3838(local27[local34], this.anInt7367);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray24.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray24[local34];
			local78 = local64[1] & 0xFF | (local64[0] & 0xFF) << 8;
			local55 &= Static422.aClass178_132.method3848(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(99) Class85 local99 = new Class85();
		local78 = Static220.aClass178_61.method3833(this.anInt7367);
		this.aClass91Array1 = new Class91[local78];
		@Pc(115) int[] local115 = Static220.aClass178_61.method3819(this.anInt7367);
		for (@Pc(117) int local117 = 0; local117 < local115.length; local117++) {
			@Pc(124) byte[] local124 = this.aByteArrayArray24[local117];
			@Pc(138) int local138 = local124[1] & 0xFF | (local124[0] & 0xFF) << 8;
			@Pc(140) Class7_Sub26 local140 = null;
			for (@Pc(145) Class7_Sub26 local145 = (Class7_Sub26) local99.method2010(); local145 != null; local145 = (Class7_Sub26) local99.method2000()) {
				if (local138 == local145.anInt3238) {
					local140 = local145;
					break;
				}
			}
			if (local140 == null) {
				local140 = new Class7_Sub26(local138, Static422.aClass178_132.method3823(local138));
				local99.method2011(local140);
			}
			this.aClass91Array1[local115[local117]] = new Class91(local124, local140);
		}
		this.aByteArrayArray24 = null;
		return true;
	}
}
