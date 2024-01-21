import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class43 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt920 = 28523;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Z")
	private boolean aBoolean242 = true;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "Z")
	private boolean aBoolean243 = true;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt921 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			if (arg1 >= 0) {
				this.anInt920 = 373;
			}
			for (@Pc(27) int local27 = 0; local27 < arg0; local27++) {
				@Pc(37) Class1 local37 = this.aClass1Array1[local27] = new Class1();
				local37.aClass1_41 = local37;
				local37.aClass1_42 = local37;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("46146, " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method632(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt921 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong33 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!u;J)V")
	public void method633(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) long arg2) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method673();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg2 & (long) (this.anInt921 - 1))];
			arg1.aClass1_42 = local18.aClass1_42;
			arg1.aClass1_41 = local18;
			arg1.aClass1_42.aClass1_41 = arg1;
			@Pc(33) boolean local33 = false;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong33 = arg2;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("519, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}
}
