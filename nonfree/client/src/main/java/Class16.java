import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IHMCQRZY")
public final class Class16 {

	@OriginalMember(owner = "client!IHMCQRZY", name = "d", descriptor = "Lclient!XAQVXEIR;")
	private Class1 aClass1_28;

	@OriginalMember(owner = "client!IHMCQRZY", name = "a", descriptor = "I")
	private int anInt356 = 9;

	@OriginalMember(owner = "client!IHMCQRZY", name = "b", descriptor = "I")
	private int anInt357 = 275;

	@OriginalMember(owner = "client!IHMCQRZY", name = "c", descriptor = "Lclient!XAQVXEIR;")
	private Class1 aClass1_27 = new Class1();

	@OriginalMember(owner = "client!IHMCQRZY", name = "<init>", descriptor = "(Z)V")
	public Class16(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass1_27.aClass1_41 = this.aClass1_27;
			this.aClass1_27.aClass1_42 = this.aClass1_27;
			if (arg0) {
				this.anInt357 = -211;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("61986, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHMCQRZY", name = "a", descriptor = "(Lclient!XAQVXEIR;)V")
	public void method182(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method560();
		}
		arg0.aClass1_42 = this.aClass1_27.aClass1_42;
		arg0.aClass1_41 = this.aClass1_27;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!IHMCQRZY", name = "a", descriptor = "(Lclient!XAQVXEIR;I)V")
	public void method183(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method560();
			}
			arg0.aClass1_42 = this.aClass1_27;
			arg0.aClass1_41 = this.aClass1_27.aClass1_41;
			if (this.anInt356 != 9) {
				for (@Pc(21) int local21 = 1; local21 > 0; local21++) {
				}
			}
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("12835, " + arg0 + ", " + 9 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHMCQRZY", name = "a", descriptor = "()Lclient!XAQVXEIR;")
	public Class1 method184() {
		@Pc(3) Class1 local3 = this.aClass1_27.aClass1_41;
		if (local3 == this.aClass1_27) {
			return null;
		} else {
			local3.method560();
			return local3;
		}
	}

	@OriginalMember(owner = "client!IHMCQRZY", name = "b", descriptor = "()Lclient!XAQVXEIR;")
	public Class1 method185() {
		@Pc(3) Class1 local3 = this.aClass1_27.aClass1_41;
		if (local3 == this.aClass1_27) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!IHMCQRZY", name = "a", descriptor = "(Z)Lclient!XAQVXEIR;")
	public Class1 method186() {
		try {
			@Pc(3) Class1 local3 = this.aClass1_27.aClass1_42;
			if (local3 == this.aClass1_27) {
				this.aClass1_28 = null;
				return null;
			} else {
				this.aClass1_28 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("55638, " + true + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHMCQRZY", name = "b", descriptor = "(Z)Lclient!XAQVXEIR;")
	public Class1 method187() {
		try {
			@Pc(11) Class1 local11 = this.aClass1_28;
			if (local11 == this.aClass1_27) {
				this.aClass1_28 = null;
				return null;
			} else {
				this.aClass1_28 = local11.aClass1_41;
				return local11;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("19369, " + true + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHMCQRZY", name = "a", descriptor = "(I)Lclient!XAQVXEIR;")
	public Class1 method188(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class1 local2 = this.aClass1_28;
			if (arg0 < 4 || arg0 > 4) {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			if (local2 == this.aClass1_27) {
				this.aClass1_28 = null;
				return null;
			} else {
				this.aClass1_28 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("14961, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IHMCQRZY", name = "c", descriptor = "()V")
	public void method189() {
		if (this.aClass1_27.aClass1_41 == this.aClass1_27) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_27.aClass1_41;
			if (local10 == this.aClass1_27) {
				return;
			}
			local10.method560();
		}
	}
}
