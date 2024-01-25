import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public final class Class326 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public int anInt9247;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
	public int anInt9254;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	public int anInt9256;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	public int anInt9251 = 128;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
	public int anInt9255 = 128;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	public int anInt9252;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
	public Class326(@OriginalArg(0) int arg0) {
		this.anInt9252 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIII)V")
	private Class326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9247 = arg4;
		this.anInt9255 = arg2;
		this.anInt9256 = arg5;
		this.anInt9252 = arg0;
		this.anInt9251 = arg1;
		this.anInt9254 = arg3;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLclient!vc;)V")
	public void method7760(@OriginalArg(1) Class326 arg0) {
		this.anInt9247 = arg0.anInt9247;
		this.anInt9256 = arg0.anInt9256;
		this.anInt9255 = arg0.anInt9255;
		this.anInt9254 = arg0.anInt9254;
		this.anInt9252 = arg0.anInt9252;
		this.anInt9251 = arg0.anInt9251;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Lclient!vc;")
	public Class326 method7761() {
		return new Class326(this.anInt9252, this.anInt9251, this.anInt9255, this.anInt9254, this.anInt9247, this.anInt9256);
	}
}
