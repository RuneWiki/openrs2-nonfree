import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WGMBOAQO")
public final class Class45 {

	@OriginalMember(owner = "client!WGMBOAQO", name = "a", descriptor = "I")
	private int anInt726 = 720;

	@OriginalMember(owner = "client!WGMBOAQO", name = "b", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!WGMBOAQO", name = "c", descriptor = "I")
	private int anInt727;

	@OriginalMember(owner = "client!WGMBOAQO", name = "d", descriptor = "[Lclient!YNSWJIIM;")
	private Class2[] aClass2Array1;

	@OriginalMember(owner = "client!WGMBOAQO", name = "<init>", descriptor = "(BI)V")
	public Class45(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt727 = arg1;
			this.aClass2Array1 = new Class2[arg1];
			for (@Pc(27) int local27 = 0; local27 < arg1; local27++) {
				@Pc(37) Class2 local37 = this.aClass2Array1[local27] = new Class2();
				local37.aClass2_41 = local37;
				local37.aClass2_42 = local37;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("33471, " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WGMBOAQO", name = "a", descriptor = "(J)Lclient!YNSWJIIM;")
	public Class2 method549(@OriginalArg(0) long arg0) {
		@Pc(11) Class2 local11 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt727 - 1))];
		for (@Pc(14) Class2 local14 = local11.aClass2_41; local14 != local11; local14 = local14.aClass2_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!WGMBOAQO", name = "a", descriptor = "(JBLclient!YNSWJIIM;)V")
	public void method550(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class2 arg2) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg2.aClass2_42 != null) {
				arg2.method562();
			}
			@Pc(34) Class2 local34 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt727 - 1))];
			arg2.aClass2_42 = local34.aClass2_42;
			arg2.aClass2_41 = local34;
			arg2.aClass2_42.aClass2_41 = arg2;
			arg2.aClass2_41.aClass2_42 = arg2;
			arg2.aLong26 = arg0;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("8723, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}
}
