import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public final class Class323 {

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
	public int anInt9336;

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
	public int anInt9343;

	@OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
	public int anInt9347;

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
	public int anInt9338 = 128;

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
	public int anInt9341 = 128;

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
	public int anInt9342;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(I)V")
	public Class323(@OriginalArg(0) int arg0) {
		this.anInt9342 = arg0;
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(IIIIII)V")
	private Class323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9341 = arg2;
		this.anInt9347 = arg5;
		this.anInt9338 = arg1;
		this.anInt9342 = arg0;
		this.anInt9336 = arg3;
		this.anInt9343 = arg4;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)Lclient!tw;")
	public Class323 method7610() {
		return new Class323(this.anInt9342, this.anInt9338, this.anInt9341, this.anInt9336, this.anInt9343, this.anInt9347);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lclient!tw;Z)V")
	public void method7611(@OriginalArg(0) Class323 arg0) {
		this.anInt9342 = arg0.anInt9342;
		this.anInt9338 = arg0.anInt9338;
		this.anInt9341 = arg0.anInt9341;
		this.anInt9343 = arg0.anInt9343;
		this.anInt9347 = arg0.anInt9347;
		this.anInt9336 = arg0.anInt9336;
	}
}
