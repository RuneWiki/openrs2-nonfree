import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class2_Sub11_Sub1 extends Class2_Sub11 {

	@OriginalMember(owner = "client!di", name = "F", descriptor = "[Lclient!ac;")
	public Class3[] aClass3Array1;

	@OriginalMember(owner = "client!di", name = "H", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!di", name = "L", descriptor = "I")
	private final int anInt1276;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(I)V")
	public Class2_Sub11_Sub1(@OriginalArg(0) int arg0) {
		this.anInt1276 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)Z")
	public boolean method1342(@OriginalArg(1) int arg0) {
		return this.aClass3Array1[arg0].aBoolean7;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Z")
	public boolean method1346(@OriginalArg(1) int arg0) {
		return this.aClass3Array1[arg0].aBoolean8;
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(B)Z")
	public boolean method1347() {
		if (this.aClass3Array1 != null) {
			return true;
		}
		@Pc(39) int local39;
		if (this.aByteArrayArray4 == null) {
			if (!Static29.aClass191_17.method5457(this.anInt1276)) {
				return false;
			}
			@Pc(32) int[] local32 = Static29.aClass191_17.method5447(this.anInt1276);
			this.aByteArrayArray4 = new byte[local32.length][];
			for (local39 = 0; local39 < local32.length; local39++) {
				this.aByteArrayArray4[local39] = Static29.aClass191_17.method5459(this.anInt1276, local32[local39]);
			}
		}
		@Pc(60) boolean local60 = true;
		@Pc(83) int local83;
		for (local39 = 0; local39 < this.aByteArrayArray4.length; local39++) {
			@Pc(69) byte[] local69 = this.aByteArrayArray4[local39];
			local83 = (local69[0] & 0xFF) << 8 | local69[1] & 0xFF;
			local60 &= Static162.aClass191_101.method5440(local83);
		}
		if (!local60) {
			return false;
		}
		@Pc(104) Class216 local104 = new Class216();
		local83 = Static29.aClass191_17.method5443(this.anInt1276);
		this.aClass3Array1 = new Class3[local83];
		@Pc(120) int[] local120 = Static29.aClass191_17.method5447(this.anInt1276);
		for (@Pc(122) int local122 = 0; local122 < local120.length; local122++) {
			@Pc(129) byte[] local129 = this.aByteArrayArray4[local122];
			@Pc(143) int local143 = local129[1] & 0xFF | (local129[0] & 0xFF) << 8;
			@Pc(145) Class2_Sub29 local145 = null;
			for (@Pc(150) Class2_Sub29 local150 = (Class2_Sub29) local104.method5992(); local150 != null; local150 = (Class2_Sub29) local104.method6000()) {
				if (local143 == local150.anInt3907) {
					local145 = local150;
					break;
				}
			}
			if (local145 == null) {
				local145 = new Class2_Sub29(local143, Static162.aClass191_101.method5448(local143));
				local104.method5995(local145);
			}
			this.aClass3Array1[local120[local122]] = new Class3(local129, local145);
		}
		this.aByteArrayArray4 = null;
		return true;
	}
}
