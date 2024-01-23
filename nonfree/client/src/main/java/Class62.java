import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class62 {

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt2136;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "[Lclient!hh;")
	public Class50[] aClass50Array38;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
	public Class62(@OriginalArg(0) int arg0) {
		this.anInt2136 = arg0;
		this.aShortArray31 = new short[this.anInt2136];
		this.anIntArray205 = new int[this.anInt2136];
		this.aClass50Array38 = new Class50[this.anInt2136];
		this.aShortArray32 = new short[this.anInt2136];
		this.aByteArray27 = new byte[this.anInt2136];
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)I")
	public int method1640(@OriginalArg(0) int arg0) {
		return this.aByteArray27[arg0] & 0x3;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Z")
	public boolean method1642(@OriginalArg(0) int arg0) {
		return (this.aByteArray27[arg0] & 0x4) != 0;
	}
}
