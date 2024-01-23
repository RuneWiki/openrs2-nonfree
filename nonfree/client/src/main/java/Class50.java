import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class50 {

	@OriginalMember(owner = "client!f", name = "l", descriptor = "I")
	public int anInt1409;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray6;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I)V")
	public Class50(@OriginalArg(0) int arg0) {
		this.anInt1409 = arg0;
		this.anIntArray169 = new int[this.anInt1409];
		this.aByteArray17 = new byte[this.anInt1409];
		this.aStringArray6 = new String[this.anInt1409];
		this.anIntArray168 = new int[this.anInt1409];
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)I")
	public int method1167(@OriginalArg(0) int arg0) {
		return this.aByteArray17[arg0] & 0x3;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)Z")
	public boolean method1168(@OriginalArg(1) int arg0) {
		return (this.aByteArray17[arg0] & 0x4) != 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Z")
	public boolean method1170(@OriginalArg(0) int arg0) {
		return (this.aByteArray17[arg0] & 0x8) != 0;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)Z")
	public boolean method1171(@OriginalArg(1) int arg0) {
		return (this.aByteArray17[arg0] & 0x10) == 0;
	}
}
