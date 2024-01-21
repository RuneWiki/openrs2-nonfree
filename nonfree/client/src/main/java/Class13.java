import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EWLVMFRK")
public final class Class13 {

	@OriginalMember(owner = "client!EWLVMFRK", name = "f", descriptor = "Lclient!OZVKRYKO;")
	private Class1 aClass1_16;

	@OriginalMember(owner = "client!EWLVMFRK", name = "a", descriptor = "I")
	private int anInt170 = 22736;

	@OriginalMember(owner = "client!EWLVMFRK", name = "b", descriptor = "I")
	private int anInt171 = 303;

	@OriginalMember(owner = "client!EWLVMFRK", name = "c", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!EWLVMFRK", name = "d", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!EWLVMFRK", name = "e", descriptor = "Lclient!OZVKRYKO;")
	private Class1 aClass1_15 = new Class1();

	@OriginalMember(owner = "client!EWLVMFRK", name = "<init>", descriptor = "(Z)V")
	public Class13(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass1_15.aClass1_41 = this.aClass1_15;
			this.aClass1_15.aClass1_42 = this.aClass1_15;
			if (!arg0) {
				this.anInt170 = -233;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("597, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWLVMFRK", name = "a", descriptor = "(Lclient!OZVKRYKO;)V")
	public void method108(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method565();
		}
		arg0.aClass1_42 = this.aClass1_15.aClass1_42;
		arg0.aClass1_41 = this.aClass1_15;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!EWLVMFRK", name = "a", descriptor = "(ILclient!OZVKRYKO;)V")
	public void method109(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method565();
			}
			arg1.aClass1_42 = this.aClass1_15;
			@Pc(14) boolean local14 = false;
			arg1.aClass1_41 = this.aClass1_15.aClass1_41;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("19003, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWLVMFRK", name = "a", descriptor = "()Lclient!OZVKRYKO;")
	public Class1 method110() {
		@Pc(3) Class1 local3 = this.aClass1_15.aClass1_41;
		if (local3 == this.aClass1_15) {
			return null;
		} else {
			local3.method565();
			return local3;
		}
	}

	@OriginalMember(owner = "client!EWLVMFRK", name = "b", descriptor = "()Lclient!OZVKRYKO;")
	public Class1 method111() {
		@Pc(3) Class1 local3 = this.aClass1_15.aClass1_41;
		if (local3 == this.aClass1_15) {
			this.aClass1_16 = null;
			return null;
		} else {
			this.aClass1_16 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!EWLVMFRK", name = "a", descriptor = "(I)Lclient!OZVKRYKO;")
	public Class1 method112() {
		try {
			@Pc(3) Class1 local3 = this.aClass1_15.aClass1_42;
			if (local3 == this.aClass1_15) {
				this.aClass1_16 = null;
				return null;
			} else {
				this.aClass1_16 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("38731, " + -2258 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWLVMFRK", name = "a", descriptor = "(B)Lclient!OZVKRYKO;")
	public Class1 method113() {
		try {
			@Pc(9) Class1 local9 = this.aClass1_16;
			if (local9 == this.aClass1_15) {
				this.aClass1_16 = null;
				return null;
			} else {
				this.aClass1_16 = local9.aClass1_41;
				return local9;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("29103, " + 3 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWLVMFRK", name = "b", descriptor = "(B)Lclient!OZVKRYKO;")
	public Class1 method114() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_16;
			if (local2 == this.aClass1_15) {
				this.aClass1_16 = null;
				return null;
			} else {
				this.aClass1_16 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("94271, " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWLVMFRK", name = "c", descriptor = "()V")
	public void method115() {
		if (this.aClass1_15.aClass1_41 == this.aClass1_15) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_15.aClass1_41;
			if (local10 == this.aClass1_15) {
				return;
			}
			local10.method565();
		}
	}
}
