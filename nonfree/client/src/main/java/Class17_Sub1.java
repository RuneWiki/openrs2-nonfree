import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class17_Sub1 extends Class17 implements Interface17 {

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	private int anInt4084;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!dia;I[BI)V")
	public Class17_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4084 = arg1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)I")
	@Override
	public int method6787() {
		return this.anInt4084;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZI[B)V")
	@Override
	public void method6786(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method8390(arg1, arg0);
		this.anInt4084 = 5123;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)J")
	@Override
	public long method6788() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)I")
	@Override
	public int method6789() {
		return 0;
	}
}
