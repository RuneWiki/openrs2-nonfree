import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class9_Sub8 extends Class9 {

	@OriginalMember(owner = "client!no", name = "n", descriptor = "Z")
	private boolean aBoolean476 = false;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class9_Sub8(@OriginalArg(0) Class7_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8030(@OriginalArg(1) boolean arg0) {
		super.aClass7_Sub1_23.method5764(Static468.aClass95_3, Static563.aClass95_5);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
		@Pc(18) Interface11 local18 = super.aClass7_Sub1_23.method5693();
		if (local18 == null || !arg0) {
			super.aClass7_Sub1_23.method5713(Static308.aClass61_4, 0);
			return;
		}
		super.aClass7_Sub1_23.method5746(1);
		super.aClass7_Sub1_23.method5694(local18);
		super.aClass7_Sub1_23.method5684(Static153.aClass143_1);
		super.aClass7_Sub1_23.method5746(1);
		super.aClass7_Sub1_23.method5764(Static509.aClass95_4, Static563.aClass95_5);
		super.aClass7_Sub1_23.method5741(true, Static410.aClass61_6, false, 2);
		super.aClass7_Sub1_23.method5713(Static308.aClass61_4, 0);
		@Pc(80) Class81_Sub1 local80 = super.aClass7_Sub1_23.method5727();
		local80.method1958(super.aClass7_Sub1_23.method5722());
		super.aClass7_Sub1_23.method5737(Static560.aClass322_5);
		super.aClass7_Sub1_23.method5746(0);
		this.aBoolean476 = true;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	@Override
	public void method8021() {
		if (this.aBoolean476) {
			super.aClass7_Sub1_23.method5746(1);
			super.aClass7_Sub1_23.method5684(Static469.aClass143_4);
			super.aClass7_Sub1_23.method5764(Static468.aClass95_3, Static468.aClass95_3);
			super.aClass7_Sub1_23.method5681(2, Static18.aClass61_1);
			super.aClass7_Sub1_23.method5713(Static411.aClass61_5, 0);
			super.aClass7_Sub1_23.method5750();
			super.aClass7_Sub1_23.method5694(null);
			super.aClass7_Sub1_23.method5746(0);
			this.aBoolean476 = false;
		} else {
			super.aClass7_Sub1_23.method5713(Static411.aClass61_5, 0);
		}
		super.aClass7_Sub1_23.method5764(Static468.aClass95_3, Static468.aClass95_3);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!aj;II)V")
	@Override
	public void method8029(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass7_Sub1_23.method5694(arg0);
		super.aClass7_Sub1_23.method5757(arg1);
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8028() {
		return true;
	}
}
