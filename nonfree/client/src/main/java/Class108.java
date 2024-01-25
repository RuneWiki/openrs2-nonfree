import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class108 implements Interface21 {

	@OriginalMember(owner = "client!es", name = "c", descriptor = "Lclient!ci;")
	private final Class62 aClass62_1;

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!bba;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!bba;Lclient!ci;)V")
	public Class108(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class62 arg1) {
		this.aClass62_1 = arg1;
		this.aClass30_1 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
	@Override
	public void method7888() {
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7887() {
		return this.aClass30_1.method493();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7886() {
		@Pc(11) Class364 local11 = this.aClass30_1.method495(this.aClass62_1.anInt1105);
		if (local11 == null) {
			return;
		}
		@Pc(33) int local33 = this.aClass62_1.aClass275_8.method6449(Static613.anInt10005, this.aClass62_1.anInt1102) + this.aClass62_1.anInt1104;
		@Pc(50) int local50 = this.aClass62_1.aClass81_8.method2034(Static10.anInt152, this.aClass62_1.anInt1107) + this.aClass62_1.anInt1110;
		if (this.aClass62_1.aBoolean83) {
			Static208.aClass65_7.method6895(local33, local50, this.aClass62_1.anInt1102, this.aClass62_1.anInt1107, this.aClass62_1.anInt1106, 0);
		}
		local50 += this.method2728(local50, Static231.aClass73_8, local11.aString104, local33) * 12;
		local50 += 8;
		if (this.aClass62_1.aBoolean83) {
			Static208.aClass65_7.method6932(local33, local50, local33 + this.aClass62_1.anInt1102 - 1, local50, this.aClass62_1.anInt1106, 0);
		}
		local50++;
		local50 += this.method2728(local50, Static231.aClass73_8, local11.aString103, local33) * 12;
		local50 += 5;
		@Pc(137) int local137 = local50 + this.method2728(local50, Static231.aClass73_8, local11.aString105, local33) * 12;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IILclient!da;ILjava/lang/String;I)I")
	private int method2728(@OriginalArg(1) int arg0, @OriginalArg(2) Class73 arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		return arg1.method5780(0, (Class1) null, arg3 + 5, arg0 - -5, arg2, 0, 0, (Class50[]) null, this.aClass62_1.anInt1102 - 10, 0, this.aClass62_1.anInt1101, 0, this.aClass62_1.anInt1108, this.aClass62_1.anInt1107 - 10, (int[]) null);
	}
}
