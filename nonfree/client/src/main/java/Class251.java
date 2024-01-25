import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class251 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
	public int anInt7181;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
	public int anInt7182;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
	public int anInt7183;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
	public int anInt7187;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	public int anInt7188;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	public int anInt7189;

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
	public int anInt7193;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	public int anInt7186 = 128;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
	public int anInt7184 = 128;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	public int anInt7190;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
	public Class251(@OriginalArg(0) int arg0) {
		this.anInt7190 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIII)V")
	private Class251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7181 = arg3;
		this.anInt7184 = arg2;
		this.anInt7190 = arg0;
		this.anInt7187 = arg4;
		this.anInt7193 = arg5;
		this.anInt7186 = arg1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method6155(@OriginalArg(0) Class251 arg0) {
		this.anInt7186 = arg0.anInt7186;
		this.anInt7193 = arg0.anInt7193;
		this.anInt7187 = arg0.anInt7187;
		this.anInt7184 = arg0.anInt7184;
		this.anInt7181 = arg0.anInt7181;
		this.anInt7190 = arg0.anInt7190;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Lclient!rg;")
	public Class251 method6156() {
		return new Class251(this.anInt7190, this.anInt7186, this.anInt7184, this.anInt7181, this.anInt7187, this.anInt7193);
	}
}
