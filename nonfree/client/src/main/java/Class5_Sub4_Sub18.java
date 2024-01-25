import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class5_Sub4_Sub18 extends Class5_Sub4 {

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
	public int anInt8973;

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
	public int anInt8975;

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
	public int anInt8976;

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
	public int anInt8979;

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
	public int anInt8980;

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "Lclient!hi;")
	public final Class143 aClass143_2;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "Lclient!se;")
	public final Class313 aClass313_1;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!hi;Lclient!l;)V")
	public Class5_Sub4_Sub18(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class14_Sub8 arg1) {
		this.aClass143_2 = arg0;
		this.aClass313_1 = this.aClass143_2.method3233();
		this.method7691();
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public void method7691() {
		this.anInt8975 = this.aClass143_2.anInt3661;
		this.anInt8979 = this.aClass143_2.anInt3655;
		this.anInt8980 = this.aClass143_2.anInt3654;
		if (this.aClass143_2.aClass117_3 != null) {
			this.aClass143_2.aClass117_3.method7255(this.aClass313_1.anInt8617, this.aClass313_1.anInt8612, this.aClass313_1.anInt8620, Static37.anIntArray52);
		}
		this.anInt8976 = Static37.anIntArray52[0];
		this.anInt8973 = Static37.anIntArray52[2];
	}
}
