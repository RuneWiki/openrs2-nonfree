import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class43 {

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt935 = 160;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt937 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(22) int local22 = 0; local22 < arg1; local22++) {
				@Pc(32) Class1 local32 = this.aClass1Array1[local22] = new Class1();
				local32.aClass1_41 = local32;
				local32.aClass1_42 = local32;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("12362, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method632(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt937 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong33 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(JLclient!u;I)V")
	public void method633(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method673();
			}
			@Pc(16) Class1 local16 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt937 - 1))];
			if (this.anInt936 <= 0 && this.anInt936 >= 0) {
				arg1.aClass1_42 = local16.aClass1_42;
				arg1.aClass1_41 = local16;
				arg1.aClass1_42.aClass1_41 = arg1;
				arg1.aClass1_41.aClass1_42 = arg1;
				arg1.aLong33 = arg0;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("66371, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}
}
