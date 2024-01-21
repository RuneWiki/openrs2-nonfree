import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DKRLEWQI")
public final class Class10 {

	@OriginalMember(owner = "client!DKRLEWQI", name = "a", descriptor = "I")
	private int anInt138 = 666;

	@OriginalMember(owner = "client!DKRLEWQI", name = "b", descriptor = "I")
	private int anInt139 = -884;

	@OriginalMember(owner = "client!DKRLEWQI", name = "c", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!DKRLEWQI", name = "d", descriptor = "I")
	private int anInt140;

	@OriginalMember(owner = "client!DKRLEWQI", name = "e", descriptor = "[Lclient!OZVKRYKO;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!DKRLEWQI", name = "<init>", descriptor = "(ZI)V")
	public Class10(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt140 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(24) int local24 = 0; local24 < arg1; local24++) {
				@Pc(34) Class1 local34 = this.aClass1Array1[local24] = new Class1();
				local34.aClass1_41 = local34;
				local34.aClass1_42 = local34;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("94544, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DKRLEWQI", name = "a", descriptor = "(J)Lclient!OZVKRYKO;")
	public Class1 method64(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt140 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!DKRLEWQI", name = "a", descriptor = "(IJLclient!OZVKRYKO;)V")
	public void method65(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method565();
			}
			@Pc(16) Class1 local16 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt140 - 1))];
			arg1.aClass1_42 = local16.aClass1_42;
			arg1.aClass1_41 = local16;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("65624, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}
}
