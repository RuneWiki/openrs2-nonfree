import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "[Lclient!tn;")
	public Class240[] aClass240Array1;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
	private final int anInt4920;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
	public Class2_Sub1_Sub12(@OriginalArg(0) int arg0) {
		this.anInt4920 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)Z")
	public boolean method3889(@OriginalArg(1) int arg0) {
		return this.aClass240Array1[arg0].aBoolean457;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Z")
	public boolean method3890(@OriginalArg(0) int arg0) {
		return this.aClass240Array1[arg0].aBoolean458;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Z")
	public boolean method3892() {
		if (this.aClass240Array1 != null) {
			return true;
		}
		@Pc(32) int local32;
		if (this.aByteArrayArray16 == null) {
			if (!Static257.aClass171_58.method3656(this.anInt4920)) {
				return false;
			}
			@Pc(25) int[] local25 = Static257.aClass171_58.method3670(this.anInt4920);
			this.aByteArrayArray16 = new byte[local25.length][];
			for (local32 = 0; local32 < local25.length; local32++) {
				this.aByteArrayArray16[local32] = Static257.aClass171_58.method3658(this.anInt4920, local25[local32]);
			}
		}
		@Pc(52) boolean local52 = true;
		@Pc(74) int local74;
		for (local32 = 0; local32 < this.aByteArrayArray16.length; local32++) {
			@Pc(60) byte[] local60 = this.aByteArrayArray16[local32];
			local74 = (local60[0] & 0xFF) << 8 | local60[1] & 0xFF;
			local52 &= Static237.aClass171_54.method3666(local74);
		}
		if (!local52) {
			return false;
		}
		@Pc(99) Class181 local99 = new Class181();
		local74 = Static257.aClass171_58.method3662(this.anInt4920);
		this.aClass240Array1 = new Class240[local74];
		@Pc(115) int[] local115 = Static257.aClass171_58.method3670(this.anInt4920);
		for (@Pc(117) int local117 = 0; local117 < local115.length; local117++) {
			@Pc(123) byte[] local123 = this.aByteArrayArray16[local117];
			@Pc(137) int local137 = (local123[0] & 0xFF) << 8 | local123[1] & 0xFF;
			@Pc(139) Class2_Sub47 local139 = null;
			for (@Pc(144) Class2_Sub47 local144 = (Class2_Sub47) local99.method3972(); local144 != null; local144 = (Class2_Sub47) local99.method3975()) {
				if (local137 == local144.anInt7599) {
					local139 = local144;
					break;
				}
			}
			if (local139 == null) {
				local139 = new Class2_Sub47(local137, Static237.aClass171_54.method3664(local137));
				local99.method3973(local139);
			}
			this.aClass240Array1[local115[local117]] = new Class240(local123, local139);
		}
		this.aByteArrayArray16 = null;
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(II)Z")
	public boolean method3895(@OriginalArg(0) int arg0) {
		return this.aClass240Array1[arg0].aBoolean456;
	}
}
