import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class5_Sub9_Sub11 extends Class5_Sub9 {

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "[Lclient!pb;")
	public Class153[] aClass153Array1;

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
	private final int anInt2794;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V")
	public Class5_Sub9_Sub11(@OriginalArg(0) int arg0) {
		this.anInt2794 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)Z")
	public boolean method2610(@OriginalArg(0) int arg0) {
		return this.aClass153Array1[arg0].aBoolean332;
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)Z")
	public boolean method2614() {
		if (this.aClass153Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray7 == null) {
			if (!Static176.aClass170_35.method4562(this.anInt2794)) {
				return false;
			}
			@Pc(27) int[] local27 = Static176.aClass170_35.method4573(this.anInt2794);
			this.aByteArrayArray7 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray7[local34] = Static176.aClass170_35.method4584(this.anInt2794, local27[local34]);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray7.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray7[local34];
			local82 = local68[1] & 0xFF | (local68[0] & 0xFF) << 8;
			local59 &= Static277.aClass170_93.method4568(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(111) Class211 local111 = new Class211();
		local82 = Static176.aClass170_35.method4575(this.anInt2794);
		this.aClass153Array1 = new Class153[local82];
		@Pc(127) int[] local127 = Static176.aClass170_35.method4573(this.anInt2794);
		for (@Pc(129) int local129 = 0; local129 < local127.length; local129++) {
			@Pc(136) byte[] local136 = this.aByteArrayArray7[local129];
			@Pc(150) int local150 = local136[1] & 0xFF | (local136[0] & 0xFF) << 8;
			@Pc(152) Class5_Sub22 local152 = null;
			for (@Pc(157) Class5_Sub22 local157 = (Class5_Sub22) local111.method5608(); local157 != null; local157 = (Class5_Sub22) local111.method5603()) {
				if (local150 == local157.anInt2588) {
					local152 = local157;
					break;
				}
			}
			if (local152 == null) {
				local152 = new Class5_Sub22(local150, Static277.aClass170_93.method4571(local150));
				local111.method5609(local152);
			}
			this.aClass153Array1[local127[local129]] = new Class153(local136, local152);
		}
		this.aByteArrayArray7 = null;
		return true;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Z")
	public boolean method2616(@OriginalArg(0) int arg0) {
		return this.aClass153Array1[arg0].aBoolean331;
	}
}
