import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dr", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!dr", name = "E", descriptor = "[Lclient!pf;")
	public Class189[] aClass189Array1;

	@OriginalMember(owner = "client!dr", name = "C", descriptor = "I")
	private final int anInt1944;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2_Sub7(@OriginalArg(0) int arg0) {
		this.anInt1944 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Z")
	public boolean method1406() {
		if (this.aClass189Array1 != null) {
			return true;
		}
		@Pc(36) int local36;
		if (this.aByteArrayArray4 == null) {
			if (!Static314.aClass188_85.method4287(this.anInt1944)) {
				return false;
			}
			@Pc(29) int[] local29 = Static314.aClass188_85.method4294(this.anInt1944);
			this.aByteArrayArray4 = new byte[local29.length][];
			for (local36 = 0; local36 < local29.length; local36++) {
				this.aByteArrayArray4[local36] = Static314.aClass188_85.method4283(this.anInt1944, local29[local36]);
			}
		}
		@Pc(57) boolean local57 = true;
		@Pc(86) int local86;
		for (local36 = 0; local36 < this.aByteArrayArray4.length; local36++) {
			@Pc(72) byte[] local72 = this.aByteArrayArray4[local36];
			local86 = local72[1] & 0xFF | (local72[0] & 0xFF) << 8;
			local57 &= Static174.aClass188_49.method4296(local86);
		}
		if (!local57) {
			return false;
		}
		@Pc(111) Class265 local111 = new Class265();
		local86 = Static314.aClass188_85.method4285(this.anInt1944);
		this.aClass189Array1 = new Class189[local86];
		@Pc(127) int[] local127 = Static314.aClass188_85.method4294(this.anInt1944);
		for (@Pc(129) int local129 = 0; local129 < local127.length; local129++) {
			@Pc(136) byte[] local136 = this.aByteArrayArray4[local129];
			@Pc(150) int local150 = (local136[0] & 0xFF) << 8 | local136[1] & 0xFF;
			@Pc(152) Class2_Sub35 local152 = null;
			for (@Pc(157) Class2_Sub35 local157 = (Class2_Sub35) local111.method6005(); local157 != null; local157 = (Class2_Sub35) local111.method6001()) {
				if (local150 == local157.anInt5875) {
					local152 = local157;
					break;
				}
			}
			if (local152 == null) {
				local152 = new Class2_Sub35(local150, Static174.aClass188_49.method4282(local150));
				local111.method5999(local152);
			}
			this.aClass189Array1[local127[local129]] = new Class189(local136, local152);
		}
		this.aByteArrayArray4 = null;
		return true;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)Z")
	public boolean method1407(@OriginalArg(1) int arg0) {
		return this.aClass189Array1[arg0].aBoolean459;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)Z")
	public boolean method1409(@OriginalArg(1) int arg0) {
		return this.aClass189Array1[arg0].aBoolean460;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(BI)Z")
	public boolean method1411(@OriginalArg(1) int arg0) {
		return this.aClass189Array1[arg0].aBoolean458;
	}
}
