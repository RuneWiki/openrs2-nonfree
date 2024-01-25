import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class320 {

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
	public int anInt8923;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!tc;")
	public Class113 aClass113_8;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!sn;")
	public Class320 aClass320_2;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
	public int anInt8925;

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
	public int anInt8926;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
	public final int anInt8924;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
	public final int anInt8921;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(II)V")
	public Class320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8924 = arg1;
		this.anInt8921 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)Lclient!sn;")
	public Class320 method7682(@OriginalArg(0) int arg0) {
		return new Class320(this.anInt8921, arg0);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)Lclient!tda;")
	public Class328 method7683() {
		return Static16.method233(this.anInt8921);
	}
}
