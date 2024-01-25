import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class3_Sub7_Sub21 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "[Lclient!ci;")
	public Class33[] aClass33Array1;

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
	private final int anInt6237;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub21(@OriginalArg(0) int arg0) {
		this.anInt6237 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)Z")
	public boolean method5287(@OriginalArg(0) int arg0) {
		return this.aClass33Array1[arg0].aBoolean41;
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)Z")
	public boolean method5288() {
		if (this.aClass33Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray20 == null) {
			if (!Static216.aClass100_87.method2284(this.anInt6237)) {
				return false;
			}
			@Pc(27) int[] local27 = Static216.aClass100_87.method2292(this.anInt6237);
			this.aByteArrayArray20 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray20[local34] = Static216.aClass100_87.method2319(this.anInt6237, local27[local34]);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray20.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray20[local34];
			local78 = local64[1] & 0xFF | (local64[0] & 0xFF) << 8;
			local55 &= Static271.aClass100_107.method2289(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(99) Class127 local99 = new Class127();
		local78 = Static216.aClass100_87.method2309(this.anInt6237);
		this.aClass33Array1 = new Class33[local78];
		@Pc(115) int[] local115 = Static216.aClass100_87.method2292(this.anInt6237);
		for (@Pc(117) int local117 = 0; local117 < local115.length; local117++) {
			@Pc(124) byte[] local124 = this.aByteArrayArray20[local117];
			@Pc(138) int local138 = local124[1] & 0xFF | (local124[0] & 0xFF) << 8;
			@Pc(140) Class3_Sub39 local140 = null;
			for (@Pc(145) Class3_Sub39 local145 = (Class3_Sub39) local99.method3402(); local145 != null; local145 = (Class3_Sub39) local99.method3400()) {
				if (local138 == local145.anInt5802) {
					local140 = local145;
					break;
				}
			}
			if (local140 == null) {
				local140 = new Class3_Sub39(local138, Static271.aClass100_107.method2318(local138));
				local99.method3387(local140);
			}
			this.aClass33Array1[local115[local117]] = new Class33(local124, local140);
		}
		this.aByteArrayArray20 = null;
		return true;
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(II)Z")
	public boolean method5289(@OriginalArg(0) int arg0) {
		return this.aClass33Array1[arg0].aBoolean42;
	}
}
