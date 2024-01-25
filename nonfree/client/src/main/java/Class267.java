import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public final class Class267 {

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
	public int anInt7173;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
	public int anInt7174;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	public int anInt7175;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
	public int anInt7176;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
	public int anInt7179;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
	public int anInt7181;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
	public int anInt7185;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
	public int anInt7171 = 128;

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
	public int anInt7184 = 128;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
	public int anInt7170;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(I)V")
	public Class267(@OriginalArg(0) int arg0) {
		this.anInt7170 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(IIIIII)V")
	private Class267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7176 = arg5;
		this.anInt7184 = arg2;
		this.anInt7179 = arg4;
		this.anInt7170 = arg0;
		this.anInt7171 = arg1;
		this.anInt7185 = arg3;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!wk;B)V")
	public void method5644(@OriginalArg(0) Class267 arg0) {
		this.anInt7176 = arg0.anInt7176;
		this.anInt7171 = arg0.anInt7171;
		this.anInt7170 = arg0.anInt7170;
		this.anInt7179 = arg0.anInt7179;
		this.anInt7185 = arg0.anInt7185;
		this.anInt7184 = arg0.anInt7184;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Lclient!wk;")
	public Class267 method5646() {
		return new Class267(this.anInt7170, this.anInt7171, this.anInt7184, this.anInt7185, this.anInt7179, this.anInt7176);
	}
}
