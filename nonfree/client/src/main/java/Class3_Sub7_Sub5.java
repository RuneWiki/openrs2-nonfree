import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class3_Sub7_Sub5 extends Class3_Sub7 {

	@OriginalMember(owner = "client!dq", name = "w", descriptor = "I")
	public int anInt1389;

	@OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
	public int anInt1390;

	@OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
	public int anInt1392;

	@OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
	public int anInt1394;

	@OriginalMember(owner = "client!dq", name = "F", descriptor = "I")
	public int anInt1395;

	@OriginalMember(owner = "client!dq", name = "v", descriptor = "Lclient!ti;")
	public final Class191 aClass191_1;

	@OriginalMember(owner = "client!dq", name = "z", descriptor = "Lclient!u;")
	public final Class196 aClass196_1;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!ti;Lclient!nd;)V")
	public Class3_Sub7_Sub5(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class8_Sub5 arg1) {
		this.aClass191_1 = arg0;
		this.aClass196_1 = Static152.method2446(arg0.anInt5988);
		this.method1086();
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)V")
	public void method1086() {
		this.anInt1389 = this.aClass191_1.anInt5986;
		this.anInt1395 = this.aClass191_1.anInt5989;
		this.anInt1392 = this.aClass191_1.anInt5991;
		if (this.aClass191_1.aClass56_5 != null) {
			this.aClass191_1.aClass56_5.method4689(this.aClass196_1.anInt6160, this.aClass196_1.anInt6158, this.aClass196_1.anInt6155, Static33.anIntArray48);
		}
		this.anInt1390 = Static33.anIntArray48[0];
		this.anInt1394 = Static33.anIntArray48[2];
	}
}
