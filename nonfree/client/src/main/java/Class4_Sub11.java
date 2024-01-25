import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "F")
	private float aFloat196 = 0.0F;

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "Lclient!lja;")
	private final Class202 aClass202_8;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!ai;Lclient!lja;)V")
	public Class4_Sub11(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_8 = arg1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBLclient!bm;)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		super.aClass13_Sub1_23.method7530(arg1);
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(B)V")
	@Override
	public void method7858() {
		super.aClass13_Sub1_23.method7461(1);
		super.aClass13_Sub1_23.method7521(Static580.aClass203_4, Static580.aClass203_4);
		super.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
		super.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
		super.aClass13_Sub1_23.method7527(1);
		super.aClass13_Sub1_23.method7530((Interface3) null);
		super.aClass13_Sub1_23.method7461(0);
		super.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7852(@OriginalArg(1) boolean arg0) {
		super.aClass13_Sub1_23.method7521(Static265.aClass203_3, Static580.aClass203_4);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7848() {
		return this.aClass202_8.method5174();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7856(@OriginalArg(0) boolean arg0) {
		super.aClass13_Sub1_23.method7461(1);
		super.aClass13_Sub1_23.method7521(Static265.aClass203_3, Static191.aClass203_2);
		super.aClass13_Sub1_23.method7498(true, false, 0, Static523.aClass326_5);
		super.aClass13_Sub1_23.method7517(0, Static348.aClass326_4);
		super.aClass13_Sub1_23.method7527(0);
		super.aClass13_Sub1_23.method7461(0);
		super.aClass13_Sub1_23.method7539(-16777216);
		super.aClass13_Sub1_23.method7517(0, Static125.aClass326_1);
		this.method7851();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass13_Sub1_23.method7461(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass13_Sub1_23.method7530((Interface3) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass202_8.aBoolean412) {
				this.aFloat196 = (float) (super.aClass13_Sub1_23.anInt8613 % 4000) / 4000.0F;
				super.aClass13_Sub1_23.method7530(this.aClass202_8.anInterface21_2);
			} else {
				@Pc(91) int local91 = super.aClass13_Sub1_23.anInt8613 % 4000 * 16 / 4000;
				super.aClass13_Sub1_23.method7530(this.aClass202_8.anInterface7Array2[local91]);
			}
		} else if (this.aClass202_8.aBoolean412) {
			super.aClass13_Sub1_23.method7530(this.aClass202_8.anInterface21_2);
		} else {
			super.aClass13_Sub1_23.method7530(this.aClass202_8.anInterface7Array2[0]);
		}
		super.aClass13_Sub1_23.method7461(0);
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
	@Override
	public void method7851() {
		if (super.aClass13_Sub1_23.method7473() != 0) {
			return;
		}
		@Pc(24) Class239_Sub3 local24 = super.aClass13_Sub1_23.method7420();
		super.aClass13_Sub1_23.method7461(1);
		@Pc(34) Class239_Sub3 local34 = super.aClass13_Sub1_23.method7512();
		local34.method9247(local24);
		local34.method9256(1.0F, 0.125F, 0.125F);
		local34.method9271(this.aFloat196, 0.0F, 0.0F);
		super.aClass13_Sub1_23.method7464(Static293.aClass94_6);
		super.aClass13_Sub1_23.method7461(0);
	}
}
