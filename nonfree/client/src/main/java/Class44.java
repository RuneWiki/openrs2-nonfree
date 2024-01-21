import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!u")
public final class Class44 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "B")
	private byte aByte40 = -46;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "[Lclient!v;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IB)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(12) boolean local12 = false;
			this.anInt964 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			for (@Pc(28) int local28 = 0; local28 < arg0; local28++) {
				@Pc(38) Class1 local38 = this.aClass1Array1[local28] = new Class1();
				local38.aClass1_41 = local38;
				local38.aClass1_42 = local38;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("63718, " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(J)Lclient!v;")
	public Class1 method644(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt964 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong35 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IJLclient!v;)V")
	public void method645(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class1 arg2) {
		try {
			if (arg2.aClass1_42 != null) {
				arg2.method669();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt964 - 1))];
			@Pc(22) boolean local22 = false;
			arg2.aClass1_42 = local18.aClass1_42;
			arg2.aClass1_41 = local18;
			arg2.aClass1_42.aClass1_41 = arg2;
			arg2.aClass1_41.aClass1_42 = arg2;
			arg2.aLong35 = arg1;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("44188, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}
}
