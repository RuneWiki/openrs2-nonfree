import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class189 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!c;")
	public Class35 aClass35_6;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public int anInt5342;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	public int anInt5346;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!pd;")
	public Class189 aClass189_1;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	public int anInt5348;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public final int anInt5345;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public final int anInt5343;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(II)V")
	public Class189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5345 = arg1;
		this.anInt5343 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!pd;I)V")
	public Class189(@OriginalArg(0) Class189 arg0, @OriginalArg(1) int arg1) {
		this.aClass189_1 = arg0;
		this.anInt5345 = arg1 + this.aClass189_1.anInt5345;
		this.anInt5343 = this.aClass189_1.anInt5343;
		this.aClass35_6 = this.aClass189_1.aClass35_6;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Lclient!wl;")
	public Class267 method4279() {
		return Static266.method3990(this.anInt5343);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)Lclient!pd;")
	public Class189 method4280(@OriginalArg(1) int arg0) {
		return new Class189(this.anInt5343, arg0);
	}
}
