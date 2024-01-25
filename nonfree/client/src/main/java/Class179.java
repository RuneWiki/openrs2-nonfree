import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class179 {

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Lclient!c;")
	public Class31 aClass31_4;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	public int anInt5340;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
	public int anInt5342;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!pf;")
	public Class179 aClass179_2;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
	public int anInt5347;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
	public final int anInt5338;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
	public final int anInt5339;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5338 = arg1;
		this.anInt5339 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!pf;I)V")
	public Class179(@OriginalArg(0) Class179 arg0, @OriginalArg(1) int arg1) {
		this.aClass179_2 = arg0;
		this.anInt5339 = this.aClass179_2.anInt5339;
		this.aClass31_4 = this.aClass179_2.aClass31_4;
		this.anInt5338 = this.aClass179_2.anInt5338 + arg1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)Lclient!pf;")
	public Class179 method4104(@OriginalArg(0) int arg0) {
		return new Class179(this.anInt5339, arg0);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)Lclient!ah;")
	public Class8 method4106() {
		return Static87.method1587(this.anInt5339);
	}
}
