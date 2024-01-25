import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class49 {

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!po;")
	private final Class202 aClass202_1 = new Class202();

	@OriginalMember(owner = "client!df", name = "k", descriptor = "I")
	private int anInt1470;

	@OriginalMember(owner = "client!df", name = "s", descriptor = "I")
	private final int anInt1476;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Lclient!ke;")
	private final Class137 aClass137_8;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V")
	public Class49(@OriginalArg(0) int arg0) {
		this.anInt1470 = arg0;
		this.anInt1476 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass137_8 = new Class137(local16);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public void method1376() {
		this.aClass202_1.method4473();
		this.aClass137_8.method3178();
		this.anInt1470 = this.anInt1476;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!ah;IBLjava/lang/Object;)V")
	private void method1377(@OriginalArg(0) Interface1 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt1476 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method1385(arg0);
		this.anInt1470--;
		while (this.anInt1470 < 0) {
			@Pc(32) Class6_Sub1_Sub11 local32 = (Class6_Sub1_Sub11) this.aClass202_1.method4470();
			this.method1379(local32);
		}
		@Pc(53) Class6_Sub1_Sub11_Sub1 local53 = new Class6_Sub1_Sub11_Sub1(arg0, arg1, 1);
		this.aClass137_8.method3179(arg0.method5001(), local53);
		this.aClass202_1.method4472(local53);
		local53.aLong218 = 0L;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!ah;)Ljava/lang/Object;")
	public Object method1378(@OriginalArg(1) Interface1 arg0) {
		@Pc(9) long local9 = arg0.method5001();
		for (@Pc(16) Class6_Sub1_Sub11 local16 = (Class6_Sub1_Sub11) this.aClass137_8.method3175(local9); local16 != null; local16 = (Class6_Sub1_Sub11) this.aClass137_8.method3176()) {
			if (local16.anInterface1_3.method5002(arg0)) {
				@Pc(37) Object local37 = local16.method5718();
				if (local37 != null) {
					if (local16.method5719()) {
						@Pc(78) Class6_Sub1_Sub11_Sub1 local78 = new Class6_Sub1_Sub11_Sub1(arg0, local37, local16.anInt7039);
						this.aClass137_8.method3179(local16.aLong217, local78);
						this.aClass202_1.method4472(local78);
						local78.aLong218 = 0L;
						local16.method5977();
						local16.method5984();
					} else {
						this.aClass202_1.method4472(local16);
						local16.aLong218 = 0L;
					}
					return local37;
				}
				local16.method5977();
				local16.method5984();
				this.anInt1470 += local16.anInt7039;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!hl;B)V")
	private void method1379(@OriginalArg(0) Class6_Sub1_Sub11 arg0) {
		if (arg0 != null) {
			arg0.method5977();
			arg0.method5984();
			this.anInt1470 += arg0.anInt7039;
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)I")
	public int method1380() {
		return this.anInt1470;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	public void method1381() {
		if (Static62.aClass23_1 == null) {
			return;
		}
		for (@Pc(14) Class6_Sub1_Sub11 local14 = (Class6_Sub1_Sub11) this.aClass202_1.method4476(); local14 != null; local14 = (Class6_Sub1_Sub11) this.aClass202_1.method4474()) {
			if (local14.method5719()) {
				if (local14.method5718() == null) {
					local14.method5977();
					local14.method5984();
					this.anInt1470 += local14.anInt7039;
				}
			} else if (++local14.aLong218 > (long) 5) {
				@Pc(36) Class6_Sub1_Sub11 local36 = Static62.aClass23_1.method5895(local14);
				this.aClass137_8.method3179(local14.aLong217, local36);
				Static436.method5891(local36, local14);
				local14.method5977();
				local14.method5984();
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)I")
	public int method1383() {
		return this.anInt1476;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!ah;ILjava/lang/Object;)V")
	public void method1384(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) Object arg1) {
		this.method1377(arg0, arg1);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!ah;)V")
	private void method1385(@OriginalArg(1) Interface1 arg0) {
		@Pc(9) long local9 = arg0.method5001();
		for (@Pc(16) Class6_Sub1_Sub11 local16 = (Class6_Sub1_Sub11) this.aClass137_8.method3175(local9); local16 != null; local16 = (Class6_Sub1_Sub11) this.aClass137_8.method3176()) {
			if (local16.anInterface1_3.method5002(arg0)) {
				this.method1379(local16);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
	public void method1387() {
		for (@Pc(11) Class6_Sub1_Sub11 local11 = (Class6_Sub1_Sub11) this.aClass202_1.method4476(); local11 != null; local11 = (Class6_Sub1_Sub11) this.aClass202_1.method4474()) {
			if (local11.method5719()) {
				local11.method5977();
				local11.method5984();
				this.anInt1470 += local11.anInt7039;
			}
		}
	}
}
