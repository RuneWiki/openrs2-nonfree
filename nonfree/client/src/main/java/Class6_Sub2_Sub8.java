import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class6_Sub2_Sub8 extends Class6_Sub2 {

	@OriginalMember(owner = "client!kt", name = "M", descriptor = "[Lclient!pb;")
	public Class191[] aClass191Array1;

	@OriginalMember(owner = "client!kt", name = "P", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
	private final int anInt4004;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(I)V")
	public Class6_Sub2_Sub8(@OriginalArg(0) int arg0) {
		this.anInt4004 = arg0;
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(B)Z")
	public boolean method3328() {
		if (this.aClass191Array1 != null) {
			return true;
		}
		@Pc(42) int local42;
		if (this.aByteArrayArray14 == null) {
			if (!Static289.aClass100_54.method2497(this.anInt4004)) {
				return false;
			}
			@Pc(35) int[] local35 = Static289.aClass100_54.method2504(this.anInt4004);
			this.aByteArrayArray14 = new byte[local35.length][];
			for (local42 = 0; local42 < local35.length; local42++) {
				this.aByteArrayArray14[local42] = Static289.aClass100_54.method2520(local35[local42], this.anInt4004);
			}
		}
		@Pc(67) boolean local67 = true;
		@Pc(90) int local90;
		for (local42 = 0; local42 < this.aByteArrayArray14.length; local42++) {
			@Pc(76) byte[] local76 = this.aByteArrayArray14[local42];
			local90 = local76[1] & 0xFF | (local76[0] & 0xFF) << 8;
			local67 &= Static150.aClass100_24.method2492(local90);
		}
		if (!local67) {
			return false;
		}
		@Pc(115) Class244 local115 = new Class244();
		local90 = Static289.aClass100_54.method2523(this.anInt4004);
		this.aClass191Array1 = new Class191[local90];
		@Pc(131) int[] local131 = Static289.aClass100_54.method2504(this.anInt4004);
		for (@Pc(133) int local133 = 0; local133 < local131.length; local133++) {
			@Pc(140) byte[] local140 = this.aByteArrayArray14[local133];
			@Pc(154) int local154 = local140[1] & 0xFF | (local140[0] & 0xFF) << 8;
			@Pc(156) Class6_Sub12 local156 = null;
			for (@Pc(161) Class6_Sub12 local161 = (Class6_Sub12) local115.method5976(); local161 != null; local161 = (Class6_Sub12) local115.method5964()) {
				if (local154 == local161.anInt1957) {
					local156 = local161;
					break;
				}
			}
			if (local156 == null) {
				local156 = new Class6_Sub12(local154, Static150.aClass100_24.method2515(local154));
				local115.method5966(local156);
			}
			this.aClass191Array1[local131[local133]] = new Class191(local140, local156);
		}
		this.aByteArrayArray14 = null;
		return true;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)Z")
	public boolean method3329(@OriginalArg(0) int arg0) {
		return this.aClass191Array1[arg0].aBoolean340;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(II)Z")
	public boolean method3330(@OriginalArg(1) int arg0) {
		return this.aClass191Array1[arg0].aBoolean342;
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(II)Z")
	public boolean method3332(@OriginalArg(0) int arg0) {
		return this.aClass191Array1[arg0].aBoolean341;
	}
}
