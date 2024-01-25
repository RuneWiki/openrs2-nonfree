import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class273 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public int anInt7136;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
	public int anInt7138;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public int anInt7141;

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
	public int anInt7142;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	public int anInt7145;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
	public int anInt7146;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
	public int anInt7148;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
	public int anInt7150;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	public int anInt7140 = 128;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
	public int anInt7139 = 128;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
	public int anInt7149;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V")
	public Class273(@OriginalArg(0) int arg0) {
		this.anInt7149 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(IIIIII)V")
	private Class273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7139 = arg1;
		this.anInt7140 = arg2;
		this.anInt7149 = arg0;
		this.anInt7146 = arg3;
		this.anInt7136 = arg4;
		this.anInt7145 = arg5;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!qg;I)V")
	public void method6079(@OriginalArg(0) Class273 arg0) {
		this.anInt7149 = arg0.anInt7149;
		this.anInt7146 = arg0.anInt7146;
		this.anInt7140 = arg0.anInt7140;
		this.anInt7145 = arg0.anInt7145;
		this.anInt7139 = arg0.anInt7139;
		this.anInt7136 = arg0.anInt7136;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Lclient!qg;")
	public Class273 method6081() {
		return new Class273(this.anInt7149, this.anInt7139, this.anInt7140, this.anInt7146, this.anInt7136, this.anInt7145);
	}
}
