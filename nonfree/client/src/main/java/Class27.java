import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OWFJUUFC")
public final class Class27 {

	@OriginalMember(owner = "client!OWFJUUFC", name = "a", descriptor = "Z")
	private boolean aBoolean92 = true;

	@OriginalMember(owner = "client!OWFJUUFC", name = "b", descriptor = "I")
	private int anInt439 = 562;

	@OriginalMember(owner = "client!OWFJUUFC", name = "c", descriptor = "B")
	private byte aByte11 = 5;

	@OriginalMember(owner = "client!OWFJUUFC", name = "d", descriptor = "I")
	private int anInt440;

	@OriginalMember(owner = "client!OWFJUUFC", name = "e", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!OWFJUUFC", name = "f", descriptor = "[Lclient!LXNKZOGX;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!OWFJUUFC", name = "<init>", descriptor = "(BI)V")
	public Class27(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == this.aByte11) {
				@Pc(16) boolean local16 = false;
			} else {
				this.anInt440 = -458;
			}
			this.anInt441 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
				@Pc(39) Class1 local39 = this.aClass1Array1[local29] = new Class1();
				local39.aClass1_41 = local39;
				local39.aClass1_42 = local39;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("21016, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWFJUUFC", name = "a", descriptor = "(J)Lclient!LXNKZOGX;")
	public Class1 method293(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt441 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!OWFJUUFC", name = "a", descriptor = "(JLclient!LXNKZOGX;I)V")
	public void method294(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method551();
			}
			@Pc(28) Class1 local28 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt441 - 1))];
			arg1.aClass1_42 = local28.aClass1_42;
			arg1.aClass1_41 = local28;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("57532, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}
}
