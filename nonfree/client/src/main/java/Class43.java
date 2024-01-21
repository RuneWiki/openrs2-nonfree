import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class43 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt960 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			for (@Pc(24) int local24 = 0; local24 < arg0; local24++) {
				@Pc(34) Class1 local34 = this.aClass1Array1[local24] = new Class1();
				local34.aClass1_41 = local34;
				local34.aClass1_42 = local34;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("54368, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method632(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt960 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong33 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(JILclient!u;)V")
	public void method633(@OriginalArg(0) long arg0, @OriginalArg(2) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method673();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt960 - 1))];
			arg1.aClass1_42 = local18.aClass1_42;
			arg1.aClass1_41 = local18;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong33 = arg0;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("53901, " + arg0 + ", " + 2 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}
}
