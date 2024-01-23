import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class119 {

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	public int anInt4555;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "[Lclient!sc;")
	public Class107[] aClass107Array29;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V")
	public Class119(@OriginalArg(0) int arg0) {
		this.anInt4555 = arg0;
		this.aShortArray51 = new short[this.anInt4555];
		this.anIntArray367 = new int[this.anInt4555];
		this.aShortArray52 = new short[this.anInt4555];
		this.aByteArray63 = new byte[this.anInt4555];
		this.aClass107Array29 = new Class107[this.anInt4555];
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Z")
	public boolean method3411(@OriginalArg(1) int arg0) {
		return (this.aByteArray63[arg0] & 0x4) != 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)I")
	public int method3412(@OriginalArg(0) int arg0) {
		return this.aByteArray63[arg0] & 0x3;
	}
}
