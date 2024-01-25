import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class19 {

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	public int anInt268;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "I")
	public int anInt272;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "I")
	public int anInt276;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "I")
	public int anInt269 = 128;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "I")
	public int anInt273 = 128;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "I")
	public int anInt267;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V")
	public Class19(@OriginalArg(0) int arg0) {
		this.anInt267 = arg0;
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIII)V")
	private Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt268 = arg3;
		this.anInt272 = arg4;
		this.anInt267 = arg0;
		this.anInt276 = arg5;
		this.anInt269 = arg1;
		this.anInt273 = arg2;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Lclient!al;")
	public Class19 method240() {
		return new Class19(this.anInt267, this.anInt269, this.anInt273, this.anInt268, this.anInt272, this.anInt276);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLclient!al;)V")
	public void method241(@OriginalArg(1) Class19 arg0) {
		this.anInt268 = arg0.anInt268;
		this.anInt273 = arg0.anInt273;
		this.anInt267 = arg0.anInt267;
		this.anInt269 = arg0.anInt269;
		this.anInt272 = arg0.anInt272;
		this.anInt276 = arg0.anInt276;
	}
}
