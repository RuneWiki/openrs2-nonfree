import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class Class230 implements Interface16 {

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
	public final int anInt7385;

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
	public final int anInt7384;

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "Lclient!pd;")
	public final Class247 aClass247_13;

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "Lclient!tl;")
	public final Class319 aClass319_13;

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
	public final int anInt7381;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(ILclient!tl;Lclient!pd;II)V")
	public Class230(@OriginalArg(0) int arg0, @OriginalArg(1) Class319 arg1, @OriginalArg(2) Class247 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7385 = arg0;
		this.anInt7384 = arg3;
		this.aClass247_13 = arg2;
		this.aClass319_13 = arg1;
		this.anInt7381 = arg4;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)Lclient!jd;")
	@Override
	public Class153 method6332() {
		return Static167.aClass153_7;
	}
}
