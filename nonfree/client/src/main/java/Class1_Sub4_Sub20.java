import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class1_Sub4_Sub20 extends Class1_Sub4 {

	@OriginalMember(owner = "client!np", name = "I", descriptor = "[[B")
	private byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!np", name = "M", descriptor = "[Lclient!vb;")
	public Class211[] aClass211Array1;

	@OriginalMember(owner = "client!np", name = "H", descriptor = "I")
	private final int anInt4349;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(I)V")
	public Class1_Sub4_Sub20(@OriginalArg(0) int arg0) {
		this.anInt4349 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(II)Z")
	public boolean method4029(@OriginalArg(0) int arg0) {
		return this.aClass211Array1[arg0].aBoolean477;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(II)Z")
	public boolean method4032(@OriginalArg(1) int arg0) {
		return this.aClass211Array1[arg0].aBoolean476;
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(B)Z")
	public boolean method4034() {
		if (this.aClass211Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray13 == null) {
			if (!Static55.aClass30_12.method1152(this.anInt4349)) {
				return false;
			}
			@Pc(27) int[] local27 = Static55.aClass30_12.method1156(this.anInt4349);
			this.aByteArrayArray13 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray13[local34] = Static55.aClass30_12.method1161(local27[local34], this.anInt4349);
			}
		}
		@Pc(55) boolean local55 = true;
		for (local34 = 0; local34 < this.aByteArrayArray13.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray13[local34];
			@Pc(78) int local78 = local64[1] & 0xFF | (local64[0] & 0xFF) << 8;
			local55 &= Static200.aClass30_59.method1154(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(103) Class42 local103 = new Class42();
		@Pc(117) int local117 = Static55.aClass30_12.method1180(this.anInt4349);
		this.aClass211Array1 = new Class211[local117];
		@Pc(127) int[] local127 = Static55.aClass30_12.method1156(this.anInt4349);
		for (@Pc(129) int local129 = 0; local129 < local127.length; local129++) {
			@Pc(136) byte[] local136 = this.aByteArrayArray13[local129];
			@Pc(150) int local150 = (local136[0] & 0xFF) << 8 | local136[1] & 0xFF;
			@Pc(152) Class1_Sub16 local152 = null;
			for (@Pc(157) Class1_Sub16 local157 = (Class1_Sub16) local103.method1543(); local157 != null; local157 = (Class1_Sub16) local103.method1551()) {
				if (local150 == local157.anInt1603) {
					local152 = local157;
					break;
				}
			}
			if (local152 == null) {
				local152 = new Class1_Sub16(local150, Static200.aClass30_59.method1179(local150));
				local103.method1549(local152);
			}
			this.aClass211Array1[local127[local129]] = new Class211(local136, local152);
		}
		this.aByteArrayArray13 = null;
		return true;
	}
}
