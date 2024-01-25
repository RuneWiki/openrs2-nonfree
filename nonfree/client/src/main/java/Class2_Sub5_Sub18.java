import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class2_Sub5_Sub18 extends Class2_Sub5 {

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "[Lclient!wj;")
	public Class266[] aClass266Array1;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "[[B")
	private byte[][] aByteArrayArray61;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
	private final int anInt7150;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(I)V")
	public Class2_Sub5_Sub18(@OriginalArg(0) int arg0) {
		this.anInt7150 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
	public boolean method5626(@OriginalArg(0) int arg0) {
		return this.aClass266Array1[arg0].aBoolean521;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)Z")
	public boolean method5627() {
		if (this.aClass266Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray61 == null) {
			if (!Static180.aClass54_52.method1103(this.anInt7150)) {
				return false;
			}
			@Pc(27) int[] local27 = Static180.aClass54_52.method1113(this.anInt7150);
			this.aByteArrayArray61 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray61[local34] = Static180.aClass54_52.method1126(this.anInt7150, local27[local34]);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray61.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray61[local34];
			local78 = (local64[0] & 0xFF) << 8 | local64[1] & 0xFF;
			local55 &= Static161.aClass54_101.method1131(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(99) Class156 local99 = new Class156();
		local78 = Static180.aClass54_52.method1123(this.anInt7150);
		this.aClass266Array1 = new Class266[local78];
		@Pc(115) int[] local115 = Static180.aClass54_52.method1113(this.anInt7150);
		for (@Pc(117) int local117 = 0; local117 < local115.length; local117++) {
			@Pc(124) byte[] local124 = this.aByteArrayArray61[local117];
			@Pc(138) int local138 = local124[1] & 0xFF | (local124[0] & 0xFF) << 8;
			@Pc(140) Class2_Sub4 local140 = null;
			for (@Pc(145) Class2_Sub4 local145 = (Class2_Sub4) local99.method3155(); local145 != null; local145 = (Class2_Sub4) local99.method3150()) {
				if (local145.anInt580 == local138) {
					local140 = local145;
					break;
				}
			}
			if (local140 == null) {
				local140 = new Class2_Sub4(local138, Static161.aClass54_101.method1110(local138));
				local99.method3157(local140);
			}
			this.aClass266Array1[local115[local117]] = new Class266(local124, local140);
		}
		this.aByteArrayArray61 = null;
		return true;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)Z")
	public boolean method5629(@OriginalArg(0) int arg0) {
		return this.aClass266Array1[arg0].aBoolean522;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)Z")
	public boolean method5630(@OriginalArg(1) int arg0) {
		return this.aClass266Array1[arg0].aBoolean520;
	}
}
