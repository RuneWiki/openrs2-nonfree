import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class374 {

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
	public int anInt10300;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
	public int anInt10301;

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
	public int anInt10302;

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
	public int anInt10305;

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "B")
	private byte aByte136;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
	public int anInt10307;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class374() {
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class374(@OriginalArg(0) Class2_Sub20 arg0) {
		this.aByte136 = arg0.method8536();
		this.anInt10301 = arg0.method8575();
		this.anInt10307 = arg0.method8555(-9372);
		this.anInt10300 = arg0.method8555(-9372);
		this.anInt10305 = arg0.method8555(-9372);
		this.anInt10302 = arg0.method8555(-9372);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I")
	public int method9031() {
		return this.aByte136 & 0x7;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)I")
	public int method9033() {
		return (this.aByte136 & 0x8) == 8 ? 1 : 0;
	}
}
