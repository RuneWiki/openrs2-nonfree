import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class151 {

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	public int anInt5555;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "[I")
	public int[] anIntArray470;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "[I")
	public int[] anIntArray471;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray39;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I)V")
	public Class151(@OriginalArg(0) int arg0) {
		this.anInt5555 = arg0;
		this.anIntArray470 = new int[this.anInt5555];
		this.anIntArray471 = new int[this.anInt5555];
		this.aStringArray39 = new String[this.anInt5555];
		this.aByteArray65 = new byte[this.anInt5555];
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)I")
	public int method4218(@OriginalArg(0) int arg0) {
		return this.aByteArray65[arg0] & 0x3;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ)Z")
	public boolean method4219(@OriginalArg(0) int arg0) {
		return (this.aByteArray65[arg0] & 0x10) == 0;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)Z")
	public boolean method4220(@OriginalArg(0) int arg0) {
		return (this.aByteArray65[arg0] & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)Z")
	public boolean method4224(@OriginalArg(0) int arg0) {
		return (this.aByteArray65[arg0] & 0x8) != 0;
	}
}
