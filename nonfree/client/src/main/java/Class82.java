import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class82 {

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
	public int anInt2893;

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray38;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "[I")
	public int[] anIntArray262;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "[I")
	public int[] anIntArray264;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(I)V")
	public Class82(@OriginalArg(0) int arg0) {
		this.anInt2893 = arg0;
		this.aStringArray38 = new String[this.anInt2893];
		this.aByteArray44 = new byte[this.anInt2893];
		this.anIntArray262 = new int[this.anInt2893];
		this.anIntArray264 = new int[this.anInt2893];
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)I")
	public int method2229(@OriginalArg(1) int arg0) {
		return this.aByteArray44[arg0] & 0x3;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)Z")
	public boolean method2232(@OriginalArg(1) int arg0) {
		return (this.aByteArray44[arg0] & 0x8) != 0;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)Z")
	public boolean method2233(@OriginalArg(1) int arg0) {
		return (this.aByteArray44[arg0] & 0x4) != 0;
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)Z")
	public boolean method2234(@OriginalArg(1) int arg0) {
		return (this.aByteArray44[arg0] & 0x10) == 0;
	}
}
