import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WOVRPCGT")
public final class Class42 {

	@OriginalMember(owner = "client!WOVRPCGT", name = "e", descriptor = "Lclient!BLBQHZXT;")
	private Class1 aClass1_36;

	@OriginalMember(owner = "client!WOVRPCGT", name = "a", descriptor = "I")
	private int anInt683 = 40071;

	@OriginalMember(owner = "client!WOVRPCGT", name = "b", descriptor = "Z")
	private boolean aBoolean156 = true;

	@OriginalMember(owner = "client!WOVRPCGT", name = "c", descriptor = "I")
	private int anInt684 = 1;

	@OriginalMember(owner = "client!WOVRPCGT", name = "d", descriptor = "Lclient!BLBQHZXT;")
	private Class1 aClass1_35 = new Class1();

	@OriginalMember(owner = "client!WOVRPCGT", name = "<init>", descriptor = "(I)V")
	public Class42(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_35.aClass1_41 = this.aClass1_35;
			this.aClass1_35.aClass1_42 = this.aClass1_35;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("91180, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WOVRPCGT", name = "a", descriptor = "(Lclient!BLBQHZXT;)V")
	public void method484(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method571();
		}
		arg0.aClass1_42 = this.aClass1_35.aClass1_42;
		arg0.aClass1_41 = this.aClass1_35;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!WOVRPCGT", name = "a", descriptor = "(ILclient!BLBQHZXT;)V")
	public void method485(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method571();
			}
			arg1.aClass1_42 = this.aClass1_35;
			if (arg0 != this.anInt683) {
				this.aBoolean156 = !this.aBoolean156;
			}
			arg1.aClass1_41 = this.aClass1_35.aClass1_41;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("47344, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WOVRPCGT", name = "a", descriptor = "()Lclient!BLBQHZXT;")
	public Class1 method486() {
		@Pc(3) Class1 local3 = this.aClass1_35.aClass1_41;
		if (local3 == this.aClass1_35) {
			return null;
		} else {
			local3.method571();
			return local3;
		}
	}

	@OriginalMember(owner = "client!WOVRPCGT", name = "b", descriptor = "()Lclient!BLBQHZXT;")
	public Class1 method487() {
		@Pc(3) Class1 local3 = this.aClass1_35.aClass1_41;
		if (local3 == this.aClass1_35) {
			this.aClass1_36 = null;
			return null;
		} else {
			this.aClass1_36 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!WOVRPCGT", name = "a", descriptor = "(Z)Lclient!BLBQHZXT;")
	public Class1 method488() {
		try {
			@Pc(13) Class1 local13 = this.aClass1_35.aClass1_42;
			if (local13 == this.aClass1_35) {
				this.aClass1_36 = null;
				return null;
			} else {
				this.aClass1_36 = local13.aClass1_42;
				return local13;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("4616, " + false + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WOVRPCGT", name = "a", descriptor = "(I)Lclient!BLBQHZXT;")
	public Class1 method489() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_36;
			if (local2 == this.aClass1_35) {
				this.aClass1_36 = null;
				return null;
			} else {
				this.aClass1_36 = local2.aClass1_41;
				return local2;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("85223, " + 907 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WOVRPCGT", name = "b", descriptor = "(I)Lclient!BLBQHZXT;")
	public Class1 method490(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class1 local2 = this.aClass1_36;
			if (local2 == this.aClass1_35) {
				this.aClass1_36 = null;
				return null;
			}
			this.aClass1_36 = local2.aClass1_42;
			if (arg0 != 27382) {
				throw new NullPointerException();
			}
			return local2;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("33920, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WOVRPCGT", name = "c", descriptor = "()V")
	public void method491() {
		if (this.aClass1_35.aClass1_41 == this.aClass1_35) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_35.aClass1_41;
			if (local10 == this.aClass1_35) {
				return;
			}
			local10.method571();
		}
	}
}
