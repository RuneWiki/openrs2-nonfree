import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class Class67 {

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Lclient!v;")
	public Class181 aClass181_1;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "I")
	public int anInt1836;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(II)V")
	public Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass181_1 = Static183.method3088(arg0);
		this.anInt1836 = arg1;
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!v;I)V")
	public Class67(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1) {
		this.aClass181_1 = arg0;
		this.anInt1836 = arg1;
	}
}
