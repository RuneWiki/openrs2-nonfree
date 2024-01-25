import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class265 {

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
	public int anInt7972;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	public int anInt7974;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "Lclient!rn;")
	public Class265 aClass265_1;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	public int anInt7975;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "Lclient!m;")
	public Class91 aClass91_6;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
	public final int anInt7979;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
	public final int anInt7977;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(II)V")
	public Class265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7979 = arg0;
		this.anInt7977 = arg1;
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!rn;I)V")
	public Class265(@OriginalArg(0) Class265 arg0, @OriginalArg(1) int arg1) {
		this.aClass265_1 = arg0;
		this.anInt7977 = this.aClass265_1.anInt7977 + arg1;
		this.aClass91_6 = this.aClass265_1.aClass91_6;
		this.anInt7979 = this.aClass265_1.anInt7979;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)Lclient!fl;")
	public Class102 method6595() {
		return Static10.method290(this.anInt7979);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)Lclient!rn;")
	public Class265 method6598(@OriginalArg(0) int arg0) {
		return new Class265(this.anInt7979, arg0);
	}
}
