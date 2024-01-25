import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class3_Sub7_Sub15 extends Class3_Sub7 {

	@OriginalMember(owner = "client!lv", name = "t", descriptor = "I")
	public int anInt6088;

	@OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
	public int anInt6089;

	@OriginalMember(owner = "client!lv", name = "u", descriptor = "I")
	public int anInt6090;

	@OriginalMember(owner = "client!lv", name = "v", descriptor = "I")
	public int anInt6091;

	@OriginalMember(owner = "client!lv", name = "z", descriptor = "I")
	public int anInt6093;

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "Lclient!lk;")
	public final Class232 aClass232_2;

	@OriginalMember(owner = "client!lv", name = "q", descriptor = "Lclient!em;")
	public final Class100 aClass100_1;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!lk;Lclient!ms;)V")
	public Class3_Sub7_Sub15(@OriginalArg(0) Class232 arg0, @OriginalArg(1) Class9_Sub5 arg1) {
		this.aClass232_2 = arg0;
		this.aClass100_1 = this.aClass232_2.method5129();
		this.method5313();
	}

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "(I)V")
	public void method5313() {
		this.anInt6088 = this.aClass232_2.anInt5879;
		this.anInt6093 = this.aClass232_2.anInt5884;
		this.anInt6089 = this.aClass232_2.anInt5886;
		if (this.aClass232_2.aClass58_4 != null) {
			this.aClass232_2.aClass58_4.method9512(this.aClass100_1.anInt2708, this.aClass100_1.anInt2722, this.aClass100_1.anInt2715, Static514.anIntArray731);
		}
		this.anInt6091 = Static514.anIntArray731[2];
		this.anInt6090 = Static514.anIntArray731[0];
	}
}
