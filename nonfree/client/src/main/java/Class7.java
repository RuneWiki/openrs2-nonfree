import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EHIGZZMD")
public final class Class7 {

	@OriginalMember(owner = "client!EHIGZZMD", name = "a", descriptor = "I")
	private int anInt199 = -23585;

	@OriginalMember(owner = "client!EHIGZZMD", name = "b", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!EHIGZZMD", name = "c", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!EHIGZZMD", name = "d", descriptor = "[Lclient!BLBQHZXT;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!EHIGZZMD", name = "<init>", descriptor = "(II)V")
	public Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt200 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(26) Class1 local26 = this.aClass1Array1[local16] = new Class1();
				local26.aClass1_41 = local26;
				local26.aClass1_42 = local26;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("73750, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHIGZZMD", name = "a", descriptor = "(J)Lclient!BLBQHZXT;")
	public Class1 method97(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt200 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!EHIGZZMD", name = "a", descriptor = "(JLclient!BLBQHZXT;I)V")
	public void method98(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method571();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt200 - 1))];
			arg1.aClass1_42 = local18.aClass1_42;
			arg1.aClass1_41 = local18;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("64105, " + arg0 + ", " + arg1 + ", " + -42535 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}
}
