import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GRIRTYPY")
public final class Class13 {

	@OriginalMember(owner = "client!GRIRTYPY", name = "a", descriptor = "Z")
	private boolean aBoolean66 = true;

	@OriginalMember(owner = "client!GRIRTYPY", name = "b", descriptor = "I")
	private int anInt327 = -52;

	@OriginalMember(owner = "client!GRIRTYPY", name = "c", descriptor = "Z")
	private boolean aBoolean67 = true;

	@OriginalMember(owner = "client!GRIRTYPY", name = "d", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!GRIRTYPY", name = "e", descriptor = "[Lclient!XAQVXEIR;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!GRIRTYPY", name = "<init>", descriptor = "(BI)V")
	public Class13(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(15) boolean local15 = false;
			this.anInt328 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				@Pc(43) Class1 local43 = this.aClass1Array1[local33] = new Class1();
				local43.aClass1_41 = local43;
				local43.aClass1_42 = local43;
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("32613, " + arg0 + ", " + arg1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRIRTYPY", name = "a", descriptor = "(J)Lclient!XAQVXEIR;")
	public Class1 method145(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt328 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!GRIRTYPY", name = "a", descriptor = "(ILclient!XAQVXEIR;J)V")
	public void method146(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method560();
			}
			@Pc(16) Class1 local16 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt328 - 1))];
			arg0.aClass1_42 = local16.aClass1_42;
			arg0.aClass1_41 = local16;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("78758, " + 328 + ", " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}
}
