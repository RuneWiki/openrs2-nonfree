import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class95 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	public int anInt2680;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public int anInt2681;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!hd;")
	public Class95 aClass95_2;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!n;")
	public Class11 aClass11_4;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	public int anInt2685;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
	public final int anInt2684;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	public final int anInt2682;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(II)V")
	public Class95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2684 = arg1;
		this.anInt2682 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!hd;I)V")
	public Class95(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1) {
		this.aClass95_2 = arg0;
		this.aClass11_4 = this.aClass95_2.aClass11_4;
		this.anInt2684 = this.aClass95_2.anInt2684 + arg1;
		this.anInt2682 = this.aClass95_2.anInt2682;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Lclient!ff;")
	public Class69 method2295() {
		return Static57.method1105(this.anInt2682);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lclient!hd;")
	public Class95 method2296(@OriginalArg(0) int arg0) {
		return new Class95(this.anInt2682, arg0);
	}
}
