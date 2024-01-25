import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class70_Sub2 extends Class70 {

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
	private int anInt6476 = 0;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "Lclient!jj;")
	private final Class120 aClass120_1 = new Class120();

	static {
		new Class83("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	@Override
	public void method5074() {
		while (super.anInt6471 != super.anInt6472) {
			this.method5083();
		}
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
	private void method5083() {
		@Pc(8) int local8 = super.anInt6471++;
		if (super.anInt6471 >= 5000) {
			super.anInt6471 = 0;
		}
		this.anInt6476 = super.aByteArray91[local8];
		@Pc(34) Object local34 = super.anObjectArray5[local8];
		super.anObjectArray5[local8] = null;
		if (this.anInt6476 == 21) {
			Static302.method4101(this.aClass120_1, (Class164) local34);
		} else if (this.anInt6476 == 20) {
			@Pc(161) Class164 local161 = (Class164) local34;
			if (local161.aClass16_Sub5_3 != null) {
				local161.aClass16_Sub5_3.method5335(Static390.aClass19_37);
			}
			if (local161.aClass16_Sub5_2 != null) {
				local161.aClass16_Sub5_2.method5335(Static390.aClass19_37);
			}
			if (local161.aClass16_Sub2_2 != null) {
				local161.aClass16_Sub2_2.method5335(Static390.aClass19_37);
			}
			if (local161.aClass16_Sub2_3 != null) {
				local161.aClass16_Sub2_3.method5335(Static390.aClass19_37);
			}
			if (local161.aClass16_Sub4_2 != null) {
				local161.aClass16_Sub4_2.method5335(Static390.aClass19_37);
			}
			for (@Pc(204) Class7 local204 = local161.aClass7_3; local204 != null; local204 = local204.aClass7_1) {
				local204.aClass16_Sub1_1.method5335(Static390.aClass19_37);
			}
		} else if (this.anInt6476 >= 30 && this.anInt6476 <= 33) {
			Static390.aClass19_37.g(3000.0F, super.aFloatArray29[local8] * 1.5F);
			((Class65) local34).method4029(Static431.anInt7073, Static93.anInt1887, Static230.anInt4431, Static252.aBooleanArrayArray4, this.anInt6476 - 30 == 0);
		} else if (this.anInt6476 >= 40 && this.anInt6476 <= 43) {
			Static390.aClass19_37.g(3000.0F, super.aFloatArray29[local8] * 1.5F);
			((Class65) local34).method4029(Static431.anInt7073, Static93.anInt1887, Static230.anInt4431, Static440.aBooleanArrayArray6, this.anInt6476 - 40 == 0);
		} else if (this.anInt6476 == 22) {
			Static390.aClass19_37.AA(-1, 1583160, 40, 127);
		} else if (this.anInt6476 == 23) {
			Static390.aClass19_37.l();
			return;
		} else if (this.anInt6476 == 24) {
			Static390.aClass19_37.method4238(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZLclient!ta;FB)V")
	@Override
	public void method5079(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) float arg3) {
		super.aByteArray91[super.anInt6472] = (byte) (arg1 ? arg0 + 40 : arg0 + 30);
		super.anObjectArray5[super.anInt6472] = arg2;
		super.aFloatArray29[super.anInt6472] = arg3;
		super.anInt6472++;
		if (super.anInt6472 >= 5000) {
			super.anInt6472 = 0;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)V")
	@Override
	public void method5077(@OriginalArg(1) int arg0) {
		super.aByteArray91[super.anInt6472] = (byte) arg0;
		super.anInt6472++;
		if (super.anInt6472 >= 5000) {
			super.anInt6472 = 0;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!nt;B)V")
	@Override
	public void method5076(@OriginalArg(0) Class164 arg0) {
		super.aByteArray91[super.anInt6472] = 20;
		super.anObjectArray5[super.anInt6472] = arg0;
		super.anInt6472++;
		if (super.anInt6472 >= 5000) {
			super.anInt6472 = 0;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLclient!nt;)V")
	@Override
	public void method5078(@OriginalArg(1) Class164 arg0) {
		super.anInt6471--;
		if (super.anInt6471 < 0) {
			super.anInt6471 = 4999;
		}
		super.aByteArray91[super.anInt6471] = 21;
		super.anObjectArray5[super.anInt6471] = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!nt;I)V")
	@Override
	public void method5080(@OriginalArg(0) Class164 arg0) {
		super.aByteArray91[super.anInt6472] = 21;
		super.anObjectArray5[super.anInt6472] = arg0;
		super.anInt6472++;
		if (super.anInt6472 >= 5000) {
			super.anInt6472 = 0;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	@Override
	public void method5075(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	@Override
	public void method5073() {
	}
}
