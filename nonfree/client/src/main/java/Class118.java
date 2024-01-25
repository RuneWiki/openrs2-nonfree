import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class118 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
	public int anInt3979;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public int anInt3981;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public int anInt3983;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	public int anInt3984;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public int anInt3985;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "B")
	private byte aByte33;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class118() {
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class118(@OriginalArg(0) Class6_Sub8 arg0) {
		this.aByte33 = arg0.method8208();
		this.anInt3984 = arg0.method8220();
		this.anInt3979 = arg0.method8236();
		this.anInt3985 = arg0.method8236();
		this.anInt3983 = arg0.method8236();
		this.anInt3981 = arg0.method8236();
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)I")
	public int method3393() {
		return (this.aByte33 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	public int method3395() {
		return this.aByte33 & 0x7;
	}
}
