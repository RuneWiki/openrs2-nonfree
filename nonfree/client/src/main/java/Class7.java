import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CRZPTUPR")
public final class Class7 {

	@OriginalMember(owner = "client!CRZPTUPR", name = "e", descriptor = "Lclient!KMUPFLXI;")
	private Class8 aClass8_2;

	@OriginalMember(owner = "client!CRZPTUPR", name = "a", descriptor = "I")
	private int anInt35 = 809;

	@OriginalMember(owner = "client!CRZPTUPR", name = "b", descriptor = "Z")
	private boolean aBoolean10 = true;

	@OriginalMember(owner = "client!CRZPTUPR", name = "c", descriptor = "B")
	private byte aByte1 = -90;

	@OriginalMember(owner = "client!CRZPTUPR", name = "d", descriptor = "Lclient!KMUPFLXI;")
	private Class8 aClass8_1 = new Class8();

	@OriginalMember(owner = "client!CRZPTUPR", name = "<init>", descriptor = "(B)V")
	public Class7(@OriginalArg(0) byte arg0) {
		try {
			@Pc(20) boolean local20 = false;
			this.aClass8_1.aClass8_41 = this.aClass8_1;
			this.aClass8_1.aClass8_42 = this.aClass8_1;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("18872, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRZPTUPR", name = "a", descriptor = "(Lclient!KMUPFLXI;)V")
	public void method29(@OriginalArg(0) Class8 arg0) {
		if (arg0.aClass8_42 != null) {
			arg0.method546();
		}
		arg0.aClass8_42 = this.aClass8_1.aClass8_42;
		arg0.aClass8_41 = this.aClass8_1;
		arg0.aClass8_42.aClass8_41 = arg0;
		arg0.aClass8_41.aClass8_42 = arg0;
	}

	@OriginalMember(owner = "client!CRZPTUPR", name = "a", descriptor = "(Lclient!KMUPFLXI;I)V")
	public void method30(@OriginalArg(0) Class8 arg0) {
		try {
			if (arg0.aClass8_42 != null) {
				arg0.method546();
			}
			arg0.aClass8_42 = this.aClass8_1;
			arg0.aClass8_41 = this.aClass8_1.aClass8_41;
			arg0.aClass8_42.aClass8_41 = arg0;
			arg0.aClass8_41.aClass8_42 = arg0;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("66221, " + arg0 + ", " + 6 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRZPTUPR", name = "a", descriptor = "()Lclient!KMUPFLXI;")
	public Class8 method31() {
		@Pc(3) Class8 local3 = this.aClass8_1.aClass8_41;
		if (local3 == this.aClass8_1) {
			return null;
		} else {
			local3.method546();
			return local3;
		}
	}

	@OriginalMember(owner = "client!CRZPTUPR", name = "b", descriptor = "()Lclient!KMUPFLXI;")
	public Class8 method32() {
		@Pc(3) Class8 local3 = this.aClass8_1.aClass8_41;
		if (local3 == this.aClass8_1) {
			this.aClass8_2 = null;
			return null;
		} else {
			this.aClass8_2 = local3.aClass8_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!CRZPTUPR", name = "a", descriptor = "(B)Lclient!KMUPFLXI;")
	public Class8 method33() {
		try {
			@Pc(3) Class8 local3 = this.aClass8_1.aClass8_42;
			if (local3 == this.aClass8_1) {
				this.aClass8_2 = null;
				return null;
			} else {
				this.aClass8_2 = local3.aClass8_42;
				return local3;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("12581, " + 7 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRZPTUPR", name = "b", descriptor = "(B)Lclient!KMUPFLXI;")
	public Class8 method34() {
		try {
			@Pc(2) Class8 local2 = this.aClass8_2;
			if (local2 == this.aClass8_1) {
				this.aClass8_2 = null;
				return null;
			} else {
				this.aClass8_2 = local2.aClass8_41;
				return local2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("61344, " + 2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRZPTUPR", name = "a", descriptor = "(Z)Lclient!KMUPFLXI;")
	public Class8 method35() {
		try {
			@Pc(11) Class8 local11 = this.aClass8_2;
			if (local11 == this.aClass8_1) {
				this.aClass8_2 = null;
				return null;
			} else {
				this.aClass8_2 = local11.aClass8_42;
				return local11;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("74635, " + false + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRZPTUPR", name = "c", descriptor = "()V")
	public void method36() {
		if (this.aClass8_1.aClass8_41 == this.aClass8_1) {
			return;
		}
		while (true) {
			@Pc(10) Class8 local10 = this.aClass8_1.aClass8_41;
			if (local10 == this.aClass8_1) {
				return;
			}
			local10.method546();
		}
	}
}
