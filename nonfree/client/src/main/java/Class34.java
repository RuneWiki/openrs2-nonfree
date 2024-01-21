import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qb")
public final class Class34 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_36;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	private int anInt838 = 35985;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	private int anInt839 = 451;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V")
	public Class34(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_Sub1_35.aClass1_Sub1_38 = this.aClass1_Sub1_35;
			this.aClass1_Sub1_35.aClass1_Sub1_39 = this.aClass1_Sub1_35;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("4573, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!w;)V")
	public void method539(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_39 != null) {
			arg0.method691();
		}
		arg0.aClass1_Sub1_39 = this.aClass1_Sub1_35.aClass1_Sub1_39;
		arg0.aClass1_Sub1_38 = this.aClass1_Sub1_35;
		arg0.aClass1_Sub1_39.aClass1_Sub1_38 = arg0;
		arg0.aClass1_Sub1_38.aClass1_Sub1_39 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()Lclient!w;")
	public Class1_Sub1 method540() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_35.aClass1_Sub1_38;
		if (local3 == this.aClass1_Sub1_35) {
			return null;
		} else {
			local3.method691();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()Lclient!w;")
	public Class1_Sub1 method541() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_35.aClass1_Sub1_38;
		if (local3 == this.aClass1_Sub1_35) {
			this.aClass1_Sub1_36 = null;
			return null;
		} else {
			this.aClass1_Sub1_36 = local3.aClass1_Sub1_38;
			return local3;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Lclient!w;")
	public Class1_Sub1 method542(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class1_Sub1 local2 = this.aClass1_Sub1_36;
			if (local2 == this.aClass1_Sub1_35) {
				this.aClass1_Sub1_36 = null;
				return null;
			} else {
				this.aClass1_Sub1_36 = local2.aClass1_Sub1_38;
				@Pc(19) boolean local19 = false;
				return local2;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("25070, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()I")
	public int method543() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_35.aClass1_Sub1_38; local5 != this.aClass1_Sub1_35; local5 = local5.aClass1_Sub1_38) {
			local1++;
		}
		return local1;
	}
}
