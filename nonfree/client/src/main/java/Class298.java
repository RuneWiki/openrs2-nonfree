import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public final class Class298 {

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
	public int anInt8936;

	@OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
	public int anInt8940;

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "B")
	private byte aByte110;

	@OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
	public int anInt8941;

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "I")
	public int anInt8942;

	@OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
	public int anInt8943;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "()V")
	public Class298() {
	}

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lclient!tn;)V")
	public Class298(@OriginalArg(0) Class3_Sub15 arg0) {
		this.aByte110 = arg0.method8440();
		this.anInt8941 = arg0.method8414();
		this.anInt8942 = arg0.method8402();
		this.anInt8943 = arg0.method8402();
		this.anInt8936 = arg0.method8402();
		this.anInt8940 = arg0.method8402();
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)I")
	public int method7371() {
		return (this.aByte110 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)I")
	public int method7374() {
		return this.aByte110 & 0x7;
	}
}
