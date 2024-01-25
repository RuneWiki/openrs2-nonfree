import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class7_Sub1_Sub14 extends Class7_Sub1 {

	@OriginalMember(owner = "client!ok", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!ok", name = "F", descriptor = "[Lclient!oq;")
	public Class157[] aClass157Array1;

	@OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
	private final int anInt4607;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I)V")
	public Class7_Sub1_Sub14(@OriginalArg(0) int arg0) {
		this.anInt4607 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Z")
	public boolean method4053(@OriginalArg(0) int arg0) {
		return this.aClass157Array1[arg0].aBoolean348;
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "(B)Z")
	public boolean method4057() {
		if (this.aClass157Array1 != null) {
			return true;
		}
		@Pc(32) int local32;
		if (this.aByteArrayArray13 == null) {
			if (!Static162.aClass180_27.method4572(this.anInt4607)) {
				return false;
			}
			@Pc(25) int[] local25 = Static162.aClass180_27.method4568(this.anInt4607);
			this.aByteArrayArray13 = new byte[local25.length][];
			for (local32 = 0; local32 < local25.length; local32++) {
				this.aByteArrayArray13[local32] = Static162.aClass180_27.method4560(local25[local32], this.anInt4607);
			}
		}
		@Pc(54) boolean local54 = true;
		@Pc(76) int local76;
		for (local32 = 0; local32 < this.aByteArrayArray13.length; local32++) {
			@Pc(62) byte[] local62 = this.aByteArrayArray13[local32];
			local76 = local62[1] & 0xFF | (local62[0] & 0xFF) << 8;
			local54 &= Static177.aClass180_47.method4562(local76);
		}
		if (!local54) {
			return false;
		}
		@Pc(107) Class74 local107 = new Class74();
		local76 = Static162.aClass180_27.method4553(this.anInt4607);
		this.aClass157Array1 = new Class157[local76];
		@Pc(123) int[] local123 = Static162.aClass180_27.method4568(this.anInt4607);
		for (@Pc(125) int local125 = 0; local125 < local123.length; local125++) {
			@Pc(131) byte[] local131 = this.aByteArrayArray13[local125];
			@Pc(145) int local145 = local131[1] & 0xFF | (local131[0] & 0xFF) << 8;
			@Pc(147) Class7_Sub42 local147 = null;
			for (@Pc(152) Class7_Sub42 local152 = (Class7_Sub42) local107.method1793(); local152 != null; local152 = (Class7_Sub42) local107.method1798()) {
				if (local152.anInt6645 == local145) {
					local147 = local152;
					break;
				}
			}
			if (local147 == null) {
				local147 = new Class7_Sub42(local145, Static177.aClass180_47.method4583(local145));
				local107.method1802(local147);
			}
			this.aClass157Array1[local123[local125]] = new Class157(local131, local147);
		}
		this.aByteArrayArray13 = null;
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Z")
	public boolean method4058(@OriginalArg(1) int arg0) {
		return this.aClass157Array1[arg0].aBoolean349;
	}
}
