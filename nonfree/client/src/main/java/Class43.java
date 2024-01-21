import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class43 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt937 = 8;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(IB)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt938 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
				@Pc(29) Class1 local29 = this.aClass1Array1[local19] = new Class1();
				local29.aClass1_41 = local29;
				local29.aClass1_42 = local29;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("10752, " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method628(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt938 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong33 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLclient!u;J)V")
	public void method629(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method669();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt938 - 1))];
			arg0.aClass1_42 = local18.aClass1_42;
			arg0.aClass1_41 = local18;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong33 = arg1;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("44360, " + false + ", " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}
}
