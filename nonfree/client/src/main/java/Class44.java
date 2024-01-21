import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!u")
public final class Class44 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
	private boolean aBoolean223 = true;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "[Lclient!v;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt966 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
				@Pc(32) Class1 local32 = this.aClass1Array1[local22] = new Class1();
				local32.aClass1_41 = local32;
				local32.aClass1_42 = local32;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("88188, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(J)Lclient!v;")
	public Class1 method644(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt966 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong35 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!v;IJ)V")
	public void method645(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		try {
			if (arg1 < 2 || arg1 > 2) {
				this.anInt965 = 209;
			}
			if (arg0.aClass1_42 != null) {
				arg0.method669();
			}
			@Pc(27) Class1 local27 = this.aClass1Array1[(int) (arg2 & (long) (this.anInt966 - 1))];
			arg0.aClass1_42 = local27.aClass1_42;
			arg0.aClass1_41 = local27;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong35 = arg2;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("85128, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}
}
