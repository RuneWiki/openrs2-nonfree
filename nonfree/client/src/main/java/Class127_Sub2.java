import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class127_Sub2 extends Class127 implements Interface17 {

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
	private int anInt8711;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!hk;I[BI)V")
	public Class127_Sub2(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt8711 = arg1;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z[BII)V")
	@Override
	public void method7366(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method7363(arg0, arg1);
		this.anInt8711 = 5123;
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)I")
	@Override
	public int method7367() {
		return this.anInt8711;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)J")
	@Override
	public long method7364() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)I")
	@Override
	public int method7365() {
		return 0;
	}
}
