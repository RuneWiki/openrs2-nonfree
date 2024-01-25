import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class4_Sub4_Sub9 extends Class4_Sub4 {

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
	private int anInt1945 = 4;

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
	private int anInt1941 = 4;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(30) int local30 = Static419.anInt6404 / this.anInt1945;
			@Pc(35) int local35 = Static91.anInt1740 / this.anInt1941;
			@Pc(46) int[][] local46;
			if (local35 <= 0) {
				local46 = this.method6049(0, 0);
			} else {
				@Pc(52) int local52 = arg0 % local35;
				local46 = this.method6049(Static91.anInt1740 * local52 / local35, 0);
			}
			@Pc(66) int[] local66 = local46[0];
			@Pc(70) int[] local70 = local46[1];
			@Pc(74) int[] local74 = local46[2];
			@Pc(78) int[] local78 = local13[0];
			@Pc(82) int[] local82 = local13[1];
			@Pc(86) int[] local86 = local13[2];
			for (@Pc(88) int local88 = 0; local88 < Static419.anInt6404; local88++) {
				@Pc(102) int local102;
				if (local30 > 0) {
					@Pc(96) int local96 = local88 % local30;
					local102 = Static419.anInt6404 * local96 / local30;
				} else {
					local102 = 0;
				}
				local78[local88] = local66[local102];
				local82[local88] = local70[local102];
				local86[local88] = local74[local102];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(28) int local28 = Static419.anInt6404 / this.anInt1945;
			@Pc(33) int local33 = Static91.anInt1740 / this.anInt1941;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local33 <= 0) {
				local41 = this.method6040(0, 0);
			} else {
				local47 = arg0 % local33;
				local41 = this.method6040(local47 * Static91.anInt1740 / local33, 0);
			}
			for (local47 = 0; local47 < Static419.anInt6404; local47++) {
				if (local28 <= 0) {
					local11[local47] = local41[0];
				} else {
					@Pc(75) int local75 = local47 % local28;
					local11[local47] = local41[local75 * Static419.anInt6404 / local28];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt1945 = arg1.method5007();
		} else if (arg0 == 1) {
			this.anInt1941 = arg1.method5007();
		}
	}
}
