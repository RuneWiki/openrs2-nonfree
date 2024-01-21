import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class43 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt946 = 26961;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Z")
	private boolean aBoolean233 = true;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt947 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
				@Pc(26) Class1 local26 = this.aClass1Array1[local16] = new Class1();
				local26.aClass1_41 = local26;
				local26.aClass1_42 = local26;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("3171, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method626(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt947 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong33 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!u;JI)V")
	public void method627(@OriginalArg(0) Class1 arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method668();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt947 - 1))];
			arg0.aClass1_42 = local18.aClass1_42;
			arg0.aClass1_41 = local18;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong33 = arg1;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("46555, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}
}
