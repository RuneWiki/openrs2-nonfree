import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public final class Class235 {

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
	public int anInt7324;

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
	public int anInt7325;

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
	public int anInt7328;

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
	public int anInt7323 = 128;

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
	public int anInt7329 = 128;

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
	public int anInt7327;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(I)V")
	public Class235(@OriginalArg(0) int arg0) {
		this.anInt7327 = arg0;
	}

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(IIIIII)V")
	private Class235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7324 = arg3;
		this.anInt7328 = arg4;
		this.anInt7325 = arg5;
		this.anInt7327 = arg0;
		this.anInt7329 = arg2;
		this.anInt7323 = arg1;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!oaa;I)V")
	public void method6196(@OriginalArg(0) Class235 arg0) {
		this.anInt7324 = arg0.anInt7324;
		this.anInt7325 = arg0.anInt7325;
		this.anInt7327 = arg0.anInt7327;
		this.anInt7329 = arg0.anInt7329;
		this.anInt7328 = arg0.anInt7328;
		this.anInt7323 = arg0.anInt7323;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Lclient!oaa;")
	public Class235 method6197() {
		return new Class235(this.anInt7327, this.anInt7323, this.anInt7329, this.anInt7324, this.anInt7328, this.anInt7325);
	}
}
