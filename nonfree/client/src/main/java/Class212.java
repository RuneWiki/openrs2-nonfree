import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public final class Class212 {

	@OriginalMember(owner = "client!r", name = "d", descriptor = "I")
	public int anInt5462;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "I")
	public int anInt5466;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public int anInt5467;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "I")
	public int anInt5459 = 128;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "I")
	public int anInt5463 = 128;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "I")
	public int anInt5461;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I)V")
	public Class212(@OriginalArg(0) int arg0) {
		this.anInt5461 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IIIIII)V")
	private Class212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5461 = arg0;
		this.anInt5466 = arg3;
		this.anInt5459 = arg1;
		this.anInt5462 = arg4;
		this.anInt5467 = arg5;
		this.anInt5463 = arg2;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)Lclient!r;")
	public Class212 method4385() {
		return new Class212(this.anInt5461, this.anInt5459, this.anInt5463, this.anInt5466, this.anInt5462, this.anInt5467);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!r;)V")
	public void method4388(@OriginalArg(1) Class212 arg0) {
		this.anInt5466 = arg0.anInt5466;
		this.anInt5459 = arg0.anInt5459;
		this.anInt5467 = arg0.anInt5467;
		this.anInt5461 = arg0.anInt5461;
		this.anInt5462 = arg0.anInt5462;
		this.anInt5463 = arg0.anInt5463;
	}
}
