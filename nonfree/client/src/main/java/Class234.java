import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class234 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public int anInt7175;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "I")
	public int anInt7177;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public int anInt7178;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	public int anInt7176 = 128;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "I")
	public int anInt7184 = 128;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "I")
	public int anInt7179;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V")
	public Class234(@OriginalArg(0) int arg0) {
		this.anInt7179 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIII)V")
	private Class234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7179 = arg0;
		this.anInt7177 = arg4;
		this.anInt7184 = arg2;
		this.anInt7178 = arg3;
		this.anInt7175 = arg5;
		this.anInt7176 = arg1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!o;)V")
	public void method5978(@OriginalArg(1) Class234 arg0) {
		this.anInt7178 = arg0.anInt7178;
		this.anInt7179 = arg0.anInt7179;
		this.anInt7175 = arg0.anInt7175;
		this.anInt7176 = arg0.anInt7176;
		this.anInt7177 = arg0.anInt7177;
		this.anInt7184 = arg0.anInt7184;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)Lclient!o;")
	public Class234 method5983() {
		return new Class234(this.anInt7179, this.anInt7176, this.anInt7184, this.anInt7178, this.anInt7177, this.anInt7175);
	}
}
