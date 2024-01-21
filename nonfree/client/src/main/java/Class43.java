import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class43 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt921 = -884;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(BI)V")
	public Class43(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt922 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(26) Class1 local26 = this.aClass1Array1[local16] = new Class1();
				local26.aClass1_41 = local26;
				local26.aClass1_42 = local26;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("18050, " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method624(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt922 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong33 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(JLclient!u;B)V")
	public void method625(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method666();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt922 - 1))];
			arg1.aClass1_42 = local18.aClass1_42;
			arg1.aClass1_41 = local18;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong33 = arg0;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("13540, " + arg0 + ", " + arg1 + ", " + 34 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}
}
