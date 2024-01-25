import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class225 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
	public int anInt6165;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
	public int anInt6166;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
	public int anInt6167;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
	public int anInt6170;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
	public int anInt6172;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	public int anInt6173;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
	public int anInt6174;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
	public int anInt6177;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
	public int anInt6175 = 128;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
	public int anInt6176 = 128;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
	public int anInt6171;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V")
	public Class225(@OriginalArg(0) int arg0) {
		this.anInt6171 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIIII)V")
	private Class225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6170 = arg3;
		this.anInt6166 = arg4;
		this.anInt6171 = arg0;
		this.anInt6176 = arg2;
		this.anInt6175 = arg1;
		this.anInt6177 = arg5;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)Lclient!mi;")
	public Class225 method5324() {
		return new Class225(this.anInt6171, this.anInt6175, this.anInt6176, this.anInt6170, this.anInt6166, this.anInt6177);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!mi;)V")
	public void method5326(@OriginalArg(1) Class225 arg0) {
		this.anInt6175 = arg0.anInt6175;
		this.anInt6177 = arg0.anInt6177;
		this.anInt6176 = arg0.anInt6176;
		this.anInt6171 = arg0.anInt6171;
		this.anInt6166 = arg0.anInt6166;
		this.anInt6170 = arg0.anInt6170;
	}
}
