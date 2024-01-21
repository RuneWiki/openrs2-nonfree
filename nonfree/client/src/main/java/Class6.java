import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CABSPGMS")
public final class Class6 {

	@OriginalMember(owner = "client!CABSPGMS", name = "a", descriptor = "Z")
	private boolean aBoolean12 = false;

	@OriginalMember(owner = "client!CABSPGMS", name = "b", descriptor = "I")
	private int anInt24;

	@OriginalMember(owner = "client!CABSPGMS", name = "c", descriptor = "[Lclient!ZMCAQRHG;")
	private Class8[] aClass8Array1;

	@OriginalMember(owner = "client!CABSPGMS", name = "<init>", descriptor = "(II)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt24 = arg0;
			this.aClass8Array1 = new Class8[arg0];
			for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
				@Pc(29) Class8 local29 = this.aClass8Array1[local19] = new Class8();
				local29.aClass8_41 = local29;
				local29.aClass8_42 = local29;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("60306, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CABSPGMS", name = "a", descriptor = "(J)Lclient!ZMCAQRHG;")
	public Class8 method46(@OriginalArg(0) long arg0) {
		@Pc(11) Class8 local11 = this.aClass8Array1[(int) (arg0 & (long) (this.anInt24 - 1))];
		for (@Pc(14) Class8 local14 = local11.aClass8_41; local14 != local11; local14 = local14.aClass8_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!CABSPGMS", name = "a", descriptor = "(Lclient!ZMCAQRHG;JI)V")
	public void method47(@OriginalArg(0) Class8 arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0.aClass8_42 != null) {
				arg0.method543();
			}
			@Pc(16) Class8 local16 = this.aClass8Array1[(int) (arg1 & (long) (this.anInt24 - 1))];
			arg0.aClass8_42 = local16.aClass8_42;
			arg0.aClass8_41 = local16;
			arg0.aClass8_42.aClass8_41 = arg0;
			arg0.aClass8_41.aClass8_42 = arg0;
			arg0.aLong26 = arg1;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("47043, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}
}
