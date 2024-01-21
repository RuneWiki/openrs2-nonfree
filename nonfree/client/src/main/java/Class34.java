import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class34 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt600 = 647;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt601;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(BI)V")
	public Class34(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt601 = arg1;
			@Pc(12) boolean local12 = false;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(23) int local23 = 0; local23 < arg1; local23++) {
				@Pc(33) Class1 local33 = this.aClass1Array1[local23] = new Class1();
				local33.aClass1_41 = local33;
				local33.aClass1_42 = local33;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("84979, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method473(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt601 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong23 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!u;IJ)V")
	public void method474(@OriginalArg(0) Class1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method512();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt601 - 1))];
			arg0.aClass1_42 = local18.aClass1_42;
			arg0.aClass1_41 = local18;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong23 = arg1;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("79247, " + arg0 + ", " + -99 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}
}
