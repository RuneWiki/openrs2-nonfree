import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class Class321 implements Interface17 {

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
	public final int anInt8628;

	@OriginalMember(owner = "client!wca", name = "k", descriptor = "Lclient!al;")
	public final Class18 aClass18_15;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
	public final int anInt8626;

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "Lclient!mfa;")
	public final Class239 aClass239_17;

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
	public final int anInt8627;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(ILclient!al;Lclient!mfa;II)V")
	public Class321(@OriginalArg(0) int arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8628 = arg4;
		this.aClass18_15 = arg1;
		this.anInt8626 = arg3;
		this.aClass239_17 = arg2;
		this.anInt8627 = arg0;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class152 method9627() {
		return Static661.aClass152_8;
	}
}
