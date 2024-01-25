import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class293 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "Lclient!dr;")
	private final Class80 aClass80_6;

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "Lclient!du;")
	private final Class81 aClass81_58;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
	private int anInt7951;

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
	private final int anInt7953;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I)V")
	public Class293(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(II)V")
	public Class293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass80_6 = new Class80();
		this.anInt7951 = arg0;
		this.anInt7953 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass81_58 = new Class81(local14);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method6920() {
		@Pc(18) Class5_Sub4_Sub4 local18 = (Class5_Sub4_Sub4) this.aClass81_58.method1610();
		while (local18 != null) {
			@Pc(26) Object local26 = local18.method4398();
			if (local26 != null) {
				return local26;
			}
			@Pc(32) Class5_Sub4_Sub4 local32 = local18;
			local18 = (Class5_Sub4_Sub4) this.aClass81_58.method1610();
			local32.method8911();
			local32.method8741();
			this.anInt7951 += local32.anInt4810;
		}
		return null;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method6921(@OriginalArg(1) long arg0) {
		@Pc(15) Class5_Sub4_Sub4 local15 = (Class5_Sub4_Sub4) this.aClass81_58.method1599(arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(23) Object local23 = local15.method4398();
		if (local23 == null) {
			local15.method8911();
			local15.method8741();
			this.anInt7951 += local15.anInt4810;
			return null;
		}
		if (local15.method4399()) {
			@Pc(51) Class5_Sub4_Sub4_Sub1 local51 = new Class5_Sub4_Sub4_Sub1(local23, local15.anInt4810);
			this.aClass81_58.method1607(local51, local15.aLong282);
			this.aClass80_6.method1537(local51);
			local51.aLong273 = 0L;
			local15.method8911();
			local15.method8741();
		} else {
			this.aClass80_6.method1537(local15);
			local15.aLong273 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)V")
	public void method6922(@OriginalArg(0) int arg0) {
		if (Static251.aClass232_1 == null) {
			return;
		}
		for (@Pc(20) Class5_Sub4_Sub4 local20 = (Class5_Sub4_Sub4) this.aClass80_6.method1538(); local20 != null; local20 = (Class5_Sub4_Sub4) this.aClass80_6.method1536()) {
			if (local20.method4399()) {
				if (local20.method4398() == null) {
					local20.method8911();
					local20.method8741();
					this.anInt7951 += local20.anInt4810;
				}
			} else if ((long) arg0 < ++local20.aLong273) {
				@Pc(42) Class5_Sub4_Sub4 local42 = Static251.aClass232_1.method6958(local20);
				this.aClass81_58.method1607(local42, local20.aLong282);
				Static130.method1928(local20, local42);
				local20.method8911();
				local20.method8741();
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method6923() {
		@Pc(19) Class5_Sub4_Sub4 local19 = (Class5_Sub4_Sub4) this.aClass81_58.method1608();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method4398();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class5_Sub4_Sub4 local31 = local19;
			local19 = (Class5_Sub4_Sub4) this.aClass81_58.method1610();
			local31.method8911();
			local31.method8741();
			this.anInt7951 += local31.anInt4810;
		}
		return null;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BJLjava/lang/Object;)V")
	public void method6925(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method6931(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)I")
	public int method6926() {
		return this.anInt7951;
	}

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "(I)V")
	public void method6927() {
		for (@Pc(16) Class5_Sub4_Sub4 local16 = (Class5_Sub4_Sub4) this.aClass80_6.method1538(); local16 != null; local16 = (Class5_Sub4_Sub4) this.aClass80_6.method1536()) {
			if (local16.method4399()) {
				local16.method8911();
				local16.method8741();
				this.anInt7951 += local16.anInt4810;
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)I")
	public int method6928() {
		return this.anInt7953;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(JI)V")
	private void method6929(@OriginalArg(0) long arg0) {
		@Pc(10) Class5_Sub4_Sub4 local10 = (Class5_Sub4_Sub4) this.aClass81_58.method1599(arg0);
		this.method6932(local10);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	public void method6930() {
		this.aClass80_6.method1542();
		this.aClass81_58.method1602();
		this.anInt7951 = this.anInt7953;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BIJLjava/lang/Object;)V")
	public void method6931(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Object arg2) {
		if (arg0 > this.anInt7953) {
			throw new IllegalStateException("s>cs");
		}
		this.method6929(arg1);
		this.anInt7951 -= arg0;
		while (this.anInt7951 < 0) {
			@Pc(36) Class5_Sub4_Sub4 local36 = (Class5_Sub4_Sub4) this.aClass80_6.method1543();
			this.method6932(local36);
		}
		@Pc(49) Class5_Sub4_Sub4_Sub1 local49 = new Class5_Sub4_Sub4_Sub1(arg2, arg0);
		this.aClass81_58.method1607(local49, arg1);
		this.aClass80_6.method1537(local49);
		local49.aLong273 = 0L;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLclient!rk;)V")
	private void method6932(@OriginalArg(1) Class5_Sub4_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method8911();
			arg0.method8741();
			this.anInt7951 += arg0.anInt4810;
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(Z)I")
	public int method6933() {
		@Pc(13) int local13 = 0;
		for (@Pc(19) Class5_Sub4_Sub4 local19 = (Class5_Sub4_Sub4) this.aClass80_6.method1538(); local19 != null; local19 = (Class5_Sub4_Sub4) this.aClass80_6.method1536()) {
			if (!local19.method4399()) {
				local13++;
			}
		}
		return local13;
	}
}
