import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class4_Sub4_Sub17 extends Class4_Sub4 {

	@OriginalMember(owner = "client!rj", name = "E", descriptor = "Lclient!dj;")
	private Class43 aClass43_30;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)I")
	public int method4709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass43_30 == null) {
			return arg1;
		} else {
			@Pc(16) Class4_Sub8 local16 = (Class4_Sub8) this.aClass43_30.method1273((long) arg0);
			return local16 == null ? arg1 : local16.anInt492;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
	public String method4710(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass43_30 == null) {
			return arg1;
		} else {
			@Pc(25) Class4_Sub26 local25 = (Class4_Sub26) this.aClass43_30.method1273((long) arg0);
			return local25 == null ? arg1 : local25.aString35;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLclient!lf;I)V")
	private void method4713(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(26) int local26 = arg0.method3440();
		@Pc(33) int local33;
		if (this.aClass43_30 == null) {
			local33 = Static28.method5505(local26);
			this.aClass43_30 = new Class43(local33);
		}
		for (local33 = 0; local33 < local26; local33++) {
			@Pc(58) boolean local58 = arg0.method3440() == 1;
			@Pc(62) int local62 = arg0.method3442();
			@Pc(71) Class4 local71;
			if (local58) {
				local71 = new Class4_Sub26(arg0.method3446());
			} else {
				local71 = new Class4_Sub8(arg0.method3418());
			}
			this.aClass43_30.method1276(local71, (long) local62);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!lf;I)V")
	public void method4714(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3440();
			if (local13 == 0) {
				return;
			}
			this.method4713(arg0, local13);
		}
	}
}
