import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class141 {

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "[Lclient!ji;")
	private static final Class103[] aClass103Array1 = new Class103[32];

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "Lclient!sq;")
	private Class1_Sub4 aClass1_Sub4_48;

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "J")
	private long aLong143;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
	private final int anInt4067;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "[Lclient!sq;")
	private final Class1_Sub4[] aClass1_Sub4Array1;

	static {
		@Pc(65) Class103[] local65 = Static325.method4782();
		for (@Pc(67) int local67 = 0; local67 < local65.length; local67++) {
			aClass103Array1[local65[local67].anInt3138] = local65[local67];
		}
		new Class106("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(I)V")
	public Class141(@OriginalArg(0) int arg0) {
		this.anInt4067 = arg0;
		this.aClass1_Sub4Array1 = new Class1_Sub4[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub4 local20 = this.aClass1_Sub4Array1[local10] = new Class1_Sub4();
			local20.aClass1_Sub4_62 = local20;
			local20.aClass1_Sub4_61 = local20;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)Lclient!sq;")
	public Class1_Sub4 method3759() {
		if (this.aClass1_Sub4_48 == null) {
			return null;
		}
		@Pc(23) Class1_Sub4 local23 = this.aClass1_Sub4Array1[(int) ((long) (this.anInt4067 - 1) & this.aLong143)];
		while (local23 != this.aClass1_Sub4_48) {
			if (this.aLong143 == this.aClass1_Sub4_48.aLong211) {
				@Pc(39) Class1_Sub4 local39 = this.aClass1_Sub4_48;
				this.aClass1_Sub4_48 = this.aClass1_Sub4_48.aClass1_Sub4_61;
				return local39;
			}
			this.aClass1_Sub4_48 = this.aClass1_Sub4_48.aClass1_Sub4_61;
		}
		this.aClass1_Sub4_48 = null;
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(JZLclient!sq;)V")
	public void method3761(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub4 arg1) {
		if (arg1.aClass1_Sub4_62 != null) {
			arg1.method5714();
		}
		@Pc(21) Class1_Sub4 local21 = this.aClass1_Sub4Array1[(int) (arg0 & (long) (this.anInt4067 - 1))];
		arg1.aClass1_Sub4_62 = local21.aClass1_Sub4_62;
		arg1.aClass1_Sub4_61 = local21;
		arg1.aClass1_Sub4_62.aClass1_Sub4_61 = arg1;
		arg1.aLong211 = arg0;
		arg1.aClass1_Sub4_61.aClass1_Sub4_62 = arg1;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(JI)Lclient!sq;")
	public Class1_Sub4 method3763(@OriginalArg(0) long arg0) {
		this.aLong143 = arg0;
		@Pc(20) Class1_Sub4 local20 = this.aClass1_Sub4Array1[(int) (arg0 & (long) (this.anInt4067 - 1))];
		for (this.aClass1_Sub4_48 = local20.aClass1_Sub4_61; this.aClass1_Sub4_48 != local20; this.aClass1_Sub4_48 = this.aClass1_Sub4_48.aClass1_Sub4_61) {
			if (arg0 == this.aClass1_Sub4_48.aLong211) {
				@Pc(43) Class1_Sub4 local43 = this.aClass1_Sub4_48;
				this.aClass1_Sub4_48 = this.aClass1_Sub4_48.aClass1_Sub4_61;
				return local43;
			}
		}
		this.aClass1_Sub4_48 = null;
		return null;
	}
}
