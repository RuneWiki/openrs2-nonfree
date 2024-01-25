import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
	public int anInt764;

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
	public int anInt766;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
	public int anInt770;

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "Lclient!oa;")
	public final Class143 aClass143_1;

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "Lclient!ae;")
	public final Class6 aClass6_1;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!oa;Lclient!dp;)V")
	public Class4_Sub1_Sub4(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class17_Sub3 arg1) {
		this.aClass143_1 = arg0;
		this.aClass6_1 = Static129.method2606(arg0.anInt4557);
		this.method670();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
	public void method670() {
		this.anInt767 = this.aClass143_1.anInt4566;
		this.anInt764 = this.aClass143_1.anInt4562;
		this.anInt763 = this.aClass143_1.anInt4560;
		if (this.aClass143_1.aClass23_2 != null) {
			this.aClass143_1.aClass23_2.method5093(this.aClass6_1.anInt142, this.aClass6_1.anInt147, this.aClass6_1.anInt146, Static272.anIntArray453);
		}
		this.anInt770 = Static272.anIntArray453[0];
		this.anInt766 = Static272.anIntArray453[2];
	}
}
