import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class156 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Lclient!og;")
	public Class14_Sub1_Sub3 aClass14_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "S")
	public short aShort60;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "S")
	public short aShort61;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "S")
	public short aShort62;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!cj;")
	public Class14_Sub1_Sub2 aClass14_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "Lclient!cj;")
	public Class14_Sub1_Sub2 aClass14_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Lclient!nl;")
	public Class14_Sub1_Sub5 aClass14_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "Lclient!og;")
	public Class14_Sub1_Sub3 aClass14_Sub1_Sub3_2;

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "Lclient!jg;")
	public Class14_Sub1_Sub4 aClass14_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "Lclient!daa;")
	public Class66 aClass66_2;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "S")
	public short aShort63;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "Lclient!ih;")
	public Class156 aClass156_1;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "B")
	public byte aByte78;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V")
	public Class156(@OriginalArg(0) int arg0) {
		this.aByte78 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public void method3617() {
		while (this.aClass66_2 != null) {
			@Pc(19) Class66 local19 = this.aClass66_2.aClass66_1;
			this.aClass66_2.method1339();
			this.aClass66_2 = local19;
		}
	}
}
