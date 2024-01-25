import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class8_Sub2_Sub2 extends Class8_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!ti", name = "bb", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "B")
	private final byte aByte66;

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "B")
	private final byte aByte67;

	@OriginalMember(owner = "client!ti", name = "eb", descriptor = "Z")
	private final boolean aBoolean440;

	@OriginalMember(owner = "client!ti", name = "N", descriptor = "S")
	private final short aShort92;

	@OriginalMember(owner = "client!ti", name = "Y", descriptor = "Z")
	private final boolean aBoolean437;

	@OriginalMember(owner = "client!ti", name = "db", descriptor = "Z")
	private final boolean aBoolean439;

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "Lclient!ni;")
	private Class38 aClass38_6;

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "Lclient!o;")
	private Class4_Sub4_Sub4 aClass4_Sub4_Sub4_5;

	static {
		new Class159("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!vq;Lclient!bi;IIIIZIIIII)V")
	public Class8_Sub2_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static194.method3667(arg11, arg10));
		super.anInt5898 = (short) arg3;
		this.aByte68 = (byte) arg11;
		this.aByte66 = (byte) arg2;
		this.aByte67 = (byte) arg10;
		this.aBoolean440 = arg1.anInt503 != 0 && !arg6;
		super.anInt5892 = (short) arg5;
		this.aShort92 = (short) arg1.anInt534;
		this.aBoolean437 = arg6;
		this.aBoolean439 = arg0.method2740() && arg1.aBoolean52 && !this.aBoolean437 && Static9.anInt216 != 0;
		@Pc(79) Class184 local79 = this.method5032(this.aBoolean439, arg0, 1024);
		if (local79 != null) {
			this.aClass38_6 = local79.aClass38_5;
			this.aClass4_Sub4_Sub4_5 = local79.aClass4_Sub4_Sub4_4;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!vq;I)V")
	@Override
	public void method5593(@OriginalArg(0) Class47 arg0) {
		@Pc(22) Class4_Sub4_Sub4 local22;
		if (this.aClass4_Sub4_Sub4_5 == null && this.aBoolean439) {
			@Pc(33) Class184 local33 = this.method5032(true, arg0, 131072);
			local22 = local33 == null ? null : local33.aClass4_Sub4_Sub4_4;
		} else {
			local22 = this.aClass4_Sub4_Sub4_5;
			this.aClass4_Sub4_Sub4_5 = null;
		}
		if (local22 != null) {
			Static66.method1584(local22, this.aByte66, super.anInt5898, super.anInt5892, null);
		}
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)I")
	@Override
	public int method5020() {
		return this.aClass38_6 == null ? 0 : this.aClass38_6.method1921();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class38 local17 = this.method5030(arg0, 65536);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class57 local22 = arg0.method2706();
			local22.method4189(super.anInt5898, super.anInt5897, super.anInt5892);
			return local17.method1905(arg1, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!vq;BI)Lclient!ni;")
	private Class38 method5030(@OriginalArg(0) Class47 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass38_6 != null && arg0.method2695(this.aClass38_6.method1898(), arg1) == 0) {
			return this.aClass38_6;
		} else {
			@Pc(30) Class184 local30 = this.method5032(false, arg0, arg1);
			return local30 == null ? null : local30.aClass38_5;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!vq;)V")
	@Override
	public void method5591(@OriginalArg(1) Class47 arg0) {
		@Pc(25) Class4_Sub4_Sub4 local25;
		if (this.aClass4_Sub4_Sub4_5 == null && this.aBoolean439) {
			@Pc(18) Class184 local18 = this.method5032(true, arg0, 131072);
			local25 = local18 == null ? null : local18.aClass4_Sub4_Sub4_4;
		} else {
			local25 = this.aClass4_Sub4_Sub4_5;
			this.aClass4_Sub4_Sub4_5 = null;
		}
		if (local25 != null) {
			Static70.method1652(local25, this.aByte66, super.anInt5898, super.anInt5892, null);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5592() {
		return this.aBoolean439;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!vq;)Lclient!ni;")
	@Override
	public Class38 method5588(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1) {
		return this.method5030(arg1, arg0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		if (this.aClass38_6 == null) {
			return null;
		}
		@Pc(11) Class57 local11 = arg0.method2706();
		local11.method4189(super.anInt5898 + super.anInt5893, super.anInt5897, super.anInt5894 + super.anInt5892);
		@Pc(35) Class2_Sub2 local35 = null;
		if (this.aBoolean440) {
			local35 = Static248.method4393(1);
		}
		this.aClass38_6.method1925(local11, local35 == null ? null : local35.aClass2_Sub5Array1[0], 0);
		return local35;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)I")
	@Override
	public int method5589() {
		return this.aByte67;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	@Override
	public void method5587() {
		if (this.aClass38_6 != null) {
			this.aClass38_6.method1924();
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)I")
	@Override
	public int method5594() {
		return this.aShort92 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I")
	@Override
	public int method5590() {
		return this.aByte68;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZILclient!vq;I)Lclient!sl;")
	private Class184 method5032(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class47 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class18 local17 = Static113.method2380(this.aShort92 & 0xFFFF);
		@Pc(25) Class60 local25;
		@Pc(29) Class60 local29;
		if (this.aBoolean437) {
			local25 = Static77.aClass60Array1[this.aByte66];
			local29 = Static304.aClass60Array3[0];
		} else {
			if (this.aByte66 < 3) {
				local29 = Static304.aClass60Array3[this.aByte66 + 1];
			} else {
				local29 = null;
			}
			local25 = Static304.aClass60Array3[this.aByte66];
		}
		return local17.method410(arg2, super.anInt5892, local25, this.aByte68, this.aByte67, super.anInt5898, arg1, arg0, local29, super.anInt5897);
	}
}
