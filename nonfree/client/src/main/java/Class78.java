import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class78 {

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	public int anInt2855;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "[I")
	public int[] anIntArray264;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray14;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "[I")
	public int[] anIntArray265;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
	public Class78(@OriginalArg(0) int arg0) {
		this.anInt2855 = arg0;
		this.anIntArray264 = new int[this.anInt2855];
		this.aStringArray14 = new String[this.anInt2855];
		this.aByteArray32 = new byte[this.anInt2855];
		this.anIntArray265 = new int[this.anInt2855];
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)Z")
	public boolean method2180(@OriginalArg(1) int arg0) {
		return (this.aByteArray32[arg0] & 0x4) != 0;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)I")
	public int method2182(@OriginalArg(0) int arg0) {
		return this.aByteArray32[arg0] & 0x3;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)Z")
	public boolean method2183(@OriginalArg(0) int arg0) {
		return (this.aByteArray32[arg0] & 0x10) == 0;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(IB)Z")
	public boolean method2184(@OriginalArg(0) int arg0) {
		return (this.aByteArray32[arg0] & 0x8) != 0;
	}
}
