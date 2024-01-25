import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public final class Class329 {

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
	public int anInt9268;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
	public int anInt9269;

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
	public int anInt9270;

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
	public int anInt9271;

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
	public int anInt9272;

	@OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
	public int anInt9274;

	@OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
	public int anInt9280;

	@OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
	public int anInt9281;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
	public int anInt9267 = 128;

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
	public int anInt9279 = 128;

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
	public int anInt9276;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(I)V")
	public Class329(@OriginalArg(0) int arg0) {
		this.anInt9276 = arg0;
	}

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(IIIIII)V")
	private Class329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9276 = arg0;
		this.anInt9267 = arg1;
		this.anInt9269 = arg4;
		this.anInt9280 = arg5;
		this.anInt9279 = arg2;
		this.anInt9274 = arg3;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)Lclient!vda;")
	public Class329 method7770() {
		return new Class329(this.anInt9276, this.anInt9267, this.anInt9279, this.anInt9274, this.anInt9269, this.anInt9280);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!vda;Z)V")
	public void method7771(@OriginalArg(0) Class329 arg0) {
		this.anInt9274 = arg0.anInt9274;
		this.anInt9269 = arg0.anInt9269;
		this.anInt9280 = arg0.anInt9280;
		this.anInt9276 = arg0.anInt9276;
		this.anInt9279 = arg0.anInt9279;
		this.anInt9267 = arg0.anInt9267;
	}
}
