import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class280 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!m;")
	public Class78 aClass78_6;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
	public int anInt8068;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
	public int anInt8070;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "Lclient!tf;")
	public Class280 aClass280_2;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
	public int anInt8075;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
	public final int anInt8077;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public final int anInt8071;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(II)V")
	public Class280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8077 = arg1;
		this.anInt8071 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!tf;I)V")
	public Class280(@OriginalArg(0) Class280 arg0, @OriginalArg(1) int arg1) {
		this.aClass280_2 = arg0;
		this.anInt8077 = this.aClass280_2.anInt8077 + arg1;
		this.aClass78_6 = this.aClass280_2.aClass78_6;
		this.anInt8071 = this.aClass280_2.anInt8071;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Lclient!i;")
	public Class137 method6569() {
		return Static374.method5621(this.anInt8071);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)Lclient!tf;")
	public Class280 method6572(@OriginalArg(1) int arg0) {
		return new Class280(this.anInt8071, arg0);
	}
}
