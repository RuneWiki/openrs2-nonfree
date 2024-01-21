import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LAPJVQGB")
public final class Class24 {

	@OriginalMember(owner = "client!LAPJVQGB", name = "d", descriptor = "Lclient!KTAHMSMP;")
	private Class8_Sub1 aClass8_Sub1_21;

	@OriginalMember(owner = "client!LAPJVQGB", name = "a", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!LAPJVQGB", name = "b", descriptor = "I")
	private int anInt347 = 280;

	@OriginalMember(owner = "client!LAPJVQGB", name = "c", descriptor = "Lclient!KTAHMSMP;")
	private Class8_Sub1 aClass8_Sub1_20 = new Class8_Sub1();

	@OriginalMember(owner = "client!LAPJVQGB", name = "<init>", descriptor = "(I)V")
	public Class24(@OriginalArg(0) int arg0) {
		try {
			this.aClass8_Sub1_20.aClass8_Sub1_36 = this.aClass8_Sub1_20;
			this.aClass8_Sub1_20.aClass8_Sub1_37 = this.aClass8_Sub1_20;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("5060, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAPJVQGB", name = "a", descriptor = "(Lclient!KTAHMSMP;)V")
	public void method285(@OriginalArg(0) Class8_Sub1 arg0) {
		if (arg0.aClass8_Sub1_37 != null) {
			arg0.method555();
		}
		arg0.aClass8_Sub1_37 = this.aClass8_Sub1_20.aClass8_Sub1_37;
		arg0.aClass8_Sub1_36 = this.aClass8_Sub1_20;
		arg0.aClass8_Sub1_37.aClass8_Sub1_36 = arg0;
		arg0.aClass8_Sub1_36.aClass8_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!LAPJVQGB", name = "a", descriptor = "()Lclient!KTAHMSMP;")
	public Class8_Sub1 method286() {
		@Pc(3) Class8_Sub1 local3 = this.aClass8_Sub1_20.aClass8_Sub1_36;
		if (local3 == this.aClass8_Sub1_20) {
			return null;
		} else {
			local3.method555();
			return local3;
		}
	}

	@OriginalMember(owner = "client!LAPJVQGB", name = "b", descriptor = "()Lclient!KTAHMSMP;")
	public Class8_Sub1 method287() {
		@Pc(3) Class8_Sub1 local3 = this.aClass8_Sub1_20.aClass8_Sub1_36;
		if (local3 == this.aClass8_Sub1_20) {
			this.aClass8_Sub1_21 = null;
			return null;
		} else {
			this.aClass8_Sub1_21 = local3.aClass8_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!LAPJVQGB", name = "a", descriptor = "(Z)Lclient!KTAHMSMP;")
	public Class8_Sub1 method288() {
		try {
			@Pc(12) Class8_Sub1 local12 = this.aClass8_Sub1_21;
			if (local12 == this.aClass8_Sub1_20) {
				this.aClass8_Sub1_21 = null;
				return null;
			} else {
				this.aClass8_Sub1_21 = local12.aClass8_Sub1_36;
				return local12;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("79807, " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LAPJVQGB", name = "c", descriptor = "()I")
	public int method289() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class8_Sub1 local5 = this.aClass8_Sub1_20.aClass8_Sub1_36; local5 != this.aClass8_Sub1_20; local5 = local5.aClass8_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
