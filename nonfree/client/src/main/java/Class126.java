import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class126 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public int anInt4518;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public int anInt4519;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	public int anInt4521;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public int anInt4523;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public int anInt4525;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	public int anInt4526;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
	public int anInt4529;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	public int anInt4530;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
	public int anInt4532 = 128;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	public int anInt4531 = 128;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	public int anInt4528;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V")
	public Class126(@OriginalArg(0) int arg0) {
		this.anInt4528 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIII)V")
	private Class126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4525 = arg3;
		this.anInt4531 = arg1;
		this.anInt4528 = arg0;
		this.anInt4532 = arg2;
		this.anInt4529 = arg4;
		this.anInt4518 = arg5;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Lclient!hc;")
	public Class126 method3641() {
		return new Class126(this.anInt4528, this.anInt4531, this.anInt4532, this.anInt4525, this.anInt4529, this.anInt4518);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!hc;)V")
	public void method3642(@OriginalArg(1) Class126 arg0) {
		this.anInt4529 = arg0.anInt4529;
		this.anInt4518 = arg0.anInt4518;
		this.anInt4528 = arg0.anInt4528;
		this.anInt4531 = arg0.anInt4531;
		this.anInt4532 = arg0.anInt4532;
		this.anInt4525 = arg0.anInt4525;
	}
}
