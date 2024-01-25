import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public final class Class3_Sub48 extends Class3 {

	@OriginalMember(owner = "client!qha", name = "w", descriptor = "I")
	public final int anInt8085;

	@OriginalMember(owner = "client!qha", name = "o", descriptor = "I")
	public final int anInt8078;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(II)V")
	public Class3_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8085 = arg1;
		this.anInt8078 = arg0;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)Z")
	public boolean method7064() {
		return (this.anInt8078 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)Z")
	public boolean method7065() {
		return (this.anInt8078 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)I")
	public int method7066() {
		return this.anInt8078 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)I")
	public int method7067() {
		return Static326.method4968(this.anInt8078);
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(B)Z")
	public boolean method7068() {
		return (this.anInt8078 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)Z")
	public boolean method7070(@OriginalArg(1) int arg0) {
		return (this.anInt8078 >> arg0 + 1 & 0x1) != 0;
	}
}
