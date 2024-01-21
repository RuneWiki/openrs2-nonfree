import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class37 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt769 = 12;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt770 = 4;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	private int anInt771;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt771 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			@Pc(21) int local21 = 9 / arg0;
			for (@Pc(23) int local23 = 0; local23 < arg1; local23++) {
				@Pc(33) Class1 local33 = this.aClass1Array1[local23] = new Class1();
				local33.aClass1_41 = local33;
				local33.aClass1_42 = local33;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("37796, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method522(@OriginalArg(0) long arg0) {
		@Pc(13) Class1 local13 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt771 - 1))];
		for (@Pc(16) Class1 local16 = local13.aClass1_41; local16 != local13; local16 = local16.aClass1_41) {
			if (local16.aLong26 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IJLclient!u;)V")
	public void method523(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method559();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt771 - 1))];
			arg1.aClass1_42 = local18.aClass1_42;
			arg1.aClass1_41 = local18;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("16038, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}
}
