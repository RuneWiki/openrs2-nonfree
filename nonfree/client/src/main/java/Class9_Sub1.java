import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "F")
	private float aFloat36 = 0.0F;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Lclient!ob;")
	private final Class242 aClass242_3;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!nh;Lclient!ob;)V")
	public Class9_Sub1(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) Class242 arg1) {
		super(arg0);
		this.aClass242_3 = arg1;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	@Override
	public void method8021() {
		super.aClass7_Sub1_23.method5746(1);
		super.aClass7_Sub1_23.method5764(Static468.aClass95_3, Static468.aClass95_3);
		super.aClass7_Sub1_23.method5681(0, Static411.aClass61_5);
		super.aClass7_Sub1_23.method5713(Static411.aClass61_5, 0);
		super.aClass7_Sub1_23.method5730(1);
		super.aClass7_Sub1_23.method5694(null);
		super.aClass7_Sub1_23.method5746(0);
		super.aClass7_Sub1_23.method5713(Static411.aClass61_5, 0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
		super.aClass7_Sub1_23.method5746(1);
		super.aClass7_Sub1_23.method5764(Static371.aClass95_1, Static563.aClass95_5);
		super.aClass7_Sub1_23.method5741(true, Static411.aClass61_5, false, 0);
		super.aClass7_Sub1_23.method5713(Static410.aClass61_6, 0);
		super.aClass7_Sub1_23.method5730(0);
		super.aClass7_Sub1_23.method5746(0);
		super.aClass7_Sub1_23.method5712(-16777216);
		super.aClass7_Sub1_23.method5713(Static18.aClass61_1, 0);
		this.method8025();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!aj;II)V")
	@Override
	public void method8029(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass7_Sub1_23.method5694(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8028() {
		return this.aClass242_3.method5534();
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
	@Override
	public void method8025() {
		if (super.aClass7_Sub1_23.method5670() != 0) {
			return;
		}
		@Pc(12) Class81_Sub1 local12 = super.aClass7_Sub1_23.method5759();
		super.aClass7_Sub1_23.method5746(1);
		@Pc(22) Class81_Sub1 local22 = super.aClass7_Sub1_23.method5727();
		local22.M(local12);
		local22.method1960(1.0F, 0.125F, 0.125F);
		local22.method1970(0.0F, 0.0F, this.aFloat36);
		super.aClass7_Sub1_23.method5737(Static581.aClass322_6);
		super.aClass7_Sub1_23.method5746(0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass7_Sub1_23.method5746(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass7_Sub1_23.method5694(null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass242_3.aBoolean489) {
				this.aFloat36 = (float) (super.aClass7_Sub1_23.anInt7377 % 4000) / 4000.0F;
				super.aClass7_Sub1_23.method5694(this.aClass242_3.anInterface23_2);
			} else {
				@Pc(64) int local64 = super.aClass7_Sub1_23.anInt7377 % 4000 * 16 / 4000;
				super.aClass7_Sub1_23.method5694(this.aClass242_3.anInterface4Array2[local64]);
			}
		} else if (this.aClass242_3.aBoolean489) {
			super.aClass7_Sub1_23.method5694(this.aClass242_3.anInterface23_2);
		} else {
			super.aClass7_Sub1_23.method5694(this.aClass242_3.anInterface4Array2[0]);
		}
		super.aClass7_Sub1_23.method5746(0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8030(@OriginalArg(1) boolean arg0) {
		super.aClass7_Sub1_23.method5764(Static468.aClass95_3, Static563.aClass95_5);
	}
}
