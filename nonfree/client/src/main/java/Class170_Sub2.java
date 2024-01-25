import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class170_Sub2 extends Class170 implements Interface11 {

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
	private int anInt7322;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!na;I[BI)V")
	public Class170_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7322 = arg1;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5887(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method5883(arg1, arg0);
		this.anInt7322 = 5123;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)J")
	@Override
	public long method5884() {
		return super.aNativeBuffer4.b();
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)I")
	@Override
	public int method5886() {
		return 0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)I")
	@Override
	public int method5885() {
		return this.anInt7322;
	}
}
