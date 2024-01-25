import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class3_Sub7_Sub15 extends Class3_Sub7 {

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "[Lclient!ul;")
	public Class232[] aClass232Array1;

	@OriginalMember(owner = "client!vo", name = "I", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
	private final int anInt6247;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub15(@OriginalArg(0) int arg0) {
		this.anInt6247 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)Z")
	public boolean method5582(@OriginalArg(1) int arg0) {
		return this.aClass232Array1[arg0].aBoolean452;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)Z")
	public boolean method5583(@OriginalArg(1) int arg0) {
		return this.aClass232Array1[arg0].aBoolean453;
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)Z")
	public boolean method5585() {
		if (this.aClass232Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray23 == null) {
			if (!Static160.aClass20_79.method244(this.anInt6247)) {
				return false;
			}
			@Pc(27) int[] local27 = Static160.aClass20_79.method228(this.anInt6247);
			this.aByteArrayArray23 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray23[local34] = Static160.aClass20_79.method253(local27[local34], this.anInt6247);
			}
		}
		@Pc(60) boolean local60 = true;
		@Pc(83) int local83;
		for (local34 = 0; local34 < this.aByteArrayArray23.length; local34++) {
			@Pc(69) byte[] local69 = this.aByteArrayArray23[local34];
			local83 = (local69[0] & 0xFF) << 8 | local69[1] & 0xFF;
			local60 &= Static287.aClass20_69.method226(local83);
		}
		if (!local60) {
			return false;
		}
		@Pc(104) Class138 local104 = new Class138();
		local83 = Static160.aClass20_79.method231(this.anInt6247);
		this.aClass232Array1 = new Class232[local83];
		@Pc(120) int[] local120 = Static160.aClass20_79.method228(this.anInt6247);
		for (@Pc(122) int local122 = 0; local122 < local120.length; local122++) {
			@Pc(129) byte[] local129 = this.aByteArrayArray23[local122];
			@Pc(143) int local143 = local129[1] & 0xFF | (local129[0] & 0xFF) << 8;
			@Pc(145) Class3_Sub19 local145 = null;
			for (@Pc(150) Class3_Sub19 local150 = (Class3_Sub19) local104.method3051(); local150 != null; local150 = (Class3_Sub19) local104.method3050()) {
				if (local150.anInt2647 == local143) {
					local145 = local150;
					break;
				}
			}
			if (local145 == null) {
				local145 = new Class3_Sub19(local143, Static287.aClass20_69.method224(local143));
				local104.method3053(local145);
			}
			this.aClass232Array1[local120[local122]] = new Class232(local129, local145);
		}
		this.aByteArrayArray23 = null;
		return true;
	}
}
