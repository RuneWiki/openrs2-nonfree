import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public final class Class280 {

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
	public int anInt8550;

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "Lclient!q;")
	public Class255 aClass255_7;

	@OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
	public int anInt8552;

	@OriginalMember(owner = "client!rea", name = "j", descriptor = "Lclient!rea;")
	public Class280 aClass280_2;

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
	public int anInt8555;

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
	public final int anInt8553;

	@OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
	public final int anInt8557;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(II)V")
	public Class280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8553 = arg0;
		this.anInt8557 = arg1;
	}

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!rea;I)V")
	public Class280(@OriginalArg(0) Class280 arg0, @OriginalArg(1) int arg1) {
		this.aClass280_2 = arg0;
		this.aClass255_7 = this.aClass280_2.aClass255_7;
		this.anInt8557 = arg1 + this.aClass280_2.anInt8557;
		this.anInt8553 = this.aClass280_2.anInt8553;
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)Lclient!bg;")
	public Class29 method7008() {
		return Static153.method2973(this.anInt8553);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZI)Lclient!rea;")
	public Class280 method7009(@OriginalArg(1) int arg0) {
		return new Class280(this.anInt8553, arg0);
	}
}
