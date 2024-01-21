import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HSZHZJQR")
public final class Class21 {

	@OriginalMember(owner = "client!HSZHZJQR", name = "a", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!HSZHZJQR", name = "b", descriptor = "B")
	private byte aByte15 = 117;

	@OriginalMember(owner = "client!HSZHZJQR", name = "c", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!HSZHZJQR", name = "d", descriptor = "[Lclient!IHAIACWA;")
	private Class4[] aClass4Array1;

	@OriginalMember(owner = "client!HSZHZJQR", name = "<init>", descriptor = "(ZI)V")
	public Class21(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt347 = arg1;
			this.aClass4Array1 = new Class4[arg1];
			for (@Pc(26) int local26 = 0; local26 < arg1; local26++) {
				@Pc(36) Class4 local36 = this.aClass4Array1[local26] = new Class4();
				local36.aClass4_41 = local36;
				local36.aClass4_42 = local36;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("98447, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HSZHZJQR", name = "a", descriptor = "(J)Lclient!IHAIACWA;")
	public Class4 method267(@OriginalArg(0) long arg0) {
		@Pc(11) Class4 local11 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt347 - 1))];
		for (@Pc(14) Class4 local14 = local11.aClass4_41; local14 != local11; local14 = local14.aClass4_41) {
			if (local14.aLong26 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!HSZHZJQR", name = "a", descriptor = "(BJLclient!IHAIACWA;)V")
	public void method268(@OriginalArg(1) long arg0, @OriginalArg(2) Class4 arg1) {
		try {
			if (arg1.aClass4_42 != null) {
				arg1.method528();
			}
			@Pc(18) Class4 local18 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt347 - 1))];
			arg1.aClass4_42 = local18.aClass4_42;
			if (this.aByte15 != 117) {
				this.aBoolean107 = !this.aBoolean107;
			}
			arg1.aClass4_41 = local18;
			arg1.aClass4_42.aClass4_41 = arg1;
			arg1.aClass4_41.aClass4_42 = arg1;
			arg1.aLong26 = arg0;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("86621, " + 117 + ", " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}
}
