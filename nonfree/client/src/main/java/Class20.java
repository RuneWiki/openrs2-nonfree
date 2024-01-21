import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KZFVEUEL")
public final class Class20 {

	@OriginalMember(owner = "client!KZFVEUEL", name = "d", descriptor = "Lclient!MUOTSYDS;")
	private Class1_Sub1 aClass1_Sub1_26;

	@OriginalMember(owner = "client!KZFVEUEL", name = "a", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!KZFVEUEL", name = "b", descriptor = "I")
	private int anInt422 = 9;

	@OriginalMember(owner = "client!KZFVEUEL", name = "c", descriptor = "Lclient!MUOTSYDS;")
	private Class1_Sub1 aClass1_Sub1_25 = new Class1_Sub1();

	@OriginalMember(owner = "client!KZFVEUEL", name = "<init>", descriptor = "(I)V")
	public Class20(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_Sub1_25.aClass1_Sub1_35 = this.aClass1_Sub1_25;
			this.aClass1_Sub1_25.aClass1_Sub1_36 = this.aClass1_Sub1_25;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("94267, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZFVEUEL", name = "a", descriptor = "(Lclient!MUOTSYDS;)V")
	public void method245(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_36 != null) {
			arg0.method511();
		}
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_25.aClass1_Sub1_36;
		arg0.aClass1_Sub1_35 = this.aClass1_Sub1_25;
		arg0.aClass1_Sub1_36.aClass1_Sub1_35 = arg0;
		arg0.aClass1_Sub1_35.aClass1_Sub1_36 = arg0;
	}

	@OriginalMember(owner = "client!KZFVEUEL", name = "a", descriptor = "()Lclient!MUOTSYDS;")
	public Class1_Sub1 method246() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_25.aClass1_Sub1_35;
		if (local3 == this.aClass1_Sub1_25) {
			return null;
		} else {
			local3.method511();
			return local3;
		}
	}

	@OriginalMember(owner = "client!KZFVEUEL", name = "b", descriptor = "()Lclient!MUOTSYDS;")
	public Class1_Sub1 method247() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_25.aClass1_Sub1_35;
		if (local3 == this.aClass1_Sub1_25) {
			this.aClass1_Sub1_26 = null;
			return null;
		} else {
			this.aClass1_Sub1_26 = local3.aClass1_Sub1_35;
			return local3;
		}
	}

	@OriginalMember(owner = "client!KZFVEUEL", name = "a", descriptor = "(Z)Lclient!MUOTSYDS;")
	public Class1_Sub1 method248() {
		try {
			@Pc(2) Class1_Sub1 local2 = this.aClass1_Sub1_26;
			if (local2 == this.aClass1_Sub1_25) {
				this.aClass1_Sub1_26 = null;
				return null;
			} else {
				this.aClass1_Sub1_26 = local2.aClass1_Sub1_35;
				return local2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("62798, " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZFVEUEL", name = "c", descriptor = "()I")
	public int method249() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_25.aClass1_Sub1_35; local5 != this.aClass1_Sub1_25; local5 = local5.aClass1_Sub1_35) {
			local1++;
		}
		return local1;
	}
}
