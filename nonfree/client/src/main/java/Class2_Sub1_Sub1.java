import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "[Lclient!em;")
	public Class63[] aClass63Array1;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
	private final int anInt45;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(I)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) int arg0) {
		this.anInt45 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)Z")
	public boolean method28() {
		if (this.aClass63Array1 != null) {
			return true;
		}
		@Pc(36) int local36;
		if (this.aByteArrayArray1 == null) {
			if (!Static110.aClass71_23.method1570(this.anInt45)) {
				return false;
			}
			@Pc(29) int[] local29 = Static110.aClass71_23.method1552(this.anInt45);
			this.aByteArrayArray1 = new byte[local29.length][];
			for (local36 = 0; local36 < local29.length; local36++) {
				this.aByteArrayArray1[local36] = Static110.aClass71_23.method1555(this.anInt45, local29[local36]);
			}
		}
		@Pc(61) boolean local61 = true;
		@Pc(84) int local84;
		for (local36 = 0; local36 < this.aByteArrayArray1.length; local36++) {
			@Pc(70) byte[] local70 = this.aByteArrayArray1[local36];
			local84 = local70[1] & 0xFF | (local70[0] & 0xFF) << 8;
			local61 &= Static137.aClass71_29.method1560(local84);
		}
		if (!local61) {
			return false;
		}
		@Pc(109) Class210 local109 = new Class210();
		local84 = Static110.aClass71_23.method1580(this.anInt45);
		this.aClass63Array1 = new Class63[local84];
		@Pc(135) int[] local135 = Static110.aClass71_23.method1552(this.anInt45);
		for (@Pc(137) int local137 = 0; local137 < local135.length; local137++) {
			@Pc(144) byte[] local144 = this.aByteArrayArray1[local137];
			@Pc(158) int local158 = local144[1] & 0xFF | (local144[0] & 0xFF) << 8;
			@Pc(160) Class2_Sub19 local160 = null;
			for (@Pc(165) Class2_Sub19 local165 = (Class2_Sub19) local109.method5035(); local165 != null; local165 = (Class2_Sub19) local109.method5037()) {
				if (local165.anInt2697 == local158) {
					local160 = local165;
					break;
				}
			}
			if (local160 == null) {
				local160 = new Class2_Sub19(local158, Static137.aClass71_29.method1564(local158));
				local109.method5044(local160);
			}
			this.aClass63Array1[local135[local137]] = new Class63(local144, local160);
		}
		this.aByteArrayArray1 = null;
		return true;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
	public boolean method31(@OriginalArg(1) int arg0) {
		return this.aClass63Array1[arg0].aBoolean129;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Z")
	public boolean method34(@OriginalArg(1) int arg0) {
		return this.aClass63Array1[arg0].aBoolean130;
	}
}
