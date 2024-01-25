import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class Class270 {

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	public int anInt7119;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!ok;")
	public Class270 aClass270_2;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public int anInt7120;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "Lclient!sj;")
	public Class10 aClass10_7;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public int anInt7124;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	public final int anInt7122;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	public final int anInt7121;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(II)V")
	public Class270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7122 = arg1;
		this.anInt7121 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lclient!ok;")
	public Class270 method6189(@OriginalArg(0) int arg0) {
		return new Class270(this.anInt7121, arg0);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Lclient!ot;")
	public Class274 method6191() {
		return Static257.method4233(this.anInt7121);
	}
}
