import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!u")
public final class Class44 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
	private boolean aBoolean221 = true;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	private int anInt995 = -34;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	private int anInt996 = 46;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "[Lclient!v;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt997 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			@Pc(21) int local21 = 73 / arg1;
			for (@Pc(23) int local23 = 0; local23 < arg0; local23++) {
				@Pc(33) Class1 local33 = this.aClass1Array1[local23] = new Class1();
				local33.aClass1_41 = local33;
				local33.aClass1_42 = local33;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("62532, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(J)Lclient!v;")
	public Class1 method644(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt997 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong35 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IJLclient!v;)V")
	public void method645(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method669();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt997 - 1))];
			arg1.aClass1_42 = local18.aClass1_42;
			arg1.aClass1_41 = local18;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong35 = arg0;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("56353, " + 46 + ", " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}
}
