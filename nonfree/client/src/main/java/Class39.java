import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class39 {

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
	public int anInt1166;

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
	public int anInt1167;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
	public int anInt1168;

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
	public int anInt1170;

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
	public int anInt1171;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
	public int anInt1173;

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
	public int anInt1175;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
	public int anInt1169 = 128;

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
	public int anInt1174 = 128;

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
	public int anInt1172;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I)V")
	public Class39(@OriginalArg(0) int arg0) {
		this.anInt1172 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(IIIIII)V")
	private Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1168 = arg4;
		this.anInt1172 = arg0;
		this.anInt1175 = arg5;
		this.anInt1169 = arg1;
		this.anInt1171 = arg3;
		this.anInt1174 = arg2;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)Lclient!ct;")
	public Class39 method1157() {
		return new Class39(this.anInt1172, this.anInt1169, this.anInt1174, this.anInt1171, this.anInt1168, this.anInt1175);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ct;B)V")
	public void method1158(@OriginalArg(0) Class39 arg0) {
		this.anInt1169 = arg0.anInt1169;
		this.anInt1175 = arg0.anInt1175;
		this.anInt1174 = arg0.anInt1174;
		this.anInt1168 = arg0.anInt1168;
		this.anInt1171 = arg0.anInt1171;
		this.anInt1172 = arg0.anInt1172;
	}
}
