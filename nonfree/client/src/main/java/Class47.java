import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YFWIPPMU")
public final class Class47 {

	@OriginalMember(owner = "client!YFWIPPMU", name = "a", descriptor = "I")
	private int anInt766 = -142;

	@OriginalMember(owner = "client!YFWIPPMU", name = "b", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!YFWIPPMU", name = "c", descriptor = "Z")
	private boolean aBoolean189 = true;

	@OriginalMember(owner = "client!YFWIPPMU", name = "d", descriptor = "I")
	private int anInt767;

	@OriginalMember(owner = "client!YFWIPPMU", name = "e", descriptor = "[Lclient!KMUPFLXI;")
	private Class8[] aClass8Array1;

	@OriginalMember(owner = "client!YFWIPPMU", name = "<init>", descriptor = "(IB)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt767 = arg0;
			this.aClass8Array1 = new Class8[arg0];
			@Pc(22) boolean local22 = false;
			for (@Pc(28) int local28 = 0; local28 < arg0; local28++) {
				@Pc(38) Class8 local38 = this.aClass8Array1[local28] = new Class8();
				local38.aClass8_41 = local38;
				local38.aClass8_42 = local38;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("54955, " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFWIPPMU", name = "a", descriptor = "(J)Lclient!KMUPFLXI;")
	public Class8 method539(@OriginalArg(0) long arg0) {
		@Pc(11) Class8 local11 = this.aClass8Array1[(int) (arg0 & (long) (this.anInt767 - 1))];
		for (@Pc(14) Class8 local14 = local11.aClass8_41; local14 != local11; local14 = local14.aClass8_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!YFWIPPMU", name = "a", descriptor = "(IJLclient!KMUPFLXI;)V")
	public void method540(@OriginalArg(1) long arg0, @OriginalArg(2) Class8 arg1) {
		try {
			if (arg1.aClass8_42 != null) {
				arg1.method546();
			}
			@Pc(18) Class8 local18 = this.aClass8Array1[(int) (arg0 & (long) (this.anInt767 - 1))];
			arg1.aClass8_42 = local18.aClass8_42;
			arg1.aClass8_41 = local18;
			arg1.aClass8_42.aClass8_41 = arg1;
			arg1.aClass8_41.aClass8_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("80911, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}
}
