import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class155_Sub2 extends Class155 {

	@OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
	private int anInt6162 = 0;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "Lclient!br;")
	private final Class25 aClass25_1 = new Class25();

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!sk;B)V")
	@Override
	public void method5565(@OriginalArg(0) Class187 arg0) {
		super.aByteArray95[super.anInt6146] = 21;
		super.anObjectArray35[super.anInt6146] = arg0;
		super.anInt6146++;
		if (super.anInt6146 >= 5000) {
			super.anInt6146 = 0;
		}
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V")
	private void method5577() {
		@Pc(8) int local8 = super.anInt6147++;
		if (super.anInt6147 >= 5000) {
			super.anInt6147 = 0;
		}
		this.anInt6162 = super.aByteArray95[local8];
		@Pc(37) Object local37 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt6162 == 21) {
			Static150.method2942(this.aClass25_1, (Class187) local37);
		} else if (this.anInt6162 == 20) {
			@Pc(59) Class187 local59 = (Class187) local37;
			if (local59.aClass44_Sub5_1 != null) {
				local59.aClass44_Sub5_1.method5775(Static289.aClass81_6);
			}
			if (local59.aClass44_Sub5_2 != null) {
				local59.aClass44_Sub5_2.method5775(Static289.aClass81_6);
			}
			if (local59.aClass44_Sub1_1 != null) {
				local59.aClass44_Sub1_1.method5775(Static289.aClass81_6);
			}
			if (local59.aClass44_Sub1_2 != null) {
				local59.aClass44_Sub1_2.method5775(Static289.aClass81_6);
			}
			if (local59.aClass44_Sub3_1 != null) {
				local59.aClass44_Sub3_1.method5775(Static289.aClass81_6);
			}
			for (@Pc(106) Class214 local106 = local59.aClass214_19; local106 != null; local106 = local106.aClass214_21) {
				local106.aClass44_Sub4_1.method5775(Static289.aClass81_6);
			}
		} else if (this.anInt6162 >= 30 && this.anInt6162 <= 33) {
			Static289.aClass81_6.method2974(3000.0F, super.aFloatArray29[local8] * 1.5F);
			((Class106) local37).method5723(Static339.anInt6187, Static8.anInt3154, Static30.anInt573, Static258.aBooleanArrayArray5, this.anInt6162 - 30 == 0);
		} else if (this.anInt6162 >= 40 && this.anInt6162 <= 43) {
			Static289.aClass81_6.method2974(3000.0F, super.aFloatArray29[local8] * 1.5F);
			((Class106) local37).method5723(Static339.anInt6187, Static8.anInt3154, Static30.anInt573, Static266.aBooleanArrayArray6, this.anInt6162 - 40 == 0);
		} else if (this.anInt6162 == 22) {
			Static289.aClass81_6.method3049();
		} else if (this.anInt6162 == 23) {
			Static289.aClass81_6.method3042();
		} else if (this.anInt6162 == 24) {
			Static289.aClass81_6.method3036(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(FBIZLclient!nc;)V")
	@Override
	public void method5566(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class106 arg3) {
		super.aByteArray95[super.anInt6146] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray35[super.anInt6146] = arg3;
		super.aFloatArray29[super.anInt6146] = arg0;
		super.anInt6146++;
		if (super.anInt6146 >= 5000) {
			super.anInt6146 = 0;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!sk;)V")
	@Override
	public void method5567(@OriginalArg(1) Class187 arg0) {
		super.anInt6147--;
		if (super.anInt6147 < 0) {
			super.anInt6147 = 4999;
		}
		super.aByteArray95[super.anInt6147] = 21;
		super.anObjectArray35[super.anInt6147] = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V")
	@Override
	public void method5572() {
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IB)V")
	@Override
	public void method5571(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
	@Override
	public void method5570(@OriginalArg(1) int arg0) {
		super.aByteArray95[super.anInt6146] = (byte) arg0;
		super.anInt6146++;
		if (super.anInt6146 >= 5000) {
			super.anInt6146 = 0;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
	@Override
	public void method5569() {
		while (super.anInt6146 != super.anInt6147) {
			this.method5577();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!sk;I)V")
	@Override
	public void method5563(@OriginalArg(0) Class187 arg0) {
		super.aByteArray95[super.anInt6146] = 20;
		super.anObjectArray35[super.anInt6146] = arg0;
		super.anInt6146++;
		if (super.anInt6146 >= 5000) {
			super.anInt6146 = 0;
		}
	}
}
