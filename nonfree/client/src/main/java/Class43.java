import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class43 {

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt949 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(23) int local23 = 0; local23 < arg1; local23++) {
				@Pc(33) Class1 local33 = this.aClass1Array1[local23] = new Class1();
				local33.aClass1_41 = local33;
				local33.aClass1_42 = local33;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("37077, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method632(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt949 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong33 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!u;IJ)V")
	public void method633(@OriginalArg(0) Class1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method673();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt949 - 1))];
			arg0.aClass1_42 = local18.aClass1_42;
			arg0.aClass1_41 = local18;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong33 = arg1;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("1528, " + arg0 + ", " + 944 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}
}
