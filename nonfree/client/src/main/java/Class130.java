import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class130 {

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public int anInt3917;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "[I")
	public int[] anIntArray298;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray61;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V")
	public Class130(@OriginalArg(0) int arg0) {
		this.anInt3917 = arg0;
		this.anIntArray298 = new int[this.anInt3917];
		this.aStringArray61 = new String[this.anInt3917];
		this.aByteArray34 = new byte[this.anInt3917];
		this.anIntArray297 = new int[this.anInt3917];
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)I")
	public int method3049(@OriginalArg(0) int arg0) {
		return this.aByteArray34[arg0] & 0x3;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)Z")
	public boolean method3050(@OriginalArg(1) int arg0) {
		return (this.aByteArray34[arg0] & 0x4) != 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Z")
	public boolean method3051(@OriginalArg(1) int arg0) {
		return (this.aByteArray34[arg0] & 0x10) == 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Z")
	public boolean method3052(@OriginalArg(1) int arg0) {
		return (this.aByteArray34[arg0] & 0x8) != 0;
	}
}
