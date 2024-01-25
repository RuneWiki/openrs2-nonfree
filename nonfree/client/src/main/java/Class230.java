import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class230 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public int anInt5994;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	public int anInt5996;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!sd;")
	public Class230 aClass230_2;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
	public int anInt6005;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Lclient!c;")
	public Class34 aClass34_6;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	public final int anInt6003;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	public final int anInt6004;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(II)V")
	public Class230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6003 = arg0;
		this.anInt6004 = arg1;
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!sd;I)V")
	public Class230(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1) {
		this.aClass230_2 = arg0;
		this.aClass34_6 = this.aClass230_2.aClass34_6;
		this.anInt6003 = this.aClass230_2.anInt6003;
		this.anInt6004 = this.aClass230_2.anInt6004 + arg1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Lclient!ki;")
	public Class140 method4832() {
		return Static383.method4925(this.anInt6003);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lclient!sd;")
	public Class230 method4833(@OriginalArg(1) int arg0) {
		return new Class230(this.anInt6003, arg0);
	}
}
