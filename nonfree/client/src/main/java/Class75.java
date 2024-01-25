import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class75 {

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "Lclient!ra;")
	private Class1_Sub4 aClass1_Sub4_27;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
	private final int anInt2304;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "[Lclient!ra;")
	private final Class1_Sub4[] aClass1_Sub4Array1;

	static {
		new Class34("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V")
	public Class75(@OriginalArg(0) int arg0) {
		this.anInt2304 = arg0;
		this.aClass1_Sub4Array1 = new Class1_Sub4[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub4 local20 = this.aClass1_Sub4Array1[local10] = new Class1_Sub4();
			local20.aClass1_Sub4_62 = local20;
			local20.aClass1_Sub4_61 = local20;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BJ)Lclient!ra;")
	public Class1_Sub4 method2023(@OriginalArg(1) long arg0) {
		this.aLong75 = arg0;
		@Pc(20) Class1_Sub4 local20 = this.aClass1_Sub4Array1[(int) ((long) (this.anInt2304 - 1) & arg0)];
		for (this.aClass1_Sub4_27 = local20.aClass1_Sub4_61; this.aClass1_Sub4_27 != local20; this.aClass1_Sub4_27 = this.aClass1_Sub4_27.aClass1_Sub4_61) {
			if (this.aClass1_Sub4_27.aLong214 == arg0) {
				@Pc(39) Class1_Sub4 local39 = this.aClass1_Sub4_27;
				this.aClass1_Sub4_27 = this.aClass1_Sub4_27.aClass1_Sub4_61;
				return local39;
			}
		}
		this.aClass1_Sub4_27 = null;
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lclient!ra;")
	public Class1_Sub4 method2024() {
		if (this.aClass1_Sub4_27 == null) {
			return null;
		}
		@Pc(28) Class1_Sub4 local28 = this.aClass1_Sub4Array1[(int) ((long) (this.anInt2304 - 1) & this.aLong75)];
		while (local28 != this.aClass1_Sub4_27) {
			if (this.aLong75 == this.aClass1_Sub4_27.aLong214) {
				@Pc(40) Class1_Sub4 local40 = this.aClass1_Sub4_27;
				this.aClass1_Sub4_27 = this.aClass1_Sub4_27.aClass1_Sub4_61;
				return local40;
			}
			this.aClass1_Sub4_27 = this.aClass1_Sub4_27.aClass1_Sub4_61;
		}
		this.aClass1_Sub4_27 = null;
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(JLclient!ra;I)V")
	public void method2026(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub4 arg1) {
		if (arg1.aClass1_Sub4_62 != null) {
			arg1.method5632();
		}
		@Pc(27) Class1_Sub4 local27 = this.aClass1_Sub4Array1[(int) (arg0 & (long) (this.anInt2304 - 1))];
		arg1.aClass1_Sub4_62 = local27.aClass1_Sub4_62;
		arg1.aClass1_Sub4_61 = local27;
		arg1.aClass1_Sub4_62.aClass1_Sub4_61 = arg1;
		arg1.aClass1_Sub4_61.aClass1_Sub4_62 = arg1;
		arg1.aLong214 = arg0;
	}
}
