import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public final class Class235 {

	@OriginalMember(owner = "client!mha", name = "i", descriptor = "I")
	public int anInt6345;

	@OriginalMember(owner = "client!mha", name = "k", descriptor = "I")
	public int anInt6346;

	@OriginalMember(owner = "client!mha", name = "h", descriptor = "I")
	public int anInt6350;

	@OriginalMember(owner = "client!mha", name = "j", descriptor = "I")
	public int anInt6349 = 128;

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "I")
	public int anInt6352 = 128;

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "I")
	public int anInt6348;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(I)V")
	public Class235(@OriginalArg(0) int arg0) {
		this.anInt6348 = arg0;
	}

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(IIIIII)V")
	private Class235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6345 = arg3;
		this.anInt6349 = arg1;
		this.anInt6348 = arg0;
		this.anInt6350 = arg4;
		this.anInt6352 = arg2;
		this.anInt6346 = arg5;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)Lclient!mha;")
	public Class235 method5416() {
		return new Class235(this.anInt6348, this.anInt6349, this.anInt6352, this.anInt6345, this.anInt6350, this.anInt6346);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ILclient!mha;)V")
	public void method5418(@OriginalArg(1) Class235 arg0) {
		this.anInt6352 = arg0.anInt6352;
		this.anInt6346 = arg0.anInt6346;
		this.anInt6345 = arg0.anInt6345;
		this.anInt6348 = arg0.anInt6348;
		this.anInt6350 = arg0.anInt6350;
		this.anInt6349 = arg0.anInt6349;
	}
}
