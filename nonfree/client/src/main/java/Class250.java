import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class250 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "Lclient!q;")
	public Class34 aClass34_10;

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "Lclient!pp;")
	public Class250 aClass250_2;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
	public int anInt6987;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
	public int anInt6988;

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
	public int anInt6992;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
	public final int anInt6994;

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
	public final int anInt6989;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(II)V")
	public Class250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6994 = arg0;
		this.anInt6989 = arg1;
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!pp;I)V")
	public Class250(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1) {
		this.aClass250_2 = arg0;
		this.anInt6994 = this.aClass250_2.anInt6994;
		this.aClass34_10 = this.aClass250_2.aClass34_10;
		this.anInt6989 = arg1 + this.aClass250_2.anInt6989;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)Lclient!un;")
	public Class319 method5827() {
		return Static342.method7459(this.anInt6994);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)Lclient!pp;")
	public Class250 method5828(@OriginalArg(1) int arg0) {
		return new Class250(this.anInt6994, arg0);
	}
}
