import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class26 {

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "Lclient!fk;")
	private final Class74 aClass74_1 = new Class74();

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
	private final int anInt417;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "Lclient!ec;")
	private final Class58 aClass58_3;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(I)V")
	public Class26(@OriginalArg(0) int arg0) {
		this.anInt417 = arg0;
		this.anInt426 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass58_3 = new Class58(local14);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(JI)V")
	private void method325(@OriginalArg(0) long arg0) {
		@Pc(10) Class11_Sub4_Sub13 local10 = (Class11_Sub4_Sub13) this.aClass58_3.method1009(arg0);
		if (local10 != null) {
			local10.method5701();
			local10.method5580();
			this.anInt426++;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method327() {
		@Pc(19) Class11_Sub4_Sub13 local19 = (Class11_Sub4_Sub13) this.aClass58_3.method1008();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method5302();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class11_Sub4_Sub13 local31 = local19;
			local19 = (Class11_Sub4_Sub13) this.aClass58_3.method1004();
			local31.method5701();
			local31.method5580();
			this.anInt426++;
		}
		return null;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	public void method328() {
		for (@Pc(7) Class11_Sub4_Sub13 local7 = (Class11_Sub4_Sub13) this.aClass74_1.method1294(); local7 != null; local7 = (Class11_Sub4_Sub13) this.aClass74_1.method1288()) {
			if (local7.method5306()) {
				local7.method5701();
				local7.method5580();
				this.anInt426++;
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V")
	public void method329(@OriginalArg(0) int arg0) {
		if (Static46.aClass203_1 == null) {
			return;
		}
		for (@Pc(20) Class11_Sub4_Sub13 local20 = (Class11_Sub4_Sub13) this.aClass74_1.method1294(); local20 != null; local20 = (Class11_Sub4_Sub13) this.aClass74_1.method1288()) {
			if (local20.method5306()) {
				if (local20.method5302() == null) {
					local20.method5701();
					local20.method5580();
					this.anInt426++;
				}
			} else if ((long) arg0 < ++local20.aLong208) {
				@Pc(44) Class11_Sub4_Sub13 local44 = Static46.aClass203_1.method5428(local20);
				this.aClass58_3.method1006(local20.aLong215, local44);
				Static83.method1220(local44, local20);
				local20.method5701();
				local20.method5580();
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(JBLjava/lang/Object;)V")
	public void method330(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method325(arg0);
		if (this.anInt426 == 0) {
			@Pc(16) Class11_Sub4_Sub13 local16 = (Class11_Sub4_Sub13) this.aClass74_1.method1293();
			local16.method5701();
			local16.method5580();
		} else {
			this.anInt426--;
		}
		@Pc(35) Class11_Sub4_Sub13_Sub2 local35 = new Class11_Sub4_Sub13_Sub2(arg1);
		this.aClass58_3.method1006(arg0, local35);
		this.aClass74_1.method1290(local35);
		local35.aLong208 = 0L;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)I")
	public int method331() {
		return this.anInt417;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZJ)Ljava/lang/Object;")
	public Object method332(@OriginalArg(1) long arg0) {
		@Pc(10) Class11_Sub4_Sub13 local10 = (Class11_Sub4_Sub13) this.aClass58_3.method1009(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(23) Object local23 = local10.method5302();
		if (local23 == null) {
			local10.method5701();
			local10.method5580();
			this.anInt426++;
			return null;
		}
		if (local10.method5306()) {
			@Pc(58) Class11_Sub4_Sub13_Sub2 local58 = new Class11_Sub4_Sub13_Sub2(local23);
			this.aClass58_3.method1006(local10.aLong215, local58);
			this.aClass74_1.method1290(local58);
			local58.aLong208 = 0L;
			local10.method5701();
			local10.method5580();
		} else {
			this.aClass74_1.method1290(local10);
			local10.aLong208 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
	public void method333() {
		this.aClass74_1.method1298();
		this.aClass58_3.method1011();
		this.anInt426 = this.anInt417;
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)I")
	public int method335() {
		return this.anInt426;
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method336() {
		@Pc(16) Class11_Sub4_Sub13 local16 = (Class11_Sub4_Sub13) this.aClass58_3.method1004();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method5302();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class11_Sub4_Sub13 local28 = local16;
			local16 = (Class11_Sub4_Sub13) this.aClass58_3.method1004();
			local28.method5701();
			local28.method5580();
			this.anInt426++;
		}
		return null;
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)I")
	public int method337() {
		@Pc(7) int local7 = 0;
		for (@Pc(21) Class11_Sub4_Sub13 local21 = (Class11_Sub4_Sub13) this.aClass74_1.method1294(); local21 != null; local21 = (Class11_Sub4_Sub13) this.aClass74_1.method1288()) {
			if (!local21.method5306()) {
				local7++;
			}
		}
		return local7;
	}
}
