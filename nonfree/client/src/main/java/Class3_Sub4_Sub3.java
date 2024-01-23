import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "Lclient!cn;")
	private Class30 aClass30_3;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBLclient!ug;)V")
	private void method523(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(22) int local22 = arg1.method3915();
		@Pc(29) int local29;
		if (this.aClass30_3 == null) {
			local29 = Static165.method2731(local22);
			this.aClass30_3 = new Class30(local29);
		}
		for (local29 = 0; local29 < local22; local29++) {
			@Pc(49) boolean local49 = arg1.method3915() == 1;
			@Pc(53) int local53 = arg1.method3899();
			@Pc(62) Class3 local62;
			if (local49) {
				local62 = new Class3_Sub28(arg1.method3931());
			} else {
				local62 = new Class3_Sub8(arg1.method3896());
			}
			this.aClass30_3.method668(local62, (long) local53);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method524(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass30_3 == null) {
			return arg1;
		} else {
			@Pc(24) Class3_Sub28 local24 = (Class3_Sub28) this.aClass30_3.method663((long) arg0);
			return local24 == null ? arg1 : local24.aString183;
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(III)I")
	public int method525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass30_3 == null) {
			return arg1;
		} else {
			@Pc(27) Class3_Sub8 local27 = (Class3_Sub8) this.aClass30_3.method663((long) arg0);
			return local27 == null ? arg1 : local27.anInt1237;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!ug;)V")
	public void method530(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3915();
			if (local13 == 0) {
				return;
			}
			this.method523(local13, arg0);
		}
	}
}
