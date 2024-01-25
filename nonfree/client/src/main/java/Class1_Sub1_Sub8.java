import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dl", name = "F", descriptor = "[Lclient!pr;")
	public Class202[] aClass202Array1;

	@OriginalMember(owner = "client!dl", name = "G", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
	private final int anInt1970;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub8(@OriginalArg(0) int arg0) {
		this.anInt1970 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)Z")
	public boolean method1440(@OriginalArg(1) int arg0) {
		return this.aClass202Array1[arg0].aBoolean375;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Z")
	public boolean method1442() {
		if (this.aClass202Array1 != null) {
			return true;
		}
		@Pc(32) int local32;
		if (this.aByteArrayArray7 == null) {
			if (!Static381.aClass211_84.method4757(this.anInt1970)) {
				return false;
			}
			@Pc(25) int[] local25 = Static381.aClass211_84.method4755(this.anInt1970);
			this.aByteArrayArray7 = new byte[local25.length][];
			for (local32 = 0; local32 < local25.length; local32++) {
				this.aByteArrayArray7[local32] = Static381.aClass211_84.method4758(local25[local32], this.anInt1970);
			}
		}
		@Pc(52) boolean local52 = true;
		@Pc(82) int local82;
		for (local32 = 0; local32 < this.aByteArrayArray7.length; local32++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray7[local32];
			local82 = local68[1] & 0xFF | (local68[0] & 0xFF) << 8;
			local52 &= Static34.aClass211_11.method4761(local82);
		}
		if (!local52) {
			return false;
		}
		@Pc(107) Class203 local107 = new Class203();
		local82 = Static381.aClass211_84.method4772(this.anInt1970);
		this.aClass202Array1 = new Class202[local82];
		@Pc(123) int[] local123 = Static381.aClass211_84.method4755(this.anInt1970);
		for (@Pc(125) int local125 = 0; local125 < local123.length; local125++) {
			@Pc(131) byte[] local131 = this.aByteArrayArray7[local125];
			@Pc(145) int local145 = local131[1] & 0xFF | (local131[0] & 0xFF) << 8;
			@Pc(147) Class1_Sub2 local147 = null;
			for (@Pc(152) Class1_Sub2 local152 = (Class1_Sub2) local107.method4548(); local152 != null; local152 = (Class1_Sub2) local107.method4545()) {
				if (local145 == local152.anInt80) {
					local147 = local152;
					break;
				}
			}
			if (local147 == null) {
				local147 = new Class1_Sub2(local145, Static34.aClass211_11.method4774(local145));
				local107.method4551(local147);
			}
			this.aClass202Array1[local123[local125]] = new Class202(local131, local147);
		}
		this.aByteArrayArray7 = null;
		return true;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(ZI)Z")
	public boolean method1446(@OriginalArg(1) int arg0) {
		return this.aClass202Array1[arg0].aBoolean376;
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "(II)Z")
	public boolean method1448(@OriginalArg(1) int arg0) {
		return this.aClass202Array1[arg0].aBoolean377;
	}
}
