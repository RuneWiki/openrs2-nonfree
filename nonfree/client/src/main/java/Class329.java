import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class329 {

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
	public int anInt8848;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
	public int anInt8849;

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
	public int anInt8858;

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
	public int anInt8852 = 128;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
	public int anInt8857 = 128;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
	public int anInt8856;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(I)V")
	public Class329(@OriginalArg(0) int arg0) {
		this.anInt8856 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(IIIIII)V")
	private Class329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8857 = arg2;
		this.anInt8849 = arg3;
		this.anInt8848 = arg5;
		this.anInt8856 = arg0;
		this.anInt8858 = arg4;
		this.anInt8852 = arg1;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!rr;I)V")
	public void method7827(@OriginalArg(0) Class329 arg0) {
		this.anInt8858 = arg0.anInt8858;
		this.anInt8849 = arg0.anInt8849;
		this.anInt8848 = arg0.anInt8848;
		this.anInt8852 = arg0.anInt8852;
		this.anInt8857 = arg0.anInt8857;
		this.anInt8856 = arg0.anInt8856;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Lclient!rr;")
	public Class329 method7828() {
		return new Class329(this.anInt8856, this.anInt8852, this.anInt8857, this.anInt8849, this.anInt8858, this.anInt8848);
	}
}
