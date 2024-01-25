import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kha")
public final class Class57_Sub7 extends Class57 {

	@OriginalMember(owner = "client!kha", name = "w", descriptor = "F")
	private float aFloat125 = 0.0F;

	@OriginalMember(owner = "client!kha", name = "v", descriptor = "Lclient!mt;")
	private final Class211 aClass211_7;

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lclient!uv;Lclient!mt;)V")
	public Class57_Sub7(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class211 arg1) {
		super(arg0);
		this.aClass211_7 = arg1;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8707(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub2_23.method4022(Static503.aClass144_4, Static438.aClass144_3);
	}

	@OriginalMember(owner = "client!kha", name = "g", descriptor = "(I)V")
	@Override
	public void method8713() {
		if (super.aClass5_Sub2_23.method3970() != 0) {
			return;
		}
		@Pc(24) Class115_Sub3 local24 = super.aClass5_Sub2_23.method4064();
		super.aClass5_Sub2_23.method3954(1);
		@Pc(34) Class115_Sub3 local34 = super.aClass5_Sub2_23.method3960();
		local34.method6282(local24);
		local34.method6319(1.0F, 0.125F, 0.125F);
		local34.method6322(0.0F, this.aFloat125, 0.0F);
		super.aClass5_Sub2_23.method4011(Static281.aClass272_4);
		super.aClass5_Sub2_23.method3954(0);
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8712(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub2_23.method3954(1);
		super.aClass5_Sub2_23.method4022(Static503.aClass144_4, Static3.aClass144_1);
		super.aClass5_Sub2_23.method4029(0, true, Static522.aClass80_4, false);
		super.aClass5_Sub2_23.method3956(Static115.aClass80_1, 0);
		super.aClass5_Sub2_23.method3997(0);
		super.aClass5_Sub2_23.method3954(0);
		super.aClass5_Sub2_23.method3987(-16777216);
		super.aClass5_Sub2_23.method3956(Static347.aClass80_2, 0);
		this.method8713();
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(III)V")
	@Override
	public void method8710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass5_Sub2_23.method3954(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass5_Sub2_23.method4008((Interface4) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass211_7.aBoolean554) {
				this.aFloat125 = (float) (super.aClass5_Sub2_23.anInt4859 % 4000) / 4000.0F;
				super.aClass5_Sub2_23.method4008(this.aClass211_7.anInterface11_1);
			} else {
				@Pc(67) int local67 = super.aClass5_Sub2_23.anInt4859 % 4000 * 16 / 4000;
				super.aClass5_Sub2_23.method4008(this.aClass211_7.anInterface15Array1[local67]);
			}
		} else if (this.aClass211_7.aBoolean554) {
			super.aClass5_Sub2_23.method4008(this.aClass211_7.anInterface11_1);
		} else {
			super.aClass5_Sub2_23.method4008(this.aClass211_7.anInterface15Array1[0]);
		}
		super.aClass5_Sub2_23.method3954(0);
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8709() {
		return this.aClass211_7.method5816();
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IILclient!bl;)V")
	@Override
	public void method8706(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1) {
		super.aClass5_Sub2_23.method4008(arg1);
	}

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		super.aClass5_Sub2_23.method3954(1);
		super.aClass5_Sub2_23.method4022(Static438.aClass144_3, Static438.aClass144_3);
		super.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
		super.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
		super.aClass5_Sub2_23.method3997(1);
		super.aClass5_Sub2_23.method4008((Interface4) null);
		super.aClass5_Sub2_23.method3954(0);
		super.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
	}
}
