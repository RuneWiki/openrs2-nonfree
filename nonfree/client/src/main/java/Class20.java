import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JLFXAIRK")
public final class Class20 {

	@OriginalMember(owner = "client!JLFXAIRK", name = "a", descriptor = "Z")
	private boolean aBoolean72 = true;

	@OriginalMember(owner = "client!JLFXAIRK", name = "b", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!JLFXAIRK", name = "c", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!JLFXAIRK", name = "d", descriptor = "[Lclient!ZUOIJLRD;")
	private Class10[] aClass10Array1;

	@OriginalMember(owner = "client!JLFXAIRK", name = "<init>", descriptor = "(BI)V")
	public Class20(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt231 = arg1;
			this.aClass10Array1 = new Class10[arg1];
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(26) Class10 local26 = this.aClass10Array1[local16] = new Class10();
				local26.aClass10_41 = local26;
				local26.aClass10_42 = local26;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("68506, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JLFXAIRK", name = "a", descriptor = "(J)Lclient!ZUOIJLRD;")
	public Class10 method163(@OriginalArg(0) long arg0) {
		@Pc(11) Class10 local11 = this.aClass10Array1[(int) (arg0 & (long) (this.anInt231 - 1))];
		for (@Pc(14) Class10 local14 = local11.aClass10_41; local14 != local11; local14 = local14.aClass10_41) {
			if (local14.aLong23 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!JLFXAIRK", name = "a", descriptor = "(ILclient!ZUOIJLRD;J)V")
	public void method164(@OriginalArg(1) Class10 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass10_42 != null) {
				arg0.method534();
			}
			@Pc(16) Class10 local16 = this.aClass10Array1[(int) (arg1 & (long) (this.anInt231 - 1))];
			arg0.aClass10_42 = local16.aClass10_42;
			arg0.aClass10_41 = local16;
			arg0.aClass10_42.aClass10_41 = arg0;
			arg0.aClass10_41.aClass10_42 = arg0;
			arg0.aLong23 = arg1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("24638, " + 6 + ", " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
