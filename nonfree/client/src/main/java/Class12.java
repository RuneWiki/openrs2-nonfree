import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FXRMRSFD")
public final class Class12 {

	@OriginalMember(owner = "client!FXRMRSFD", name = "a", descriptor = "B")
	private byte aByte10 = 1;

	@OriginalMember(owner = "client!FXRMRSFD", name = "b", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!FXRMRSFD", name = "c", descriptor = "[Lclient!WWONSPNF;")
	private Class8[] aClass8Array1;

	@OriginalMember(owner = "client!FXRMRSFD", name = "<init>", descriptor = "(IB)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt237 = arg0;
			if (arg1 != this.aByte10) {
				throw new NullPointerException();
			}
			this.aClass8Array1 = new Class8[arg0];
			for (@Pc(21) int local21 = 0; local21 < arg0; local21++) {
				@Pc(31) Class8 local31 = this.aClass8Array1[local21] = new Class8();
				local31.aClass8_41 = local31;
				local31.aClass8_42 = local31;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("98597, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FXRMRSFD", name = "a", descriptor = "(J)Lclient!WWONSPNF;")
	public Class8 method138(@OriginalArg(0) long arg0) {
		@Pc(11) Class8 local11 = this.aClass8Array1[(int) (arg0 & (long) (this.anInt237 - 1))];
		for (@Pc(14) Class8 local14 = local11.aClass8_41; local14 != local11; local14 = local14.aClass8_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!FXRMRSFD", name = "a", descriptor = "(JLclient!WWONSPNF;I)V")
	public void method139(@OriginalArg(0) long arg0, @OriginalArg(1) Class8 arg1) {
		try {
			if (arg1.aClass8_42 != null) {
				arg1.method554();
			}
			@Pc(19) Class8 local19 = this.aClass8Array1[(int) (arg0 & (long) (this.anInt237 - 1))];
			arg1.aClass8_42 = local19.aClass8_42;
			arg1.aClass8_41 = local19;
			arg1.aClass8_42.aClass8_41 = arg1;
			arg1.aClass8_41.aClass8_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("72464, " + arg0 + ", " + arg1 + ", " + -317 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}
}
