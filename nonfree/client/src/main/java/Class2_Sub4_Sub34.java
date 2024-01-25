import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class2_Sub4_Sub34 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
	private int anInt8854 = 4;

	@OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
	private int anInt8859 = 4;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(20) int local20 = Static143.anInt7434 / this.anInt8854;
			@Pc(25) int local25 = Static42.anInt782 / this.anInt8859;
			@Pc(33) int[] local33;
			@Pc(39) int local39;
			if (local25 <= 0) {
				local33 = this.method7568(0, 0);
			} else {
				local39 = arg0 % local25;
				local33 = this.method7568(Static42.anInt782 * local39 / local25, 0);
			}
			for (local39 = 0; local39 < Static143.anInt7434; local39++) {
				if (local20 <= 0) {
					local11[local39] = local33[0];
				} else {
					@Pc(70) int local70 = local39 % local20;
					local11[local39] = local33[local70 * Static143.anInt7434 / local20];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(25) int local25 = Static143.anInt7434 / this.anInt8854;
			@Pc(30) int local30 = Static42.anInt782 / this.anInt8859;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method7567(local36 * Static42.anInt782 / local30, 0);
			} else {
				local46 = this.method7567(0, 0);
			}
			@Pc(58) int[] local58 = local46[0];
			@Pc(62) int[] local62 = local46[1];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local11[0];
			@Pc(74) int[] local74 = local11[1];
			@Pc(78) int[] local78 = local11[2];
			for (@Pc(80) int local80 = 0; local80 < Static143.anInt7434; local80++) {
				@Pc(97) int local97;
				if (local25 > 0) {
					@Pc(91) int local91 = local80 % local25;
					local97 = local91 * Static143.anInt7434 / local25;
				} else {
					local97 = 0;
				}
				local70[local80] = local58[local97];
				local74[local80] = local62[local97];
				local78[local80] = local66[local97];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt8854 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt8859 = arg1.method4464();
		}
	}
}
