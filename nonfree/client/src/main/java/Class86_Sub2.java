import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uka")
public final class Class86_Sub2 extends Class86 implements Interface6 {

	@OriginalMember(owner = "client!uka", name = "c", descriptor = "I")
	private int anInt10187;

	@OriginalMember(owner = "client!uka", name = "<init>", descriptor = "(Lclient!pi;I[BI)V")
	public Class86_Sub2(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt10187 = arg1;
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(I)I")
	@Override
	public int method8718() {
		return 0;
	}

	@OriginalMember(owner = "client!uka", name = "b", descriptor = "(B)J")
	@Override
	public long method8719() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(I[BBI)V")
	@Override
	public void method8717(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method8715(arg1, arg0);
		this.anInt10187 = 5123;
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(B)I")
	@Override
	public int method8716() {
		return this.anInt10187;
	}
}
