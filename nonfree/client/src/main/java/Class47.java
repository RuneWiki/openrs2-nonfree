import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class47 {

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
	public int anInt1208;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
	public int anInt1209;

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
	public int anInt1214;

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
	public int anInt1216;

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
	public int anInt1218;

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
	public int anInt1220;

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
	public int anInt1221;

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
	public int anInt1213 = 128;

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
	public int anInt1215 = 128;

	@OriginalMember(owner = "client!cw", name = "n", descriptor = "I")
	public int anInt1219;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(I)V")
	public Class47(@OriginalArg(0) int arg0) {
		this.anInt1219 = arg0;
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(IIIIII)V")
	private Class47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1216 = arg5;
		this.anInt1220 = arg4;
		this.anInt1213 = arg1;
		this.anInt1219 = arg0;
		this.anInt1221 = arg3;
		this.anInt1215 = arg2;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!cw;I)V")
	public void method1069(@OriginalArg(0) Class47 arg0) {
		this.anInt1220 = arg0.anInt1220;
		this.anInt1219 = arg0.anInt1219;
		this.anInt1213 = arg0.anInt1213;
		this.anInt1221 = arg0.anInt1221;
		this.anInt1215 = arg0.anInt1215;
		this.anInt1216 = arg0.anInt1216;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)Lclient!cw;")
	public Class47 method1070() {
		return new Class47(this.anInt1219, this.anInt1213, this.anInt1215, this.anInt1221, this.anInt1220, this.anInt1216);
	}
}
