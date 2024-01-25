import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class201 {

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Lclient!pn;")
	private Class11_Sub4 aClass11_Sub4_58;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "J")
	private long aLong195;

	@OriginalMember(owner = "client!up", name = "e", descriptor = "I")
	private final int anInt6285;

	@OriginalMember(owner = "client!up", name = "j", descriptor = "[Lclient!pn;")
	private final Class11_Sub4[] aClass11_Sub4Array1;

	static {
		new Class117("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(I)V")
	public Class201(@OriginalArg(0) int arg0) {
		this.anInt6285 = arg0;
		this.aClass11_Sub4Array1 = new Class11_Sub4[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class11_Sub4 local20 = this.aClass11_Sub4Array1[local10] = new Class11_Sub4();
			local20.aClass11_Sub4_61 = local20;
			local20.aClass11_Sub4_62 = local20;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(JILclient!pn;)V")
	public void method5381(@OriginalArg(0) long arg0, @OriginalArg(2) Class11_Sub4 arg1) {
		if (arg1.aClass11_Sub4_61 != null) {
			arg1.method5580();
		}
		@Pc(29) Class11_Sub4 local29 = this.aClass11_Sub4Array1[(int) ((long) (this.anInt6285 - 1) & arg0)];
		arg1.aClass11_Sub4_62 = local29;
		arg1.aClass11_Sub4_61 = local29.aClass11_Sub4_61;
		arg1.aClass11_Sub4_61.aClass11_Sub4_62 = arg1;
		arg1.aLong208 = arg0;
		arg1.aClass11_Sub4_62.aClass11_Sub4_61 = arg1;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)Lclient!pn;")
	public Class11_Sub4 method5382() {
		if (this.aClass11_Sub4_58 == null) {
			return null;
		}
		@Pc(28) Class11_Sub4 local28 = this.aClass11_Sub4Array1[(int) ((long) (this.anInt6285 - 1) & this.aLong195)];
		while (this.aClass11_Sub4_58 != local28) {
			if (this.aLong195 == this.aClass11_Sub4_58.aLong208) {
				@Pc(44) Class11_Sub4 local44 = this.aClass11_Sub4_58;
				this.aClass11_Sub4_58 = this.aClass11_Sub4_58.aClass11_Sub4_62;
				return local44;
			}
			this.aClass11_Sub4_58 = this.aClass11_Sub4_58.aClass11_Sub4_62;
		}
		this.aClass11_Sub4_58 = null;
		return null;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(JZ)Lclient!pn;")
	public Class11_Sub4 method5385(@OriginalArg(0) long arg0) {
		this.aLong195 = arg0;
		@Pc(18) Class11_Sub4 local18 = this.aClass11_Sub4Array1[(int) ((long) (this.anInt6285 - 1) & arg0)];
		for (this.aClass11_Sub4_58 = local18.aClass11_Sub4_62; this.aClass11_Sub4_58 != local18; this.aClass11_Sub4_58 = this.aClass11_Sub4_58.aClass11_Sub4_62) {
			if (this.aClass11_Sub4_58.aLong208 == arg0) {
				@Pc(36) Class11_Sub4 local36 = this.aClass11_Sub4_58;
				this.aClass11_Sub4_58 = this.aClass11_Sub4_58.aClass11_Sub4_62;
				return local36;
			}
		}
		this.aClass11_Sub4_58 = null;
		return null;
	}
}
