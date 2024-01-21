import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZRDWHMTU")
public final class Class49 {

	@OriginalMember(owner = "client!ZRDWHMTU", name = "a", descriptor = "I")
	private int anInt792;

	@OriginalMember(owner = "client!ZRDWHMTU", name = "b", descriptor = "[Lclient!MXUYAYVV;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!ZRDWHMTU", name = "<init>", descriptor = "(II)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt792 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(18) int local18 = 0; local18 < arg1; local18++) {
				@Pc(28) Class1 local28 = this.aClass1Array1[local18] = new Class1();
				local28.aClass1_41 = local28;
				local28.aClass1_42 = local28;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("20664, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZRDWHMTU", name = "a", descriptor = "(J)Lclient!MXUYAYVV;")
	public Class1 method537(@OriginalArg(0) long arg0) {
		@Pc(13) Class1 local13 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt792 - 1))];
		for (@Pc(16) Class1 local16 = local13.aClass1_41; local16 != local13; local16 = local16.aClass1_41) {
			if (local16.aLong26 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ZRDWHMTU", name = "a", descriptor = "(JLclient!MXUYAYVV;I)V")
	public void method538(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method510();
			}
			@Pc(21) Class1 local21 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt792 - 1))];
			arg1.aClass1_42 = local21.aClass1_42;
			arg1.aClass1_41 = local21;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("55759, " + arg0 + ", " + arg1 + ", " + -251 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
