import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class4_Sub1_Sub17 extends Class4_Sub1 {

	@OriginalMember(owner = "client!rw", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!rw", name = "B", descriptor = "[Lclient!rt;")
	public Class227[] aClass227Array1;

	@OriginalMember(owner = "client!rw", name = "I", descriptor = "I")
	private final int anInt6365;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(I)V")
	public Class4_Sub1_Sub17(@OriginalArg(0) int arg0) {
		this.anInt6365 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)Z")
	public boolean method5221(@OriginalArg(0) int arg0) {
		return this.aClass227Array1[arg0].aBoolean468;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BI)Z")
	public boolean method5223(@OriginalArg(1) int arg0) {
		return this.aClass227Array1[arg0].aBoolean467;
	}

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "(B)Z")
	public boolean method5226() {
		if (this.aClass227Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray19 == null) {
			if (!Static338.aClass38_69.method1044(this.anInt6365)) {
				return false;
			}
			@Pc(27) int[] local27 = Static338.aClass38_69.method1024(this.anInt6365);
			this.aByteArrayArray19 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray19[local34] = Static338.aClass38_69.method1039(local27[local34], this.anInt6365);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray19.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray19[local34];
			local78 = local64[1] & 0xFF | (local64[0] & 0xFF) << 8;
			local55 &= Static25.aClass38_6.method1037(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(103) Class91 local103 = new Class91();
		local78 = Static338.aClass38_69.method1032(this.anInt6365);
		this.aClass227Array1 = new Class227[local78];
		@Pc(127) int[] local127 = Static338.aClass38_69.method1024(this.anInt6365);
		for (@Pc(129) int local129 = 0; local129 < local127.length; local129++) {
			@Pc(136) byte[] local136 = this.aByteArrayArray19[local129];
			@Pc(150) int local150 = local136[1] & 0xFF | (local136[0] & 0xFF) << 8;
			@Pc(152) Class4_Sub24 local152 = null;
			for (@Pc(157) Class4_Sub24 local157 = (Class4_Sub24) local103.method2584(); local157 != null; local157 = (Class4_Sub24) local103.method2586()) {
				if (local157.anInt4506 == local150) {
					local152 = local157;
					break;
				}
			}
			if (local152 == null) {
				local152 = new Class4_Sub24(local150, Static25.aClass38_6.method1031(local150));
				local103.method2587(local152);
			}
			this.aClass227Array1[local127[local129]] = new Class227(local136, local152);
		}
		this.aByteArrayArray19 = null;
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(II)Z")
	public boolean method5227(@OriginalArg(0) int arg0) {
		return this.aClass227Array1[arg0].aBoolean469;
	}
}
