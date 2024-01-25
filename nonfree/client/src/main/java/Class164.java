import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class164 {

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "Lclient!kj;")
	private Class2_Sub10 aClass2_Sub10_37;

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "[Lclient!kj;")
	private final Class2_Sub10[] aClass2_Sub10Array1;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
	private final int anInt3943;

	static {
		new Class32("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(I)V")
	public Class164(@OriginalArg(0) int arg0) {
		this.aClass2_Sub10Array1 = new Class2_Sub10[arg0];
		this.anInt3943 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub10 local20 = this.aClass2_Sub10Array1[local10] = new Class2_Sub10();
			local20.aClass2_Sub10_54 = local20;
			local20.aClass2_Sub10_53 = local20;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(JI)Lclient!kj;")
	public Class2_Sub10 method3635(@OriginalArg(0) long arg0) {
		this.aLong133 = arg0;
		@Pc(20) Class2_Sub10 local20 = this.aClass2_Sub10Array1[(int) (arg0 & (long) (this.anInt3943 - 1))];
		for (this.aClass2_Sub10_37 = local20.aClass2_Sub10_53; this.aClass2_Sub10_37 != local20; this.aClass2_Sub10_37 = this.aClass2_Sub10_37.aClass2_Sub10_53) {
			if (this.aClass2_Sub10_37.aLong206 == arg0) {
				@Pc(39) Class2_Sub10 local39 = this.aClass2_Sub10_37;
				this.aClass2_Sub10_37 = this.aClass2_Sub10_37.aClass2_Sub10_53;
				return local39;
			}
		}
		this.aClass2_Sub10_37 = null;
		return null;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(JBLclient!kj;)V")
	public void method3636(@OriginalArg(0) long arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg1.aClass2_Sub10_54 != null) {
			arg1.method5572();
		}
		@Pc(25) Class2_Sub10 local25 = this.aClass2_Sub10Array1[(int) (arg0 & (long) (this.anInt3943 - 1))];
		arg1.aClass2_Sub10_53 = local25;
		arg1.aClass2_Sub10_54 = local25.aClass2_Sub10_54;
		arg1.aClass2_Sub10_54.aClass2_Sub10_53 = arg1;
		arg1.aLong206 = arg0;
		arg1.aClass2_Sub10_53.aClass2_Sub10_54 = arg1;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)Lclient!kj;")
	public Class2_Sub10 method3637() {
		if (this.aClass2_Sub10_37 == null) {
			return null;
		}
		@Pc(23) Class2_Sub10 local23 = this.aClass2_Sub10Array1[(int) ((long) (this.anInt3943 - 1) & this.aLong133)];
		while (local23 != this.aClass2_Sub10_37) {
			if (this.aLong133 == this.aClass2_Sub10_37.aLong206) {
				@Pc(39) Class2_Sub10 local39 = this.aClass2_Sub10_37;
				this.aClass2_Sub10_37 = this.aClass2_Sub10_37.aClass2_Sub10_53;
				return local39;
			}
			this.aClass2_Sub10_37 = this.aClass2_Sub10_37.aClass2_Sub10_53;
		}
		this.aClass2_Sub10_37 = null;
		return null;
	}
}
