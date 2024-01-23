import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class113 {

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
	public int anInt3429;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray15;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "[I")
	public int[] anIntArray260;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I)V")
	public Class113(@OriginalArg(0) int arg0) {
		this.anInt3429 = arg0;
		this.aStringArray15 = new String[this.anInt3429];
		this.anIntArray261 = new int[this.anInt3429];
		this.anIntArray260 = new int[this.anInt3429];
		this.aByteArray28 = new byte[this.anInt3429];
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Z")
	public boolean method2820(@OriginalArg(0) int arg0) {
		return (this.aByteArray28[arg0] & 0x10) == 0;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)Z")
	public boolean method2821(@OriginalArg(1) int arg0) {
		return (this.aByteArray28[arg0] & 0x8) != 0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)Z")
	public boolean method2822(@OriginalArg(1) int arg0) {
		return (this.aByteArray28[arg0] & 0x4) != 0;
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)I")
	public int method2826(@OriginalArg(1) int arg0) {
		return this.aByteArray28[arg0] & 0x3;
	}
}
