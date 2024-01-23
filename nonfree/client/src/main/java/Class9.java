import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class9 {

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	public int anInt203;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray2;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "[I")
	public int[] anIntArray21;

	@OriginalMember(owner = "client!am", name = "h", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(I)V")
	public Class9(@OriginalArg(0) int arg0) {
		this.anInt203 = arg0;
		this.aStringArray2 = new String[this.anInt203];
		this.anIntArray21 = new int[this.anInt203];
		this.aByteArray3 = new byte[this.anInt203];
		this.anIntArray22 = new int[this.anInt203];
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Z")
	public boolean method174(@OriginalArg(1) int arg0) {
		return (this.aByteArray3[arg0] & 0x10) == 0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)Z")
	public boolean method175(@OriginalArg(1) int arg0) {
		return (this.aByteArray3[arg0] & 0x4) != 0;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(BI)Z")
	public boolean method177(@OriginalArg(1) int arg0) {
		return (this.aByteArray3[arg0] & 0x8) != 0;
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(BI)I")
	public int method178(@OriginalArg(1) int arg0) {
		return this.aByteArray3[arg0] & 0x3;
	}
}
