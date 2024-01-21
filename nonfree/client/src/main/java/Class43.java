import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class43 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt944 = 7;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt945 = 7228;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "B")
	private byte aByte44 = 0;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt946 = arg0;
			if (arg1 != this.anInt945) {
				this.anInt944 = 236;
			}
			this.aClass1Array1 = new Class1[arg0];
			for (@Pc(29) int local29 = 0; local29 < arg0; local29++) {
				@Pc(39) Class1 local39 = this.aClass1Array1[local29] = new Class1();
				local39.aClass1_41 = local39;
				local39.aClass1_42 = local39;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("35087, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method625(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt946 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong33 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZJLclient!u;)V")
	public void method626(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method667();
			}
			@Pc(19) Class1 local19 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt946 - 1))];
			arg1.aClass1_42 = local19.aClass1_42;
			arg1.aClass1_41 = local19;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong33 = arg0;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("89767, " + true + ", " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}
}
