import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
	private int anInt1719 = 0;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "Lclient!vp;")
	private final Class288 aClass288_1 = new Class288();

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZLclient!ne;)V")
	@Override
	public void method5089(@OriginalArg(1) Class224 arg0) {
		super.anInt5935--;
		if (super.anInt5935 < 0) {
			super.anInt5935 = 4999;
		}
		super.aByteArray68[super.anInt5935] = 21;
		super.anObjectArray35[super.anInt5935] = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
	@Override
	public void method5090(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
	private void method1499() {
		@Pc(8) int local8 = super.anInt5935++;
		if (super.anInt5935 >= 5000) {
			super.anInt5935 = 0;
		}
		this.anInt1719 = super.aByteArray68[local8];
		@Pc(34) Object local34 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt1719 == 21) {
			Static6.method504(this.aClass288_1, (Class224) local34);
		} else if (this.anInt1719 == 20) {
			@Pc(152) Class224 local152 = (Class224) local34;
			if (local152.aClass11_Sub4_3 != null) {
				local152.aClass11_Sub4_3.method8110(Static114.aClass9_5);
			}
			if (local152.aClass11_Sub4_2 != null) {
				local152.aClass11_Sub4_2.method8110(Static114.aClass9_5);
			}
			if (local152.aClass11_Sub3_2 != null) {
				local152.aClass11_Sub3_2.method8110(Static114.aClass9_5);
			}
			if (local152.aClass11_Sub3_1 != null) {
				local152.aClass11_Sub3_1.method8110(Static114.aClass9_5);
			}
			if (local152.aClass11_Sub5_2 != null) {
				local152.aClass11_Sub5_2.method8110(Static114.aClass9_5);
			}
			for (@Pc(201) Class270 local201 = local152.aClass270_1; local201 != null; local201 = local201.aClass270_2) {
				local201.aClass11_Sub1_2.method8110(Static114.aClass9_5);
			}
		} else if (this.anInt1719 >= 30 && this.anInt1719 <= 33) {
			((Class62) local34).method8208(Static579.anInt7897, Static266.anInt4817, Static203.anInt4358, Static487.aBooleanArrayArray9, this.anInt1719 - 30 == 0);
		} else if (this.anInt1719 >= 40 && this.anInt1719 <= 43) {
			((Class62) local34).method8208(Static579.anInt7897, Static266.anInt4817, Static203.anInt4358, Static277.aBooleanArrayArray3, this.anInt1719 - 40 == 0);
		} else if (this.anInt1719 == 22) {
			Static114.aClass9_5.AA(-1, 1583160, 40, 127);
		} else if (this.anInt1719 == 23) {
			Static114.aClass9_5.k();
		} else if (this.anInt1719 == 24) {
			Static114.aClass9_5.method5401(0, null);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!d;IZI)V")
	@Override
	public void method5094(@OriginalArg(0) Class62 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		super.aByteArray68[super.anInt5940] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray35[super.anInt5940] = arg0;
		super.anInt5940++;
		if (super.anInt5940 >= 5000) {
			super.anInt5940 = 0;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	@Override
	public void method5095() {
		while (super.anInt5940 != super.anInt5935) {
			this.method1499();
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)V")
	@Override
	public void method5096(@OriginalArg(1) int arg0) {
		super.aByteArray68[super.anInt5940] = (byte) arg0;
		super.anInt5940++;
		if (super.anInt5940 >= 5000) {
			super.anInt5940 = 0;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!ne;)V")
	@Override
	public void method5091(@OriginalArg(1) Class224 arg0) {
		super.aByteArray68[super.anInt5940] = 20;
		super.anObjectArray35[super.anInt5940] = arg0;
		super.anInt5940++;
		if (super.anInt5940 >= 5000) {
			super.anInt5940 = 0;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	@Override
	public void method5088() {
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(ILclient!ne;)V")
	@Override
	public void method5092(@OriginalArg(1) Class224 arg0) {
		super.aByteArray68[super.anInt5940] = 21;
		super.anObjectArray35[super.anInt5940] = arg0;
		super.anInt5940++;
		if (super.anInt5940 >= 5000) {
			super.anInt5940 = 0;
		}
	}
}
