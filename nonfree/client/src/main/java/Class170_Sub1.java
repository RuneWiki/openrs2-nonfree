import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class170_Sub1 extends Class170 implements Interface9 {

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	private int anInt8401;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!ac;I[BI)V")
	public Class170_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt8401 = arg1;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)I")
	@Override
	public int method7035() {
		return 0;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)J")
	@Override
	public long method7038() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)I")
	@Override
	public int method7037() {
		return this.anInt8401;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method7036(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method7392(arg0, arg1);
		this.anInt8401 = 5123;
	}
}
