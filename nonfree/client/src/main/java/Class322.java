import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class322 implements Interface15 {

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "Lclient!bc;")
	private Class25 aClass25_40 = new Class25(128);

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "[I")
	public final int[] anIntArray623 = new int[Static164.aClass52_1.anInt1878];

	@OriginalMember(owner = "client!uca", name = "r", descriptor = "[I")
	private final int[] anIntArray624 = new int[Static164.aClass52_1.anInt1878];

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)V")
	public void method7758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class156 local8 = Static380.aClass46_1.method1595(arg1);
		@Pc(11) int local11 = local8.anInt4387;
		@Pc(22) int local22 = local8.anInt4390;
		@Pc(25) int local25 = local8.anInt4386;
		@Pc(31) int local31 = Class73_Sub2.anIntArray575[local25 - local22];
		if (arg0 < 0 || local31 < arg0) {
			arg0 = 0;
		}
		local31 <<= local22;
		this.method7762(local31 & arg0 << local22 | this.anIntArray623[local11] & ~local31, local11);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
	public void method7759() {
		for (@Pc(1) int local1 = 0; local1 < Static164.aClass52_1.anInt1878; local1++) {
			@Pc(15) Class342 local15 = Static164.aClass52_1.method1764(local1);
			if (local15 != null && local15.anInt9975 == 0) {
				this.anIntArray624[local1] = 0;
				this.anIntArray623[local1] = 0;
			}
		}
		this.aClass25_40 = new Class25(128);
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(II)I")
	@Override
	public int method7757(@OriginalArg(0) int arg0) {
		@Pc(13) Class156 local13 = Static380.aClass46_1.method1595(arg0);
		@Pc(16) int local16 = local13.anInt4387;
		@Pc(19) int local19 = local13.anInt4390;
		@Pc(22) int local22 = local13.anInt4386;
		@Pc(29) int local29 = Class73_Sub2.anIntArray575[local22 - local19];
		return this.anIntArray623[local16] >> local19 & local29;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(III)V")
	public void method7762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray623[arg1] = arg0;
		@Pc(18) Class3_Sub52 local18 = (Class3_Sub52) this.aClass25_40.method946((long) arg1);
		if (local18 == null) {
			local18 = new Class3_Sub52(Static376.method6088() + 500L);
			this.aClass25_40.method945(local18, (long) arg1);
		} else {
			local18.aLong263 = Static376.method6088() + 500L;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)I")
	@Override
	public int method7756(@OriginalArg(1) int arg0) {
		return this.anIntArray623[arg0];
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IZ)I")
	public int method7763(@OriginalArg(1) boolean arg0) {
		@Pc(14) long local14 = Static376.method6088();
		for (@Pc(28) Class3_Sub52 local28 = arg0 ? (Class3_Sub52) this.aClass25_40.method949() : (Class3_Sub52) this.aClass25_40.method947(); local28 != null; local28 = (Class3_Sub52) this.aClass25_40.method947()) {
			if (local14 > (local28.aLong263 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local28.aLong263 & 0x4000000000000000L) != 0L) {
					@Pc(51) int local51 = (int) local28.aLong262;
					this.anIntArray623[local51] = this.anIntArray624[local51];
					local28.method8412();
					return local51;
				}
				local28.method8412();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(III)V")
	public void method7764(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray624[arg0] = arg1;
		@Pc(25) Class3_Sub52 local25 = (Class3_Sub52) this.aClass25_40.method946((long) arg0);
		if (local25 == null) {
			local25 = new Class3_Sub52(4611686018427387905L);
			this.aClass25_40.method945(local25, (long) arg0);
		} else if (local25.aLong263 != 4611686018427387905L) {
			local25.aLong263 = Static376.method6088() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(III)V")
	public void method7765(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class156 local8 = Static380.aClass46_1.method1595(arg0);
		@Pc(11) int local11 = local8.anInt4387;
		@Pc(18) int local18 = local8.anInt4390;
		@Pc(21) int local21 = local8.anInt4386;
		@Pc(28) int local28 = Class73_Sub2.anIntArray575[local21 - local18];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local18;
		this.method7764(local11, local28 & arg1 << local18 | ~local28 & this.anIntArray624[local11]);
	}
}
