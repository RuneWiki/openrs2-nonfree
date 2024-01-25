import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class114 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	public int anInt3297;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "I")
	public int anInt3299;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	public int anInt3300;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	public int anInt3303 = 128;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	public int anInt3306 = 128;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	public int anInt3305;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V")
	public Class114(@OriginalArg(0) int arg0) {
		this.anInt3305 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIII)V")
	private Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3303 = arg2;
		this.anInt3299 = arg5;
		this.anInt3306 = arg1;
		this.anInt3297 = arg4;
		this.anInt3305 = arg0;
		this.anInt3300 = arg3;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!he;Z)V")
	public void method2965(@OriginalArg(0) Class114 arg0) {
		this.anInt3297 = arg0.anInt3297;
		this.anInt3303 = arg0.anInt3303;
		this.anInt3299 = arg0.anInt3299;
		this.anInt3300 = arg0.anInt3300;
		this.anInt3305 = arg0.anInt3305;
		this.anInt3306 = arg0.anInt3306;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Lclient!he;")
	public Class114 method2967() {
		return new Class114(this.anInt3305, this.anInt3306, this.anInt3303, this.anInt3300, this.anInt3297, this.anInt3299);
	}
}
