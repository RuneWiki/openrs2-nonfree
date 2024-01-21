import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BEGVKNAP")
public final class Class4 {

	@OriginalMember(owner = "client!BEGVKNAP", name = "b", descriptor = "I")
	private int anInt68;

	@OriginalMember(owner = "client!BEGVKNAP", name = "a", descriptor = "Z")
	private boolean aBoolean21 = true;

	@OriginalMember(owner = "client!BEGVKNAP", name = "c", descriptor = "I")
	private int anInt69;

	@OriginalMember(owner = "client!BEGVKNAP", name = "d", descriptor = "[Lclient!DOUWNVSH;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!BEGVKNAP", name = "<init>", descriptor = "(II)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt69 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
				@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
				local23.aClass1_41 = local23;
				local23.aClass1_42 = local23;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("89831, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BEGVKNAP", name = "a", descriptor = "(J)Lclient!DOUWNVSH;")
	public Class1 method62(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt69 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong25 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!BEGVKNAP", name = "a", descriptor = "(BJLclient!DOUWNVSH;)V")
	public void method63(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method501();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt69 - 1))];
			arg1.aClass1_42 = local18.aClass1_42;
			arg1.aClass1_41 = local18;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong25 = arg0;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("32598, " + -90 + ", " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}
}
