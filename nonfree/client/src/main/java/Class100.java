import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class100 {

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	public int anInt3236;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "[I")
	public int[] anIntArray265;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray22;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
	public Class100(@OriginalArg(0) int arg0) {
		this.anInt3236 = arg0;
		this.anIntArray265 = new int[this.anInt3236];
		this.aStringArray22 = new String[this.anInt3236];
		this.anIntArray266 = new int[this.anInt3236];
		this.aByteArray38 = new byte[this.anInt3236];
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I")
	public int method2542(@OriginalArg(0) int arg0) {
		return this.aByteArray38[arg0] & 0x3;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)Z")
	public boolean method2544(@OriginalArg(1) int arg0) {
		return (this.aByteArray38[arg0] & 0x8) != 0;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(II)Z")
	public boolean method2546(@OriginalArg(0) int arg0) {
		return (this.aByteArray38[arg0] & 0x10) == 0;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(II)Z")
	public boolean method2547(@OriginalArg(0) int arg0) {
		return (this.aByteArray38[arg0] & 0x4) != 0;
	}
}
