import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jt", name = "O", descriptor = "I")
	private int anInt3844 = 4;

	@OriginalMember(owner = "client!jt", name = "P", descriptor = "I")
	private int anInt3845 = 4;

	static {
		new Class256("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(25) int local25 = Static131.anInt2581 / this.anInt3844;
			@Pc(30) int local30 = Static266.anInt4930 / this.anInt3845;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local30 <= 0) {
				local41 = this.method6037(0, 0);
			} else {
				local47 = arg0 % local30;
				local41 = this.method6037(local47 * Static266.anInt4930 / local30, 0);
			}
			for (local47 = 0; local47 < Static131.anInt2581; local47++) {
				if (local25 <= 0) {
					local16[local47] = local41[0];
				} else {
					@Pc(78) int local78 = local47 % local25;
					local16[local47] = local41[Static131.anInt2581 * local78 / local25];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt3844 = arg1.method3737();
		} else if (arg0 == 1) {
			this.anInt3845 = arg1.method3737();
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(25) int local25 = Static131.anInt2581 / this.anInt3844;
			@Pc(30) int local30 = Static266.anInt4930 / this.anInt3845;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method6031(0, Static266.anInt4930 * local36 / local30);
			} else {
				local46 = this.method6031(0, 0);
			}
			@Pc(58) int[] local58 = local46[0];
			@Pc(62) int[] local62 = local46[1];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local16[0];
			@Pc(74) int[] local74 = local16[1];
			@Pc(78) int[] local78 = local16[2];
			for (@Pc(80) int local80 = 0; local80 < Static131.anInt2581; local80++) {
				@Pc(94) int local94;
				if (local25 > 0) {
					@Pc(88) int local88 = local80 % local25;
					local94 = local88 * Static131.anInt2581 / local25;
				} else {
					local94 = 0;
				}
				local70[local80] = local58[local94];
				local74[local80] = local62[local94];
				local78[local80] = local66[local94];
			}
		}
		return local16;
	}
}
