import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class23 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!t;")
	private Class1 aClass1_32;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Z")
	private boolean aBoolean100 = true;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "B")
	private byte aByte23 = 69;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
	private int anInt471 = 845;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Lclient!t;")
	private Class1 aClass1_31 = new Class1();

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
	public Class23(@OriginalArg(0) int arg0) {
		this.aClass1_31.aClass1_41 = this.aClass1_31;
		this.aClass1_31.aClass1_42 = this.aClass1_31;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!t;)V")
	public void method350(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method478();
		}
		arg0.aClass1_42 = this.aClass1_31.aClass1_42;
		arg0.aClass1_41 = this.aClass1_31;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()Lclient!t;")
	public Class1 method351() {
		@Pc(3) Class1 local3 = this.aClass1_31.aClass1_41;
		if (local3 == this.aClass1_31) {
			return null;
		} else {
			local3.method478();
			return local3;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "()Lclient!t;")
	public Class1 method352() {
		@Pc(3) Class1 local3 = this.aClass1_31.aClass1_41;
		if (local3 == this.aClass1_31) {
			this.aClass1_32 = null;
			return null;
		} else {
			this.aClass1_32 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Lclient!t;")
	public Class1 method353() {
		if (this.aByte23 != 69) {
			throw new NullPointerException();
		}
		@Pc(11) Class1 local11 = this.aClass1_31.aClass1_42;
		if (local11 == this.aClass1_31) {
			this.aClass1_32 = null;
			return null;
		} else {
			this.aClass1_32 = local11.aClass1_42;
			return local11;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Lclient!t;")
	public Class1 method354() {
		@Pc(2) Class1 local2 = this.aClass1_32;
		if (local2 == this.aClass1_31) {
			this.aClass1_32 = null;
			return null;
		} else {
			this.aClass1_32 = local2.aClass1_41;
			return local2;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Lclient!t;")
	public Class1 method355() {
		@Pc(2) Class1 local2 = this.aClass1_32;
		if (local2 == this.aClass1_31) {
			this.aClass1_32 = null;
			return null;
		} else {
			this.aClass1_32 = local2.aClass1_42;
			return local2;
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "()V")
	public void method356() {
		while (true) {
			@Pc(3) Class1 local3 = this.aClass1_31.aClass1_41;
			if (local3 == this.aClass1_31) {
				return;
			}
			local3.method478();
		}
	}
}
