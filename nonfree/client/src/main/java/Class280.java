import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public final class Class280 {

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "Lclient!rea;")
	public Class280 aClass280_2;

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
	public int anInt7964;

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
	public int anInt7965;

	@OriginalMember(owner = "client!rea", name = "j", descriptor = "Lclient!q;")
	public Class42 aClass42_5;

	@OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
	public int anInt7971;

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
	public final int anInt7969;

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
	public final int anInt7963;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(II)V")
	public Class280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7969 = arg0;
		this.anInt7963 = arg1;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)Lclient!rea;")
	public Class280 method6280(@OriginalArg(1) int arg0) {
		return new Class280(this.anInt7969, arg0);
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)Lclient!mh;")
	public Class205 method6283() {
		return Static384.method5345(this.anInt7969);
	}
}
