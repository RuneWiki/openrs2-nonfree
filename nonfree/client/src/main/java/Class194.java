import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class Class194 implements Interface23 {

	@OriginalMember(owner = "client!sea", name = "i", descriptor = "Lclient!pe;")
	public final Class258 aClass258_4;

	@OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
	public final int anInt5695;

	@OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
	public final int anInt5694;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "Lclient!op;")
	public final Class250 aClass250_6;

	@OriginalMember(owner = "client!sea", name = "k", descriptor = "I")
	public final int anInt5698;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(ILclient!pe;Lclient!op;II)V")
	public Class194(@OriginalArg(0) int arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass258_4 = arg1;
		this.anInt5695 = arg0;
		this.anInt5694 = arg3;
		this.aClass250_6 = arg2;
		this.anInt5698 = arg4;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)Lclient!sq;")
	@Override
	public Class307 method8175() {
		return Static196.aClass307_5;
	}
}
