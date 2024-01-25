import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public final class Class305 {

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
	public int anInt8945;

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
	public int anInt8946;

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
	public int anInt8948;

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
	public int anInt8949;

	@OriginalMember(owner = "client!sda", name = "h", descriptor = "B")
	private byte aByte102;

	@OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
	public int anInt8951;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "()V")
	public Class305() {
	}

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class305(@OriginalArg(0) Class8_Sub8 arg0) {
		this.aByte102 = arg0.method8550();
		this.anInt8951 = arg0.method8578();
		this.anInt8946 = arg0.method8540();
		this.anInt8949 = arg0.method8540();
		this.anInt8945 = arg0.method8540();
		this.anInt8948 = arg0.method8540();
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)I")
	public int method7345() {
		return (this.aByte102 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)I")
	public int method7346() {
		return this.aByte102 & 0x7;
	}
}
